/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js12prakpbo;

/**
 * Created by 21343065_PUTI ZAFANIA
 * @author cocaa
 */
public class Latihan6 {
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    
    public Latihan6(String namaBuah, String hargaBuah, String warnaBuah){
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }
    public void setPrice (String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah){
        this.warnaBuah = warnaBuah;
    }
    public String getName(){
        return namaBuah;
    }
    public String getPrice(){
        return hargaBuah;
    }
    public String getColor(){
        return warnaBuah;
    }
}