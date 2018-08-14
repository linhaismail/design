package com.linhai.demo.design.factory_simple.mapper;

import com.linhai.demo.design.factory_simple.domain.Department;

/**
 * @description: Department表的操作方法
 * @author: LinHai
 * @create: 2018-08-13 17:51
 */
public interface IDepartment {
    void insert(Department department);
    Department getDepartment();
}
