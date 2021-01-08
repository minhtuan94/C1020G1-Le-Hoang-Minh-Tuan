package common;

import model.DienThoaiChinhHang;
import model.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static void writeFileToDienThoaiChinhHang(List<DienThoaiChinhHang> dienThoaiChinhHangList, String filename) {
        int temp;
        try {
            temp = 1;
            FileWriter fileWriter = new FileWriter(filename,true);
            for (DienThoaiChinhHang dtch : dienThoaiChinhHangList) {
                fileWriter.write(temp + ". " + dtch.getTenDienThoai() + "," + dtch.getGiaBan() +
                        "," + dtch.getGiaBan() + "," + dtch.getSoluong() + "," + dtch.getNhaSanXuat() + ","
                        + dtch.getThoiGianBaoHanh() + "," + dtch.getPhamViBaoHanh());
                fileWriter.write("\n");
                temp++;
            }
            fileWriter.close();
            System.out.println("Ghi file thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFileToDienThoaiXachTay(List<DienThoaiXachTay> dienThoaiXachTayList, String filename) {
        int temp;
        try {
            temp = 1;
            FileWriter fileWriter = new FileWriter(filename,true);
            for (DienThoaiXachTay dtxt : dienThoaiXachTayList) {
                fileWriter.write(temp + ". " + "," + dtxt.getTenDienThoai() + "," + dtxt.getGiaBan() +
                        "," + dtxt.getGiaBan() + "," + dtxt.getSoluong() + "," + dtxt.getNhaSanXuat() + ","
                        + dtxt.getQuocGiaXachTay() + "," + dtxt.getTrangThai());
                fileWriter.write("\n");
                temp++;
            }
            fileWriter.close();
            System.out.println("Ghi file thành công");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> readFile(String filePath) {
        List<String[]> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] elementLine = line.split(",");
                list.add(elementLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void creatFile(String filePath){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                    (new File(filePath), false));
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
