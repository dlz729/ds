package com.example.dsuserprovider.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author dlz
 * @date 2020/11/19 10:48
 * @description
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class UserVo implements Serializable {

    private static  final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户中文名
     */
    private String userName;
}
