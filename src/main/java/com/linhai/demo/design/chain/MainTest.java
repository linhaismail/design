package com.linhai.demo.design.chain;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-21 14:51
 */
public class MainTest {

    public static void main(String[] args) {

        Manager commonManager = new CommonManager("经理");
        Manager majordomo = new Majordomo("总监");
        Manager generalManager = new GeneralManager("总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Request request = new Request("请假", "小王", 3);
        commonManager.requestApplication(request);
    }
}
