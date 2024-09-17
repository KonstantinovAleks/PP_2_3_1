package konst.web_app.services;

import konst.web_app.dao.UserDao;
import konst.web_app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> showAllUsers() {
        return userDao.showAllUsers();
    }

    @Override
    public User showUserById(int id) {
        return userDao.showUserById(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUserById(id);
    }
}
