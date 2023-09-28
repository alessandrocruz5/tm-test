package com.test.crudtest3;

import com.test.crudtest3.model.User;
import com.test.crudtest3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
    @Autowired
    private UserService userService;

    @PostMapping("user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("user/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userService.getUserById(Long.valueOf(id));
    }

    @PutMapping("user/{id}")
    public User updateUserById(@PathVariable String id, @RequestBody User user) throws Exception {
        return userService.updateUserById(Long.valueOf(id), user);
    }

    @DeleteMapping("user/{id}")
    public String deleteUserById(@PathVariable String id) {
        userService.deleteUserById(Long.valueOf(id));
        return "User Deleted Successfully.";
    }
}
