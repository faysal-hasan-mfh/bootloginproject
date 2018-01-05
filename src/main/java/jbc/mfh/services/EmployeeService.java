package jbc.mfh.services;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jbc.mfh.model.Employee;
import jbc.mfh.repository.EmployeeRepository;

@Service
//@Repository
public class EmployeeService {
	@Autowired
	private EmployeeRepository userRepository;

	@Transactional(readOnly = true)
	public List<Employee> getAll() {

		return userRepository.findAll();

	}

	@Transactional
	public Employee saveAndFlush(Employee si) {

		if (si != null) {
			si = userRepository.saveAndFlush(si);
		}

		return si;

	}

	@Transactional
	public void delete(long id) {

		userRepository.delete(id);

	}
	
	@Transactional
	public Employee findByUserNameAndPassword(String name, String password) {
		if(StringUtils.isNotEmpty(name) && StringUtils.isNotEmpty(password)) {
			 return userRepository.findByUserNameAndPassword(name, password);
		}
		return null;
	}

}
