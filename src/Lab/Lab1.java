/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark
 */
public class Lab1 {
    public static void main(String[] args) {
        List hobbies = new ArrayList();
        hobbies.add("Games");
        hobbies.add("Photography");
        hobbies.add("Motorsports");
        for(int i = 0; i<hobbies.size();i++){
            String s = (String)hobbies.get(i);
            System.out.println(s);
        }
        System.out.println("");
        hobbies.add("Music");
        hobbies.add("Programming");
        for(int i = 0; i<hobbies.size();i++){
            String s = (String)hobbies.get(i);
            System.out.println(s);
        }
        System.out.println("");
        hobbies.remove(2);
        hobbies.remove(3);
        for(int i = 0; i<hobbies.size();i++){
            String s = (String)hobbies.get(i);
            System.out.println(s);
        }
    }
}
