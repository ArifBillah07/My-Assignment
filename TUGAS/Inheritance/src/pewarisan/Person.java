/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;

/**
 *
 * @author farhansw
 */
public class Person {
    protected String nama;
    protected int usia;

    public Person(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void info(){
        System.out.println("Nama: " + this.nama);
        System.out.println("Usia: " + this.usia);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
   
}
