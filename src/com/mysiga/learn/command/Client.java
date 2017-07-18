package com.mysiga.learn.command;

/**
 * Created by Wilson on 2017/7/17.
 */
public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbSettingWindow=new FBSettingWindow("功能键设置");
        FunctionButton functionButton1=new FunctionButton("功能键1");
        FunctionButton functionButton2=new FunctionButton("功能键2");

        Command command1=new HelpCommand();
        Command command2=new MinimizeCommand();

        functionButton1.setCommand(command1);
        functionButton2.setCommand(command2);
        fbSettingWindow.addFunctionButton(functionButton1);
        fbSettingWindow.addFunctionButton(functionButton2);

        fbSettingWindow.display();

        functionButton1.onClick();
        functionButton2.onClick();

    }
}
