package com.linhai.demo.design.factory_abstract;

import com.linhai.demo.design.factory_abstract.domain.Department;
import com.linhai.demo.design.factory_abstract.domain.User;
import com.linhai.demo.design.factory_abstract.factory.AccessFactory;
import com.linhai.demo.design.factory_abstract.factory.DatabaseFactory;
import com.linhai.demo.design.factory_abstract.factory.SqlServerFactory;
import com.linhai.demo.design.factory_abstract.mapper.IDepartment;
import com.linhai.demo.design.factory_abstract.mapper.IUser;

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

        IUser IUser1 = sqlServerFactory.createUser();
        IUser1.insert(user);
        IUser1.getUser();

        IDepartment IDepartment1 = sqlServerFactory.createDepartment();
        IDepartment1.insert(department);
        IDepartment1.getDepartment();

        DatabaseFactory accessFactory = new AccessFactory();

        IUser IUser2 = accessFactory.createUser();
        IUser2.insert(user);
        IUser2.getUser();

        IDepartment IDepartment2 = accessFactory.createDepartment();
        IDepartment2.insert(department);
        IDepartment2.getDepartment();
    }
}
