package com;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="regular")
public class RegEmp extends Emp{
	

	float sal;
	String dept;
	public RegEmp(float sal, String dept, String name) {
		super(name);
		this.sal = sal;
		this.dept = dept;
	}
	public float getSal() {
		return sal;
	}
	public String getDept() {
		return dept;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
	
	