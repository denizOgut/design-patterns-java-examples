package com.ogutdeniz.behavioralpatterns.command.tutorial;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command1 = new ConcreteCommand1(receiver);
        Command command2 = new ConcreteCommand2(receiver);

        command1.execute();
        command2.execute();
    }
}
