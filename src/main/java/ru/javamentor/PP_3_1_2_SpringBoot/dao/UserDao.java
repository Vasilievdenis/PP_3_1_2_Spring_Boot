package ru.javamentor.PP_3_1_2_SpringBoot.dao;


import ru.javamentor.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();
    User getUser(int id);
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
}
