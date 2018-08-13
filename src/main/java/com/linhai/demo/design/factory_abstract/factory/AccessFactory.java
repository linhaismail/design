package com.linhai.demo.design.factory_abstract.factory;

import com.linhai.demo.design.factory_abstract.mapper.*;

/**
 * @description: Access工厂类
 * @author: LinHai
 * @create: 2018-08-13 17:40
 */
public class AccessFactory implements DatabaseFactory{
    @Override
    public IUser createUser() {
        return new AccessIUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessIDepartment();
    }
}
