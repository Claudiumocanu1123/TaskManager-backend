package com.claudiu.taskmanager.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String description;
    private boolean completed;
    @Column(name = "completed_at")
    private LocalDateTime completedAt;

    public Task() {

    }
    public Task( String title, String description, boolean completed, LocalDateTime completedAt) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.completedAt = completedAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public LocalDateTime getCompletedAt() {
        return completedAt;
    }
    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }
    public String toString()
    {
        return id + " " + title + " " + description + " " + completedAt + " " + completed;
    }

}
