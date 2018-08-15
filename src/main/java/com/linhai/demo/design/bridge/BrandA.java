package com.linhai.demo.design.bridge;

/**
 * @description: 品牌A
 * @author: LinHai
 * @create: 2018-08-15 17:55
 */
public class BrandA extends HandsetBrand {

    public BrandA(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + ":");
        handsetSoft.run();
    }
}
