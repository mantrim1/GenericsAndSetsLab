/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import common.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark
 */
public class Lab2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("John","Doe","123-45-6789"));
         employeeList.add(new Employee("Jane","Smith","456-75-8589"));
          employeeList.add(new Employee("Abe","Lincoln","444-44-6859"));
        for(Employee e : employeeList){
            System.out.println(e.toString());
    }
    }
    
}
