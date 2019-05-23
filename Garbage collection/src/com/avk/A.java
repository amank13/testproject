package com.avk;

public class A {

	void show() {
		
		Hello h1 =new Hello();
		h1.m1();
		System.runFinalization();
		System.gc();
		
		Hello h2= new Hello();
		h2.m1();
		System.runFinalization();
		System.gc();
	}
	
	public void finalize() {
		
		System.out.println("A-Finalize");
	}
}
