package com.mysiga.learn.chain;

/**
 * 主任类
 */
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmouont() < 5000) {
            System.out.println("主任" + this.name + "审批采购单:" + request);
        } else {
//            转发请求
            successor.processRequest(request);
        }
    }
}
