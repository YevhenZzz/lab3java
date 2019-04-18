package ua.lviv.iot.Clothes.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.Clothes.models.Clothes;

public class ClothesWriter {
    
    public ClothesWriter() {
        
    }
    
    public void writeToFile(List<Clothes> list, File file) throws IOException {
        
        try (FileOutputStream fos = new FileOutputStream(file);
                OutputStreamWriter osv = new OutputStreamWriter(fos, "UTF-8");
                BufferedWriter bufWriter = new BufferedWriter(osv);) {

            for (int j = 0; j < list.size(); j++) {
                bufWriter.write(list.get(j).getHeaders());
                bufWriter.newLine();
                bufWriter.write(list.get(j).toCSV());
                if (j < list.size() - 1) {
                    bufWriter.newLine();
                }
            }
        }
    }
}
