package org.elvis;


public class Main {
    public static void main(String[] args) {
            Task task = new Task(1, "Learn Java", "OOPS Concepts");

            long taskId = task.getId();
            String taskTitle = task.getTitle();
            String taskDescription = task.getDescription();





        System.out.println("Task ID: "+taskId);
        System.out.println("Title: "+taskTitle);
        System.out.println("Description: "+taskDescription);
        System.out.println("Status: " +task.isCompleted());



        System.out.println("Task ID: "+taskId);
        System.out.println("Title: "+taskTitle);
        System.out.println("Description: "+taskDescription);

        task.markCompleted();
        System.out.println("Status after Completion: " + task.isCompleted());




        TaskService taskService = new TaskService();

        taskService.addTask(new Task(1, "Learn Python", "Lists, Tuples, Dictionary"));
        taskService.addTask(new Task(2,"Learn Javascript", "Async Coding"));
        taskService.addTask(new Task(3, "Learn Linux", "Shell Variables"));

        taskService.displayAllTasks();




//        taskService.getAndMarkCompleted(2);
//
//        taskService.displayAllTasks();
//
//
//        taskService.getAndMarkCompleted(100);
//
//        taskService.displayAllTasks();
//
//


        //Deletion of Task

        taskService.deleteTask(2);

        taskService.displayAllTasks();





        taskService.deleteTask(100);

        taskService.displayAllTasks();




        //Updating task

        taskService.updateTask(3, "Learn CI/CD", "Start with Github Actions");



        taskService.displayAllTasks();



        taskService.updateTask(30, "Learn CI/CD", "Start with Github Actions");


        taskService.displayAllTasks();


        taskService.addTask(new Task(2, "Learn Docker", "Read about Containerization"));

        taskService.displayAllTasks();


        taskService.addTask(new Task(1, "Learn Docker", "Read about Containerization"));

        taskService.displayAllTasks();




    }
    }
