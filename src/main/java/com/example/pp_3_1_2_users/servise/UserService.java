package com.example.pp_3_1_2_users.servise;

import com.example.pp_3_1_2_users.models.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findById(long id);
    public void save(User user);
    public void update(long id, User updUser);
    public void delete(long id);
    public void gen5Users();
}