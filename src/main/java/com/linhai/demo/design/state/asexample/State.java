package com.linhai.demo.design.state.asexample;

/**
 * @description: 抽象状态类，定义一个接口，以封装与Context一个特定状态相关的行为
 * @author: LinHai
 * @create: 2018-08-14 13:59
 */
public abstract class State {

    public abstract void Handler(Context context);
}
