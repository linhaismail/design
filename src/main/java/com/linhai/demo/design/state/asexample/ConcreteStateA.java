package com.linhai.demo.design.state.asexample;

/**
 * @description: 具体状态，每一个子类实现一个与Context的一个状态相关的行为
 * @author: LinHai
 * @create: 2018-08-14 14:06
 */
public class ConcreteStateA extends State {
    @Override
    public void Handler(Context context) {
        // 设置ConcreteStateA的下一状态未ConcreteStateB
        context.state = new ConcreteStateB();
    }
}
