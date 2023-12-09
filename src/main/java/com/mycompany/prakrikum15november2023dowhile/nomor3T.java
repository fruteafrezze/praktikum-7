  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakrikum15november2023dowhile;

import java.util.Scanner;// Mengimport kelas scanner pada java agar dapat membaca data yang dimasukan lewat keyboard

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor3T {// deklarasi class
    public static void main(String[] args) {// deklarasi main
        Scanner in = new Scanner(System.in);//membuat objek bernama in dengan class scanner
        
        double beratMangga;// memesan tempat dimemori dengan nama beratMangga dengan tipe data double
        
        do {// melakukan perintah dibawah selama syarat while terpenuhi            
            System.out.print("masukan berat mangga (gram) : ");//mencetak tulisan dimonitor "masukan berat mangga (gram) : "
            beratMangga=in.nextDouble();// membaca input data dari keyboard lalu disimpan ke variable beratMangga
            
            if (beratMangga <0 ){// jika isi variable beratMangga kurang dari 0 maka
                System.out.println("input anda salah, mohon coba lagi.");// menceteak tulisan di monitor "input anda salah, mohon coba lagi."
            }
        } while (beratMangga <0 );// selama isi variable beratMangga kurang sama dengan 0 
        
        if (beratMangga < 500){// jika isi variable beratMangga  kurang dari 500 maka,
            System.out.println("kualitas mangga Biasa");// mencetak tulisan kualitas mangga Biasa
        } else if (beratMangga < 750){ //jika isi variable beratMangga  kurang dari 500 maka,
            System.out.println("kualitas mangga Bagus");// mencetak tulisan kualitas mangga Bagus
        } else { //jika isi variable beratMangga  kurang dari 500 maka,
            System.out.println("kualitas mangga unggul");// mencetak tulisan kualitas mangga unggul
        }
    }
}
