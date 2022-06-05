/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassegitiga;

/**
 *
 * @author marif
 */
import java.io.*;
public class LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int alas, tinggi;
        double luas;
        boolean isTrue = false;
        
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Menghitung luas segitiga");
        
        System.out.println("Masukkan alas segitiga:");
        alas = Integer.parseInt(data.readLine());

        System.out.println("Masukkan tinggi segitiga:");
        tinggi = Integer.parseInt(data.readLine());

        luas = 0.5 * alas * tinggi;
        
        System.out.println("Luas segitiga adalah : " + luas);
    }
    
}
