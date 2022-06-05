/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MelemparkanException;

/**
 *
 * @author marif
 */
public class KlausaThrow {
    public static void main(String[] args){
        String input = "Throw RuntimeException";
        
        System.out.println("\n********* MENGGUNAKAN KLAUSA THROW *********\n");
        try{
            if(input.equals("Throw RuntimeException")){
                throw new RuntimeException("Melempar Exception");
            }
            else if(input==null){
                throw new NullPointerException();
            }
            else{
                System.out.println("Input adalah : "+input);
            }
            System.out.println("\nPernyataan dalam blok try setelah bebas dari pelemparan exception.");
        }
        catch(Exception exc){
            System.err.println("Exception ditangkap di sini.");
            System.err.println("\nException yang ditangkap adalah : "+exc);
        }
    }
}
