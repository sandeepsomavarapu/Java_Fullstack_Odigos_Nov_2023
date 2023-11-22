package com.odigos.basics;

public class Methods_Example {
	int marks = 123;
	static String schoolName = "xyz";

	public void displayMsg() { // default method with no return type and instance
		System.out.println("welcome to india");
	}

	public void addOfTwo(int a, int b) { // param method with no return type and instance
		System.out.println("Addition of two numbers :" + (a + b));
	}

	public static int subOfTwo(int a, int b) { // param method with int return type and static
		return a - b;
	}

	public String message() { // default method with return type and instance
		return "am from methods example...";
	}

	public static void main(String[] args) {

		System.out.println(Methods_Example.subOfTwo(12, 13));
		System.out.println(Methods_Example.schoolName);
		Methods_Example obj = new Methods_Example();
		System.out.println(obj.message());
		obj.addOfTwo(12, 14);
		System.out.println(obj.marks);

	}
}
