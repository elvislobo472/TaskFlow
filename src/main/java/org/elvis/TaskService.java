package org.elvis;

import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> taskList = new ArrayList<>();



    public void addTask(Task task){
        taskList.add(task);
    }

    //Another way to do it directly
    // taskList.add(new Task(1, "Learn Java", "Practice OOP"));  //But the function makes it reusable


    public void displayAllTasks(){

        if (taskList.isEmpty()){
            System.out.println("No tasks available.");
            return;
        }

        for(Task task : taskList){
            System.out.println("Task ID: "+ task.getId());
            System.out.println("Title: "+task.getTitle());
            System.out.println("Description: "+task.getDescription());
            System.out.println("Status: " + task.isCompleted());
            System.out.println("==============================================");
        }
    }


    public void getAndMarkCompleted(int id){

        for(Task task : taskList){
            if(task.getId() == id){
                task.markCompleted();
                System.out.println("Task marked as completed!");
                return;
            }
        }

        System.out.println("Task with the mentioned ID not found.");

    }


}
