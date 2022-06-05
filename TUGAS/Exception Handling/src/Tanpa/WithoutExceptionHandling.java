/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tanpa;

/**
 *
 * @author marif
 */
public class WithoutExceptionHandling {
    public static void main (String[] args){
        System.out.println("\n********* PROGRAM TANPA EXCEPTION HANDLING *********\n");
        int hasil = 9/0; //Penyebab exception
        System.out.println("Hasil pembagian = "+hasil);
        System.out.println("Pernyataan setelah bebas dari exception.");
    }
}
