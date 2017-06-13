package kaa.work.auth.dao;

import kaa.work.auth.model.User;

import java.util.List;

/**
 * Created by user on 13.06.17.
 */
public interface UserDao {
    User findById(int id);
    User findBySSO(String sso);
    void save(User user);
    void deleteBySSO(String sso);
    List<User> findAllUsers();
}
