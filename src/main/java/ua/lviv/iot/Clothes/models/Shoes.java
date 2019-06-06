package ua.lviv.iot.Clothes.models;

public class Shoes extends Clothes {
    private ShoesType shoesType;
    private boolean hasLaces;
    
    public final String getHeaders() {
        return super.getHeaders() + "ShoesType, " + "HasLaces";
    }
    
    public final String toCSV() {
        return super.toCSV() + ", " + getShoesType() + ", " + getHasLaces();
    }

    public Shoes() {

    }

    public Shoes(final ShoesType shoesType, final boolean hasLaces) {
        this.shoesType = shoesType;
        this.hasLaces = hasLaces;
    }

    public Shoes(final String brand, final String color, final int price, final TypesForWearing typesForWearing,
            final ShoesType shoesType, final boolean hasLaces) {
        super(brand, color, price, typesForWearing);
        this.shoesType = shoesType;
        this.hasLaces = hasLaces;
    }

    public final ShoesType getShoesType() {
        return shoesType;
    }

    public final void setShoesType(final ShoesType shoesType) {
        this.shoesType = shoesType;
    }

    public final boolean getHasLaces() {
        return hasLaces;
    }

    public final void setHasLaces(final boolean hasLaces) {
        this.hasLaces = hasLaces;
    }

    @Override
    public final String toString() {
        return super.toString() + " Shoes " + "\n" + " shoesType= " + shoesType + "\n" + " hasLaces= " + hasLaces
                + "\n";
    }
}