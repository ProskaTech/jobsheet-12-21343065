/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12prakpbo;

/**
 * Created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */

interface AktivitasPagi{
    abstract void lari();
    
    abstract void berenang();
}
class AktivitasPagiAnak implements AktivitasPagi{
    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }
    @Override
    public void berenang(){
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}

public class Latihan5 {
    public static void main(String args[]){
        AktivitasPagiAnak a1 = new AktivitasPagiAnak();
        
        a1.lari();
        a1.berenang();
    }
}
