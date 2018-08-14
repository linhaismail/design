package com.linhai.demo.design.state.asexample;

/**
 * @description: 具体状态，每一个子类实现一个与Context相关的一个行为
 * @author: LinHai
 * @create: 2018-08-14 14:30
 */
public class ConcreteStateB extends State {

    @Override
    public void Handler(Context context) {
        // 设置ConcreteStateB的下一状态未ConcreteStateA
        context.state = new ConcreteStateA();
    }
}

