package ua.lviv.iot.Clothes.manager;

import java.util.ArrayList;
import java.util.List;

import ua.lviv.iot.Clothes.models.CeremonialClothing;
import ua.lviv.iot.Clothes.models.Clothes;
import ua.lviv.iot.Clothes.models.Dress;
import ua.lviv.iot.Clothes.models.MaterialTypes;
import ua.lviv.iot.Clothes.models.Shoes;
import ua.lviv.iot.Clothes.models.ShoesType;
import ua.lviv.iot.Clothes.models.Size;
import ua.lviv.iot.Clothes.models.Style;
import ua.lviv.iot.Clothes.models.TypesForWearing;

public abstract class Main {
    public static void main(final String[] args) {
        ClothesManager transportationManager = new ClothesManager();

        Clothes ceremonialClothing = new CeremonialClothing("Zara", "Black", 5000, TypesForWearing.FASTIVE, "Frag",
                Style.CLASSICALSUIT);
        Clothes shoes = new Shoes("Gucci", "Yellow", 7000, TypesForWearing.EVERYDAY, ShoesType.MOCS, true);
        Dress dress = new Dress("Bershka", "Green", 4000, TypesForWearing.HOME, Size.L, MaterialTypes.FABRIC);

        List<Clothes> mainClothesList = new ArrayList<>();

        mainClothesList.add(ceremonialClothing);
        mainClothesList.add(shoes);
        mainClothesList.add(dress);

        System.out.println(transportationManager.findByCeremonial(TypesForWearing.FASTIVE));
        System.out.println(transportationManager.sortByPrice(mainClothesList, true));
        System.out.println(transportationManager.sortByBrand(mainClothesList, true));

    }
}
