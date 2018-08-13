package com.linhai.demo.design.factory_abstract.factory;

import com.linhai.demo.design.factory_abstract.mapper.IDepartment;
import com.linhai.demo.design.factory_abstract.mapper.SqlServerIDepartment;
import com.linhai.demo.design.factory_abstract.mapper.SqlServerIUser;
import com.linhai.demo.design.factory_abstract.mapper.IUser;

/**
 * @description: SqlServer工厂类
 * @author: LinHai
 * @create: 2018-08-13 17:39
 */
public class SqlServerFactory implements DatabaseFactory{
    @Override
    public IUser createUser() {
        return new SqlServerIUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerIDepartment();
    }
}
