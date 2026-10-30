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


        System.out.println();

        System.out.println("Task ID: "+taskId);
        System.out.println("Title: "+taskTitle);
        System.out.println("Description: "+taskDescription);

        task.markCompleted();
        System.out.println("Status after Completion: " + task.isCompleted());



        TaskService list = new TaskService();

        list.addTask(new Task(2, "Learn Python", "Lists, Tuples, Dictionary"));
        list.addTask(new Task(3,"Learn Javascript", "Async Coding"));



        }
    }
