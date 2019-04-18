package ua.lviv.iot.Clothes.models;

public class Clothes {
    private String brand;
    private String color;
    private int price;
    private TypesForWearing typesForWearing;

    public String getHeaders() {
        return "Brand, " + "Color, " + "Price, " + "TypesForWearing, ";
    }
    
    public String toCSV() {
        return getBrand() + ", " + getColor() + ", " + getPrice() + ", " + getTypesForWearing();
    }

    public Clothes() {
    }

    public Clothes(final String clothesBrand, final String color, final int price,
            final TypesForWearing typesForWearing) {
        brand = clothesBrand;
        this.color = color;
        this.price = price;
        this.typesForWearing = typesForWearing;
    }

    public final String getBrand() {
        return brand;
    }

    public final String getColor() {
        return color;
    }

    public final int getPrice() {
        return price;
    }

    public final void setBrand(final String brand) {
        this.brand = brand;
    }

    public final void setColor(final String color) {
        this.color = color;
    }

    public final void setPrice(final int price) {
        this.price = price;
    }

    public final TypesForWearing getTypesForWearing() {
        return typesForWearing;
    }

    public final void setTypesForWearing(final TypesForWearing typesForWearing) {
        this.typesForWearing = typesForWearing;
    }

    @Override
    public String toString() {
        return " Clothes " + "\n" + " brand= " + brand + "\n" + " color= " + color + "\n" + " price= " + price + "\n"
                + " TypesForWearing= " + typesForWearing + "\n";
    }

}
