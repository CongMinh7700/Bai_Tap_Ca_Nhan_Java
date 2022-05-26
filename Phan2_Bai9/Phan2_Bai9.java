/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan2_Bai9;


import java.util.*;
public class Phan2_Bai9 {
  


//1.Dem So ky tu viet hoa tren 2 duong cheo
    public static int demSoKyTu(char[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (i == j && Character.isLetter(matrix[i][j]) && Character.isUpperCase(matrix[i][j])) {
                    count++;
                }
                if (i + j == matrix.length - 1 && Character.isLetter(matrix[i][j]) && Character.isUpperCase(matrix[i][j])) {
                    count++;
                }
            }
        }
        System.out.println("So ky Tu hoa tren duong cheo la = " + count);
        return 0;
    }
 // Tim ky tu hoa xuat hien nhieu nhat mang  
  private static int demSoLanXuatHien(char[][] matrix, char c) {

    int count = 0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == c) {
                count++;
            }
        }
    }
    return count;
}
    public static char Dem(char[][] matrix) {
        int max = -1;
        char kq = '1';
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                char c = matrix[i][j];
                if (Character.isLetter(c) && Character.isUpperCase(c)) {
                    int tmp = demSoLanXuatHien(matrix, c);
                    if (tmp > max) {
                        max = tmp;
                        kq = c;
                    }
                }

            }
        }
        return kq;

    }
 // Chuyen tat ca cac ky tu viet thuong o 2 duong cheo thanh hoa  
   public static void Hoa(char[][] matrix) {

       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length; j++) {
               if (i == j && Character.isLetter(matrix[i][j])) {
                   matrix[i][j] = Character.toUpperCase(matrix[i][j]);

               }
               if (i + j == matrix.length - 1 && Character.isLetter(matrix[i][j])) {
                   matrix[i][j] = Character.toUpperCase(matrix[i][j]);

               }

           }
       }

   }
 
    public static void main(String[] args) {
        char[][] matrix = {{'A','B','B'}, {'d','e','f'}};
       
        System.out.println("Mang sau khi nhap la : ");
        System.out.println(Arrays.deepToString(matrix));
        demSoKyTu(matrix);
        System.out.println("Mang sau khi 2 duong cheo thanh hoa la : ");
        Hoa(matrix);
        char c = Dem(matrix);
        System.out.println("Ky tu xuat hien nhieu nhat trong mang la = " + c);
        System.out.println(Arrays.deepToString(matrix));
    }

   
}



