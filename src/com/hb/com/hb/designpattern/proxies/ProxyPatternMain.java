package com.hb.com.hb.designpattern.proxies;

public class ProxyPatternMain {

    public static void main(String[] args) {

        Image image1 = new ProxyImage("Photo1");
        Image image2 = new ProxyImage("Photo2");

        image1.displayImage();
        image2.displayImage();

    }
}
