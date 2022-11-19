package com.Method.NewMethod;

class Animal{
	
}
class Monkey extends Animal{	
}
public class Test4 {
	public void m1(Animal a) {
		System.out.println("Animal Version");
	}	
	public void m1(Monkey m) {
		System.out.println("Monkey type");
	}	
	public static void main(String[] args) {
		Test4 t = new Test4();
		Animal a = new Animal();
		t.m1(a); // Animal Version
		Monkey m = new Monkey();
		t.m1(m); // Monkey Version
		Animal a1 = new Animal();
		t.m1(a1); // Animal Version
	}
}
