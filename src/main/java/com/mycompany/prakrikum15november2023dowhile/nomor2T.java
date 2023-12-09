/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakrikum15november2023dowhile;

import java.util.Scanner;//Mengimport kelas scanner pada java agar dapat membaca data yang dimasukan lewat keyboard

/**
 *
 * @author FILIPUS FERRY
 */
public class nomor2T {//deklarasi class
    public static void main(String[] args) {// deklarasi main
        Scanner in = new Scanner(System.in);// membuat objek bernama in dengan class scanner
        double uts1,uts2, uas;// memesan tempat dimemori bernama uts1, uts2, uas dengan tipedata double
        double nilaiTotal=0;// memesan tempat dimemori bernama nilaiTotal dengan tipedata double
        System.out.println("input tidak boleh negatif");// mencetak tulisan " input tidak boleh negatif
        do { // melakukan perintah dibawah sampai syarat while tidak lagi terpenuhi
            System.out.println("masukan nilai uts1 : ");// mencetak tulisan "masukan nilai uts1 : "
            uts1=in.nextDouble();// membaca input data lalu disimpan ke variable uts1
            if (uts1<0) System.out.println("maaf input salah, coba lagi.");// jika isi variable uts1 kurang dari 0 maka akan mencetak tulisan "maaf input salah, coba lagi"
        } while (uts1<0);// selama isi variable uts1 kurang dari 0 maka akan mengulang sampai syarat tidak lagi terpenuhi
        
        do { // melakukan perintah dibawah sampai syarat while tidak lagi terpenuhi
            System.out.println("masukan nilai uts2 : ");// mencetak tulisan "masukan nilai uts2 : "
            uts2=in.nextDouble();// membaca input data lalu disimpan ke variable uts2
            if (uts2<0) System.out.println("maaf input salah, coba lagi.");// jika isi variable uts2 kurang dari 0 maka akan mencetak tulisan "maaf input salah, coba lagi"
        } while (uts2<0);// selama isi variable uts2 kurang dari 0 maka akan mengulang sampai syarat tidak lagi terpenuhi
        
        do { // melakukan perintah dibawah sampai syarat while tidak lagi terpenuhi
            System.out.println("masukan nilai uas : ");// mencetak tulisan "masukan nilai uas : "
            uas=in.nextDouble();// membaca input data lalu disimpan ke variable uas 
            if (uas<0) System.out.println("maaf input salah, coba lagi.");// jika isi variable uas kurang dari 0 maka akan mencetak tulisan "maaf input salah, coba lagi"
        } while (uas<0);// selama isi variable uts2 kurang dari 0 maka akan mengulang sampai syarat tidak lagi terpenuhi
        
        nilaiTotal=0.3*uts1+0.3*uts2+0.4*uas;// menyimpan hasil dari 0.3 dikali isi variable uts1 ditambah 0.3 dikali isi varable uts2 ditambah 0.4 dikali isi variable uas lalu disimpan ke variable nilaiTotal
        if (nilaiTotal>= 80 ) { // jika isi variable nilaiTotal lebih besar sama dengan 80 maka 
                System.out.println("nilai anda A");// mencetak tulisan "nilai anda A"
            } else if (nilaiTotal>= 65) { // selain itu, jika isi variable nilai total lebih besar sama dengan 65 maka
                System.out.println("nilai anda B");// mencetak tulisan "nilai anda B"
            } else if (nilaiTotal>=55) { // selain itu, jika isi variable nilai total lebih besar sama dengan 55 maka
                System.out.println("nilai anda C");// mencetak tulisan "nilai anda C"
            } else if (nilaiTotal>=50) {// selain itu, jika isi variable nilai total lebih besar sama dengan 50 maka
                System.out.println("nilai anda D");// mencetak tulisan "nilai anda D"
            } else {// selain itu, maka
                System.out.println("nilai anda F");// mencetak tulisan "nilai anda F"
            }
    }
}
