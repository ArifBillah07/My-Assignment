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
public class Person {
    
    //Inisiasi variable yang ada didalam class Person
    protected int id;
    protected String name;
    protected String address;

    //Membuat object Person yang nantinya akan di sharing atau
    //di bagikan ke seluruh child atau subClass dari Person
    
    //Inisiasi object Person 
    //Dg parameter id, name, address
    
    //struktur object 
        //Public Object(int parameter1, String parameter2, String Parameter3) {
        //  this.key1 = parameter1
        //  this.key3 = parameter3
        //  this.key2 = parameter2
     //}       
    public Person(int id, String name, String address) {
        System.out.println("Hello from Person Class");
        
        //keyword This berfungsi untuk merujuk atau mereference variable
        //yang ada diatas, dan valuenya mengambil dari parameter dari object Person                       
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Method ini berfungsi untuk mengambil nilai dari variable Id    
    public int getId() {
        return id;
    }

    // Method ini berfungsi untuk men-set atau menetapkan nilai dari variable id
    public void setId(int id) {
        this.id = id;
    }

    // Method ini berfungsi untuk mengambil nilai dari variable name    
    public String getName() {
        return name;
    }

    // Method ini berfungsi untuk men-set atau menetapkan nilai dari variable name
    public void setName(String name) {
        this.name = name;
    }
    
    // Method ini berfungsi untuk mengambil nilai dari variable adress    
    public String getAddress() {
        return address;
    }

    // Method ini berfungsi untuk men-set atau menetapkan nilai dari variable address
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
