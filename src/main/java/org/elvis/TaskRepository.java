package org.elvis;

import java.util.ArrayList;

public interface TaskRepository {

    void save(Task task);

    ArrayList<Task> findAll();

    Task findById(long id);

    int deleteById(long id);

    void update(long id, String newTitle, String newDescription);

    int markCompleted(long id);


}
