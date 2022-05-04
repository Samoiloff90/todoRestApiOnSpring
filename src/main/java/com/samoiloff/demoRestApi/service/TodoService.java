package com.samoiloff.demoRestApi.service;

import com.samoiloff.demoRestApi.entity.TodoEntity;
import com.samoiloff.demoRestApi.entity.UserEntity;
import com.samoiloff.demoRestApi.model.Todo;
import com.samoiloff.demoRestApi.repository.TodoRepo;
import com.samoiloff.demoRestApi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;
    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(TodoEntity todo, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo complete(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }
}
