/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Mark
 */
public class MapsLab {
    public static void main(String[] args) {
        
    
    Employee e1 = (new Employee("Richard","Nixon","123-45-6789"));
    Employee e2 =(new Employee("Bill","Clinton","568-89-7456"));
    Employee e3 =(new Employee("Richard","Nixon","123-45-6789"));
    Employee e4 = (new Employee("Jimmy","Carter","143-55-0089"));
    Map<String,Employee> map = new HashMap<>();
    map.put("123-45-6789",e1);
    map.put("568-89-7456",e2);
    map.put("123-45-6789",e3);
    map.put("143-55-0089", e4);
    Set<String> keys = map.keySet();
        for(String key : keys) {
            Employee found = map.get(key);
            System.out.println(found);
        }
        System.out.println("");
    Map<String,Employee> treeMap = new TreeMap<>();
    treeMap.put("123-45-6789",e1);
   treeMap.put("568-89-7456",e2);
   treeMap.put("123-45-6789",e3);
   treeMap.put("143-55-0089", e4);
    Set<String> treeKeys = treeMap.keySet(); 
    
        for(String key : treeKeys) {
            Employee found = map.get(key);
            System.out.println(found);
        }
    System.out.println("");
    Collection<Employee> collection = treeMap.values();    
    List<Employee> list = new ArrayList<Employee>(collection);
    Collections.sort(list, new EmployeeByLastName());
    for(Employee emp : list) {
            System.out.println(emp);
        }
        System.out.println("");
    Set<Employee> treeSet = new TreeSet<Employee>();
    treeSet.add(new Employee("Richard","Nixon","123-45-6789"));
    treeSet.add(new Employee("Bill","Clinton","568-89-7456"));
    treeSet.add(new Employee("Richard","Nixon","123-45-6789"));
    treeSet.add(new Employee("Jimmy","Carter","143-55-0089"));
    Iterator itr = treeSet.iterator();
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.println(element);
      }
        System.out.println("");
      List<Employee> list2 = new ArrayList<Employee>(treeSet);
       Collections.sort(list2, new EmployeeByLastName());
       for(Employee emp : list2) {
            System.out.println(emp);
        }
    }
}