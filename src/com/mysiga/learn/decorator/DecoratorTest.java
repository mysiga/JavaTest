package com.mysiga.learn.decorator;

/**
 * 装饰模式:
 */
public class DecoratorTest {
    public static void main(String[] args) {
        LeaveRequest leaveRequest=new LeaveRequest();
        Approver approver=new Approver(leaveRequest);
        approver.display();
    }
}
