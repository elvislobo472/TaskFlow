package org.elvis;

import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> taskList = new ArrayList<>();



    public void addTask(Task task){
        for (Task existingTask : taskList){
            if(existingTask.getId() == task.getId()){
                System.out.println("########Task with this ID already exists########");
                System.out.println();
                return;
            }
        }


        //input validation
        if(task.getTitle().isBlank() || task.getDescription().isBlank()){
            System.out.println("########Task title and Description cannot be empty########");
            System.out.println();
            return;
        }

        taskList.add(task);
        System.out.println("********Task added successfully********");
        System.out.println();
    }

    //Another way to do it directly
    // taskList.add(new Task(1, "Learn Java", "Practice OOP"));  //But the function makes it reusable


    public void displayAllTasks(){

        if (taskList.isEmpty()){
            System.out.println("No tasks available.");
            System.out.println();
            return;
        }

        for(Task task : taskList){
            System.out.println("Task ID: "+ task.getId());
            System.out.println("Title: "+task.getTitle());
            System.out.println("Description: "+task.getDescription());
            System.out.println("Status: " + task.isCompleted());
            System.out.println("==============================================");
            System.out.println();
        }
    }


    public void getAndMarkCompleted(int id){

        for(Task task : taskList){
            if(task.getId() == id){
                task.markCompleted();
                System.out.println("********Task marked as completed!********");
                System.out.println();
                return;
            }
        }

        System.out.println("########Task with the mentioned ID not found########");
        System.out.println();

    }


    public void deleteTask(int id){
        for(Task task : taskList){
            if(task.getId() == id){
                taskList.remove(task);
                System.out.println("********Task deleted successfully********");
                System.out.println();
                return;
            }
        }

        System.out.println("########Task with the mentioned ID could not be found########");
        System.out.println();

    }


    public void updateTask(int id, String newTitle, String newDescription){

        for(Task task : taskList){
            if(task.getId() == id){
                task.setTitle(newTitle);
                task.setDescription(newDescription);

                System.out.println("********Task details updated  successfully********");
                System.out.println();
                return;
            }
        }

        System.out.println("########Task with the mentioned ID could not be found.########");
        System.out.println();

    }


}
