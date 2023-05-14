package com.ogutdeniz.behavioralpatterns.command.tutorial;

public class ConcreteCommand1 implements Command {
    private final Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.doSomething();
    }
}
