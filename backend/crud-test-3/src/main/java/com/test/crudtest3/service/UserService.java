package com.test.crudtest3.service;

import com.test.crudtest3.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    User createUser(User user);

    Optional<User> getUserById(Long id);

    List<User> getUsers();

    User updateUserById(Long id, User user) throws Exception;

    void deleteUserById(Long id);
}