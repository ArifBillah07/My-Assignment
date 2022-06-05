/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Java;
import Stack_Java.Stack;
/**
 *
 * @author marif
 */
public class Stack_Output {
    public static void main( String[] args ){
        Stack stack=new Stack();
        stack.push("Muhammad");
        stack.push("Arif");
        stack.push("Billah");
        stack.push("07 Mei 2001");
        stack.push("https://liel2001.github.io");
        
        int count=stack.count();
        Object object=stack.peek();
        System.out.println("Jumlah Data Pada Stack : "+count);
        System.out.println("Data Paling Atas Pada Stack : "+object);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        object=stack.pop();
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        count=stack.count();
        System.out.println("Jumlah Data pada stack setelah pop : "+count);
        object=stack.peek();
        System.out.println("Data paling atas setelah pop : "+object);
    }
}
