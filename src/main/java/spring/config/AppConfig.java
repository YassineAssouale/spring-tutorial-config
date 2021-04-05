package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.repository.RepositoryEmployee;
import spring.repository.RepositoryEmployeeImpl;
import spring.service.ServiceEmployee;
import spring.service.ServiceEmployeeImpl;

@Configuration
//@ComponentScan(basePackages={"spring.service","spring.repository"})
public class AppConfig {
	// Delete the beans declarations if you want to use @ComponentScan
	@Bean
	public ServiceEmployee serviceEmployee() {
		return new ServiceEmployeeImpl();
	}
	
	@Bean
	public RepositoryEmployee repositoryEmployee() {
		return new RepositoryEmployeeImpl();
	}
}
