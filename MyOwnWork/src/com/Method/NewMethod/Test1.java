package com.Method.NewMethod;

public class Test1 {
	public void m1(String s) {
		System.out.println("String version");
	}
	public void m1(StringBuffer sb) {
		{
			System.out.println("String Buffer Version");
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1("durga"); // String Version
		t.m1(new StringBuffer("durga"));
		t.m1(null);  // CE: Reference to m1() is ambiguous
	}

}
