package com.mysiga.learn.factory.abstracts;

/**
 * Created by Wilson on 2017/7/12.
 */
public class Android implements System {

    @Override
    public OperationController getOperation() {
        return new VirtualOperation();
    }

    @Override
    public InterfaceController getInterface() {
        return new FullInterface();
    }
}
