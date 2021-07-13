package com.hb.designPattern.factories;

public class Dress implements ItemOfClosing{


    private String color;

    public Dress(String color){
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void sew() {
        System.out.println("[sew] Robe");
    }
}
