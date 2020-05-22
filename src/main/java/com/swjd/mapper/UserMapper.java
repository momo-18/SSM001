package com.swjd.mapper;

import com.swjd.bean.User;

public interface UserMapper {
    //登录
    public abstract User findUserByUnamePwd(User user);
}
