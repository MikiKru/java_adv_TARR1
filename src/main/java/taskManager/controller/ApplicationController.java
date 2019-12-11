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
    @Override
    public User getUserByIndex(int index) {
        return UserManager.users.get(index);
    }

    public void printAllUsers(){
        UserManager.users.forEach(System.out::println);
    }

    @Override
    public Task addTask(String taskName, LocalDate deadline, User user) {
        // utworzenie obiektu task
        Task task = new Task(taskName, deadline, false, user);
        // dodać utworzony taks do listy tasków użytkownika z argumentu metody
        List<Task> tasks = user.getTasks();
        tasks.add(task);
        user.setTasks(tasks);
        return task;
    }
    @Override
    public void setTaskStatus(boolean status) {

    }

}
