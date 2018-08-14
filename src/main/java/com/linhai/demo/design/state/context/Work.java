package com.linhai.demo.design.state.context;

import com.linhai.demo.design.state.state.ForenoonState;
import com.linhai.demo.design.state.state.State;
import lombok.Data;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-14 14:48
 */
@Data
public class Work {
    // 时间
    public int hour;
    // 工作状态
    public State state;
    // 工作是否完成
    public boolean taskFinished = false;

    // 初始化工作状态
    public Work() {
        this.state = new ForenoonState();
    }

    public void writeProgram() {
        state.writeProgram(this);
    }
}
