package pro.sky.java.course2.hm2_5coursework1inspring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class ArrayIsFull extends RuntimeException {
    public ArrayIsFull(String message) {
        super(message);
    }
}