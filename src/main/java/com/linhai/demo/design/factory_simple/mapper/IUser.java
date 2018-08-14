package com.linhai.demo.design.factory_simple.mapper;

import com.linhai.demo.design.factory_simple.domain.User;

/**
 * @description: User表的操作方法
 * @author: LinHai
 * @create: 2018-08-13 17:24
 */
public interface IUser {

    void insert(User user);

    User getUser();
}
