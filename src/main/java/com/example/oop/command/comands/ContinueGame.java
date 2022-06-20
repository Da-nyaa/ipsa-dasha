package com.example.oop.command.comands;

import com.example.oop.command.Command;

public class ContinueGame implements Command {
    @Override
    public void execute() {
        Command c = new StartGame();
        c.execute();
    }
}
