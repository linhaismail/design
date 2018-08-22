package com.linhai.demo.design.mediator;

import lombok.Setter;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-22 10:59
 */
@Setter
public class UnionNationSecurityCouncil implements UnionNation {

    private USA usa;
    private Iraq iraq;

    @Override
    public void send(String message, Country country) {
        if (country == usa) {
            iraq.notifyMsg(message);
        } else if (country == iraq) {
            usa.notifyMsg(message);
        } else {
            System.out.println("unknown type.");
        }
    }
}
