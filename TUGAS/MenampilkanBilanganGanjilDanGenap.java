/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menampilkan.bilangan.ganjil.dan.genap;

/**
 *
 * @author marif
 */
import java.util.*;
public class MenampilkanBilanganGanjilDanGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input;
        boolean isTrue = false;
        Scanner user = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        input = user.nextInt();
            if (input % 2 == 0) {
                System.out.println(input + " Adalah Bilangan Genap");
                 
            } else {
                System.out.println(input + " Adalah Bilangan Ganjil");
            }
    }
    
}
