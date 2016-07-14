package com.flp.ems.view;
import java.util.Scanner;
public class BootClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Management System");
		//user view
		System.out.println("1-Create Employee");
		System.out.println("2-Search Employee");
		System.out.println("3-Modify Employee");
		System.out.println("4-Remove Employee");
		System.out.println("5-Employee view");
		
		//user input
		System.out.println("Enter the action");
		Scanner s=new Scanner(System.in);
		int userinput=s.nextInt();
		menuSelection(userinput);
		s.close();
	}
	
	public static void menuSelection(int userinput){
		UserInteraction usr=new UserInteraction();
		switch(userinput)
		{ 
		case 1:usr.AddEmployee();break;
		case 2:usr.SearchEmployee();break;
		case 3:usr.ModifyEmployee();break;
		case 4:usr.RemoveEmployee();break;
		case 5:usr.SearchEmployee();break;
		default:System.out.println("invalid input");break;
		}
		}
	}
	

