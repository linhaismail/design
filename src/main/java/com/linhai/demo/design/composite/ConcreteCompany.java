package com.linhai.demo.design.composite;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 有枝节点：分公司或大部门
 * @author: LinHai
 * @create: 2018-08-15 15:16
 */
public class ConcreteCompany extends Company {

    public ConcreteCompany(String name) {
        super(name);
    }

    public List<Company> childrenList = new ArrayList<>();

    @Override
    public void add(Company company) {
        childrenList.add(company);
    }

    @Override
    public void remove(Company company) {
        childrenList.remove(company);
    }

    @Override
    public void display(int depth) {
        System.out.println(StringUtils.repeat("--", depth) + name);
        for (Company company : childrenList) {
            company.display(depth + 1);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : childrenList) {
            company.lineOfDuty();
        }
    }
}
