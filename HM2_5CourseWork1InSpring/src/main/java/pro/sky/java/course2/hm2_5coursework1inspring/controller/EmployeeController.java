package pro.sky.java.course2.hm2_5coursework1inspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hm2_5coursework1inspring.EmployeeService;
import pro.sky.java.course2.hm2_5coursework1inspring.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam("name1") String lastName, @RequestParam("name2") String firstName) {
        return employeeService.add(lastName, firstName);
    }

    @GetMapping(path = "/remove")
    public String remove(@RequestParam("name1") String lastName, @RequestParam("name2") String firstName) {
        return employeeService.remove(lastName, firstName);
    }

    @GetMapping(path = "/find")
    public String find(@RequestParam("name1") String lastName, @RequestParam("name2") String firstName) {
        return employeeService.find(lastName, firstName);
    }

    @GetMapping(path = "/print")
    public String print() {
        return employeeService.print();
    }
}
