package in.shivuu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.shivuu.AppConfig;
import in.shivuu.UserDAO;
import in.shivuu.UserDAO1;
import in.shivuu.new1;

public class Text {
	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
//		
////		UserDAO dao = ac.getBean(UserDAO.class);
//		UserDAO1 dao = ac.getBean(UserDAO1.class);
//		
//		dao.getData();
//		
//		ConfigurableApplicationContext ct = (ConfigurableApplicationContext)ac;
//		ct.close();
		
	
//		dao.getData();

		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		new1 n= ac.getBean(new1.class);
		n.getData();
		ConfigurableApplicationContext ct = (ConfigurableApplicationContext)ac;
		ct.close();
	}

}
