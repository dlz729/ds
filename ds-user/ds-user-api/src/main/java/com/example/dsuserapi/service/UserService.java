package com.example.dsuserapi.service;

import com.example.dsuserprovider.entity.UserVo;

/**
 * @author dlz
 * @date 2020/11/19 10:54
 * @description
 */
public interface UserService {
    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    UserVo findUserById(String userId);
}
