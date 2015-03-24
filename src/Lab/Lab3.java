/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import common.Dog;
import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark
 */
public class Lab3 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("Scooby", 25));
        list.add(new Employee("George","Washington","123-45-6789"));
        for(Object o : list){
            System.out.println(o.toString());
        }
    }
}
//Because there are two different objects we cannot use a specfic object so I called
//the super class of them both and used the overidden toString methods to display relevant information
