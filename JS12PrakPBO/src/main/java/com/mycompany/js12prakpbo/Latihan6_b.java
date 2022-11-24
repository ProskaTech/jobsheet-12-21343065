/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12prakpbo;

/**
 * Created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */
public class Latihan6_b {
     public static void main(String[]args){
        Latihan6 Apel = new Latihan6("Apel", "Rp.3000","Merah");
        System.out.println("Nama Buah : "+Apel.getName()+"\nHarga: "+Apel.getPrice()+"\nWarna: "
                            +Apel.getColor());
        
        Apel.setColor("Hijau");
        Apel.setPrice("Rp.7000");
        System.out.println("\nInformasi terkait Apel setelah diupdate");
        System.out.println("Nama Buah: "+Apel.getName()+"\nHarga: "+Apel.getPrice()+"\nWarna: "
                            +Apel.getColor());
    }
}