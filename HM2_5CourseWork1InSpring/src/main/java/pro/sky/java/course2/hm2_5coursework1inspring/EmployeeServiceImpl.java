package pro.sky.java.course2.hm2_5coursework1inspring;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private int maxsize = 10;

    List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Афанасьев", "Илья"),
            new Employee("Иванов", "Вячеслав"),

            new Employee("Косяков", "Евгений"),
            new Employee("Сидоров", "Артем"),

            new Employee("Бабушкин", "Павел"),
            new Employee("Суворов", "Игорь"),

            new Employee("Шачиков", "Олег"),
            new Employee("Иванов", "Евгений"),

            new Employee("Рочев", "Александр")

    ));

    @Override
    public String add(String lastName, String firstName) {
        Employee employee = new Employee(lastName, firstName);
        employees.add(employee);

        return "Сотрудник внесен в реестр";
    }
    @Override
    public String remove(String lastName, String firstName) {
    Employee employee= new Employee(lastName, firstName);
        employees.remove(employee);

        return "Сотрудник удален из реестра";
    }
    @Override
    public String find(String lastName, String firstName) {
        Employee employee = new Employee(lastName, firstName);

        boolean a = employees.contains(employee);
        return String.valueOf(a);
    }

    @Override
    public String print() {
        return employees.toString();
    }

//    @Override
//    public String toString() {
//        for (Employee employee : employees) {
//
//            if (employee != null) {
//                System.out.println(employee);
//            }
//        }
//        return "";
//
//    }

}



