package com.ogutdeniz.behavioralpatterns.command.tutorial;

public class ConcreteCommand2 implements Command {
    private final Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        System.out.println("Doing something else...");
        receiver.doSomething();
    }
}
