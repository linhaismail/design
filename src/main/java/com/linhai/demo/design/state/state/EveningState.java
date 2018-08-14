package com.linhai.demo.design.state.state;

import com.linhai.demo.design.state.context.Work;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-14 15:10
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.taskFinished) {
            // 如果已经完成，转入休息类
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.hour < 21) {
                System.out.println("当前时间：" + work.hour + "点，加班，疲累！");
            } else {
                work.setState(new SleepState());
                work.writeProgram();
            }
        }
    }
}
