package cn.ww.house.controller.user.impl;

import cn.ww.house.async.AsyncTask;
import cn.ww.house.controller.user.IUserController;
import cn.ww.house.entity.User;
import cn.ww.house.user.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

/**
 * 用户controller
 * @Author: chenghuan
 * @Date: 2019/9/9 22:43
 */
@RestController
@RequestMapping("/house/user")
@Slf4j
public class UserController implements IUserController {

    /**
     * 用户service
    */
    @Autowired
    private IUserService userService;

    @Autowired
    private AsyncTask asyncTask;

    /**
     *保存用户
     *@author chenghuan
     *@date 2019/9/9 22:47
    */
    @Override
    @GetMapping("/save")
    public void save() {
       final User user = new User();
       final Date date = new Date();
       user.setName("chenghuan").setPhone("13871465451").setEmail("123@qq.com").setAboutMe("学习").
               setPassWd("111").setAvatar("123").
               setType(1).setCreateTime(date).setUpdateTime(date).setAgencyId(12L).setEnable(1);
       userService.save(user);
    }
}
