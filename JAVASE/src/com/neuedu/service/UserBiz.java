package com.neuedu.service;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;

public interface UserBiz {
void register (String usename,String password,String password2,String name,String email)
		throws RegisterException;//用户注册
void login(String usename,String password)
		throws LoginException;//用户登录
}
