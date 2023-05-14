package com.ogutdeniz.behavioralpatterns.memento.texteditorexample;

public class Test {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.write("Hello, ");
        TextEditorMemento memento1 = editor.save();

        editor.write("world!");
        TextEditorMemento memento2 = editor.save();

        editor.undo(); // Undo "world!"
        editor.undo(); // Undo "Hello, "
        editor.undo(); // Nothing to undo
    }
}
