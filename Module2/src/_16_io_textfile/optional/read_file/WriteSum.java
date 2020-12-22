package _16_io_textfile.optional.read_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSum {
    public static void main(String[] args) {
        try{
            File file = new File("src/_16_io_textfile/optional/read_file/file1.csv");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("src/_16_io_textfile/optional/read_file/file1.csv");
            fileWriter.write("1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n");
            fileWriter.close();

            System.out.println("Ghi file thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
