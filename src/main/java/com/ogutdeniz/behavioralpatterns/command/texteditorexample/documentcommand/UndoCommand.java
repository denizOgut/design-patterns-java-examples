package com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Command;
import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;

public class UndoCommand implements Command {
    private Document document;

    public UndoCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.undo();
    }

    public void undo() {
        // Not necessary to implement undo for undo operation
    }
}
