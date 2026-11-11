package org.elvis;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        TaskRepository repository = new InMemoryTaskRepository();
        TaskService taskService = new TaskService(repository);  //Constructor based dependency injection
//
//        taskService.addTask(new Task(1, "Learn Python", "Lists, Tuples, Dictionary"));
//        taskService.addTask(new Task(2, "Learn Java", "SpringBoot"));
//        taskService.addTask(new Task(3, "Learn Linux", "Shell Variables"));
//
//        taskService.displayAllTasks();
//
//
//        taskService.addTask(new Task(1, "Learn Python", "Lists, Tuples, Dictionary"));
//
//
//        taskService.addTask(new Task(100, "", "Lists, Tuples, Dictionary"));
//
//
//        taskService.displayAllTasks();
//
//
//        taskService.updateTask(3, "Learn Docker", "Container Images");
//
//
//        taskService.completeTask(1);
//
//        taskService.displayTaskByID(1);
//
//        taskService.displayAllTasks();
//
//
//        taskService.deleteTask(2);
//
//        taskService.displayAllTasks();
//
//        taskService.addTask(new Task(4, "Github Actions", "CI/CD Pipeline"));
//        taskService.addTask(new Task(5, "Golang", "BackEnd"));

        // Add a task
        taskService.addTask(new Task(1, "Learn Java", "Practice OOP"));

// Get the returned list
        List<Task> tasks = repository.findAll();

// Clear the returned list
        tasks.clear();

// Display tasks again
        taskService.displayAllTasks();



    }
}