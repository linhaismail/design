package com.linhai.demo.design.factory_abstract.factory;

import com.linhai.demo.design.factory_abstract.mapper.DepartmentMapper;
import com.linhai.demo.design.factory_abstract.mapper.SqlServerDepartmentMapper;
import com.linhai.demo.design.factory_abstract.mapper.SqlServerUserMapper;
import com.linhai.demo.design.factory_abstract.mapper.UserMapper;

/**
 * @description: SqlServer工厂类
 * @author: LinHai
 * @create: 2018-08-13 17:39
 */
public class SqlServerFactory implements DatabaseFactory{
    @Override
    public UserMapper createUser() {
        return new SqlServerUserMapper();
    }

    @Override
    public DepartmentMapper createDepartment() {
        return new SqlServerDepartmentMapper();
    }
}
