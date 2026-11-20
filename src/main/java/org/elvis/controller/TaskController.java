package org.elvis.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {


        //Example
    @GetMapping("/hello")
    public String hello(){
        return "Welcome to Java";
    }


    @GetMapping("/info")
    public String info(){
        return "This is TaskFlow..The Place to manage your To-do-Lists";
    }


    @GetMapping("/dev")
    public String dev(){
        return "Hiii...This is Elvis!!";
    }

//    @GetMapping("/elvis")
//    public String elvis(){
//        return "Hiii...This is Elvis!!";
//    }
//
//    @GetMapping("/elias")
//    public String elias(){
//        return "Hiii...This is Elvis!!";
//    }


//    @GetMapping("/elvis")
//    public String elvis(){
//        return "Hiii...This is Elvis!!";
//    }
//
//    @GetMapping("/elias")
//    public String elias(){
//        return "Hiii...This is Elvis!!";
//    }

//    @GetMapping("/elvis")
//    public String elvis(){
//        return "Hiii...This is Elvis!!";
//    }
//
//    @GetMapping("/elias")
//    public String elias(){
//        return "Hiii...This is Elvis!!";
//    }


//    @GetMapping("/elvis")
//    public String elvis(){
//        return "Hiii...This is Elvis!!";
//    }
//
//    @GetMapping("/elias")
//    public String elias(){
//        return "Hiii...This is Elvis!!";
//    }


    //
}
