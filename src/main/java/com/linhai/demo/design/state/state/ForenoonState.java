package com.linhai.demo.design.state.state;

import com.linhai.demo.design.state.context.Work;

/**
 * @description: 上午状态类
 * @author: LinHai
 * @create: 2018-08-14 14:49
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.hour < 12) {
            System.out.println("当前时间：" + work.hour + "点，上午工作，精神百倍！");
        } else {
            // 转入中午
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
