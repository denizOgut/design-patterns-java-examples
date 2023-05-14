package com.ogutdeniz.structuralpatterns.proxy.imageloadexample;

public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.png");
        Image image2 = new ProxyImage("image2.png");

        // Loading image1 from disk
        image1.display();
        // Displaying image1 from cache
        image1.display();

        // Loading image2 from disk
        image2.display();
        // Displaying image2 from cache
        image2.display();
    }
}
