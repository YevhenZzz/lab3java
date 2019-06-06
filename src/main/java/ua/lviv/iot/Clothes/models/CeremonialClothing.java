package ua.lviv.iot.Clothes.models;

public class CeremonialClothing extends Clothes {
    private String sets;
    private Style style;
    
    public final String getHeaders() {
        return super.getHeaders()  + "Sets, " + "Style";
    }
    
    public final String toCSV() {
        return super.toCSV() + ", " + getSets() + ", " + getStyle();
    }

    public CeremonialClothing(final String sets, final Style style) {
        this.sets = sets;
        this.style = style;
    }

    public CeremonialClothing(final String brand, final String color, final int price,
            final TypesForWearing typesForWearing, final String sets, final Style style) {
        super(brand, color, price, typesForWearing);
        this.sets = sets;
        this.style = style;
    }

    public CeremonialClothing() {
    }

    public final void setSets(final String sets) {
        this.sets = sets;
    }

    public final void setStyle(final Style style) {
        this.style = style;
    }

    public final String getSets() {
        return sets;
    }

    public final Style getStyle() {
        return style;
    }

    @Override
    public final String toString() {
        return super.toString() + " CeremonialClothing " + "\n" + " sets= " + sets + "\n" + " style= " + style + "\n";
    }
}
