package _16_io_textfile._02_exercise;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("src/_16_io_textfile/_02_exercise/foldera/filea.csv"));
            outStream = new FileOutputStream(new File("src/_16_io_textfile/_02_exercise/folderb/fileb.csv"));

            int length;
            byte[] buffer = new byte[1024];

            // copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied successful!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert inStream != null;
            inStream.close();
            assert outStream != null;
            outStream.close();
        }
    }
}
