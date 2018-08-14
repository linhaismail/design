package com.linhai.demo.design.factory_simple.mapper;

import com.linhai.demo.design.factory_simple.domain.Department;

/**
 * @description: Access 库 Department 表的操作实现
 * @author: LinHai
 * @create: 2018-08-13 18:12
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 Access 的 Department 表中插入一条数据");
    }

    @Override
    public Department getDepartment() {
        System.out.println("从 Access 的 Department 表中获得一条数据");
        return null;
    }
}
