package ua.Lviv.iot.Clothes;

import ua.Lviv.iot.Enums.Style;
import ua.Lviv.iot.Enums.TypesForWearing;

public class CeremonialClothing extends Clothes {
    private String sets;
    private Style style;

    public CeremonialClothing(String sets, Style style) {
        this.sets = sets;
        this.style = style;
    }

    public CeremonialClothing(String brand, String color, int price, TypesForWearing typesForWearing, String sets, Style style) {
        super(brand, color, price, typesForWearing);
        this.sets = sets;
        this.style = style;
    }

    public CeremonialClothing (){}

    public void setSets(String sets) {
        this.sets = sets;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getSets() {
        return sets;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return super.toString()  +  " CeremonialClothing " + "\n" +
                " sets= " + sets +  "\n" +
                " style= " + style + "\n"
                ;
    }
}

