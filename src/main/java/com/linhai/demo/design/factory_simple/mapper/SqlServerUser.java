package com.linhai.demo.design.factory_simple.mapper;

import com.linhai.demo.design.factory_simple.domain.User;
/**
 * @description: SqlServer数据库表操作对象
 * @author: LinHai
 * @create: 2018-08-13 17:33
 */
public class SqlServerUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在 SQL Server 的 User 表中插入一条数据");
    }

    @Override
    public User getUser() {
        System.out.println("从 SQL Server 的 User 表中获得一条数据");
        return null;
    }
}
