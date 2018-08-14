package com.linhai.demo.design.state;

import com.linhai.demo.design.state.context.Work;

/**
 * @description: 测试状态模式
 * @author: LinHai
 * @create: 2018-08-14 13:58
 */
public class MainTest {

    public static void main(String[] args) {

        // 紧急项目
        Work emergencyProject = new Work();

        for (int i = 9; i < 24; i++) {
            emergencyProject.setHour(i);
            emergencyProject.writeProgram();
        }
    }
}
