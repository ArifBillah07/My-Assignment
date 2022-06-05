/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3_kelulusan2;
import java.util.Scanner;
/**
 *
 * @author marif
 */
public class Latihan3_Kelulusan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputan = new Scanner(System.in);
        
        System.out.print("Masukkan nama = ");
        String nama = inputan.next();
        
        System.out.print("Masukkan jenis kelamin = ");
        String gender = inputan.next();
        
        System.out.print("Masukkan tinggi badan = ");
        int tinggi = inputan.nextInt();
        
        if("laki-laki".equals(gender)){
            if(tinggi <= 170){
                System.out.println("Anda gagal");
            } else if(tinggi <=230){
                System.out.println("Selamat anda lulus");
            }
        } else if("perempuan".equals(gender)){
            if(tinggi <= 160){
                System.out.println("Anda gagal");
            } else if(tinggi <= 210){
                System.out.println("Selamat anda lulus");
            }
        }
        
    }
    
}
