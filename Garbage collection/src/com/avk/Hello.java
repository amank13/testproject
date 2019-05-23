package com.avk;

public class Hello {

	void m1() {
		
		System.out.println("m1-begin");
		Hai h1 = new Hai();
		Hai h2 = new Hai();
		Hai h3 = new Hai();

		System.out.println("m2-begin");
		System.runFinalization();
		System.gc();
		
		Hai h4 = new Hai();
		System.out.println("m2-end");
	}

	public void finalize() {
		
		System.out.println("Hello-Finalize");
	}

}
