package com.ogutdeniz.behavioralpatterns.memento.texteditorexample;

public class TextEditorMemento {
    private String savedText;

    public TextEditorMemento(String text) {
        this.savedText = text;
    }

    public String getSavedText() {
        return savedText;
    }

    public void setSavedText(String savedText) {
        this.savedText = savedText;
    }
}
