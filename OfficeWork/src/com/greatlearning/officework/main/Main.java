package com.greatlearning.officework.main;
import com.greatlearning.officework.departments.*;
import com.greatlearning.officework.services.*;

public class Main {

	//Main function
	public static void main(String[] args) {
		
		//Object of Admin Department
		AdminDepartment adminDepartment=new AdminDepartment();
		MyConsole.Print(" Welcome to "+adminDepartment.departmentName());
		MyConsole.Print(adminDepartment.getTodaysWork());
		MyConsole.Print(adminDepartment.getWorkDeadline());
		MyConsole.Print(adminDepartment.isTodayAHoliday());
		MyConsole.Print(" ");
		
		//Object of Hr Department
		HrDepartment hrDepartment=new HrDepartment();
		MyConsole.Print(" Welcome to "+hrDepartment.departmentName());
		MyConsole.Print(hrDepartment.doActivity());
		MyConsole.Print(hrDepartment.getTodaysWork());
		MyConsole.Print(hrDepartment.getWorkDeadline());
		MyConsole.Print(hrDepartment.isTodayAHoliday());
		MyConsole.Print(" ");
		MyConsole.Print(" ");
		
		//Object of Tech Department
		TechDepartment techDepartment=new TechDepartment();
		MyConsole.Print(" Welcome to "+techDepartment.departmentName());
		MyConsole.Print(techDepartment.getTodaysWork());
		MyConsole.Print(techDepartment.getWorkDeadline());
		MyConsole.Print(techDepartment.getTechStackInformation());
		MyConsole.Print(techDepartment.isTodayAHoliday());
	}

}
