/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2_nilaihuruf;
import java.util.Scanner;
/**
 *
 * @author marif
 */
public class Latihan2_NilaiHuruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukkan nilai = ");
        int angka = inputan.nextInt();
        
        if(angka <= 55){
            System.out.println("E");
        } else if(angka <= 65){
            System.out.println("D");
        } else if(angka <= 75){
            System.out.println("C");
        } else if(angka <= 85){
            System.out.println("B");
        } else if(angka <= 100){
            System.out.println("A");
        } else if(angka > 100){
            System.out.println("Error");
        } else if(angka < 0){
            System.out.println("Error");
        }
        
    }
    
}
