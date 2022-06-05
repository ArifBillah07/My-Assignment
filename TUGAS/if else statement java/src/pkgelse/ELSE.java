/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgelse;
import java.util.Scanner;
/**
 *
 * @author marif
 */
public class ELSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa hasil 10 x 10? ");
        int jawaban = input.nextInt();
        if (jawaban == 100){
            System.out.println("Jawaban anda benar");
        } else{
            System.out.println("Jawaban anda salah");
        }
    }
    
}
