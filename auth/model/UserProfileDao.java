package kaa.work.auth.model;

import sun.plugin.util.UserProfile;

import java.util.List;

/**
 * Created by user on 13.06.17.
 */
public interface UserProfileDao {
    List<UserProfile> findAll();
    UserProfile findByType(String type);
    UserProfile findById(int id);
}
