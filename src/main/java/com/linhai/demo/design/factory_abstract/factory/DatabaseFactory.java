package com.linhai.demo.design.factory_abstract.factory;

import com.linhai.demo.design.factory_abstract.mapper.DepartmentMapper;
import com.linhai.demo.design.factory_abstract.mapper.UserMapper;

/**
 * @description: 创建各种数据库表操作对象的工厂类
 * @author: LinHai
 * @create: 2018-08-13 17:15
 */
public interface DatabaseFactory {

    UserMapper createUser();

    DepartmentMapper createDepartment();
}
