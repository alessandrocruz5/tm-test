package com.test.crudtest.service;

import com.test.crudtest.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(User user);

    User getUserById(Long id);

    List<User> getUsers();

    User updateUserById(Long id, User user);

    void deleteUserById(Long id);
}
