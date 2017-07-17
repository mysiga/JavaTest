package com.mysiga.learn.chain;

/**
 * 副董事会
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmouont() < 100000) {
            System.out.println("副董事长" + name + "审批采购单:" + request.getNumber());
        } else {
            successor.processRequest(request);
        }
    }
}
