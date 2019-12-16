package exceptionGenerator;

import exceptionGenerator.exceptions.MyException1;
import exceptionGenerator.exceptions.MyException2;
import exceptionGenerator.exceptions.MyException3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Napisz program który generuje losowo jeden z 3 własnych typów wyjątków:
        // -> MyException1()
        // -> MyException2()
        // -> MyException3()
        // Każdy z wyjątków posiada konstruktor zwracający typ danego wyjątku
        // Każdy z wyjątków posiada własną metodę getMessage() i printStackTrace()
        // getMessage() -> zwraca datę i czas wystąpienia wyjątku
        // printStackTarace() -> zawraca Klasę w której wystąpił dany wyjątek
        Random random = new Random();
        int randomInteger = random.nextInt(3); // losuje wartości 0 lub 1 lub 2
        try {
            switch (randomInteger) {
                case 0:
                    throw new MyException1();
                case 1:
                    throw new MyException2();
                case 2:
                    throw new MyException3();
            }
        } catch (MyException1 e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (MyException2 e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (MyException3 e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
