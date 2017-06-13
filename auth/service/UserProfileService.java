package kaa.work.auth.service;

import sun.plugin.util.UserProfile;

import java.util.List;

/**
 * Created by user on 13.06.17.
 */
public interface UserProfileService {
    UserProfile findById(int id);
    UserProfile findByType(String type);
    List<UserProfile> findAll();
}
