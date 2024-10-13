package com.example.taskmanager.service.impl;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> getAllTasks() {
        // TODO: Implement getting all tasks
        return null;
    }

    @Override
    public Task getTaskById(Long id) {
        // TODO: Implement getting a task by ID
        return null;
    }

    @Override
    public Task createTask(Task task) {
        // TODO: Implement creating a new task
        return null;
    }

    @Override
    public Task updateTask(Long id, Task task) {
        // TODO: Implement updating an existing task
        return null;
    }

    @Override
    public void deleteTask(Long id) {
        // TODO: Implement deleting a task
    }
}
