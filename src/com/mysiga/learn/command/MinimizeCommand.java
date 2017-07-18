package com.mysiga.learn.command;

/**
 * Created by Wilson on 2017/7/17.
 */
public class MinimizeCommand implements   Command {
    private WindowHandler windowHanlder;

    public MinimizeCommand() {
        this.windowHanlder = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHanlder.minimize();
    }
}
