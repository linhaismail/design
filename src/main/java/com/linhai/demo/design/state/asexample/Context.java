package com.linhai.demo.design.state.asexample;

/**
 * @description: 维护一个ConcreteState的子类的实例，这个实例定义当前的状态
 * @author: LinHai
 * @create: 2018-08-14 14:08
 */
public class Context {

    public State state;

    public Context(State state) {
        this.state = state;
        System.out.println("初始化转台：" + state.getClass().getSimpleName());
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("修改状态为：" + state.getClass().getSimpleName());
    }

    public State getState() {
        System.out.println("当前状态：" + state.getClass().getSimpleName());
        return state;
    }

    // 对请求做处理，并设置当前状态
    public void request() {
        state.Handler(this);
    }
}
