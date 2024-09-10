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
public class bai6 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh dien tich va chu vi hinh chu nhat");
        Scanner sc =new Scanner(System.in);
        double chieudai, chieurong, chuvi, dientich;
        System.out.println("Nhap chieu dai: ");
        chieudai = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        chieurong = sc.nextDouble();
        chuvi = (chieudai + chieurong) * 2;
        dientich = chieudai * chieurong;
        System.out.println("Chu vi=" + chuvi);
        System.out.println("Dien tich=" + dientich);
    }
}
