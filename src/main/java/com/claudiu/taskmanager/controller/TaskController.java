package com.claudiu.taskmanager.controller;

import com.claudiu.taskmanager.model.Task;
import com.claudiu.taskmanager.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }
    @GetMapping("/hello")
    public String hello() {
        return "Active backend";
    }
    @PostMapping
    public Task createTask(@RequestParam String title, @RequestParam(required = false) String description) {
        return taskService.createTask(title, description);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTaskById(id);
    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestParam String title) {
        return taskService.updateTask(id, title);
    }




}
