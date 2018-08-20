package com.linhai.demo.design.bridge;

/**
 * @description: 桥接模式：合成/聚合复用原则CARP，尽量使用CARP，不要使用继承
 *               将抽象部分与它的实现部分分离：实现系统可能有多角度分类，每一种分类都可能变化，
 *               那么就把这种多角度分离出来，让它们独立变化，减少它们之间的耦合。
 * @author: LinHai
 * @create: 2018-08-15 16:27
 */
public class MainTest {

    public static void main(String[] args) {

        HandsetBrand hb = new BrandA("苹果");
        hb.setSoft(new Music());
        hb.run();
    }
}
