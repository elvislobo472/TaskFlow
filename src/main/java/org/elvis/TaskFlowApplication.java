package org.elvis;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication  //Annotation combines 3 annotations @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan
public class TaskFlowApplication {

    public static void main(String[] args){
        SpringApplication.run(TaskFlowApplication.class, args); //This starts the SpringBoot Application

        //BTS SpringBoot:
        //Creates Spring Application Context
        //Performs component Scanning
        //Configures application components
        //Starts the embedded web server when web support is present

    }

}




//IoC(Inversion of Control) Container

//It is like an object manager. Instead of manually creating objects, Spring takes the responsibility for:
//1. Creating the object
//2. Managing their lifecycle
//3. Connecting dependencies
//4. Providing the objects wherever they are required


//Application Context : This is Spring's IoC container interface

