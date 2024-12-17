package in.shivu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.shivu.ConfigurationClass;
import in.shivu.beans.vtuService;


public class Test {
	public static void main(String[] args) {
		//how to start IOC
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		vtuService service = ctxt.getBean(vtuService.class);
		
		service.collectingFees();
	}


}
