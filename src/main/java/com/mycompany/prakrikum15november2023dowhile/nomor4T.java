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
public class nomor4T {// deklarasi class
    public static void main(String[] args) {// deklarasi main
        Scanner in = new Scanner(System.in);// membuat objek bernama in dengan class scanner
        
        
        int n =1;// memesan tempat di memori dengan nama n dengan tipe data integer
        double jumlah = 0, jumlahKuadrat=0;// memesan tempat di memori dengan nama jumlah, jumlahKuadrat dengan tipe data double
        double bilangan, dataInput,rerata,selisih,min=0,maks=0,varia,devia;// memesan tempat dimemori dengan nama bilangan, dataInput, rerata, selisih, maks, min, devia, varia dengan tipe data double 
     
        
        System.out.print("masukan data yang ingin dihitung : ");// mencetak tulisan "masukan data yang ingin dihitung : "
        dataInput=in.nextDouble();// membaca dan menyimpan input dari keyboard lalu disimpan ke variable dataInput
        
        do {
            System.out.println("masukan data ke "+n+" : ");// mencetak tulisan "masukan data ke " disambung dengan isi variable n disambung dengan " : "
            bilangan = in.nextDouble();// membaca dan menyimpan input dari keyboard lalu disimpan ke variable bilangan 
            jumlah = jumlah + bilangan;//menyimpan hasil perhitungan dari isi variable jumlah ditambah isi variable bilangan lalu disimpan ke variable jumlah
            jumlahKuadrat = jumlahKuadrat+Math.pow(bilangan, 2) ;//menyimpan hasil perhitungan dari isi variable jumlahKuadrat ditambah pangakat 2 dari isi variable bilangan lalu disimpan ke variable jumlahKuadrat
            
            if (bilangan==1) maks=bilangan;//jika isi variable bilangan sama dengan 1 maka menyimpan bilangan ke variable maks
            else if (bilangan>maks) maks=bilangan;// jika bilangan lebih besar dari variable maks maka menyimpan variable bilangan ke variable maks
            if (bilangan==1) min=bilangan;//jika isi variable bilangan sama dengan 1 maka menyimpan bilangan ke variable min
            else if (bilangan<min) min=bilangan;//jika bilangan lebih besar dari variable min maka menyimpan variable bilangan ke variable min
            n++;// menyimpan hasil perhitungan dari isi variable n ditambah dengan 1 lalu disimpan ke variable loop
        
        } while (n <= dataInput); // selama isi variable n kurang sama dengan isi variable dataInput
            
        System.out.println("data terbesar = "+maks);//mencetak tulisan "data terbesar = " disambung isi variable maks
        System.out.println("data terkecil = "+min);//mencetak tulisan "data terkecil = " disambung isi variable min
        
        selisih=maks-min;//menyimpan hasil hitung dari isi variable maks dikurangi isi variable min
        System.out.println("rentang data = "+selisih);//mencetak tulisan "rantang data = " disambung isi variable selisih

        rerata=jumlah/dataInput;// menyimpan hasil hitung isi variable jumlah dibagi isi variable dataInput
        System.out.println("rata rata = "+rerata);//mencetak tulisan "rata rata = " disambung isi variable rerata
         
        varia= jumlahKuadrat - n*Math.pow(rerata, 2)/n;//menyimpan hasil hitung isi variable jumlahKuadrat dikurang isi variable loop dikali pangkat 2 isi variable rerata dibagi isi variable loop lalu disimpan ke variable varia
        System.out.println("variansi = "+varia);//mencetak tulisan "variansi = " disambung isi variable varia
        
        devia= Math.sqrt(varia);// menyimpan hasil hitung akar isi variable varia lalu disimpan ke variable devia
        System.out.println("deviasi standard = "+devia);//mencetak tulisan "deviasi standard = " disambung isi variable devia
    }
}
