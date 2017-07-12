package com.mysiga.learn.factory.abstracts;

/**
 * sunny软件公司设计一款游戏，支持Symbian,Android,WindowMobile平台，不同平台有不同的游戏操作控制(OperationController)和游戏界面控制(InterfaceController)
 */
public class GameTest {
    public static void main(String[] args) {
        System system = new Symbian();
        system.getInterface().layout();
        system.getOperation().input();
    }
}
