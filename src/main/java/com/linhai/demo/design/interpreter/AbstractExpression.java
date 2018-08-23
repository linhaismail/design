package com.linhai.demo.design.interpreter;

/**
 * @description: 表达式类
 * @author: LinHai
 * @create: 2018-08-23 15:04
 */
public abstract class AbstractExpression {

    // 解释器
    public void interpret(PlayContext context) {
        if (context.getPlayContext() == null || context.getPlayContext().length() == 0) {
            return;
        } else {

        }
    }

    // 执行
}
