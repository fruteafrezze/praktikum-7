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
public class nomor1T {// deklarasi class
    public static void main(String[] args) {// deklarasi main
        Scanner input = new Scanner(System.in);// membuat objek bernama input dengan class scanner
        
        double a, b, c;// memesan tempat di memori dengan nama a, b, c dengan tipe data double
        
        do { //// melakukan perintah dibawah sampai syarat while tidak lagi terpenuhi
            System.out.print("Masukkan nilai a (a ≠ 0): ");// mencetak tulisan "masukan nilai a (a tidak sama dengan 0)"
            a = input.nextDouble(); // membaca input data dari keyboard lalu disimpan ke variable a
            
            if (a == 0) {// jika isi variable a sama dengan 0 maka
                System.out.println("Nilai a tidak boleh 0. Silakan coba lagi.");// mencetak tulisan dimonitor "nilai a tidak boleh 0. silahkan coba lagi"
            }
        } while (a == 0);// selama isi variable a sama dengan 0 maka akan mengulang sampai syarat ini tidak tepenuhi
        
        System.out.print("Masukkan nilai b: ");//mencetak tulisan "masukan nilai b : )"
        b = input.nextDouble();// membaca input data dari keyboard lalu dimasukan ke variable b
        
        System.out.print("Masukkan nilai c: ");//mencetak tulisan "masukan nilai c : "
        c = input.nextDouble();// membaca input data dari keyboard lalu disimpan ke variable c
        
        
        double diskriminan = b * b - 4 * a * c;// menghitung hasil dari isi variabel b pangkat 2 dikurang 4 dikali isi variabel a dikali isi variable c lalu disimpan ke diskriminan
        //System.out.println(diskriminan);
        if (diskriminan > 0) { // jika isi variable diskriminan lebih besar dari 0, maka
            double akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);// menyimpan hasil dari -isi variable b ditambah akar isi variable diskriminan dibagi 2 dikali isi variable a
            double akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);// menyimpan hasil dari -isi variable b dikurang akar isi variable diskriminan dibagi 2 dikali isi variable a
            System.out.println("Persamaan kuadrat memiliki dua akar berbeda:");// mencetak tulisan "Persamaan kuadrat memiliki dua akar berbeda:"
            System.out.println("Akar 1 = " + akar1);//  mencetak tulisan "akar1 = " disambung isi variable akar1
            System.out.println("Akar 2 = " + akar2);//  mencetak tulisan "akar1 = " disambung isi variable akar1
        } else if (diskriminan == 0) {// selain itu, jika isi variable diskriminan sama dengan 0 maka
            double akar = -b / (2 * a);// menyimpan hasil dari -isi variable b dibagi 2 dikali isi variable a ke variable akar
            System.out.println("Persamaan kuadrat memiliki satu akar ganda:");// mencetak tulisan "Persamaan kuadrat memiliki satu akar ganda:"
            System.out.println("Akar = " + akar);// mencetak tulisan "akar = " disambung isi variable akar
            
        } else {// selain itu, maka
            System.out.println("Persamaan kuadrat tidak memiliki akar real.");// mencetak tulisan Persamaan kuadrat tidak memiliki akar real."
        }
    }
}
