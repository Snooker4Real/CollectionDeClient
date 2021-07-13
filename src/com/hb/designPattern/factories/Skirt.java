package com.hb.designPattern.factories;

public class Skirt implements ItemOfClosing{


    private String color;

    public Skirt(String color){
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void sew() {
        System.out.println("[sew] Jupe");
    }
}
