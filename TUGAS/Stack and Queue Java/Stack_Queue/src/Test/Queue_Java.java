/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author marif
 */
public class Queue_Java {
    public static void main(String []args){
        Queue<String> nama=new LinkedList<String>();
        
        nama.add("Arif");
        nama.add("Yuki");
        nama.add("Chiho");
        nama.add("Majiko");
        
        System.out.println("Data yang pertama kali masuk : ");
        System.out.println(nama.peek());
        System.out.println("Data yang pertama keluar (poll) : ");
        System.out.println(nama.poll());
        System.out.println("Data yang masih ada setelah (poll) : ");
        System.out.println(nama);
    }
}
