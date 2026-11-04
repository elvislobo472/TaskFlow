package org.elvis;

import java.util.ArrayList;

public class TaskRepository {

    private ArrayList<Task> taskList = new ArrayList<>();


    public void save(Task task){
        taskList.add(task);
    }


    public ArrayList<Task> findAll(){
        return taskList;

        //this will send the reference to the existing ArrayList
        // Let's  say in main method:
        // Arraylist<Task> tasks = taskRepository.findAll();
    }

    public Task findById(long id){
        for(Task task : taskList){
            if(task.getId() == id){
                return task;
            }
        }


        return null;
    }


    public void deleteById(long id) {
        Task task = findById(id);

        if (task != null) {
            taskList.remove(task);
            System.out.println("********Task deleted successfully********");
            System.out.println();
        } else {

            System.out.println("########Task with the mentioned ID could not be found########");
            System.out.println();
        }
    }




    public void update(long id, String newTitle, String newDescription) {
        Task task = findById(id);

        if (task != null) {
            task.setTitle(newTitle);
            task.setDescription(newDescription);
            System.out.println("********Task details updated successfully********");
            System.out.println();
        } else {

            System.out.println("########Task with the mentioned ID could not be found########");
            System.out.println();
        }
    }
    
    
    public void markCompleted(long id){
        Task task = findById(id);

        if (task != null) {
            task.markCompleted();
            System.out.println("********Task is marked as completed successfully********");
            System.out.println();
        } else {

            System.out.println("########Task with the mentioned ID could not be found########");
            System.out.println();
        }
    }



}
