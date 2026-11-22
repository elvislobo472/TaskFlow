package org.elvis.controller;


import org.elvis.Task;
import org.elvis.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    private final TaskService taskService;


    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }


    @GetMapping("/api/hello")
    public String hello(){
        return "TaskFlow API is running!";
    }

    @GetMapping("/api/info")
    public String info(){
        return "This is TaskFlow..The Place to manage your To-do-Lists";
    }

//    @GetMapping("/api/dev")
//    public String dev(){
//        return "Hiii...This is Elvis!!";
//    }





//        //Example
//    @GetMapping("/hello")
//    public String hello(){
//        return "Welcome to Java";
//    }
//
//
//    @GetMapping("/info")
//    public String info(){
//        return "This is TaskFlow..The Place to manage your To-do-Lists";
//    }
//
//
//    @GetMapping("/dev")
//    public String dev(){
//        return "Hiii...This is Elvis!!";
//    }



    //
}
