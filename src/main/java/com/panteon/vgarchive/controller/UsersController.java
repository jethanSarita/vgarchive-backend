package com.panteon.vgarchive.controller;

import com.panteon.vgarchive.model.Users;
import com.panteon.vgarchive.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/add")
    public String add(@RequestBody Users user) {
        usersService.addUser(user);
        return "New user added";
    }

    @GetMapping("/getAll")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }
}
