package Departments.Services;

//Admin Department extends the properties of Super Class Super department
public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String isTodayAHoliday() {
		return (super.isTodayAHoliday());
	}
	
}
