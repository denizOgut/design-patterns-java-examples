package com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Command;
import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;


public class OpenDocumentCommand implements Command {
    private Document document;

    public OpenDocumentCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.open();
    }

    public void undo() {
        document.close();
    }
}

