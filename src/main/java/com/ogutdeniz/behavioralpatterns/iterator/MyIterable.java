package com.ogutdeniz.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterable implements Iterable<String> {

    private ArrayList<String> list = new ArrayList<>();

    public void add(String str) {
        list.add(str);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }
}
