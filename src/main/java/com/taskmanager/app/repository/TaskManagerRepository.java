package com.taskmanager.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.taskmanager.app.entity.Task;

public interface TaskManagerRepository extends CrudRepository<Task, Integer>{

}
