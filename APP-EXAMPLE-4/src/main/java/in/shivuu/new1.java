package in.shivuu;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class new1 {
	@PostConstruct
	public void init() {
		System.out.println("getting DB connection....");
	}
	public void getData() {
		System.out.println("getting data from DB....");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("closing DB connection.....");
	}
	
}
