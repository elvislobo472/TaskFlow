package org.elvis;

import java.util.ArrayList;

public class InMemoryTaskRepository implements TaskRepository {

    private ArrayList<Task> taskList = new ArrayList<>();

    @Override
    public void save(Task task){
        taskList.add(task);
    }
    //Another way to do it directly
    // taskList.add(new Task(1, "Learn Java", "Practice OOP"));  //But the function makes it reusable


    @Override
    public ArrayList<Task> findAll(){
        //this will send the reference to the existing ArrayList
        // Let's  say in main method:
        // Arraylist<Task> tasks = taskRepository.findAll();

        return taskList;
    }


    @Override
    public Task findById(long id){
        for(Task task : taskList){
            if(task.getId() == id){
                return task;
            }
        }


        return null;
    }

    @Override
    public int deleteById(long id) {
        Task task = findById(id);

        if (task != null) {
            taskList.remove(task);
            return 1;
        } else {
            return 0;
        }
    }


    @Override
    public int update(long id, String newTitle, String newDescription) {
        Task task = findById(id);

        if (task != null) {
            task.setTitle(newTitle);
            task.setDescription(newDescription);
            return 1;
        } else {
            return 0;
        }
    }



    @Override
    public int markCompleted(long id){
        Task task = findById(id);

        if (task != null) {
            task.markCompleted();
            return 1;
        } else {
            return 0;

        }
    }



}
