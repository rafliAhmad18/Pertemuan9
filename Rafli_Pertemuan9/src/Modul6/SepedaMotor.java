/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

/**
 *
 * @author hp
 */
class SepedaMotor {
    private String merk, tipe;
    private int tangki;
    private long harga;
    public void inputMerk (String merk){
        this.merk = merk;
    }
    public void inputTipe (String tipe){
        this.tipe = tipe;
    }
    public void inputTangki(int tangki){
        this.tangki = tangki;
    }
    public void inputHarga(int harga){
        this.harga = harga;
    }
    public String tampilMerk(){
        return merk;
    }
    public String tampilTipe(){
        return tipe;
    }
    public int tampilTangki(){
        return tangki;
    }
    public long tampilHarga(){
        return harga;
    }
  
}
