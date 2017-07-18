package com.mysiga.learn.command.player;

import com.mysiga.learn.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wilson on 2017/7/17.
 */
public class MacroAudioCommand implements  MacroCommand {
    private List<Command> commands=new ArrayList<>();

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void remove(Command command) {
        commands.remove(command);
    }
}
