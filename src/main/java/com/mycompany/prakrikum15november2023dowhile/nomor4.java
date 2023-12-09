/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakrikum15november2023dowhile;

import java.util.Scanner;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int putar = 1;
        double jumlah = 0, bilangan;
        do {            
            System.out.print("masukan data ke "+putar+" : ");
            bilangan=in.nextDouble();
            jumlah = jumlah + bilangan;
            putar++;
            
        } while (putar<=5);
        System.out.println("jumlah 5 bilangan input adalah "+jumlah);
    }
}
