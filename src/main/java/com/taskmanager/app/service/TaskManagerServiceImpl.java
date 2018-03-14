package com.taskmanager.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanager.app.dao.TaskManagerDao;
import com.taskmanager.app.entity.Task;

@Service("taskManagerService")
public class TaskManagerServiceImpl implements TaskManagerService{
	
	@Autowired
	private TaskManagerDao taskManagerDao;
	
	@Override
	public List<Task> getAll() {
		// TODO Auto-generated method stub
		return taskManagerDao.getAll();
	}

	@Override
	public Task getTask(int id) {
		// TODO Auto-generated method stub
		return taskManagerDao.getTask(id);
	}

	@Override
	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskManagerDao.addTask(task);
	}

	@Override
	public void deleteTask(int id) {
		// TODO Auto-generated method stub
		taskManagerDao.deleteTask(id);
	}
	

}
