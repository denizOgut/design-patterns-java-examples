package com.ogutdeniz.behavioralpatterns.mediator;

public class Test {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User("X", chatRoom);
        User user2 = new User("Y", chatRoom);
        User user3 = new User("Z", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello everyone!");
        user2.sendMessage("Hi Z!");
    }
}
