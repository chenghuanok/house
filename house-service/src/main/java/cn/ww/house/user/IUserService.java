package cn.ww.house.user;

import cn.ww.house.entity.User;

/**
 * 用户service
 * @Author: chenghuan
 * @Date: 2019/9/9 22:35
 */
public interface IUserService {

    /**
     * 保存用户
     *@param user
     *@return User
     *@author chenghuan
     *@date 2019/9/9 22:38
    */
    void save(final User user);
}
