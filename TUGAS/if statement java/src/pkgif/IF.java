/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;
import java.util.Scanner;
/**
 *
 * @author marif
 */
public class IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = input.nextInt();
        if (nilai >= 75){
            System.out.println("Selamat Anda Lulus");
        }
        if (nilai < 75){
            System.out.println("Maaf anda gagal");
        }
    }
    
}
