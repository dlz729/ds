package com.example.dsuserprovider.service;

import com.example.dsuserprovider.entity.UserVo;

/**
 * @author dlz
 * @date 2020/11/19 10:51
 * @description
 */
public interface UserApi {
    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    UserVo findUserById(String userId);
}
