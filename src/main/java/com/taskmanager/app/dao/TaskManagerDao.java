package com.taskmanager.app.dao;

import java.util.List;

import com.taskmanager.app.entity.Task;


public interface TaskManagerDao {
	
	
	public List<Task> getAll();
	
	public Task getTask(int id);
	
	public void addTask(Task task);
	
	public void deleteTask(int id);

}
