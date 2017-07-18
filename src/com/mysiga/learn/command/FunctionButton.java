package com.mysiga.learn.command;

/**
 * Created by Wilson on 2017/7/17.
 */
public class FunctionButton {
    private String name;
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void onClick() {
        System.out.println("点击功能键:");
        command.execute();
    }
}
