package com.linhai.demo.design.factory_simple.factory;

import com.linhai.demo.design.factory_abstract.mapper.IUser;

/**
 * @program: design
 * @description: 简单工厂，加反射
 * @author: LinHai
 * @create: 2018-08-14 01:11
 */
public class DataAccess {
    private static final String db = "SqlServer";

    public static IUser createDB() {
        String assemblyDB = db + "User";
        return null;
    }

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.linhai.demo.design.factory_simple.mapper." + db + "User");
            String name = aClass.getName();
            System.out.println(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
