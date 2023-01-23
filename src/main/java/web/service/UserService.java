package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void updateUser(int id, User updateUser);

    void deleteUser(int id);
}
