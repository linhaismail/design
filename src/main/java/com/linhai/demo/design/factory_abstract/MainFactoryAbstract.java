package com.linhai.demo.design.factory_abstract;

import com.linhai.demo.design.factory_abstract.domain.Department;
import com.linhai.demo.design.factory_abstract.domain.User;
import com.linhai.demo.design.factory_abstract.factory.AccessFactory;
import com.linhai.demo.design.factory_abstract.factory.DatabaseFactory;
import com.linhai.demo.design.factory_abstract.factory.SqlServerFactory;
import com.linhai.demo.design.factory_abstract.mapper.DepartmentMapper;
import com.linhai.demo.design.factory_abstract.mapper.UserMapper;

/**
 * @description: 测试抽象工厂方法
 * @author: LinHai
 * @create: 2018-08-13 17:21
 */
public class MainFactoryAbstract {

    public static void main(String[] args) {

        User user = new User();
        Department department = new Department();

        DatabaseFactory sqlServerFactory = new SqlServerFactory();

        UserMapper userMapper1 = sqlServerFactory.createUser();
        userMapper1.insert(user);
        userMapper1.getUser();

        DepartmentMapper departmentMapper1 = sqlServerFactory.createDepartment();
        departmentMapper1.insert(department);
        departmentMapper1.getDepartment();

        DatabaseFactory accessFactory = new AccessFactory();

        UserMapper userMapper2 = accessFactory.createUser();
        userMapper2.insert(user);
        userMapper2.getUser();

        DepartmentMapper departmentMapper2 = accessFactory.createDepartment();
        departmentMapper2.insert(department);
        departmentMapper2.getDepartment();
    }
}
