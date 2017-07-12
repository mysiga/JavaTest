package com.mysiga.learn.factory.abstracts;

/**
 * Created by Wilson on 2017/7/12.
 */
public class VirtualOperation implements OperationController {
    @Override
    public void input() {
        java.lang.System.out.println("虚拟机键盘输入");
    }
}
