package com.linhai.demo.design.factory_simple.mapper;

import com.linhai.demo.design.factory_abstract.domain.User;

/**
 * @description: Access数据库User操作对象
 * @author: LinHai
 * @create: 2018-08-13 17:37
 */
public class AccessIUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在 Access 的 User 表中插入一条数据");
    }

    @Override
    public User getUser() {
        System.out.println("从 Access 的 User 表中获得一条数据");
        return null;
    }
}
