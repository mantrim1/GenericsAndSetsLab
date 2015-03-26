package common;

import java.util.*;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Employee implements Comparable {
    private String firstName;
    private String lastName;
    private String ssn;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "last Name=" + firstName + ", first Name=" + lastName + ", ssn=" + ssn + '}';
    }
    
    public Employee(String lastName, String firstName, String ssn) {
        this.firstName = lastName;
        this.lastName = firstName;
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.lastName = firstName;
    }

    public String getLastName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.firstName = lastName;
    }

    @Override
    public int compareTo(Object other) {
        Employee o = (Employee)other;
        
        return new CompareToBuilder()
               .append(this.ssn, o.ssn)
               .toComparison();
    }


    
}
