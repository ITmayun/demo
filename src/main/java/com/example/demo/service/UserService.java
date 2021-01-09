package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    public void insert(User user);

    public void update(User user);

    public void delete(int id);

    public List<User> selectAll();

    public User selectOne(int id);
}
