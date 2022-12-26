package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void create(User user);

    User showUserById(long id);

    List<User> getList();

    void update(long id, User user);

    void delete(long id);
}