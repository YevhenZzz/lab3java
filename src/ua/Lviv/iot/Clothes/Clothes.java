package ua.Lviv.iot.Clothes;

import ua.Lviv.iot.Enums.TypesForWearing;

public class Clothes {
    private String brand;
    private String color;
    private int price;
    private TypesForWearing typesForWearing;

    public  Clothes (){}

    public Clothes(String clothesBrand, String color, int price, TypesForWearing typesForWearing) {
         brand = clothesBrand;
        this.color = color;
        this.price = price;
        this.typesForWearing = typesForWearing;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TypesForWearing getTypesForWearing() {
        return typesForWearing;
    }

    public void setTypesForWearing(TypesForWearing typesForWearing) {
        this.typesForWearing = typesForWearing;
    }

    @Override
    public String toString() {
        return  " Clothes " + "\n" +
                " brand= " + brand  +  "\n" +
                " color= " + color +  "\n" +
                " price= " + price +  "\n" +
                " TypesForWearing= " + typesForWearing
                + "\n";

    }


}
