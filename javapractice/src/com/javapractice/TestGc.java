package com.javapractice;


class A{
	
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized A method Called");
	}
	
}

class B{
	
	A a;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized B method Called");
	}
}

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
//		TestGc G1=new TestGc();
//		TestGc G2=new TestGc();
//		TestGc G3=new TestGc();
//		TestGc G4=new TestGc();
		
		
//		G2=null;
//		G1=G2;
//		G1=null;
		
		
		
//		System.out.println(G1);
//		System.out.println(G2);
//		System.out.println(G5);
//		object();
//		
		A obj1=new A();
		B obj2=new B();
		
		obj1.b=obj2;
		obj2.a=obj1;
		obj1=null;
		obj2=null;
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		System.gc();
		
		
		
		
		System.out.println("Main Method ended");
	}

//	static void object() {
//		TestGc G5=new TestGc();
//
//	}
}
