package com.linhai.demo.design.interpreter.example;

/**
 * @description: 非终结符表达式，为文法中的非终结符实现解释操作.
 *               对文法中的每一条规则R1、R2....Rn 都需要一个具体的非终结符表达式
 * @author: LinHai
 * @create: 2018-08-23 14:33
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器。");
    }
}
