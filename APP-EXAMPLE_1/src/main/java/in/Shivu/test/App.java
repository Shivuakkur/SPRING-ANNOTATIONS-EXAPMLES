package in.Shivu.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;


import in.Shivu.AppConfig;

public class App {
	public static void main(String[] args) {
		//how to start IOC
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
