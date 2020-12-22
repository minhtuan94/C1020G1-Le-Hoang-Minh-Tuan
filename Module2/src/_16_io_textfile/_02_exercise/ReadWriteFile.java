package _16_io_textfile._02_exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static List<String> readfile (String fileName) {
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

    public static void write(List<String> list,String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName,true);
            for (String string : list) {
                fileWriter.write(string);
                fileWriter.write("\n");
                System.out.println(string);
            }
            fileWriter.close();
            System.out.println("Ghi file thành công.");
        } catch (IOException e){
            System.out.println("Có ngoại lệ");
            e.printStackTrace();
        }
    }
}
