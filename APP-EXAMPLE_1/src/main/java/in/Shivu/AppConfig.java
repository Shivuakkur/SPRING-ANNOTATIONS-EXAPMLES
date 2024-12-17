package in.Shivu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
(basePackages = {"in.Shivu,com.mysore"})
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig::constructor");
	}
	@Bean
	public Engine getEngine() {
		Engine eng = new Engine();
		
		return eng;
	}
	

}
