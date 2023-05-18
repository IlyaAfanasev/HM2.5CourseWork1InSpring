package pro.sky.java.course2.hm2_5coursework1inspring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class EmployeeAlreadyAdded extends RuntimeException{
    public EmployeeAlreadyAdded(String message) {
        super(message);
    }
}