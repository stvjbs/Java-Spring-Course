package ru.gb.MySecondProjectLection;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {
    private final List<Task> tasks = new ArrayList<>();

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task getTaskById(UUID id) {
        return tasks.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
    }

    public Task addNewTask(Task task) {
        tasks.add(task);
        return task;
    }

    public void deleteTaskById(UUID id) {
        tasks.removeIf(x -> x.getId().equals(id));
    }

    public Task updateTask(UUID id, Task task) {
        Task task1 = getTaskById(id);
        if (task1 != null) {
            task1.setDescription(task.getDescription());
            task1.setName(task.getName());
            task1.setStatus(task.getStatus());
            task1.setCompletionTime(task.getCompletionTime());
        }
        return task1;
    }
}
