package cn.ww.house.user.impl;

import cn.ww.house.entity.User;
import cn.ww.house.user.IUserDao;
import cn.ww.house.user.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户service
 * @Author: chenghuan
 * @Date: 2019/9/9 22:35
 */
@Service
@Transactional(rollbackFor = Exception.class)
@Slf4j
public class UserServiceImpl implements IUserService {

    /**
     * 用户Dao
     */
    @Autowired
    private IUserDao userDao;

    /**
     * 保存用户
     * @param user
     * @return User
     * @author chenghuan
     * @date 2019/9/9 22:38
     */
    @Override
    public void save(final User user) {
       userDao.save(user);
    }
}
