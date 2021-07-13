package com.hb.com.hb.designpattern.proxies;

public class Realimage implements Image{

    private String filename = null;

    public Realimage(final String FILENAME){
        filename = FILENAME;
        loadImageFromDisk();
    }
    @Override
    public void displayImage() {
        System.out.println("Displaying ... " + filename);
    }

    private void loadImageFromDisk(){
        System.out.println("Loading ... " + filename);
    }
}
