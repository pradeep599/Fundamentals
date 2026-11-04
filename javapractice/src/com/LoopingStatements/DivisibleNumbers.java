package com.LoopingStatements;

public class DivisibleNumbers {

	public static void main(String[] args) {

		for(int i=1;i<=50;i++) {
			if(i%5==0&& i%3==0) {
				System.out.println(i+"->"+"Fizz & Buzz");
			}else if(i%5==0) {
				System.out.println(i+"->"+"Fizz");
			}else if(i%3==0) {
				System.out.println(i+"->"+"Buzz");
			}else {
				System.out.println(i+"->"+"These are not divisible by both 3&5");
			}
		}
	}

}
