package com.linhai.demo.design.composite;

import org.apache.commons.lang3.StringUtils;

/**
 * @description: 叶节点：人力资源部
 * @author: LinHai
 * @create: 2018-08-15 15:22
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.repeat("--", depth) + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "员工招聘培训管理。");
    }
}
