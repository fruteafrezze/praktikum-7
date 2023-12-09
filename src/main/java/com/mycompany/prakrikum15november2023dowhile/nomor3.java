/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakrikum15november2023dowhile;

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor3 {
    public static void main(String[] args) {
        int jumlah =0, bilangan= 0;
        do {            
            jumlah = jumlah + bilangan;
            bilangan= bilangan+5;
        } while (bilangan <= 100);
        System.out.println("Jumlah dari 5+10+…+100 = "+jumlah);
    }
}
