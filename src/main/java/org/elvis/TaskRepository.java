package org.elvis;

import java.util.List;

public interface TaskRepository {

    void save(Task task);

    List<Task> findAll();

    Task findById(long id);

    boolean deleteById(long id);

    boolean update(long id, String newTitle, String newDescription);

    boolean markCompleted(long id);


}
