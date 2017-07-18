package com.mysiga.learn.command;

/**
 * Created by Wilson on 2017/7/17.
 */
public class HelpCommand implements Command {
    private HelpHandler helpHandler;

    public HelpCommand() {
        this.helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
