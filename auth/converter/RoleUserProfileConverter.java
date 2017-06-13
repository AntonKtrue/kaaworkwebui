package kaa.work.auth.converter;

import kaa.work.auth.service.UserProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import sun.plugin.util.UserProfile;

/**
 * Created by user on 13.06.17.
 */
public class RoleUserProfileConverter implements Converter<Object,UserProfile> {

    static final Logger logger = LoggerFactory.getLogger(RoleUserProfileConverter.class);

    @Autowired
    UserProfileService userProfileService;

    @Override
    public UserProfile convert(Object element) {
        Integer id = Integer.parseInt((String)element);
        UserProfile profile = userProfileService.findById(id);
        logger.info("Profile: {}", profile);
        return profile;
    }
}
