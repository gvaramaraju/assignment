package com.taskmanager.app.service;

import java.util.List;

import com.taskmanager.app.entity.Task;

public interface TaskManagerService {
	
public List<Task> getAll();
	
	public Task getTask(int id);
	
	public void addTask(Task task);
	
	public void deleteTask(int id);

}
