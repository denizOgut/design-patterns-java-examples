package com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Command;
import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;

public class SpellCheckCommand implements Command {
    private Document document;

    public SpellCheckCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.spellCheck();
    }

    public void undo() {
        // Not necessary to implement undo for spell check operation
    }
}
