package com.linhai.demo.design.bridge;

/**
 * @description: 品牌B
 * @author: LinHai
 * @create: 2018-08-15 17:57
 */
public class BrandB extends HandsetBrand {

    public BrandB(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + ":");
        handsetSoft.run();
    }
}
