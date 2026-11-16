package org.elvis;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication  //Annotation combines 3 annotations @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan
public class TaskFlowApplication {

    public static void main(String[] args){
//        SpringApplication.run(TaskFlowApplication.class, args); //This starts the SpringBoot Application

        //BTS SpringBoot:
        //Creates Spring Application Context
        //Performs component Scanning
        //Configures application components
        //Starts the embedded web server when web support is present



        ConfigurableApplicationContext context = SpringApplication.run(TaskFlowApplication.class, args); //This starts the SpringBoot Application

        TaskService taskService = context.getBean(TaskService.class);

        System.out.println("TaskService Bean: " + taskService);


    }

}




//IoC(Inversion of Control) Container

//It is like an object manager. Instead of manually creating objects, Spring takes the responsibility for:
//1. Creating the object
//2. Managing their lifecycle
//3. Connecting dependencies
//4. Providing the objects wherever they are required


//Application Context : This is Spring's IoC container interface. SpringBoot creates and configures an application context. This context manages the objects known as Spring Beans


//Bean: It is simply an object created and managed by the Spring IoC container



//1. Maven launches SpringBoot
//2. Spring initializes the ApplicationContext
//3. Spring Boot configures the web environment
//4. Embedded Tomcat starts
//5. TaskFlow(OR Any Application being developed) becomes available on port 8080
