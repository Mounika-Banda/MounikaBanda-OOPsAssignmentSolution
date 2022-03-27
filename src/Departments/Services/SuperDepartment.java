package Departments.Services;

//Super Department class is the super class for Admin, Tech & Hr Department Classes
public class SuperDepartment {
	
	//Methods in Super department Class
	public String departmentName(){
		return "Super Department";
	}
	
	public String getTodaysWork() {
		return "No Work as of now";
	}
	
	public String getWorkDeadline() {
		return "Nil";
	}
	
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

}
