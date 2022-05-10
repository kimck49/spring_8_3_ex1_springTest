package com.kimck.spring_8_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		AdminConnection connection = ctx.getBean("adminconfig", AdminConnection.class);
		
		System.out.println(connection.getAdminId());
		System.out.println(connection.getAdminPw());
		System.out.println(connection.getSub_adminId());
		System.out.println(connection.getSub_adminPw());
		
		ctx.close();
		
	}

}
