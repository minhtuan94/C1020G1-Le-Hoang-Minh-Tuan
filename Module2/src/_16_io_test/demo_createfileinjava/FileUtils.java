package _16_io_test.demo_createfileinjava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public void writeFile(String pathFile, String line){
        try{
            FileWriter fileWriter = new FileWriter(pathFile,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
