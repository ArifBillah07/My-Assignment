/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.util.*;
/**
 *
 * @author marif
 */
public class PerulanganFor {
    public static void main(String[] args){
    /*inisialisasi integer*/
    int angkaAwal, angkaAkhir;
    
    /*Membuat inputan*/
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan angka pertama: ");
    angkaAwal = input.nextInt();
    System.out.print("Masukkan angka akhir: ");
    angkaAkhir = input.nextInt();
    
    /*looping*/
    for( int hasil=angkaAwal; hasil <= angkaAkhir; hasil++){
        System.out.print(hasil+", ");
    }
    }
}

