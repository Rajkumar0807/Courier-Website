package com;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="trainee")
public class Trainee extends Emp{
	
	float payperday;
	
	String period;
	
	public Trainee(float payperday, String period,String name) {
		super(name);
		this.payperday = payperday;
		this.period = period;
		
	}
	public Trainee() {
		
	}
	
	
	
	
	public float getPayperday() {
		return payperday;
	}
	public String getPeriod() {
		return period;
	}
	public void setPayperday(float payperday) {
		this.payperday = payperday;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	

}
