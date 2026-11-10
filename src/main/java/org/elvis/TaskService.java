package org.elvis;


import java.util.List;

public class TaskService {

    private TaskRepository taskRepository;


    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }



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
        List<Task> tasks = taskRepository.findAll();


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
        boolean completed = taskRepository.markCompleted(id);

        if(completed){
            System.out.println("********Task is marked as completed successfully********");
            System.out.println();
        }else{
            System.out.println("########Task with the mentioned ID could not be found########");
            System.out.println();
        }
    }


    public void deleteTask(long id) {
        boolean deleted = taskRepository.deleteById(id);

        if (deleted) {
            System.out.println("********Task deleted successfully********");
            System.out.println();
        } else {
            System.out.println("########Task with the mentioned ID could not be found########");
            System.out.println();
        }
    }


    public void updateTask(long id, String newTitle, String newDescription){

       boolean updated = taskRepository.update(id, newTitle, newDescription);

        if (updated) {
            System.out.println("********Task details updated successfully********");
            System.out.println();
        } else {
            System.out.println("########Task with the mentioned ID could not be found########");
            System.out.println();
        }


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
