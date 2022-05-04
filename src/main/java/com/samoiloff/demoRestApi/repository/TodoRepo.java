package com.samoiloff.demoRestApi.repository;

import com.samoiloff.demoRestApi.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}
