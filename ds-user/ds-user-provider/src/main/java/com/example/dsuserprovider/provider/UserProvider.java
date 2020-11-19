package com.example.dsuserprovider.provider;

import com.example.dsuserapi.service.UserService;
import com.example.dsuserprovider.entity.UserVo;
import com.example.dsuserprovider.service.UserApi;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dlz
 * @date 2020/11/19 10:51
 * @description
 */
@Service(interfaceClass = UserApi.class)
@Component
public class UserProvider implements UserApi {

    @Override
    public UserVo findUserById(String userId) {
        return null;
    }
}
