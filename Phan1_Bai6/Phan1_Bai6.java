/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan1_Bai6;


import java.util.*;

public class Phan1_Bai6 {
    // 1.Dem so ky tu thuong trong chuoi
    static void DemKyTu(char[] str) {

        int count = 0;
        char c;
        for (int i = 0; i < str.length; i++) {
            c = str[i];
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        System.out.println();
        System.out.println("So ky tu thuong trong chuoi la : " + count);

    }
// 2.Lay tat ca cac ky tu hoa co trong mang
    static void LayHoa(char[] str) {

        for (int i = 0; i < str.length; i++) {
            if (Character.isLetter(str[i]) && Character.isUpperCase(str[i])) {
                System.out.print(" " + str[i]);
            }

        }

    }
  // 3.Kiem tra co ki tu cho truoc hay khong
  private static void KiemTra(char[] str, char x) {

    int count = 0;
    for (int i = 0; i < str.length; i++) {
        if (str[i] == x) {
            count++;
        }
    }
    if (count == 1) {
        System.out.println("Co ky tu cho truoc la : " + x);

    } else {
        System.out.println("Khong co ky tu cho truoc!");
    }
}
    public static void main(String[] args) {
        char[] str = { 'a', 'B', 'c', 'A', 'C', 'x', 'g', 'J' };
        System.out.println("Chuoi la :");

        for (int i = 0; i < str.length; i++) {
            System.out.print(" " + str[i]);
        }
        DemKyTu(str);
        System.out.println();
        char x = 'a';
        KiemTra(str, x);
        System.out.println("Lay ki tu hoa trong mang :");
        LayHoa(str);

    }

  
}
