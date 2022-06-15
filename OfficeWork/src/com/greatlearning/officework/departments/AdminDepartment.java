package com.greatlearning.officework.departments;

public class AdminDepartment extends SuperDepartment {
	
	//overridden department Name function
	public String departmentName() {
		return "Admin Department ";
	}
	
	//overridden get Todays Work function
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	//overridden get Work Deadline function
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

}
