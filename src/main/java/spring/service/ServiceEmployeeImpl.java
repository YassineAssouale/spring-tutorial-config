package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import spring.model.Employee;
import spring.repository.RepositoryEmployee;
//@Service // With @ComponentScan(basePackages={"spring.service","spring.repository"}) in AppConfig
public class ServiceEmployeeImpl implements ServiceEmployee{
	@Autowired // Replace the constructor below, Spring IoC create and inject the object
	private RepositoryEmployee repEmployee;
	
//	public ServiceEmployeeImpl(RepositoryEmployee _repEmployee) {
//		this.repEmployee = _repEmployee;
//	}

	@Override
	public Employee create() {
		
		return repEmployee.create();
	}

}
