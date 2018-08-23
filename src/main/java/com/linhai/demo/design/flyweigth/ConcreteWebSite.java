package com.linhai.demo.design.flyweigth;

import lombok.AllArgsConstructor;

/**
 * @description: 具体网站类
 * @author: LinHai
 * @create: 2018-08-23 10:17
 */
@AllArgsConstructor
class ConcreteWebSite extends WebSite {

    public String name;

    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
