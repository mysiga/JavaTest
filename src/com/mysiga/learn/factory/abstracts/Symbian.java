package com.mysiga.learn.factory.abstracts;

/**
 * Created by Wilson on 2017/7/12.
 */
public class Symbian implements System {

    @Override
    public OperationController getOperation() {
        return new EntityOperation();
    }

    @Override
    public InterfaceController getInterface() {
        return new SmartInterface();
    }
}
