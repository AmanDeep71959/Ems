package com.flp.ems.view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;


public class UserInteraction {

	Scanner s=new Scanner(System.in);
	public void AddEmployee()
	{	
		HashMap<Integer,Object> hmap= new HashMap<Integer,Object>();
		
		
		System.out.println("Enter the employee name (alphanumeric only)");
		String Name=s.next();
		if(Validate.validateName(Name)==false)
		System.out.println("Invalid Input");		
		hmap.put(1,Name);
		
		
		System.out.println("Enter the Date in d-M-y format");
		String Date=s.next();
		hmap.put(2,Date);
		
		System.out.println("Enter the Kin_id");
		String 
		
		
		
		
		EmployeeServiceImpl empsvc=new EmployeeServiceImpl(); 
		empsvc.AddEmployee(hmap);
		
		
	}
	public void ModifyEmployee()
	{
	
	
	}
	public void RemoveEmployee()
	{
	
	
	}
	public void SearchEmployee(){
		
		
		
	}
}
