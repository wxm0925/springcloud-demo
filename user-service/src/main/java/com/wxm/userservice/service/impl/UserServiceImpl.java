package com.wxm.userservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxm.feignclient.user.dto.UserDTO;
import com.wxm.userservice.domain.User;
import com.wxm.userservice.mapper.UserMapper;
import com.wxm.userservice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author wen_xm
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-05-01 23:54:47
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

    @Autowired
    private UserMapper userMapper;

    Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public UserDTO getUserByid(String userId) {
        log.debug("查询用户:{}",userId);
        User user = userMapper.selectById(userId);
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUsername(user.getUsername());
        return userDTO;
    }
}




