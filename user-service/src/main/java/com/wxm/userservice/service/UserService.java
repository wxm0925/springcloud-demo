package com.wxm.userservice.service;

import com.wxm.feignclient.user.dto.UserDTO;

public interface UserService {
    UserDTO getUserByid(String userId);
}
