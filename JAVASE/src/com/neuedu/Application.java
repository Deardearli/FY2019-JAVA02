package com.neuedu;

import java.util.Scanner;

import com.neuedu.exception.LoginException;
import com.neuedu.view.UserView;
import com.neuedu.view.impl.UserViewImpl;

public class Application {
public static void main(String[] args) {
	Application app=new Application();
	app.choise();
}
public static void choise() {
	System.out.println("===»¶Ó­µÇÂ¼¼Æ·ÑÏµÍ³===");
	System.out.println("===ÇëÊäÈë:1:µÇÂ¼  2:×¢²á===");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num==1) {//µÇÂ¼
		UserView userView=new UserViewImpl();
		try {
			userView.login();
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();//´òÓ¡¶ÑÕ»ÐÅÏ¢
			String msg=e.getMessage();
			System.out.println(msg);
		}
	}else if(num==2) {
		//×¢²á
	}
}
}
