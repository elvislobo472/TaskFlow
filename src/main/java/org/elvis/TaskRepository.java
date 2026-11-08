package org.elvis;

import java.util.ArrayList;

public interface TaskRepository {

    void save(Task task);

    ArrayList<Task> findAll();

    Task findById(long id);

    boolean deleteById(long id);

    boolean update(long id, String newTitle, String newDescription);

    boolean markCompleted(long id);


}
