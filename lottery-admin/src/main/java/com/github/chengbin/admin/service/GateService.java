package com.github.chengbin.admin.service;

import com.github.chengbin.admin.biz.GateClientBiz;
import com.github.chengbin.admin.constant.CommonConstant;
import com.github.chengbin.admin.entity.Element;
import com.github.chengbin.admin.entity.GateClient;
import com.github.chengbin.admin.biz.ElementBiz;
import com.github.chengbin.core.vo.authority.PermissionInfo;
import com.github.chengbin.core.vo.gate.ClientInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-07-02 19:23
 */
@Service
public class GateService {
	@Autowired
	private GateClientBiz gateClientBiz;
	@Autowired
	private ElementBiz elmentBiz;
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

	public ClientInfo getGateClientInfo(String clientId) {
		Example example = new Example(GateClient.class);
		example.createCriteria().andEqualTo("code", clientId);
		ClientInfo info = new ClientInfo();
		GateClient gateClient = gateClientBiz.selectByExample(example).get(0);
		BeanUtils.copyProperties(gateClient, info);
		info.setLocked(CommonConstant.BOOLEAN_NUMBER_TRUE.equals(gateClient.getLocked()));
//		info.setSecret(encoder.encode(info.getSecret()));
		return info;
	}

	public List<PermissionInfo> getGateServiceInfo() {
		List<PermissionInfo> infos = new ArrayList<PermissionInfo>();
		Example example = new Example(Element.class);
		example.createCriteria().andEqualTo("menuId", "-1");
		List<Element> elements = elmentBiz.selectByExample(example);
		convert(infos, elements);
		return infos;
	}

	public List<PermissionInfo> getGateServiceInfo(String clientId) {
		GateClient gateClient = new GateClient();
		gateClient.setCode(clientId);
		gateClient = gateClientBiz.selectOne(gateClient);
		List<PermissionInfo> infos = new ArrayList<PermissionInfo>();
		List<Element> elements = gateClientBiz.getClientServices(gateClient.getId());
		convert(infos, elements);
		return infos;
	}

	private void convert(List<PermissionInfo> infos, List<Element> elements) {
		PermissionInfo info;
		for (Element element : elements) {
			info = new PermissionInfo();
			info.setCode(element.getCode());
			info.setType(element.getType());
			info.setUri(element.getUri());
			info.setMethod(element.getMethod());
			info.setName(element.getName());
			infos.add(info);
		}
	}
}
