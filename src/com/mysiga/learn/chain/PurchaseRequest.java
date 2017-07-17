package com.mysiga.learn.chain;

/**
 * 采购单：请求类
 */
public class PurchaseRequest {
    /**
     * 采购金额
     */
    private double amouont;
    /**
     * 采购单编号
     */
    private int number;
    /**
     * 采购目的
     */
    private String purpost;

    public PurchaseRequest(double amouont, int number, String purpost) {
        this.amouont = amouont;
        this.number = number;
        this.purpost = purpost;
    }

    public double getAmouont() {
        return amouont;
    }

    public void setAmouont(double amouont) {
        this.amouont = amouont;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPurpost() {
        return purpost;
    }

    public void setPurpost(String purpost) {
        this.purpost = purpost;
    }
}
