package exceptionGenerator.exceptions;

import java.time.LocalDateTime;

public class MyException1 extends Exception implements MyExeception {

    @Override
    public String getMessage() {
        return "DATA I CZAS WYSTĄPIENIA WYJĄTKU: " + LocalDateTime.now();
    }

    @Override
    public void printStackTrace() {

    }
}
