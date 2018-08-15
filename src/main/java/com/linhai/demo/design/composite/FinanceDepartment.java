package com.linhai.demo.design.composite;

import org.apache.commons.lang3.StringUtils;

/**
 * @description: 叶节点：财务部
 * @author: LinHai
 * @create: 2018-08-15 15:25
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(name + "公司财务收支管理。");
    }
}
