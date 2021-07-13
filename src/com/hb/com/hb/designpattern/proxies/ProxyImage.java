package com.hb.com.hb.designpattern.proxies;

public class ProxyImage implements Image{

    private Realimage image = null;
    private String fileName = null;

    public ProxyImage(final String FILENAME){
        fileName = FILENAME;
    }

    @Override
    public void displayImage() {
        if (image == null)
        {
            image = new Realimage(fileName);
        }

        //ici on peut imaginer faire d'autres opérations


        image.displayImage();
    }
}
