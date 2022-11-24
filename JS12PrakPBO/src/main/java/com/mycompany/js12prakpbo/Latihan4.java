/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12prakpbo;

/**
 * Created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */

abstract class orang{
    public String namaAyah = "Randi Proska";
    abstract void makan();
    public void minum(){
        System.out.println("Minum Air Teh dan Kopi");
    }
}
class anakUmur1Tahun extends orang{
    public void namaAyahku(){
        System.out.println("Nama Ayahku adalah "+namaAyah);
    }
    @Override
    public void makan(){
        System.out.println("Anak umur 1 tahun makan ASI");
    }
    @Override
    public void minum(){
        System.out.println("Anak umur 1 tahun minum ASI");
    }
}

public class Latihan4 {
     public static void main (String args[]){
        anakUmur1Tahun a1 = new anakUmur1Tahun();
        
        a1.makan();
        a1.minum();
        a1.namaAyahku();
        System.out.println();
    }
}