package com.linhai.demo.design.composite;

import lombok.AllArgsConstructor;

/**
 * @description: 抽象类或接口：公司
 * @author: LinHai
 * @create: 2018-08-15 15:11
 */
@AllArgsConstructor
public abstract class Company {

    protected String name;

    // 增加
    public abstract void add(Company company);
    // 移除
    public abstract void remove(Company company);
    // 展示
    public abstract void display(int depth);
    // 履行职责
    public abstract void lineOfDuty();
}
