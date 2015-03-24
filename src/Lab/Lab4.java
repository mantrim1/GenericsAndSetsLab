/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import common.Employee;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mark
 */
public class Lab4 {
    public static void main(String[] args) {
        Set<Employee> employeeSet = new HashSet<Employee>();
        employeeSet.add(new Employee("Richard","Nixon","123-45-6789"));
        employeeSet.add(new Employee("Bill","Clinton","568-89-7456"));
        employeeSet.add(new Employee("Richard","Nixon","123-45-6789"));
        for(Employee e : employeeSet){
            System.out.println(e.toString());
        }
    }
}
