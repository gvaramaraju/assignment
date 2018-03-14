package com.taskmanager.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.taskmanager.app.entity.Task;
import com.taskmanager.app.repository.TaskManagerRepository;

@Repository("TaskManagerDao")
public class TaskManagerDaoImpl implements TaskManagerDao {
	
	@Autowired
	private TaskManagerRepository taskManagerRepository;
	
	
	@Override
	public List<Task> getAll() {
		// TODO Auto-generated method stub
		List<Task> list = new ArrayList<>();
		taskManagerRepository.findAll().forEach(list::add);
		return list;
	}

	@Override
	public Task getTask(int id) {
		// TODO Auto-generated method stub
		return taskManagerRepository.findOne(id);
	}

	@Override
	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskManagerRepository.save(task);
	}

	@Override
	public void deleteTask(int id) {
		// TODO Auto-generated method stub
		taskManagerRepository.delete(id);
	}
	

}
