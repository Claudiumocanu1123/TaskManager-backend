package com.claudiu.taskmanager.service;

import com.claudiu.taskmanager.model.Task;
import com.claudiu.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public Task createTask(String title, String description) {
        if(title == null || title.isEmpty()) {
            throw new IllegalArgumentException("title cannot be null or empty");
        }
        if(description == null ) {
            description = "";
        }
        Task task = new Task(title,description,false);
        return repository.save(task);
    }
    public List<Task> getAllTasks()
    {
        return repository.findAll();
    }
    public Optional<Task> getTaskById(Long id)
    {
        return repository.findById(id);
    }
    public Task completeTask(Long id) {
        Task task = repository.findById(id).orElseThrow(()->new RuntimeException("Task not found"));
        task.setCompleted(true);
        return repository.save(task);
    }
    public void deleteTaskById(Long id) {
        repository.deleteById(id);
    }
    public Task updateTask(Long id, String title,String description) {
        Task task = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));
        task.setTitle(title);
        task.setDescription(description);
        return repository.save(task);
    }

}
