package Departments.Services;

//Hr Department extends the properties of Super Class Super department
public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		return "Hr Department";
	}
	
	public String getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
	
	public String isTodayAHoliday() {
		return super.isTodayAHoliday();
	}

}
