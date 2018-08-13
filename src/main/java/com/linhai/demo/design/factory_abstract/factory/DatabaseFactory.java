package com.linhai.demo.design.factory_abstract.factory;

import com.linhai.demo.design.factory_abstract.mapper.IDepartment;
import com.linhai.demo.design.factory_abstract.mapper.IUser;

/**
 * @description: 创建各种数据库表操作对象的工厂类
 * @author: LinHai
 * @create: 2018-08-13 17:15
 */
public interface DatabaseFactory {

    IUser createUser();

    IDepartment createDepartment();
}
