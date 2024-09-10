/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class bai4 {
    public static void main(String[] args) {
        System.out.println("chuong trinh tinh tong hieu tinh thuong");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = sc.nextInt();
        System.out.println("Nhap so b");
        int b = sc.nextInt();
        int tong=tong(a,b);
        int hieu=a-b;
        double thuong=(double)a/b;
        int tich=a*b;
        System.out.println(a+ " + "+ b +" = "+ tong);
        System.out.println(a+ " / "+ b +" = "+ thuong);
        System.out.println(a+ " - "+ b +" = "+ hieu);
        System.out.println(a+ " / "+ b +" = "+ thuong(a,b));
        System.out.println(a+ " * "+ b +" = "+ tich);
    }
        private static int tong(int a,int b) {
            return a+b;
            
        }
        private static String thuong(int a,int b)
        {
            if(b == 0) {
                return "Khong chia het cho 0";
            }else{
            return Double.toString((double)a/b);
            
        }
    }
}


