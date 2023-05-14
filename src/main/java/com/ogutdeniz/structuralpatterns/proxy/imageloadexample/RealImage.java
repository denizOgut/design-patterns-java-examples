package com.ogutdeniz.structuralpatterns.proxy.imageloadexample;


/*
    loading the image from the file system is a time-consuming process and we want to add a proxy to cache the real images that have already been loaded.
    The ProxyImage class will implement the Image interface and contain a reference to a RealImage object.
    When the display() method is called on the ProxyImage object, it will first check if the real image has already been loaded.
    If it has, it will use the cached image.
    If not, it will create a new RealImage object and load the image from the file system.
*/
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

