package exceptionGenerator.exceptions;

import java.time.LocalDateTime;

public class MyException2 extends Exception implements MyExeception {

    public MyException2() {
        System.out.println("TYP WYJATKU: " + getClass().getName());
    }

    @Override
    public String getMessage() {
        return "DATA I CZAS WYSTĄPIENIA WYJĄTKU: " + LocalDateTime.now();
    }

//    @Override
//    public void printStackTrace() {
//
//    }
}
