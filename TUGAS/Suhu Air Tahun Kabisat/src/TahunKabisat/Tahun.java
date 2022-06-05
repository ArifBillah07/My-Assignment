/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TahunKabisat;

/**
 *
 * @author marif
 */
import java.util.Scanner;
public class Tahun {
    public static void main(String[] Args){
        Scanner input = new Scanner (System.in);
            System.out.println("Perhitungan Tahun Kabisat");
            System.out.print("Silahkan masukan tahun: ");
        int tahun= input.nextInt();
        if((tahun % 4 == 0 && tahun % 100 != 0)|| tahun % 400 == 0){
            System.out.println(tahun+" adalah tahun kabisat");
        } else
            System.out.println(tahun+" bukan tahun kabisat");
    }
}

