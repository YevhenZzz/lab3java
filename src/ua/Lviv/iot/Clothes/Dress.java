package ua.Lviv.iot.Clothes;

import ua.Lviv.iot.Enums.MaterialTypes;
import ua.Lviv.iot.Enums.Size;
import ua.Lviv.iot.Enums.TypesForWearing;

public class Dress extends Clothes {
    private Size size;
    private MaterialTypes materialTypes;

    public Dress (){}

    public Dress(Size size, MaterialTypes materialTypes) {
        this.size = size;
        this.materialTypes = materialTypes;
    }

    public Dress(String brand, String color, int price, TypesForWearing typesForWearing, Size size, MaterialTypes materialTypes) {
        super(brand, color, price, typesForWearing);
        this.size = size;
        this.materialTypes = materialTypes;
    }

    public Size getSize() {
        return size;
    }

    public void setMaterialTypes(MaterialTypes materialTypes) {
        this.materialTypes = materialTypes;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public MaterialTypes getMaterialTypes() {
        return materialTypes;
    }


    @Override
    public String toString() {
        return super.toString() + " Dress " + "\n" +
                " " +
                "size= " + size +  "\n" +
                " materialTypes= " + materialTypes +  "\n"
                ;
    }

}
