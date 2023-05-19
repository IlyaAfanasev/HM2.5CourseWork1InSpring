package pro.sky.java.course2.hm2_5coursework1inspring;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {

    Employee add(String lastName, String firstName);


    Employee remove(String lastName, String firstName);

    Employee find(String lastName, String firstName);

    Collection<Employee> print();


}