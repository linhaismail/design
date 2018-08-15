package com.linhai.demo.design.composite.asexample;

import com.sun.deploy.util.StringUtils;

/**
 * @description: 范例
 * @author: LinHai
 * @create: 2018-08-15 14:10
 */
public class MainExample {

    public static void main(String[] args) {

        // 生成根
        Composite root = new Composite("root");

        // 根上长出两叶
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        // 根上长出一分支，分支上有两叶
        Composite child = new Composite("child");
        child.add(new Leaf("Child Leaf A"));
        child.add(new Leaf("Child Leaf B"));
        root.add(child);

        // child上长出一分支，分支上有两叶
        Composite grandSon = new Composite("grandSon");
        grandSon.add(new Leaf("GrandSon Leaf A"));
        grandSon.add(new Leaf("GrandSon Leaf B"));

        root.add(new Leaf("Leaf C"));
        root.add(new Leaf("Leaf D"));

        root.display(1);
    }
}
