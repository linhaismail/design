package com.linhai.demo.design.state.state;

import com.linhai.demo.design.state.context.Work;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-14 15:21
 */
public class SleepState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.hour + "点，不行了，睡着！");
    }
}
