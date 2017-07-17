package com.mysiga.learn.chain;

/**
 * 经理类
 */
public class Manager extends Approver {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmouont() < 80000) {
            System.out.println("经理:" + name + "审批采购单:" + request.getNumber());
        } else {
            successor.processRequest(request);
        }
    }
}
