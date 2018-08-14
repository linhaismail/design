package com.linhai.demo.design.factory_simple.factory;

import com.linhai.demo.design.factory_simple.mapper.IUser;
import com.linhai.demo.design.factory_simple.mapper.SqlServerUser;

/**
 * @program: design
 * @description: 简单工厂，反射
 * @author: LinHai
 * @create: 2018-08-14 01:11
 */
public class DataAccess {

    private static final String path = "com.linhai.demo.design.factory_simple.mapper";

    public static IUser createDB(String db) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName(path + "." + db + "User");
        return (SqlServerUser) aClass.newInstance();
    }
}
