package taskManager.controller;

import taskManager.model.Task;
import taskManager.model.User;

import java.time.LocalDate;
import java.util.List;

public class ApplicationController implements UserManager, TaskManager {
    @Override
    public void addUser(String name, String lastName) {
        // utworzenie obiektu user
        User user = new User(name, lastName);
        // dodanie użytkownika do listy użytkowników
        UserManager.users.add(user);
    }
    @Override
    public List<User> getAllUsers() {
        return UserManager.users;
    }
    public void printAllUsers(){
        UserManager.users.forEach(System.out::println);
    }

    @Override
    public Task addTask(String name, LocalDate deadline, User user) {
        return null;
    }
    @Override
    public void setTaskStatus(boolean status) {

    }

}
