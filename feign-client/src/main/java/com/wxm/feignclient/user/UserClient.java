package com.wxm.feignclient.user;

import com.wxm.feignclient.user.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service")
public interface UserClient {
    /**
     * 获取用户
     * @param userId 用户ID
     * @return
     */
    @GetMapping("user/{id}")
    UserDTO getUserByUserId(@PathVariable(value = "id") String userId);

}
