package com.mysiga.learn.command.player;

import com.mysiga.learn.command.Command;

/**
 * Created by Wilson on 2017/7/17.
 */
public class RewindCommand implements Command {
    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
