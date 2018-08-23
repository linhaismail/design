package com.linhai.demo.design.interpreter.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 解释器模式：interpreter
 * @author: LinHai
 * @create: 2018-08-23 14:26
 */
public class MainExample {

    public static void main(String[] args) {

        Context context = new Context();

        List<AbstractExpression> expressionList = new ArrayList<>();
        expressionList.add(new TerminalExpression());
        expressionList.add(new NonterminalExpression());
        expressionList.add(new TerminalExpression());
        expressionList.add(new TerminalExpression());

        for (AbstractExpression expression : expressionList) {
            expression.interpret(context);
        }
    }
}
