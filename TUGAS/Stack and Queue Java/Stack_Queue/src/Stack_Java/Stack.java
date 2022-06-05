/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Java;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author marif
 */
public class Stack {
    private List<Object> list=new ArrayList<Object>();
    private int currentIndex=-1;
    
    public void push(Object object){
        list.add(object);
        currentIndex++;
    }
    
    public Object pop(){
        Object object=list.remove(currentIndex);
        currentIndex--;
        return object;
    }
    
    public int count(){
        return list.size();
    }
    
    public Object peek(){
        return list.get(currentIndex);
    }
    
    public void clear(){
        list.clear();
        currentIndex=-1;
    }
}
