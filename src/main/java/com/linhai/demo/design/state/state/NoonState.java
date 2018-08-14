package com.linhai.demo.design.state.state;

import com.linhai.demo.design.state.context.Work;

/**
 * @description: 中午状态类
 * @author: LinHai
 * @create: 2018-08-14 14:57
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.hour < 14) {
            System.out.println("当前时间：" + work.hour + "点，中午犯困，午休！");
        } else {
            // 转入下午
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
