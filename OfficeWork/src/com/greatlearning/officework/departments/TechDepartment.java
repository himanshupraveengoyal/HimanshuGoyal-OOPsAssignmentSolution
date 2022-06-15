package com.greatlearning.officework.departments;

public class TechDepartment extends SuperDepartment {
	
	//overridden department Name function
	public String departmentName() {
		return "Tech Department ";
	}
	
	//overridden get Todays Work function
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	//overridden get Work Deadline function
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	// get Tech Stack Information function
	public String getTechStackInformation() {
		return "core Java";
	}

}
