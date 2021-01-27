package com.bipredicate;

public class TimeSheet {
	
	private int eno;
	private int days;
	public TimeSheet(int eno, int days) {
		super();
		this.eno = eno;
		this.days = days;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	

}
