package com.mysiga.learn.chain;

/**
 * 职责链模式：通过建立一条链式组织请求的处理者，请求将沿着链进行传递，请求发送者无须知道请求在何时，
 * 何处以及如何被处理。实现了请求发送者与处理者解耦。
 */
public class Client {
    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, menting, rhuang;
        wjzhang = new Director("张无忌");
        rhuang = new Manager("黄蓉");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        menting = new Congress("董事会");
        wjzhang.setSuccessor(rhuang);
        rhuang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(menting);

        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买椅子");
        wjzhang.processRequest(pr1);
        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买电脑");
        wjzhang.processRequest(pr2);
        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买汽车");
        wjzhang.processRequest(pr3);
        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买办公室");
        wjzhang.processRequest(pr4);

    }
}
