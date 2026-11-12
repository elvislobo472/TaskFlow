package org.elvis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TaskTest {

    @Test
    void newTaskShouldNotBeCompleted(){

        //Arrange

        Task task = new Task(1, "Learn Python", "Begin with Lists, Tuples, Dictionary");

        //Assert

        assertFalse(task.isCompleted());



    }


    @Test
    void completedTaskShouldReturnTrue(){

        //Arrange

        Task task = new Task(1, "Learn Java", "Begin with OOPS");

        task.markCompleted();

        assertTrue(task.isCompleted());

    }


    @Test
    void taskShouldHaveCorrectTitle(){
        Task task = new Task(1, "Learn Java", "Begin with OOPS");

        assertEquals("Learn Java", task.getTitle());

    }



    @Test
    void taskShouldHaveCorrectDescription(){
        Task task = new Task(1, "Learn Java", "Begin with OOPS");

        assertEquals("Begin with OOPS", task.getDescription());

    }

}


