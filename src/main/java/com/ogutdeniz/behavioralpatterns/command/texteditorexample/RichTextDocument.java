package com.ogutdeniz.behavioralpatterns.command.texteditorexample;

import com.ogutdeniz.behavioralpatterns.command.texteditorexample.Document;

public class RichTextDocument extends Document {
    private String content;

    public void open() {
        System.out.println("Opening rich text document...");
    }

    public void close() {
        System.out.println("Closing rich text document...");
    }

    public void save() {
        System.out.println("Saving rich text document...");
    }

    public void cut() {
        System.out.println("Cutting text...");
    }

    public void undoCut() {
        System.out.println("Undoing cut...");
    }

    public void copy() {
        System.out.println("Copying text...");
    }

    public void paste() {
        System.out.println("Pasting text...");
    }

    public void undoPaste() {
        System.out.println("Undoing paste...");
    }

    public void spellCheck() {
        System.out.println("Checking spelling...");
    }

    public void undo() {
        System.out.println("Undoing operation...");
    }

    public void redo() {
        System.out.println("Redoing operation...");
    }
}
