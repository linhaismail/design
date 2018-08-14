package com.linhai.demo.design.state.state;

import com.linhai.demo.design.state.context.Work;

/**
 * @description: 抽象状态类
 * @author: LinHai
 * @create: 2018-08-14 14:44
 */
public abstract class State {

    public abstract void writeProgram(Work work);
}
