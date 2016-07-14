package com.flp.ems.util;

import java.util.regex.Pattern;

public class Validate {
	
	public static boolean validateName(String Name)
	{
		boolean b=Pattern.matches("[a-zA-Z0-9]",Name);
		return b;
	}
	
	
	
	public static boolean validateKin_id()
	{
		
		return true;
			
	}
	
	public static boolean validatePhone_no()
	{
		return true;	
		
	}
	
	public static boolean validateemail_id()
	{
		return true;
			
	}
	
	public static boolean validatedate()
	{
		return true;
			
	}
}
