/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12prakpbo;

/**
 * Created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */

class CompileTime{
    static int keliling(int a){
        return 4 * a;
    }
    static int keliling(int L, int b){
        return 2 * (L + b);
    }
}

public class Latihan2 {
    public static void main(String[]args){
        System.out.println("Sisi persegi adalah : 4 \nkeliling persegi adalah : " 
                + CompileTime.keliling(4)+ "\n");
        
        System.out.println("Sisi persegi panjang adalah : 10, 13\nKeliling persegi panjang adalah : "
                            + CompileTime.keliling(10, 13));
    }
}