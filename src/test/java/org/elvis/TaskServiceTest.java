package org.elvis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    void shouldAddValidTask(){

        TaskRepository repository = new InMemoryTaskRepository();
        TaskService taskService = new TaskService(repository);


        Task task = new Task(1, "Learn Spring Boot", "Understand Dependency Injection");

        taskService.addTask(task);

        assertEquals(1, repository.findAll().size());
    }

    @Test
    void shouldNotAddTaskWithBlankTitle(){

        TaskRepository repository = new InMemoryTaskRepository();
        TaskService taskService = new TaskService(repository);


        Task task = new Task(1, "", "Understand Dependency Injection");

        taskService.addTask(task);

        assertEquals(0, repository.findAll().size());
    }


    @Test
    void shouldNotAddTaskWithBlankDescription(){

        TaskRepository repository = new InMemoryTaskRepository();
        TaskService taskService = new TaskService(repository);


        Task task = new Task(1, "Learn Spring Boot", ""); // Description cannot be blank therefore it fails the test

        taskService.addTask(task);

        assertEquals(0, repository.findAll().size());
    }


    @Test
    void shouldNotAddTaskWithDuplicateId(){

        TaskRepository repository = new InMemoryTaskRepository();
        TaskService taskService = new TaskService(repository);


        Task firstTask = new Task(1, "Learn Spring Boot", "Understand Dependency Injection");
        Task secondTask = new Task(1, "Learn Bash", "Understand Shell Variables"); //this should fail since there's already a task with ID 1

        taskService.addTask(firstTask);
        taskService.addTask(secondTask);

        assertEquals(1, repository.findAll().size());
    }


}
