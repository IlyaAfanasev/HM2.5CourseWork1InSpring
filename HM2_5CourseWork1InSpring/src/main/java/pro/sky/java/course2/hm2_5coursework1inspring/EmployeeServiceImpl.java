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

            new Employee("Шачиков", "Олег"),
            new Employee("Иванов", "Евгений"),

            new Employee("Рочев", "Александр"),
            new Employee("Суворов", "Игорь")

    ));

    @Override
    public String add(String lastName, String firstName) {

        try {
            addEmployee(lastName, firstName);
        } catch (ArrayIsFull e) {
            return e.getMessage();
        } catch (EmployeeAlreadyAdded e) {
            return e.getMessage();
        }
        return "Сотрудник "+lastName+" "+firstName + " добавлен в реестр";
    }
    public void addEmployee(String lastName, String firstName) {

        Employee employee = new Employee(lastName, firstName);

        if (employees.size() >= maxsize) {
            throw new ArrayIsFull("В реестре больше нет места");
        }
        else if (employees.contains(employee)) {
            throw new EmployeeAlreadyAdded("Сотрудник "+lastName+" "+firstName + " уже внесен в реестр");
        }else {
            employees.add(employee);
        }
    }

    @Override
    public String remove(String lastName, String firstName) {
        try {
            removeEmployee(lastName, firstName);
        } catch (EmployeeNotFound e) {
            return e.getMessage();
        }

        return "Сотрудник "+lastName+" "+firstName + "удален из реестра";
    }
    public void removeEmployee(String lastName, String firstName) {
        Employee employee= new Employee(lastName, firstName);
        if (!employees.contains(employee)) {
            throw new EmployeeNotFound("Сотрудник не найден");
        }
        else {
            employees.remove(employee);
        }

    }

    @Override
    public String find(String lastName, String firstName) {
        try {
            findEmployee(lastName, firstName);
        } catch (EmployeeNotFound e) {
    return e.getMessage();
        }

    Employee employee=new Employee(lastName, firstName);
        return employee.toString();

    }
    public void findEmployee(String lastName, String firstName) {
        Employee employee = new Employee(lastName, firstName);

        if (!employees.contains(employee)) {
            throw new EmployeeNotFound("Сотрудник не найден");
        }



    }

    @Override
    public String print() {
        return employees.toString();
    }

}