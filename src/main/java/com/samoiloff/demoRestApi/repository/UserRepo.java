package com.samoiloff.demoRestApi.repository;

import com.samoiloff.demoRestApi.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
