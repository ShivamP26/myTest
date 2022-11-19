package com.Method.NewMethod;

public class Test3 {
	public void m1(int i) {
		System.out.println("int version");
	}
	
	public void m1(int...x) {
		System.out.println("var arg method");
	}
	
	public static void main(String[] args) {
		Test3 t = new Test3();
		t.m1();
		t.m1(10,20);
		t.m1(10);
	}
}
