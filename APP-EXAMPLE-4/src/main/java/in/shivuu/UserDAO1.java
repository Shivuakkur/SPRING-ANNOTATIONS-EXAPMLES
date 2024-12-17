package in.shivuu;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDAO1 implements InitializingBean,DisposableBean {
//	public void init() {
//		System.out.println("getting DB connection....");
//	}
	public void getData() {
		System.out.println("getting data from DB....");
	}
	public void destroy() {
		System.out.println("closing DB connection.....");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init method....");
		
	}

}
