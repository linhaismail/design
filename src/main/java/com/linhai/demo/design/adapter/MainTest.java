package com.linhai.demo.design.adapter;

import com.linhai.demo.design.adapter.adapter.Translate;
import com.linhai.demo.design.adapter.common.Center;
import com.linhai.demo.design.adapter.common.Guards;

/**
 * @description: 系统的接口和行为都正确，但是接口不符时，我们应该考虑考虑用适配器，目的是使控制范围之外的一个原有对象与某个接口匹配。
 *               适配器模式主要应用于希望复用一些现存的类，但接口又与复用环境不一致的情况。
 * @author: LinHai
 * @create: 2018-08-14 15:40
 */
public class MainTest {

    public static void main(String[] args) {

        Player mao = new Center("阿猫");
        mao.attack();

        Player dog = new Guards("阿狗");
        dog.defense();

        Player ming = new Translate("姚明");
        ming.attack();
    }
}
