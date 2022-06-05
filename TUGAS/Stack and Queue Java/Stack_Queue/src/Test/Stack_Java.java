/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.util.Stack;
/**
 *
 * @author marif
 */
public class Stack_Java {
    public static void main(String []args){
        Stack<String> game = new Stack<String>();
        
        game.add("DOTA");
        game.add("PUBG");
        game.add("CSGO");
        game.add("Genshin Impact");
        game.add("Minecraft");
        
        System.out.println("Data yang terakhir masuk : ");
        System.out.println(game.peek());
        System.out.println("Data yang keluar (pop) : ");
        System.out.println(game.pop());
        System.out.println(game.pop());
        System.out.println("Data yang masih ada setelah (pop) : ");
        System.out.println(game);
    }
}
