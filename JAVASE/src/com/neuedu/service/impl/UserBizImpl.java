package com.neuedu.service.impl;

import com.neuedu.exception.LoginException;
import com.neuedu.exception.RegisterException;
import com.neuedu.pojo.User;
import com.neuedu.service.UserBiz;

public class UserBizImpl implements UserBiz {
//����user��������
	private User[] users=new User[10];
	public UserBizImpl() {
		User user1=new User("admin","admin","Administrator","admin@123.com");
	
	User user2=new User("tom","cat","tomcat","tomcat@123.com");
	this.users[0]=user1;
	this.users[1]=user2;
}
	@Override
	public void register(String usename, String password, String password2, String name, String email)
			throws RegisterException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String username, String password) throws LoginException {
		// TODO Auto-generated method stub
		//����users����
		boolean usernameexists=false;
		for(int i=0;i<users.length;i++) {
			User user=users[i];
			if(user==null) {
				continue;
			}
			String _username=user.getUsername();
			String _password=user.getPassword();
			if(_username.equals(username)) {//�û�������
				usernameexists=true;
				
				if(password.equals(_password)) {//��¼�ɹ�
					System.out.println("��¼�ɹ�!!!");
				}else {//��ƥ��
					throw new LoginException("�û��������벻ƥ��");
				}
				
			}
			
		}
		if(usernameexists) {
			throw new LoginException("�û�������");
		}
		 
		
		
	}

}