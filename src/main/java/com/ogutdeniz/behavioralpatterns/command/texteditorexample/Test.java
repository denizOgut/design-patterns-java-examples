package com.ogutdeniz.behavioralpatterns.command.texteditorexample;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.documentcommand.*;

public class Test {
    public static void main(String[] args) {

        Document document = new RichTextDocument();
        ToolbarButton openButton = new ToolbarButton();
        ToolbarButton saveButton = new ToolbarButton();
        ToolbarButton cutButton = new ToolbarButton();
        ToolbarButton copyButton = new ToolbarButton();
        ToolbarButton pasteButton = new ToolbarButton();
        ToolbarButton spellCheckButton = new ToolbarButton();
        ToolbarButton undoButton = new ToolbarButton();
        ToolbarButton redoButton = new ToolbarButton();


        openButton.setCommand(new OpenDocumentCommand(document));
        saveButton.setCommand(new SaveDocumentCommand(document));
        cutButton.setCommand(new CutCommand(document));
        copyButton.setCommand(new CopyCommand(document));
        pasteButton.setCommand(new PasteCommand(document));
        spellCheckButton.setCommand(new SpellCheckCommand(document));
        undoButton.setCommand(new UndoCommand(document));
        redoButton.setCommand(new RedoCommand(document));


        openButton.click();
        cutButton.click();
        copyButton.click();
        pasteButton.click();
        spellCheckButton.click();
        saveButton.click();


        undoButton.click();
        undoButton.click();


        redoButton.click();
    }
}
