package com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Command;
import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;

public class CopyCommand implements Command {
    private Document document;

    public CopyCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.copy();
    }

    public void undo() {
        // Not necessary to implement undo for copy operation
    }
}
