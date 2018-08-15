package com.linhai.demo.design.composite.asexample;

import lombok.AllArgsConstructor;

/**
 * @description: 组合中的对象声明接口，在适当情况下，实现所有类共有接口的默认行为，声明一个接口用来访问和管理子类
 * @author: LinHai
 * @create: 2018-08-15 13:43
 */
@AllArgsConstructor
abstract class Component {

    protected String name;

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
