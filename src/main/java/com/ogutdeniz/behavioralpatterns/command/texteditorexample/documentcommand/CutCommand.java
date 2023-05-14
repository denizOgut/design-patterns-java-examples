package com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Command;
import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;

public class CutCommand implements Command {
    private Document document;

    public CutCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.cut();
    }

    public void undo() {
        document.undoCut();
    }
}
