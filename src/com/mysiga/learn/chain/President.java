package com.mysiga.learn.chain;

/**
 * 董事长类
 */
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmouont() < 500000) {
            System.out.println("董事长" + name + "审批采购单:" + request.getNumber());
        } else {
            successor.processRequest(request);
        }
    }
}
