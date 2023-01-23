package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {
    private final UserDAO usersDAO;

    @Autowired
    public UserServiceImp(UserDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return usersDAO.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return usersDAO.getUser(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        usersDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(int id, User updateUser) {
        usersDAO.updateUser(id, updateUser);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        usersDAO.deleteUser(id);
    }

}
