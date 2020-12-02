package _02_Array_and_loop._02_exercise;

import java.util.Scanner;

public class _02_show_20primetive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //hiển thị số nguyên tố
        System.out.print("Nhập số lượng snt cần hiển thị: ");
        int n = scanner.nextInt();
        int count = 0;
        int num = 2;
        while (count < n){
            if(ktSNT(num)){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }

    //hàm kiểm tra số nguyên tố
    public static boolean ktSNT(int a) {
        boolean check = true;
        if (a < 2) {
            check = false;
        }else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    check = false;
                    break;
                }
            }
        }

        if (check) {
            return true;
        } else {
            return false;
        }
    }

}
