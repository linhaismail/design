package com.linhai.demo.design.chain.example;

import java.util.Arrays;
import java.util.List;

/**
 * @description: 范例
 *               当客户提交一个请求时，请求是沿链传递直至一个ConcreteHandler负责处理他。
 *               通俗说，好处就是请求者不用管哪个对象来处理，反正最终会被处理。
 *               接受和发送者都不知道对方的信息，且链中的对象也不知道链的结构。
 *               结果是职责链可以简化对象之间的链接，他们只用保持一个指向后继者的引用，而不用保持它所有候选接受者的引用。
 * @author: LinHai
 * @create: 2018-08-21 11:11
 */
public class MainExample {

    public static void main(String[] args) {

        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        List<Integer> list = Arrays.asList(new Integer[]{2, 4, 7, 8, 11, 16, 21});

        list.forEach(l -> {
            handlerA.handlerRequest(l);
        });
    }
}
