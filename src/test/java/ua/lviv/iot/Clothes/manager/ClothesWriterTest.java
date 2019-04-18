package ua.lviv.iot.Clothes.manager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.Clothes.models.CeremonialClothing;
import ua.lviv.iot.Clothes.models.Clothes;
import ua.lviv.iot.Clothes.models.ClothesWriter;
import ua.lviv.iot.Clothes.models.Dress;
import ua.lviv.iot.Clothes.models.MaterialTypes;
import ua.lviv.iot.Clothes.models.Shoes;
import ua.lviv.iot.Clothes.models.ShoesType;
import ua.lviv.iot.Clothes.models.Size;
import ua.lviv.iot.Clothes.models.Style;
import ua.lviv.iot.Clothes.models.TypesForWearing;

public class ClothesWriterTest {
    private File file = new File("output.csv");;
    private ClothesWriter writer = new ClothesWriter();
    private List<Clothes> listTest = new ArrayList<Clothes>();
    private ClothesManager managerTest = new ClothesManager();
    
    @BeforeEach
    public void setUp() {
    listTest = new ArrayList<>();
    
    Dress object1 = new Dress("Bershka", "Green", 4000, TypesForWearing.HOME,
            Size.L, MaterialTypes.FABRIC);
    CeremonialClothing object2 = new CeremonialClothing("Zara", "Black", 5000, TypesForWearing.FASTIVE, "Frag",
            Style.CLASSICALSUIT);
    Shoes object3 = new Shoes("Gucci", "Yellow", 7000, TypesForWearing.EVERYDAY, ShoesType.MOCS, true);
    
    listTest.add(object1);
    listTest.add(object2);
    listTest.add(object3);
    
    managerTest.setClothesList(listTest);
    
    } 
     
    @Test
    void testwriteToFile() throws IOException {
        System.out.println(listTest);
        writer.writeToFile(listTest, file);
        Assertions.assertNotEquals(file.length(), 0);
    }
}
