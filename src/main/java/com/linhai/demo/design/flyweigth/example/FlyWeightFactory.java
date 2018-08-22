package com.linhai.demo.design.flyweigth.example;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 工厂
 * @author: LinHai
 * @create: 2018-08-22 16:50
 */
public class FlyWeightFactory {

    public static ConcurrentHashMap<String, FlyWeight> flyWeightMap = new ConcurrentHashMap<>();

    // 初始化工厂时，先生成三个实例
    public FlyWeightFactory() {
        flyWeightMap.put("X", new ConcreteFlyWeight());
        flyWeightMap.put("Y", new ConcreteFlyWeight());
        flyWeightMap.put("Z", new ConcreteFlyWeight());
    }

    // 根据客户端请求获得已生成的实例
    public FlyWeight getFlyWeight(String key) {
        return flyWeightMap.get(key);
    }
}
