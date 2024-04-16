package com.panteon.vgarchive.service;

import com.panteon.vgarchive.model.Users;
import com.panteon.vgarchive.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    UsersRepository usersRepository;

    public Users addUser(Users u) {
        return usersRepository.save(u);
    }

    public void delUser (Users u) {
        usersRepository.delete(u);
    }

    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

}
