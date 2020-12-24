package _17_io_binary_file._02_exercise.manage_product.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileX {
    public static List<String> readFile (String fileName) {
        List<String> a = new ArrayList<>();
        try {
            File readA = new File(fileName);
            FileReader fileReader = new FileReader(readA);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                a.add(line);
            }
        } catch (IOException e) {
            System.out.println("có ngoại lệ");
            e.printStackTrace();
        }
        return a;
    }
}