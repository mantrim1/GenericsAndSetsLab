/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists.with.generics;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Mark
 */
public class Demo1 {
    public static void main(String[] args) {
        
    
    //best average performance is array list. best looping speed is LinkedList. 
    List<String> list = new ArrayList();
    list.add("Yes");
    list.add("No");
    list.add("Maybe");
//    for(int i=0;i<list.size();i++){
//        String s = (String)list.get(i);
//        System.out.println(s);
//    }
   
    list.remove(1);
    list.add(2,"I guess");
    for(String s2 : list){
        s2+="Item Retrieved ";
        System.out.println(s2);
    }
    
    }
     
}
