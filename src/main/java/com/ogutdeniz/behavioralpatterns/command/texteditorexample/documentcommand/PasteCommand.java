package com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Command;
import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;

public class PasteCommand implements Command {
    private Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.paste();
    }

    public void undo() {
        document.undoPaste();
    }
}
