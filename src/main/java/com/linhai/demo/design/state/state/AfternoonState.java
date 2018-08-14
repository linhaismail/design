package com.linhai.demo.design.state.state;

import com.linhai.demo.design.state.context.Work;

/**
 * @description: 下午状态类
 * @author: LinHai
 * @create: 2018-08-14 15:06
 */
public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.hour < 17) {
            System.out.println("当前时间：" + work.hour + "点，下午状态一般，继续努力！");
        } else {
            // 转为晚上
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
