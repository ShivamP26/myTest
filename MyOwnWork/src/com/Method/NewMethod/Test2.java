package com.Method.NewMethod;

public class Test2 {
	public void m1(int i, float f) {
		System.out.println("int-float version");
	}
	public void m1(float f, int i) {
		{
			System.out.println("float int version");
		}
	}
	
	public static void main(String[] args) {
	Test2 t = new Test2();
	t.m1(10,10.5f); // int float version
	t.m1(10.5f, 10); // float int version
	//t.m1(10,10); // reference to m1() is ambiguous
	//t.m1(10.5f,10.5f); // CE: Cann't find symbol 
					   // Symbol: method m1(float, float)
						// location: class Test2
	}
}
