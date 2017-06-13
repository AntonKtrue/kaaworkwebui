package kaa.work.auth.model;

import kaa.work.auth.dao.AbstractDao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import sun.plugin.util.UserProfile;

import java.util.List;

/**
 * Created by user on 13.06.17.
 */
@Repository("userProfileDao")
public class UserProfileDaoImpl extends AbstractDao<Integer, UserProfile> implements UserProfileDao{
    @Override
    @SuppressWarnings("uncheked")
    public List<UserProfile> findAll() {
        Criteria crit = createEntityCriteria();
        crit.addOrder(Order.asc("type"));
        return (List<UserProfile>)crit.list();
    }

    @Override
    public UserProfile findByType(String type) {
        Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("type",type));
        return (UserProfile)crit.uniqueResult();
    }

    @Override
    public UserProfile findById(int id) {
        return getByKey(id);
    }
}
