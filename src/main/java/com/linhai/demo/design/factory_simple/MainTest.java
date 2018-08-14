package com.linhai.demo.design.factory_simple;

import com.linhai.demo.design.factory_simple.domain.User;
import com.linhai.demo.design.factory_simple.factory.DataAccess;
import com.linhai.demo.design.factory_simple.mapper.IUser;

/**
 * @description: 测试简单工厂类
 * @author: LinHai
 * @create: 2018-08-14 11:25
 */
public class MainTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {

        IUser sqlServer = DataAccess.createDB("SqlServer");

        User user = new User();

        sqlServer.insert(user);
        sqlServer.getUser();
    }
}
