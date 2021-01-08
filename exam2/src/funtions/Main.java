package bai_thi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int countId = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int luaChon;
        do {
            showMenu();
            luaChon = Integer.parseInt(input.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("them dien thoai");
                    System.out.println("1.chinh hang");
                    System.out.println("2.xach tay");
                    System.out.println("3.thoat");
                    System.out.println("lua chon cua ban?");
                    int luaChon1 = Integer.parseInt(input.nextLine());
                    switch (luaChon1) {
                        case 1://dien thoai chinh hang
                            List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
                            DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang();
                            dienThoaiChinhHang.setId(++countId);
                            dienThoaiChinhHang.nhap();
                            dienThoaiChinhHangList.add(dienThoaiChinhHang);
                            try {
                                FileWriter fileWriter = new FileWriter("src/bai_thi/mobiles.csv", true);
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                for (DienThoaiChinhHang dienThoaiChinhHang1 : dienThoaiChinhHangList) {
                                    bufferedWriter.write(String.valueOf(dienThoaiChinhHang1));
                                    bufferedWriter.newLine();
                                }
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 2://dien thaoi xach tay
                            List<DienThoaiXachTay> dienThoaiXachTayArrayList = new ArrayList<>();
                            DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay();
                            dienThoaiXachTay.setId(++countId);
                            dienThoaiXachTay.nhap();
                            dienThoaiXachTayArrayList.add(dienThoaiXachTay);
                            try {
                                FileWriter fileWriter = new FileWriter("src/bai_thi/mobiles.csv", true);
                                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                                for (DienThoaiXachTay dienThoaiXachTay1 : dienThoaiXachTayArrayList) {
                                    bufferedWriter.write(String.valueOf(dienThoaiXachTay1));
                                    bufferedWriter.newLine();
                                }
                                bufferedWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
                    System.out.println("nhap id can xoa");
                    int idXoa = Integer.parseInt(input.nextLine());
                    try {
                        FileReader fileReader = new FileReader("src/bai_thi/mobiles.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String chinhHang[] = line.split(",");
                            int id = Integer.parseInt(chinhHang[0]);
                            String tenDienThoai = chinhHang[1];
                            String giaBan = chinhHang[2];
                            String soLuong = chinhHang[3];
                            String nhaSanXuat = chinhHang[4];
                            String thoiGianBaoHanh = chinhHang[5];
                            String phamViBaoHanh = chinhHang[6];
                            dienThoaiChinhHangList.add(new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong,
                                    nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh));
                        }
                        boolean check = false;
                        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
                            if (idXoa == dienThoaiChinhHangList.get(i).getId()) {
                                check = true;
                                System.out.println("ban co muon xoa khong?");
                                System.out.println("1.co");
                                System.out.println("2.huy");
                                int luaChon2 = Integer.parseInt(input.nextLine());
                                switch (luaChon2) {
                                    case 1:
                                        dienThoaiChinhHangList.remove(dienThoaiChinhHangList.get(i));
                                        System.out.println("da xoa thanh cong");
                                        break;
                                    case 2:
                                        break;
                                }
                            } else check = false;
                        }
                        if (check == false) {
                            System.out.println("khong co trong dnah sach");
                        }

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        FileWriter fileWriter=new FileWriter("src/bai_thi/mobiles.csv");
                        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                        for (DienThoaiChinhHang dt:dienThoaiChinhHangList) {
                            bufferedWriter.write(String.valueOf(dt));
                            bufferedWriter.newLine();
                        }
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    break;
                case 3://xem danh sach dt
                    List<DienThoaiChinhHang> list = new ArrayList<>();
                    try {
                        FileReader fileReader = new FileReader("src/bai_thi/mobiles.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String chinhHang[] = line.split(",");
                            int id = Integer.parseInt(chinhHang[0]);
                            String tenDienThoai = chinhHang[1];
                            String giaBan = chinhHang[2];
                            String soLuong = chinhHang[3];
                            String nhaSanXuat = chinhHang[4];
                            String thoiGianBaoHanh = chinhHang[5];
                            String phamViBaoHanh = chinhHang[6];
                            list.add(new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong,
                                    nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh));

                        }
                        for (DienThoaiChinhHang dt : list) {
                            System.out.println(dt.toString());
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    List<DienThoaiChinhHang> list1 = new ArrayList<>();
                    try {
                        FileReader fileReader = new FileReader("src/bai_thi/mobiles.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        String line = "";
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            String chinhHang[] = line.split(",");
                            int id = Integer.parseInt(chinhHang[0]);
                            String tenDienThoai = chinhHang[1];
                            String giaBan = chinhHang[2];
                            String soLuong = chinhHang[3];
                            String nhaSanXuat = chinhHang[4];
                            String thoiGianBaoHanh = chinhHang[5];
                            String phamViBaoHanh = chinhHang[6];
                            list1.add(new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong,
                                    nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh));
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("ban muon tim theo ten hay theo id??");
                    System.out.println("1.ten");
                    System.out.println("2.id");
                    System.out.println("3.thoat");
                    System.out.println("nhap lua chon");
                    int luaChon4 = Integer.parseInt(input.nextLine());
                    switch (luaChon4) {
                        case 1:
                            System.out.println("nhap ten dien thoai can tim");
                            String tenCanTim = input.nextLine();
                            for (int i = 0; i < list1.size(); i++) {
                                if (list1.get(i).getTenDienThoai().contains(tenCanTim)) {
                                    System.out.println(list1.get(i));
                                }
                            }
                            break;
                        case 2:
                            System.out.println("nhap id can tim");
                            int idCanTim = Integer.parseInt(input.nextLine());
                            for (int i = 0; i < list1.size(); i++) {
                                if (list1.get(i).getId() == idCanTim) {
                                    System.out.println(list1.get(i));
                                }
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;

                case 5:
                    System.out.println("tam biet");
                    break;
            }
        } while (luaChon != 5);
    }

    public static void showMenu() {
        System.out.println("***menu****");
        System.out.println("1.them moi");
        System.out.println("2.xoa");
        System.out.println("3.xem danh sach dien thoai");
        System.out.println("4.tim kiem");
        System.out.println("5.thoat");
        System.out.println("nhap lua chon chua ban");
    }
}
