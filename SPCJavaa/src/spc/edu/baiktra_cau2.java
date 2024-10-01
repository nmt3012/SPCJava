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
public class baiktra_cau2 {
     public static void main(String[] args) {
        System.out.println("Chuong trinh tinh dien tich va chu vi hinh chu nhat");
        Scanner sc =new Scanner(System.in);
        double canha, canhb, canhc, nuachuvi,chuvi, dientich;
        System.out.println("Nhap canha: ");
        canha = sc.nextDouble();
        System.out.println("Nhap canhb: ");
        canhb = sc.nextDouble();
         System.out.println("Nhap canhc: ");
        canhc = sc.nextDouble();
        nuachuvi = (canha + canhb + canhc) / 2;
        dientich = Math.sqrt(nuachuvi*(nuachuvi - canha) * (nuachuvi-canhb) * (nuachuvi - canhc));
        chuvi = (canha + canhb + canhc);
        
        System.out.println("Chu vi=" + chuvi);
        System.out.println("Dien tich=" + dientich);
    }
}
