package taskManager;

import taskManager.controller.ApplicationController;

public class Main {
    public static void main(String[] args) {
        ApplicationController ac = new ApplicationController();
        ac.addUser("Michał", "Kruczkowski");
        ac.printAllUsers();
    }
}
