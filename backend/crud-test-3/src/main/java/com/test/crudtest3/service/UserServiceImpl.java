package com.test.crudtest3.service;

import com.test.crudtest3.model.User;
import com.test.crudtest3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUserById(Long id, User user) throws Exception {
//        Optional<User> existingUser = userRepository.findById(id);
//        if (existingUser.isPresent()) {
//            User updatedUser = existingUser.get();
//
//            updatedUser.setId(id);
//            updatedUser.setName(user.getName());
//            updatedUser.setEmail(user.getEmail());
//            updatedUser.setGender(user.getGender());
//            updatedUser.setDateCreated(user.getDateCreated());
//            updatedUser.setLastUpdated(LocalDateTime.now());
//
//            return userRepository.save(updatedUser);
//        } else {
//            throw new Exception("User not found.");
//        }
//        user.setId(id);
//        return userRepository.save(user);
        Optional<User> existingUser = userRepository.findById(id);
        if(existingUser.isPresent()) {
            User updatedUser = existingUser.get();
            updatedUser.setId(id);
            updatedUser.setName(user.getName());
            updatedUser.setEmail(user.getEmail());
            updatedUser.setGender(user.getGender());
            updatedUser.setLastUpdated(LocalDateTime.now());
            return userRepository.save(updatedUser);
        } else {
            throw new Exception("User not found.");
        }
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
