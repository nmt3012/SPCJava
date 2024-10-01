/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author Administrator
 */
public class Bai21_String01 {
    public static void main(String[] args) {
        System.out.println("BAI TAP VE STRING");
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP HO VA TEN");
        String hovaten = sc.nextLine();
        // Nguyen Minh Triet
        System.out.println("HO: " + hovaten.substring(0, 6));
        System.out.println("Chu Lot: " + hovaten.substring(6, 11));
        System.out.println("Ten: " + hovaten.substring(12));
        
        System.out.println("Chu Minh: " + hovaten.substring(6, 11));
        System.out.println("HO VA TEN: " + hovaten.toUpperCase());
    }
}
 
