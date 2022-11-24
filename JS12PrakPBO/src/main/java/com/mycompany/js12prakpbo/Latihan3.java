/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12prakpbo;

/**
 * Created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */

class Bank{
    float sukuBunga(){
        return 0;
    }
}
class BRI extends Bank{
    float sukuBunga(){
        return 5.5f;
    }
}
class BNI extends Bank{
    float sukuBunga(){
        return 10.6f;
    }
}
class Mandiri extends Bank{
    float sukuBunga(){
        return 9.4f;
    }
}

public class Latihan3 {
    public static void main(String[]args){
        Bank B;
        B = new BRI();
        System.out.println("Tingkat suku bunga BRI adalah : "+ B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat suku bunga BNI adalah : "+ B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat suku bunga Mandiri adalah : "+ B.sukuBunga());
    }
}
