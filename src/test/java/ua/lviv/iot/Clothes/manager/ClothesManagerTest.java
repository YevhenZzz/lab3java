package ua.lviv.iot.Clothes.manager;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.Clothes.models.CeremonialClothing;
import ua.lviv.iot.Clothes.models.Clothes;
import ua.lviv.iot.Clothes.models.Dress;
import ua.lviv.iot.Clothes.models.MaterialTypes;
import ua.lviv.iot.Clothes.models.Shoes;
import ua.lviv.iot.Clothes.models.ShoesType;
import ua.lviv.iot.Clothes.models.Size;
import ua.lviv.iot.Clothes.models.Style;
import ua.lviv.iot.Clothes.models.TypesForWearing;
class ClothesManagerTest {
    
    private List<Clothes> listTest;
    private List<Clothes> expected;
    private List<Clothes> actual;
    private Dress dress5;
    private Dress dress0;
    private Shoes shoes1;
    private Shoes shoes2;
    private CeremonialClothing ceremonialClothing1;
    private CeremonialClothing ceremonialClothing2;
    private ClothesManager clothesManager;
    
    @BeforeEach
    public void setUP() {
        clothesManager = new ClothesManager();
        dress5 = new Dress();
        dress5.setBrand("Gucci");
        dress5.setColor("Green");
        dress5.setPrice(6500);
        dress5.setMaterialTypes(MaterialTypes.COTTON);
        dress5.setSize(Size.S);
        dress5.setTypesForWearing(TypesForWearing.FASTIVE);
        
        dress0 = new Dress();
        dress0.setBrand("Zara");
        dress0.setColor("white");
        dress0.setPrice(6000);
        dress0.setMaterialTypes(MaterialTypes.SYNTHETIC);
        dress0.setSize(Size.L);
        dress0.setTypesForWearing(TypesForWearing.HOME);
        
        shoes1 = new Shoes();
        shoes1.setBrand("NIKE");
        shoes1.setColor("BLACK");
        shoes1.setHasLaces(true);
        shoes1.setPrice(2000);
        shoes1.setShoesType(ShoesType.BAGS);
        shoes1.setTypesForWearing(TypesForWearing.FASTIVE);
        
        shoes2 = new Shoes();
        shoes2.setBrand("ADIDAS");
        shoes2.setColor("GRAY");
        shoes2.setHasLaces(true);
        shoes2.setPrice(3005);
        shoes2.setShoesType(ShoesType.SNEAKERS);
        shoes2.setTypesForWearing(TypesForWearing.EVERYDAY);
        
        ceremonialClothing1 = new CeremonialClothing();
        ceremonialClothing1.setBrand("ARMANI");
        ceremonialClothing1.setColor("RED");
        ceremonialClothing1.setPrice(3000);
        ceremonialClothing1.setSets("AMERICAN");
        ceremonialClothing1.setStyle(Style.CLASSICALSUIT);
        ceremonialClothing1.setTypesForWearing(TypesForWearing.FASTIVE);
        
        ceremonialClothing2 = new CeremonialClothing();
        ceremonialClothing2.setBrand("BALANCE");
        ceremonialClothing2.setColor("BROWN");
        ceremonialClothing2.setPrice(8000);
        ceremonialClothing2.setSets("FASTive");
        ceremonialClothing2.setStyle(Style.ENGLISHSUIT);
        ceremonialClothing2.setTypesForWearing(TypesForWearing.EVERYDAY);
        
        listTest = Arrays.asList(dress0, dress5,
                shoes1, shoes2, ceremonialClothing1, ceremonialClothing2);
    
      
        clothesManager.setClothesList(listTest);
    }

    @Test
    void testFindByCeremonial() {
        Assertions.assertEquals(3, clothesManager.findByCeremonial(TypesForWearing.FASTIVE).size());
        Assertions.assertEquals(2, clothesManager.findByCeremonial(TypesForWearing.EVERYDAY).size());
        Assertions.assertEquals(1, clothesManager.findByCeremonial(TypesForWearing.HOME).size());

    }
    
    
    @Test
    void testSortByPriceIncreasing() {
        expected = Arrays.asList(shoes1, ceremonialClothing1, shoes2, dress0, dress5, ceremonialClothing2);
        actual = clothesManager.sortByPrice(listTest, false);
        Assertions.assertEquals(expected, actual);
        
    }
    
    @Test
    void testSortByPriceDecreasing() {
        expected = Arrays.asList(ceremonialClothing2, dress5, dress0, shoes2, ceremonialClothing1, shoes1);
        actual = clothesManager.sortByPrice(listTest, true);
        Assertions.assertEquals(expected, actual);
        }
    
    @Test
    void testSortByBrandToCheaper() {
        expected = Arrays.asList(shoes2, ceremonialClothing1, ceremonialClothing2, dress5,
                shoes1, dress0);
        actual = clothesManager.sortByBrand(listTest, false);
        Assertions.assertEquals(expected, actual);
        }
    
    @Test
    void testSortByBRandToCostly() {
        expected = Arrays.asList(dress0, shoes1, dress5,
                ceremonialClothing2, ceremonialClothing1, shoes2);
        actual = clothesManager.sortByBrand(listTest, true);
        Assertions.assertEquals(expected, actual);
        }
}
