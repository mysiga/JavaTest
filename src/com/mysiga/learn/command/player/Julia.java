package com.mysiga.learn.command.player;

import com.mysiga.learn.command.Command;


/**
 * Created by Wilson on 2017/7/17.
 */
public class Julia {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);

        MacroCommand macroCommand = new MacroAudioCommand();
        macroCommand.add(playCommand);
        macroCommand.add(rewindCommand);
        macroCommand.add(stopCommand);
        macroCommand.execute();

//        keypad.play();
//        keypad.rewind();
//        keypad.stop();
//        keypad.play();
//        keypad.stop();
    }
}
