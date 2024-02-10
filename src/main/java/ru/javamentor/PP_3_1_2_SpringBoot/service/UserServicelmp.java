package ru.javamentor.PP_3_1_2_SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.PP_3_1_2_SpringBoot.dao.UserDao;
import ru.javamentor.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

@Service
@Transactional
public class UserServicelmp implements UserService {
    public UserDao userDao;


    @Autowired
    public UserServicelmp(UserDao userDao) {

        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {

        return userDao.getUsers();
    }

    @Transactional(readOnly = true)
    @Override
    public User getUser(int id) {

        return userDao.getUser(id);
    }


    @Override
    public void addUser(User user) {
        userDao.addUser(user);

    }


    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }


    @Override
    public void removeUser(int id) {
        userDao.removeUser(id);

    }
}
