package cn.ww.house.user;

import cn.ww.house.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 用户Dao
 * @Author: chenghuan
 * @Date: 2019/9/9 22:29
 */
@Repository
public interface IUserDao  extends JpaRepository<User,Long> {

    /**
     *根据用户名和密码查找对应的用户
     *@param name
     *@param passWd
     *@return  User
     *@author chenghuan
     *@date 2019/9/9 22:32
    */
    User findByNameAndPassWd(final String name,final String passWd);
}
