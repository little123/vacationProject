package code.service;

import code.IDao.IUserDao;
import code.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Lr on 2017/7/10.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User gerUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }
}
