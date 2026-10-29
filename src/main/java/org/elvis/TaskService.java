package org.elvis;

import java.sql.Array;
import java.util.ArrayList;

public class TaskService {
    private ArrayList<Task> taskList = new ArrayList<>();



    public void addTask(Task task){
        taskList.add(task);
    }

}
