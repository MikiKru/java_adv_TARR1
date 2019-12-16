package exceptions;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInteractions {
    public void getUserData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String name = scanner.nextLine();
        System.out.println("Podaj datę urodzenia");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());  // wprowadzam napis i parsuje do daty
        System.out.println("Podaj liczbę całkowitą");
        int integerNumber = scanner.nextInt();
        System.out.println("Podaj liczbę zmiennprzecinkową");
        double doubleNumber = scanner.nextDouble();
        System.out.printf("Twoje dane: %s, %s, %d, %f\n", name, birthDate, integerNumber, doubleNumber);
    }

    public static void main(String[] args) {
        UserInteractions ui = new UserInteractions();
        ui.getUserData();
    }
}
