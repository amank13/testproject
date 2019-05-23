package com.avk;

public class ATest {

	public static void main(String[] args) {
		
		A a = new A();
		a.show();
		System.runFinalization();
		System.gc();
	}
	
	
}
