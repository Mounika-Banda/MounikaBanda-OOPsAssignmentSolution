package Departments.Driver;

import Departments.Services.AdminDepartment;
import Departments.Services.HrDepartment;
import Departments.Services.TechDepartment;

public class Driver {

	//Main Method
	public static void main(String[] args) {
		
		//Creating Objects of HR, Tech, Admin Department Classes
		HrDepartment hr = new HrDepartment();
		TechDepartment te = new TechDepartment();
		AdminDepartment ad = new AdminDepartment();
		
		//Calling AdminDepartment Functions
		System.out.println("Welcome to " +ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday()+"\n");
		
		//Calling HR Department Functions
		System.out.println("Welcome to " +hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday()+"\n");
		
		//Calling TechDepartment Functions
		System.out.println("Welcome to " +te.departmentName());
		System.out.println(te.getTodaysWork());
		System.out.println(te.getWorkDeadline());
		System.out.println(te.getTechStackInformation());
		System.out.println(te.isTodayAHoliday()+"\n");
		
	}

}
