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
		//���ܼ�������,��ȡusername,password
		Scanner s=new Scanner(System.in);
		System.out.println("�������û���");
		String username=s.next();
		System.out.println("����������");
		String password=s.next();
		
		UserBiz userBiz=new UserBizImpl();
		userBiz.login(username, password);
		
		
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

}
