/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matriks;
import java.util.Scanner;

/**
 *
 * @author Arif
 */
public class Matriks {

    public static void main(String[] args) {
        int matriks1[][] = new int[5][5];
        int matriks2[][] = new int[5][5];
        int hasil[][] = new int[5][5];
        Scanner elemen = new Scanner(System.in);

        System.out.println("Operasi Matriks");
        System.out.println(" 1. Penjumlahan\n 2. Pengurangan");
        System.out.println("\nMasukkan pilihan operasi: ");
        Scanner pilihOperasi = new Scanner(System.in);
        int pilih = pilihOperasi.nextInt();

        //jumlah baris & kolom
        System.out.print("\nMasukkan jumlah baris: ");
        Scanner jmlBaris = new Scanner(System.in);
        int x = jmlBaris.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        Scanner jmlKolom = new Scanner(System.in);
        int y = jmlKolom.nextInt();

        //Input elemen Matriks1
        System.out.println("\n= Masukkan elemen matriks ke -1  =");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("elemen ke-[" + i + "," + j + "]: ");
                matriks1[i][j] = elemen.nextInt();
            }
        }

        //input elemen matriks2
        System.out.println("\n= Masukkan Elemen Matriks ke-2");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("elemen ke-[" + i + "," + j + "]: ");
                matriks2[i][j] = elemen.nextInt();
            }
        }

        switch (pilih) {
            case 1:
                System.out.println("\n= Penjumlahan Matriks =");
                System.out.println("Hasil: ");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
                break;

            case 2:
                System.out.println("\n= Pengurangan Matriks =");
                System.out.println("Hasil: ");
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        hasil[i][j] = matriks1[i][j] - matriks2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println("\n");
                }
                break;
        }
    }
}
