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
public class harga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SepedaMotor motor = new SepedaMotor();
        motor.inputMerk("Yamaha");
        motor.inputTipe("MX - 125cc");
        motor.inputTangki(4);
        motor.inputHarga(15000000);
        System.out.println("Rincian Motor : ");
        System.out.println("Merk    : " + motor.tampilMerk());
        System.out.println("Tipe    : " + motor.tampilTipe());
        System.out.println("Tangki  : " + motor.tampilTangki());
        System.out.println("Harga   : " + motor.tampilHarga());
    }
    
}
