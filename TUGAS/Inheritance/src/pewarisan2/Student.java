/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan2;

/**
 *
 * @author luckyman
 */
public class Student extends Person{
    
    // inisiasi variable tambahan 
    protected String nim;
    
    
    // inisiaisi object Student yang nantinya bisa dishare ke semua subClass   
    //Constructor
    //yang di dalam kurung bisa disebut paramenter
    public Student(int id, String name, String address, String nim) {
        
        //Mengambil variable yang di Extends dari class Person
        super(id, name, address);
        
        // Inisiasi variable nim yang mana nilai dari this.nim diambil dari 
        // parameter object Student atau constructor diatas
        this.nim = nim;
        System.out.println("hello from StudentClass");
    }        

    // Method ini berfungsi untuk mengambil nilai dari variable nim
    public String getNim() {
        return nim;
    }

    // Method ini berfungsin untuk menetapkan nilai dari variable nim
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    
    
}
