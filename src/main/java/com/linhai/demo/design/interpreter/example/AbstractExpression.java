package com.linhai.demo.design.interpreter.example;

/**
 * @description: 抽象表达式，声明一个抽象的解释操作。这个接口为抽象语法树中的所有节点所共享。
 * @author: LinHai
 * @create: 2018-08-23 14:30
 */
public abstract class AbstractExpression {

    public abstract void interpret(Context context);
}
