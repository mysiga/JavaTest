package com.mysiga.learn.factory.abstracts;

/**
 * Created by Wilson on 2017/7/12.
 */
public interface System {
    /**
     * 游戏操作控制
     *
     * @return
     */
    OperationController getOperation();

    /**
     * 游戏界面控制
     *
     * @return
     */
    InterfaceController getInterface();
}
