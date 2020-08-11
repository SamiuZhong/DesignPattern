package com.samiu.design.command;

/**
 * 命令模式
 *
 * @author Samiu 2020/8/11
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Client {

    public static void main(String[] args) {
        //构造一个接收者对象
        Receiver receiver = new Receiver();
        //根据接收者对象构造一个命令对象
        Command command = new ConcreteCommand(receiver);
        //根据具体的对象构造请求对象
        Invoker invoker = new Invoker(command);
        //执行请求方法
        invoker.action();
    }
}
