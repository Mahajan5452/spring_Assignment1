package com.assignment1;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class SpringInnoAssignment1Application {


	static App app;
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(configClass.class);
		System.out.println("hiii program");
		 app=context.getBean("app",App.class);
		app.test();
		context.close();
	}

}
