package kaa.work.auth.service;

import kaa.work.auth.model.UserProfileDao;
import org.springframework.beans.factory.annotation.Autowired;
import sun.plugin.util.UserProfile;

import java.util.List;

/**
 * Created by user on 13.06.17.
 */
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    UserProfileDao dao;

    @Override
    public UserProfile findById(int id) {
        return null;
    }

    @Override
    public UserProfile findByType(String type) {
        return null;
    }

    @Override
    public List<UserProfile> findAll() {
        return null;
    }
}
