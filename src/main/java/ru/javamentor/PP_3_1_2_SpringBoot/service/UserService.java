package ru.javamentor.PP_3_1_2_SpringBoot.service;


import ru.javamentor.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(int id);
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
}
