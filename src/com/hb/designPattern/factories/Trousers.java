package com.hb.designPattern.factories;

public class Trousers implements ItemOfClosing {


    private String color;

    public Trousers(String color){
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void sew() {
        System.out.println("[sew] Pantalon");
    }
}
