/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;



/**
 *
 * @author Administrator
 */
public class bai18_ArrayList1 {
    private static void main(String[] args) {
        System.out.println("học tạo ArrayList");
        ArrayList ds = new ArrayList();
        for (int i = 0 ; i < 10 ; i++) {
            ds.add(i);
        }
        ds.add("minhtriet");
        ds.remove(6);
        ds.removeFirst();
        ds.removeLast();
        for (int i = 0; i < ds.size(); i++) {
            System.out.print(ds.get(i)+" ");
        }
    }
}
