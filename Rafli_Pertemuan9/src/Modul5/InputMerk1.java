/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hp
 */
public class InputMerk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader Input = new BufferedReader(
        new InputStreamReader(System.in));
        String merk;
        System.out.print("Masukan Merk : ");
        merk = Input.readLine();
        System.out.println("Merk motor ini adalah " + merk);
    }
    
    
}
