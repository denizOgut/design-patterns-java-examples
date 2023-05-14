package com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Command;
import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;

public class SaveDocumentCommand implements Command {
    private Document document;

    public SaveDocumentCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.save();
    }

    public void undo() {
        // not possible to undo a save operation
    }
}
