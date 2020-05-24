package com.example.springtestcatalog;

import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class UserController {

    @PostMapping("/users")
    @ResponseBody
    @ResponseStatus(value = CREATED)
    public User createUser(@RequestBody UserForm userForm) {
        User user = new User(userForm.getName(), userForm.getEmail());
        return user;
    }
}