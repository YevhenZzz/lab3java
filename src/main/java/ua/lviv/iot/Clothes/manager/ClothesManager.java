package ua.lviv.iot.Clothes.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ua.lviv.iot.Clothes.models.Clothes;
import ua.lviv.iot.Clothes.models.TypesForWearing;

public class ClothesManager {

    private List<Clothes> clothesList = new ArrayList<>();

    public List<Clothes> getClothesList() {
        return clothesList;

    }

    public void setClothesList(final List<Clothes> clothesList) {
        this.clothesList = clothesList;
    }

    final void addClothes(final Clothes clothes) {
        clothesList.add(clothes);
    }

    public final List<Clothes> findByCeremonial(final TypesForWearing typesForWearing) {
        return clothesList.stream().filter(vessel -> vessel.getTypesForWearing() == typesForWearing)
                .collect(Collectors.toList());
    }

    public final List<Clothes> sortByPrice(final List<Clothes> clothes, final boolean ascending) {
        return sortByComparator(clothes, ascending, Comparator.comparing(Clothes::getPrice));

    }

    public final List<Clothes> sortByBrand(final List<Clothes> clothes, final boolean ascending) {
        return sortByComparator(clothes, ascending, Comparator.comparing(Clothes::getBrand));
    }

    private List<Clothes> sortByComparator(final List<Clothes> clothes, final boolean ascending,
            final Comparator<Clothes> comparator) {
        if (ascending) {
            Collections.sort(clothes, comparator.reversed());

        } else {
            Collections.sort(clothes, comparator);
        }
        return clothes;
    }

}
