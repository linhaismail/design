package com.linhai.demo.design.flyweigth;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-22 15:28
 */
public class MainTest {

    public static void main(String[] args) {

        WebSiteFactory wf = new WebSiteFactory();

        WebSite showA = wf.getFlyWeight("产品展示");
        showA.use(new User("旺财"));

        WebSite showB = wf.getFlyWeight("产品展示");;
        showB.use(new User("小强"));

        WebSite blogA = wf.getFlyWeight("博客");
        blogA.use(new User("狗剩"));

        WebSite blogB = wf.getFlyWeight("博客");
        blogB.use(new User("二娃"));

        System.out.println("实例个数：" + wf.getCount());
    }
}
