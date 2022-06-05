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
public class Titan {
    protected String titanType;
    protected String titanHeight;
    
    public void setTitan(String titanType, String titanHeight){
        this.titanType = titanType;
        this.titanHeight = titanHeight;
    }

    public void titanBehaviour() {
        System.out.println("Watch out for the titans !");
        System.out.println("Eating");
        System.out.println("Running");
        System.out.println("Fighting");
    }
    
    public String getTitanType() {
        return titanType;
    }

    public void setTitanType(String titanType) {
        this.titanType = titanType;
    }

    public String getTitanHeight() {
        return titanHeight;
    }

    public void setTitanHeight(String titanHeight) {
        this.titanHeight = titanHeight;
    }
    
}
