package com.ogutdeniz.behavioralpatterns.command.texteditorexample;

public class ToolbarButton {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }
}

