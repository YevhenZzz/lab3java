package ua.Lviv.iot.Clothes;

import ua.Lviv.iot.Enums.ShoesType;
import ua.Lviv.iot.Enums.TypesForWearing;

public class Shoes extends Clothes {
    private ShoesType shoesType;
    private boolean hasLaces;

    public Shoes (){}

    public Shoes(ShoesType shoesType, boolean hasLaces) {
        this.shoesType = shoesType;
        this.hasLaces = hasLaces;
    }

    public Shoes(String brand, String color, int price, TypesForWearing typesForWearing, ShoesType shoesType, boolean hasLaces) {
        super(brand, color, price, typesForWearing);
        this.shoesType = shoesType;
        this.hasLaces = hasLaces;
    }

    public ShoesType getShoesType() {
        return shoesType;
    }

    public void setShoesType(ShoesType shoesType) {
        this.shoesType = shoesType;
    }

    public boolean isHasLaces() {
        return hasLaces;
    }

    public void setHasLaces(boolean hasLaces) {
        this.hasLaces = hasLaces;
    }

    @Override
    public String toString() {
        return super.toString() + " Shoes " + "\n" +
                " shoesType= " + shoesType +  "\n" +
                " hasLaces= "  + hasLaces +  "\n";

    }

}