package exceptionGenerator.exceptions;

import java.time.LocalDateTime;

public class MyException3 extends Exception implements MyExeception {

    public MyException3() {
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
