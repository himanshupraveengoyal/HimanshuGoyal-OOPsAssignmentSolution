package com.greatlearning.officework.departments;

public class HrDepartment extends SuperDepartment {
	
	//overridden department Name function
	public String departmentName() {
		return "Hr Department ";
	}
	
	//overridden get Todays Work function
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	//overridden get Work Deadline function
	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
	
	// to do activity function
	public String doActivity() {
		return "team Lunch";
	}

}
