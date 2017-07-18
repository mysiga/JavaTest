package com.mysiga.learn.command.player;

import com.mysiga.learn.command.Command;

/**
 * Created by Wilson on 2017/7/17.
 */
public interface MacroCommand extends Command{
    void add(Command command);
    void remove(Command command);
}
