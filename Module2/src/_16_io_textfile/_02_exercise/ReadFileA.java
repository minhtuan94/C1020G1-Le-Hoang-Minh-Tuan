package _16_io_textfile._02_exercise;

import java.io.*;
import java.util.Scanner;

public class ReadFileA {
    public static void main(String[] args) {
        try {
            File readA = new File("src/_16_io_textfile/_02_exercise/foldera/filea.csv");
            FileReader fileReader = new FileReader(readA);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("có ngoại lệ");
            e.printStackTrace();
        }
    }
}
