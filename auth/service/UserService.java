package kaa.work.auth.service;

import kaa.work.auth.model.User;

import java.util.List;

/**
 * Created by user on 13.06.17.
 */
public interface UserService  {
    User findById(int id);
    User findBySSO(String sso);
    void saveUser(User uesr);
    void updateUser(User user);
    void deleteUserBySSO(String sso);
    List<User> findAllUsers();
    boolean isUserSSOUnique(Integer id, String sso);
}
