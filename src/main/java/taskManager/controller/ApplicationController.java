package taskManager.controller;

import taskManager.model.Task;
import taskManager.model.User;

import java.time.LocalDate;
import java.util.List;

public class ApplicationController implements UserManager, TaskManager {
    @Override
    public Task addTask(String name, LocalDate deadline, User user) {
        return null;
    }
    @Override
    public void setTaskStatus(boolean status) {

    }
    @Override
    public void addUser(String name, String lastName) {

    }
    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
