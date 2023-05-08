package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeDetails {
	@Id
    private int id;
    private int age;
    private String jobdesgination;
    private String Salary;
    private String Address;
    private String Branch;
    private String Gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJobdesgination() {
		return jobdesgination;
	}
	public void setJobdesgination(String jobdesgination) {
		this.jobdesgination = jobdesgination;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", age=" + age + ", jobdesgination=" + jobdesgination + ", Salary="
				+ Salary + ", Address=" + Address + ", Branch=" + Branch + ", Gender=" + Gender + "]";
	}
    
    
}
