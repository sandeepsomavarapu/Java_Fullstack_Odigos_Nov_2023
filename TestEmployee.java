package com.odigos.oops;

public class TestEmployee {
	public static void main(String[] args) {
		Emplyoee emp = new Emplyoee(111,"mahesh",23.34f,"hyderabad");
		emp.setEmpId(123);
		emp.setEmpName("pavan");

		System.out.println(emp.toString());//heap addresss
		System.out.println(emp.getEmpId()+" "+emp.getEmpName());
	}
}
