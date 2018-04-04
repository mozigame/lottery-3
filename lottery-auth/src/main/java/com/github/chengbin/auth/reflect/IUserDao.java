package com.github.chengbin.auth.reflect;

/**
 * @author zhangcb
 * @created 2018-02-02 16:39.
 */
interface IUserDao {

    void insert(User user);

    void delete(Long id);

    void update(User user);

    User select(Long id);
}
