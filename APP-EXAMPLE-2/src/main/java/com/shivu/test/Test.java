package com.shivu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shivu.AppConfig;
import com.shivu.beans.ReportService;

public class Test {
	public static void main(String[] args) {
		//how to start IOC
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReportService service = ctxt.getBean(ReportService.class);
		
		service.generateReport();
	}


}
