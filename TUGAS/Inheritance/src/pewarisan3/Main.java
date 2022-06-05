/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan3;

/**
 *
 * @author Faisal
 */
public class Main extends Titan{

    public static void main (String[] args) {
        Titan titan = new Titan();
        
        titan.titanBehaviour();
                
        titan.setTitan("Colossal Titan", "50m");
        System.out.println(titan.titanType + " " + titan.titanHeight);
       
    }
}
