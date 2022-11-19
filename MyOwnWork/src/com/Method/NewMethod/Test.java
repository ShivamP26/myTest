package com.Method.NewMethod;

public class Test {
	public void m1(String s) {
		System.out.println("String version");
	}
	public void m1(Object o) {
		{
			System.out.println("Object Version");
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1(new Object()); // Object Version
		t.m1("durga"); // String Version
		t.m1(null); 
	}

}
