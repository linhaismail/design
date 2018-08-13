package com.linhai.demo.design.factory_abstract.mapper;

import com.linhai.demo.design.factory_abstract.domain.Department;

/**
 * @description: Department表的操作方法
 * @author: LinHai
 * @create: 2018-08-13 17:51
 */
public interface DepartmentMapper {
    void insert(Department department);
    Department getDepartment();
}
