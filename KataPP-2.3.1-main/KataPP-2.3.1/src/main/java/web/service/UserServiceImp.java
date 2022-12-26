package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.UserDao;
import web.model.User;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(long id) {
        userDao.delete(id);
    }

    @Override
    @Transactional(readOnly = true)
    public void update(long id, User user) {
        userDao.update(id, user);
    }

    @Override
    @Transactional(readOnly = true)
    public User showUserById(long id) {
        return userDao.showUserById(id);
    }


    @Override
    @Transactional(readOnly = true)
    public List<User> getList() {
        return userDao.getList();
    }

}
