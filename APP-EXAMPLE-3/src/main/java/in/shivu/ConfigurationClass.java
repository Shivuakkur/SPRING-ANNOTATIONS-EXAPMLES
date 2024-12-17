package in.shivu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class ConfigurationClass {
	public ConfigurationClass() {
		System.out.println("Configuration constructor called.....");
	}
}
	


