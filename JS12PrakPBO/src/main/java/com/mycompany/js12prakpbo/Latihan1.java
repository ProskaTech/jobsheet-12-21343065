/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12prakpbo;

/**
 * Created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */

class Kendaraan{
    double hargaDasar = 1000000;
    public void tampilkanHarga(){
        System.out.println("Harga kendaraan adalah Rp. "+hargaDasar);
    }
}
class RodaDua extends Kendaraan{
    double NaikHargaKe = 0.20;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp. "+hargaDasar);
    }
}
class RodaEmpat extends Kendaraan{
    double NaikHargaKe = 8;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp. "+hargaDasar);
    }
}

public class Latihan1 {
    public static void main(String[]args){
        RodaDua sepeda = new RodaDua();
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}