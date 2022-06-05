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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //pembuatan Class baru atau object baru Lukman
        //yang mana diambil dari Class Student
        Student lukman = new Student(1, "Lukman Afandi", "Paiton, Probolinggo", "E31200844");
        
        //Menampilkan nama dari object lukman
        System.out.println("____-_______________________________");
        System.out.println(lukman.getName()); // Output: Lukman Afandi
             
        System.out.println("____-_______________________________");
        //Menetapkan nilai pada object Lukman
        System.out.println("Menetapkan nilai name dari object lukman");
        lukman.setName("Luqman Hakim");
         
        // menampilkan nilai dari object lukman
        System.out.println(lukman.getName()); // Output: Luqman Hakim
        
        
        
        // Pembuatan Class baru atau object baru Yoga
        // Yang mana diambil dari Class Person
        Person yoga = new Person(2, "Yoga Saputra", "Krucil, Problonggo");
        //Menampilkan nama dari object yoga
        
        System.out.println("____-_______________________________");
        System.out.println(yoga.getName()); // Output: Yoga saputra
        
        System.out.println("____-_______________________________");
        //Menetapkan nilai pada object Lukman
        System.out.println("Menetapkan nilai name dari object yoga");
        yoga.setName("Dwi Prayoga");
        
        // menampilkan nilai dari object yoga
        System.out.println(yoga.getName()); // Output: Dwi Prayoga
        
        
        //PERBEDAAN DARI object atau class lukman dan yoga adalah
        //pemanggilan dari object Lukman berasal dari Class Student 
        //yang mana pada class student kita menambahkan variable NIM
        // jadi pada object lukman mengharuskan kita mengirim paramenter NIM
        // sedangkan pada object yoga tidak boleh mengirimkan nim karena 
        // Object yoga tidak memerlukan variable NIM
        // Bisa dilihat contoh dibawah

        
        //Custom Display
        
        System.out.println("____-_______________________________");
        
        
        System.out.println("Object Lukman");
        System.out.println(" Id: " + lukman.getId()
                + " Nama : " + lukman.getName()
                + " Alamat: " + lukman.address
                + " NIM: " + lukman.nim
        );
        
        System.out.println("____-_______________________________");
        System.out.println("Object Yoga");
        System.out.println(" Id: " + yoga.getId()
                + " Nama : " + yoga.getName()
                + " Alamat: " + yoga.address                
        );
    }
    
}
