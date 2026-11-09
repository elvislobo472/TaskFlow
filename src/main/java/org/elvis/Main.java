package org.elvis;


public class Main {
    public static void main(String[] args) {


        TaskService taskService = new TaskService();

        taskService.addTask(new Task(1, "Learn Python", "Lists, Tuples, Dictionary"));
        taskService.addTask(new Task(2, "Learn Java", "SpringBoot"));
        taskService.addTask(new Task(3, "Learn Linux", "Shell Variables"));

        taskService.displayAllTasks();


        taskService.addTask(new Task(1, "Learn Python", "Lists, Tuples, Dictionary"));


        taskService.addTask(new Task(100, "", "Lists, Tuples, Dictionary"));


        taskService.displayAllTasks();


        taskService.updateTask(3, "Learn Docker", "Container Images");


        taskService.completeTask(1);

        taskService.displayTaskByID(1);

        taskService.displayAllTasks();


        taskService.deleteTask(2);

        taskService.displayAllTasks();


    }
}