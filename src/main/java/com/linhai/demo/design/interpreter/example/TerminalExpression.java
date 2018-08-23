package com.linhai.demo.design.interpreter.example;

/**
 * @description: 终结符表达式，实现与文法中的终结符相关联的解释操作。
 *               文法中的每一个终结符，都有一个具体终结符与之相对应。
 * @author: LinHai
 * @create: 2018-08-23 14:32
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
