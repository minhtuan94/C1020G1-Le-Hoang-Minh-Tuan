package _16_io_textfile._02_exercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File a = new File("src/_16_io_textfile/_02_exercise/foldera/filea.csv");
            File b = new File("src/_16_io_textfile/_02_exercise/folderb/fileb.csv");
            if (a.createNewFile()||b.createNewFile()){
                System.out.println("File đã được tạo: "+a.getName());
                System.out.println("File đã được tạo: "+b.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Có ngoại lệ");
            e.printStackTrace();
        }
    }
}
