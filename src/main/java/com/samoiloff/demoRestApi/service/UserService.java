package com.samoiloff.demoRestApi.service;

import com.samoiloff.demoRestApi.entity.UserEntity;
import com.samoiloff.demoRestApi.exception.UserAlreadyExistException;
import com.samoiloff.demoRestApi.exception.UserNotFoundException;
import com.samoiloff.demoRestApi.model.User;
import com.samoiloff.demoRestApi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExistException {
        if (userRepo.findByUsername(user.getUsername()) != null) {
            throw new UserAlreadyExistException("Пользователь с таким именем существует");
        }
        return userRepo.save(user);
    }

    public User getOne(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if (user == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return User.toModel(user);
    }

    public Long delete(Long id) {
        userRepo.deleteById(id);
        return id;
    }
}
