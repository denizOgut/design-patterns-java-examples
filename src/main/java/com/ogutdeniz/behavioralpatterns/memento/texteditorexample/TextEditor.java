package com.ogutdeniz.behavioralpatterns.memento.texteditorexample;

import java.util.Stack;

public class TextEditor {
    private String text;
    private Stack<TextEditorMemento> undoStack;

    public TextEditor() {
        this.text = "";
        this.undoStack = new Stack<>();
    }

    public void write(String content) {
        this.text += content;
        System.out.println("Text written: " + this.text);
    }

    public TextEditorMemento save() {
        TextEditorMemento memento = new TextEditorMemento(this.text);
        undoStack.push(memento);
        return memento;
    }

    public void restore(TextEditorMemento memento) {
        this.text = memento.getSavedText();
        System.out.println("Text restored: " + this.text);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            TextEditorMemento memento = undoStack.pop();
            this.text = memento.getSavedText();
            System.out.println("Undo completed. Text restored: " + this.text);
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
