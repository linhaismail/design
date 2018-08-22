package com.linhai.demo.design.mediator;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-21 17:14
 */
public class MainTest {

    public static void main(String[] args) {

        UnionNationSecurityCouncil unsc = new UnionNationSecurityCouncil();

        USA usa = new USA(unsc);
        Iraq iraq = new Iraq(unsc);

        unsc.setUsa(usa);
        unsc.setIraq(iraq);

        usa.send("how are you.");
        iraq.send("fine.");
    }
}
