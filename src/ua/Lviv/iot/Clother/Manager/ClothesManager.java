package ua.Lviv.iot.Clother.Manager;

import ua.Lviv.iot.Clothes.Clothes;
import ua.Lviv.iot.Enums.TypesForWearing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClothesManager {

    private static List<Clothes> clothesList = new ArrayList<>();

    public void addClothes(Clothes clothes) {
        clothesList.add(clothes);
    }

    public List<Clothes> findByCeremonial(TypesForWearing typesForWearing) {
        return clothesList.stream().filter(vessel -> vessel.getTypesForWearing() == typesForWearing).
                collect(Collectors.toList());
    }

    public List<Clothes> sortByPrice(List<Clothes> clothes, boolean ascending) {
        return sortByComparator(clothes, ascending, Comparator.comparing(Clothes::getPrice));

    }

    public List<Clothes> sortByBrand(List<Clothes> clothes, boolean ascending) {
        return sortByComparator(clothes, ascending, Comparator.comparing(Clothes::getBrand));
    }

    private List<Clothes> sortByComparator(List<Clothes> clothes, boolean ascending, Comparator<Clothes> comparator) {
        if (ascending) {
            Collections.sort(clothes, comparator.reversed());

        } else {
            Collections.sort(clothes, comparator);
        }
        return clothes;
    }



}
