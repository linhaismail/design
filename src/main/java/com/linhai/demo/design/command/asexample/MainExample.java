package com.linhai.demo.design.command.asexample;

/**
 * @description: 创建一个具体命令类对象，并设定它的接收者
 *               1、能够较容易的设计一个命令队列；
 *               2、在需要的情况下，可以较容易的将命令计入日志；
 *               3、允许接受请求的一方决定是否要否决请求；
 *               4、可以容易的实现对一个命令的撤销和重做；
 *               5、加入新的具体命令类不影响其他类
 * @author: LinHai
 * @create: 2018-08-16 15:39
 */
public class MainExample {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command1 = new ConcreteCommandA(receiver);
        Command command2 = new ConcreteCommandB(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command1);
        invoker.notifyCommand();

        invoker.setCommand(command2);
        invoker.notifyCommand();
    }
}
