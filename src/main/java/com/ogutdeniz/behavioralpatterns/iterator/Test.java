package com.ogutdeniz.behavioralpatterns.iterator;

public class Test {
    public static void main(String[] args) {
        MyIterable myIterable = new MyIterable();
        myIterable.add("Hello");
        myIterable.add("World");

        for (String str : myIterable) {
            System.out.println(str);
        }
    }
}
