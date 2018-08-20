package com.linhai.demo.design.command;

/**
 * @description: 厨师
 * @author: LinHai
 * @create: 2018-08-16 10:57
 */
public class Barbecuer {

    private String name;

    public Barbecuer(String name) {
        this.name = name;
    }

    public void bakeMutton() {
        System.out.println("bake mutton!");
    }

    public void bakeChickenWing() {
        System.out.println("bake chicken wing!");
    }
}
