/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author hp
 */
public class Yamaha {
    public static void main(String[] args){
        SepedaMotor motor = new SepedaMotor();
        motor.inputMerk("Yamaha");
        System.out.println("Merk motor ini adalah " + motor.tampilMerk());
    }
}
