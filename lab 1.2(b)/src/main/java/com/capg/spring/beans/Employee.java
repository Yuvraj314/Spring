package com.capg.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Empl")
@Scope("singleton")
public class Employee {
	
	@Value("12345")
	private int employeeId;
	
	@Value("Harriet")
	private String employeeName;
	
	@Value("40000")
	private double salary;
	
	@Value("40")
	private int age;
	
	@Autowired
	private SBU sbuDetails;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getSbuDetails() {
		return sbuDetails;
	}
	public void setSbuDetails(SBU sbuDetails) {
		this.sbuDetails = sbuDetails;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", age="
				+ age + "\nsbuDetails=" + sbuDetails + "]";
	}
	
	
	
	
}