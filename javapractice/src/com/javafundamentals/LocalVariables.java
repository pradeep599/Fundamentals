package com.javafundamentals;

public class LocalVariables {
	
	static int sal=2;
	String name="Pradeep";
	
	

	public static void main(String[] args) {

		int sal;
		System.out.println(LocalVariables.sal);
		
		sal=20000;
		System.out.println(sal);
		System.out.println(sal);
		
		LocalVariables v1=new LocalVariables();
		System.out.println(v1.name);
	}

}
