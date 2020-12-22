package _16_io_textfile._02_exercise;

import java.util.List;

public class CopyFileAToB {
    public static void main(String[] args) {
        List<String> list = ReadWriteFile.readfile("src/_16_io_textfile/_02_exercise/foldera/filea.csv");
        List<String> list1 = ReadWriteFile.readfile("src/_16_io_textfile/_02_exercise/foldera/filec.csv");
        ReadWriteFile.write(list,"src/_16_io_textfile/_02_exercise/folderb/fileb.csv");
        ReadWriteFile.write(list1,"src/_16_io_textfile/_02_exercise/folderb/fileb.csv");
    }
}
