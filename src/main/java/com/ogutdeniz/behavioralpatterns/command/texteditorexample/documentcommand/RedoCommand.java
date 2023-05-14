package com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Command;
import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;

public class RedoCommand implements Command {
    private Document document;

    public RedoCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.redo();
    }

    public void undo() {
        // Not necessary to implement undo for redo operation
    }
}
