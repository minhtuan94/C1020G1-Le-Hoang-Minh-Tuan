package _16_io_textfile.optional.read_file;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("src/_16_io_textfile/optional/read_file/file.csv");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
