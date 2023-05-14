package com.ogutdeniz.behavioralpatterns.command.texteditorexample;

public abstract class Document {
    public abstract void open();
    public abstract void close();
    public abstract void save();
    public abstract void cut();
    public abstract void undoCut();
    public abstract void copy();
    public abstract void paste();
    public abstract void undoPaste();
    public abstract void spellCheck();
    public abstract void undo();
    public abstract void redo();
}
