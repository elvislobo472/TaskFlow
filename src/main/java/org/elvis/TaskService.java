package org.elvis;


import java.util.ArrayList;

public class TaskService {

    private InMemoryTaskRepository taskRepository = new InMemoryTaskRepository();



    public void addTask(Task task){
        //input validation
        if(task.getTitle().isBlank() || task.getDescription().isBlank()){
            System.out.println("########Task title and Description cannot be empty########");
            System.out.println();
            return;
        }


        //Duplicate ID validation
        for (Task existingTask : taskRepository.findAll()){
            if(existingTask.getId() == task.getId()){
                System.out.println("########Task with this ID already exists########");
                System.out.println();
                return;
            }
        }

        //Save task through repository
        taskRepository.save(task);
        System.out.println("********Task added successfully********");
        System.out.println();
    }




    public void displayAllTasks(){
        ArrayList<Task> tasks = taskRepository.findAll();


        if (tasks.isEmpty()){
            System.out.println("No tasks available.");
            System.out.println();
            return;
        }

        for(Task task : tasks){
            System.out.println("Task ID: "+ task.getId());
            System.out.println("Title: "+task.getTitle());
            System.out.println("Description: "+task.getDescription());
            System.out.println("Status: " + task.isCompleted());
            System.out.println("==============================================");
            System.out.println();
        }
    }


    public void completeTask(long id){

        taskRepository.markCompleted(id);
    }


    public void deleteTask(long id) {
        int res = taskRepository.deleteById(id);

        if (res == 1) {
            System.out.println("********Task deleted successfully********");
            System.out.println();
        } else {
            System.out.println("########Task with the mentioned ID could not be found########");
            System.out.println();
        }
    }


    public void updateTask(long id, String newTitle, String newDescription){

       taskRepository.update(id, newTitle, newDescription);

    }


    public void displayTaskByID(long id){
        Task task = taskRepository.findById(id);

        System.out.println("Task ID: "+ task.getId());
        System.out.println("Title: "+task.getTitle());
        System.out.println("Description: "+task.getDescription());
        System.out.println("Status: " + task.isCompleted());
        System.out.println("==============================================");
        System.out.println();
    }


}
