package com.hb.designPattern.factories;

public class FactoryMain {

    public static void main(String[] args) {

        ItemOfClosingFactory itemFactory = new ItemOfClosingFactory();

        ItemOfClosing item1 = itemFactory.getItemOfClosing("dress","jaune");
        item1.sew();
        System.out.println("color: " + item1.getColor());

        ItemOfClosing item2 = itemFactory.getItemOfClosing("skirt","vert");
        item2.sew();
        System.out.println("color: " + item2.getColor());

        ItemOfClosing item3 = itemFactory.getItemOfClosing("trousers","rose");
        item3.sew();
        System.out.println("color: " + item3.getColor());


    }
}
