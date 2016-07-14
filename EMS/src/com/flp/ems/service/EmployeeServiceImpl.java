package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	

	
	@Override
	public void AddEmployee(HashMap<Integer,Object> hmap) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setName((String)hmap.get(1));
		
		
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}
	
	
}
