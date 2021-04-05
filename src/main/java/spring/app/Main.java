package spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import spring.config.AppConfig;
import spring.model.Employee;
import spring.service.ServiceEmployee;
import spring.service.ServiceEmployeeImpl;

public class Main {

	public static void main(String[] args) {
		
		// 1- Method 
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// 2- Method 
		//AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ctx.register(AppConfig.class);
		//ctx.refresh();
		
		
		ServiceEmployee employeeManager = ctx.getBean(ServiceEmployee.class);
		Employee employee = employeeManager.create();
		
		System.out.println(employee);
		
		
		
		
	}

}
