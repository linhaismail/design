package com.linhai.demo.design.factory_abstract.mapper;

import com.linhai.demo.design.factory_abstract.domain.Department;

/**
 * @description: SQLServer 库 Department 表的数据操作
 * @author: LinHai
 * @create: 2018-08-13 18:14
 */
public class SqlServerIDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 SQL Server 的 Department 表中插入一条数据");
    }

    @Override
    public Department getDepartment() {
        System.out.println("从 SQL Server 的 Department 表中获得一条数据");
        return null;
    }
}
