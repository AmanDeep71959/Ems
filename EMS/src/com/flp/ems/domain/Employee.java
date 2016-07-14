package com.flp.ems.domain;
import java.util.Date;;

public class Employee {
	//member variables 
  private static int Employee_id=0;
  private String Name;
  private String Kin_id;
  private String Email_id;
  private int Phone_no;
  private Date Date_of_birth;
  private Date Date_of_Joining;
  private String Address;
  private int Department_id;
  private int Project_id;
  private int Roles_id;
  
 //constructors
  public Employee() {
		Employee_id++;
	}
  
  
public static int getEmployee_id() {
	return Employee_id;
}


public String getName() {
	return Name;
}


public void setName(String name) {
	Name = name;
}


public String getKin_id() {
	return Kin_id;
}


public void setKin_id(String kin_id) {
	Kin_id = kin_id;
}


public String getEmail_id() {
	return Email_id;
}


public void setEmail_id(String email_id) {
	Email_id = email_id;
}


public int getPhone_no() {
	return Phone_no;
}


public void setPhone_no(int phone_no) {
	Phone_no = phone_no;
}


public Date getDate_of_birth() {
	return Date_of_birth;
}


public void setDate_of_birth(Date date_of_birth) {
	Date_of_birth = date_of_birth;
}


public Date getDate_of_Joining() {
	return Date_of_Joining;
}


public void setDate_of_Joining(Date date_of_Joining) {
	Date_of_Joining = date_of_Joining;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


public int getDepartment_id() {
	return Department_id;
}


public void setDepartment_id(int department_id) {
	Department_id = department_id;
}


public int getProject_id() {
	return Project_id;
}


public void setProject_id(int project_id) {
	Project_id = project_id;
}

public int getRoles_id() {
	return Roles_id;
}

public void setRoles_id(int roles_id) {
	Roles_id = roles_id;
}




  
  }
  
