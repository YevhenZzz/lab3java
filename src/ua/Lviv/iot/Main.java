package ua.Lviv.iot;

import ua.Lviv.iot.Clothes.CeremonialClothing;
import ua.Lviv.iot.Clothes.Clothes;
import ua.Lviv.iot.Clothes.Dress;
import ua.Lviv.iot.Clothes.Shoes;
import ua.Lviv.iot.Enums.*;
import ua.Lviv.iot.Clother.Manager.ClothesManager;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        ClothesManager transportationManager = new ClothesManager();


        Clothes ceremonialClothing = new CeremonialClothing("Zara", "Black", 5000,
                TypesForWearing.FASTIVE, "Frag", Style.CLASSICALSUIT);
        Clothes shoes = new Shoes("Gucci", "Yellow", 7000,
                TypesForWearing.EVERYDAY, ShoesType.MOCS, true);
        Dress dress = new Dress("Bershka", "Green", 4000, TypesForWearing.HOME,
                Size.L, MaterialTypes.FABRIC);

        List <Clothes> mainClothesList = new ArrayList<>();

        mainClothesList.add(ceremonialClothing);
        mainClothesList.add(shoes);
        mainClothesList.add(dress);


        System.out.println(transportationManager.findByCeremonial(TypesForWearing.FASTIVE));
        System.out.println(transportationManager.sortByPrice (mainClothesList, true));
        System.out.println(transportationManager.sortByBrand(mainClothesList, true ));

    }
}
