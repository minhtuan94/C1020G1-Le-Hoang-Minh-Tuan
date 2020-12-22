package _16_io_textfile._02_exercise;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileA {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("src/_16_io_textfile/_02_exercise/foldera/filea.csv");
            fileWriter.write("đây là file a");
            fileWriter.close();
            System.out.println("Ghi file thành công.");
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
