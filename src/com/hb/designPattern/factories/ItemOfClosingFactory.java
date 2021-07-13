package com.hb.designPattern.factories;

public class ItemOfClosingFactory {

    public ItemOfClosing getItemOfClosing(String itemType, String color) {

        if (itemType == null || itemType.equals("")){
            return null;
        } else if (itemType.equalsIgnoreCase("SKIRT")){
            return new Skirt(color);
        } else if (itemType.equalsIgnoreCase("DRESS")){
            return new Dress(color);
        } else if (itemType.equalsIgnoreCase("TROUSERS")){
            return new Trousers(color);
        } else {
            return null;
        }
    }
}
