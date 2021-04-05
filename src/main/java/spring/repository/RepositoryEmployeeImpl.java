package spring.repository;

import org.springframework.stereotype.Repository;

import spring.model.Employee;
//@Repository // With @ComponentScan(basePackages={"spring.service","spring.repository"}) in AppConfig
public class RepositoryEmployeeImpl implements RepositoryEmployee{

	@Override
	public Employee create() {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setFirstName("Abdullah");
		employee.setLastName("Ahmed");		
		
		return employee;
	}

}
