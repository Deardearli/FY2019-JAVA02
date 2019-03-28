package com.neuedu.view.impl;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.service.UserBiz;
import com.neuedu.service.impl.UserBizImpl;
import com.neuedu.view.UserView;

public class UserViewImpl implements UserView {

	@Override
	public void login() throws LoginException {
		// TODO Auto-generated method stub
		//接受键盘输入,获取username,password
		Scanner s=new Scanner(System.in);
		System.out.println("请输入用户名");
		String username=s.next();
		System.out.println("请输入密码");
		String password=s.next();
		
		UserBiz userBiz=new UserBizImpl();
		userBiz.login(username, password);
		
		
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

}
