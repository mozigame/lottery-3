package com.github.chengbin.crawler;

import com.github.chengbin.crawler.entity.FootballMatch;
import com.github.chengbin.crawler.mapper.FootballMatchMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryCrawlerApplicationTests {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void firstCache() {
		//一级缓存: 基于PerpetualCache的HashMap本地缓存，其存储作用域为 Session，
		// 当 Session flush 或 close 之后，该Session中的所有 Cache 就将清空。
		SqlSession session = sqlSessionFactory.openSession();
		FootballMatchMapper footballMatchMapper = session.getMapper(FootballMatchMapper.class);
		FootballMatch footballMatch = footballMatchMapper.selectByPrimaryKey("20180115004");
		System.out.println(footballMatch.getHomeTeamName());

		//重复查询同一条记录时，一级缓存开始使用
		footballMatch = footballMatchMapper.selectByPrimaryKey("20180115004");
		System.out.println(footballMatch.getHomeTeamName());

		//session关闭，session中的cache将被清除
		session.close();
		session = sqlSessionFactory.openSession();
		footballMatchMapper = session.getMapper(FootballMatchMapper.class);
		footballMatch = footballMatchMapper.selectByPrimaryKey("20180115004");
		System.out.println(footballMatch.getHomeTeamName());

		footballMatch = footballMatchMapper.selectByPrimaryKey("20180115004");
		System.out.println(footballMatch.getHomeTeamName());

		//sqlSession执行insert、update、delete等操作commit提交后会清空缓存区域
		footballMatch.setUpdateTime(new Date());
		footballMatchMapper.updateByPrimaryKeySelective(footballMatch);
		footballMatch = footballMatchMapper.selectByPrimaryKey("20180115004");
		System.out.println(footballMatch.getHomeTeamName());
	}

	@Test
	public void secondCache() {
		//二级缓存与一级缓存其机制相同，默认也是采用 PerpetualCache，HashMap存储，
		// 不同在于其存储作用域为 Mapper(Namespace)，并且可自定义存储源，如 Ehcache
		SqlSession session1 = sqlSessionFactory.openSession();
		FootballMatchMapper footballMatchMapper1 = session1.getMapper(FootballMatchMapper.class);
		FootballMatch footballMatch = footballMatchMapper1.selectByPrimaryKey("20180115004");
		System.out.println(footballMatch.getHomeTeamName());
		session1.close();

		SqlSession session2 = sqlSessionFactory.openSession();
		FootballMatchMapper footballMatchMapper2 = session2.getMapper(FootballMatchMapper.class);
		FootballMatch footballMatch2 = footballMatchMapper2.selectByPrimaryKey("20180115004");
		System.out.println(footballMatch2.getHomeTeamName());
		session2.close();
	}

}
