package com.mysiga.learn.command.player;

import com.mysiga.learn.command.Command;

/**
 * Created by Wilson on 2017/7/17.
 */
public class StopCommand implements Command {
    private AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
