package ua.lviv.iot.Clothes.models;

public class Dress extends Clothes {
    private Size size;
    private MaterialTypes materialTypes;
    
    public final String getHeaders() {
        return super.getHeaders() + "Size, " + "MaterialTypes";
    }
    
    public final String toCSV() {
        return super.toCSV() + ", " + getSize() + ", " + getMaterialTypes();
    }

    public Dress() {

    }

    public Dress(final Size size, final MaterialTypes materialTypes) {
        this.size = size;
        this.materialTypes = materialTypes;
    }

    public Dress(final String brand, final String color, final int price, final TypesForWearing typesForWearing,
            final Size size, final MaterialTypes materialTypes) {
        super(brand, color, price, typesForWearing);
        this.size = size;
        this.materialTypes = materialTypes;
    }

    public final Size getSize() {
        return size;
    }

    public final void setMaterialTypes(final MaterialTypes materialTypes) {
        this.materialTypes = materialTypes;
    }

    public final void setSize(final Size size) {
        this.size = size;
    }

    public final MaterialTypes getMaterialTypes() {
        return materialTypes;
    }

    @Override
    public final String toString() {
        return super.toString() + " Dress " + "\n" + " " + "size= " + size + "\n" + " materialTypes= " + materialTypes
                + "\n";
    }
}
