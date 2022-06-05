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
public class Student extends Person {
    private String nim;
    
    public Student(String nim, String nama, int usia){
        super(nama, usia);
        this.nim = nim;
    }
    
    public void info(){
        System.out.println("NIM: " + this.nim);
        super.info();
    }
    
    public static void main(String[] args) {
        Student murid1 = new Student("E31202560", "Mochammad Farhan SW", 18);
        murid1.info();
        
        System.out.println("\n");
        
        Student murid2 = new Student("E3120202", "Coki Padede", 18);
        murid2.info();
        
        System.out.println("\n");
        
        Student murid3 = new Student("E123456", "Tretan Muslim", 25);
        murid3.info();
    }
}
