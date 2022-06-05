/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tumpukan;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author Arif
 */
public class tumpukan_bilangan {
    static void showPush(Stack st, int a){
        st.push(new Integer(a));
        System.out.println("Push (" +a+ ")");
        System.out.println("Stack: "+st);
    }
    static void showPop(Stack st){
        System.out.print("Pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: "+st);
    }
    
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println("Stack: "+st);
        showPush(st, 7);
        showPush(st, 90);
        showPush(st, 15);
        showPop(st);
        showPop(st);
        showPop(st);
        try {
            showPop(st);
        } catch (EmptyStackException e) {
            System.out.println("Error, pesan: "+e.getMessage());
        }
    }
}
