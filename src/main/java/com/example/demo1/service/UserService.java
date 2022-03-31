package com.example.demo1.service;

import com.example.demo1.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    User getInterfaceId(int id);

    void delete(int id);

    void edit(User u);
}
