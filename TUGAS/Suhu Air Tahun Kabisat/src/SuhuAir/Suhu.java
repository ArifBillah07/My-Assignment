/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuhuAir;

/**
 *
 * @author marif
 */
import java.util.Scanner;
public class Suhu {
    public static void main(String[] Args){
        int T;
        System.out.print("Masukan suhu(C)= ");
        Scanner inputan = new Scanner(System.in);
        T = inputan.nextInt();
        if (T<0){
            System.out.println("Wujud Air Beku = "+T+" Celsius "); 
        } else if ((0<=T) && (T<=100)){
            System.out.println("Wujud Air Mendidh = "+T+" Celsius ");
        } else if (T>100){
            System.out.println("Wujud Air Uap = "+T+" Celsius ");
        }
    }
}
