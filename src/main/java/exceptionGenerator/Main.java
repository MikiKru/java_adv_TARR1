package exceptionGenerator;

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
        // printStackTarace() -> zawraca Klasę w którym wystąpił dany wyjątek
        Random random = new Random();
        int randomInteger = random.nextInt(3); // losuje wartości 0 lub 1 lub 2
        switch (randomInteger){
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
        }
    }
}
