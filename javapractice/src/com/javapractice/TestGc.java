package com.javapractice;

public class TestGc {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method Called");
	}
	
	void method() {
		System.out.println("Method is called");
	}

	public static void main(String[] args) {
		
		System.out.println("Main Method started");
		TestGc G1=new TestGc();
//		TestGc G2=new TestGc();
//		TestGc G3=new TestGc();
//		TestGc G4=new TestGc();
		
		
		System.out.println(G1);
//		System.out.println(G2);
//		System.out.println(G3);
//		System.out.println(G4);
		
		
		System.out.println("Main Method ended");
		
		G1=null;
		
		
		System.gc();
	}

}
