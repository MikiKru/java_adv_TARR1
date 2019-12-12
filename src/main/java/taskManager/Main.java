package taskManager;

import taskManager.controller.ApplicationController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationController ac = new ApplicationController();
        ac.addUser("Michał", "Kruczkowski");
        ac.addTask("Nauka programowania", LocalDate.of(2020, 02, 01), ac.getUserByIndex(2));
        ac.addTask("Nauka programowania zaawansowanego", LocalDate.of(2020, 02, 23), ac.getUserByIndex(2));
        ac.setTaskStatus(true, 2, 0);
        ac.printAllUsers();
    }
}
