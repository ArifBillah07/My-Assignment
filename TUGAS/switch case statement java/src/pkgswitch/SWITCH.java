/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import java.util.Scanner;
/**
 *
 * @author marif
 */
public class SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nama , nim;
        int jurusan;
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Pilihan : \n 1. Teknik Informatika \n 2. Manajemen Informatika \n 3. Teknik Komputer \n\n Masukkan Pilihan: ");
        jurusan = input.nextInt();
        switch (jurusan){
            case 1:
                System.out.println("\n"+nama+" dengan NIM "+nim+" memilih jurusan Teknik Informatika");
                break;
            case 2:
                System.out.println("\n"+nama+" dengan NIM "+nim+" memilih jurusan Manajemen Informatika");
                break;
            case 3:
                System.out.println("\n"+nama+" dengan NIM "+nim+" memilih jurusan Teknik Komputer");
        }
    }
    
}
