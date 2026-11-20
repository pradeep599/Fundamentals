package com.Arrays;

public class Rounding {
	
	
	public static void main(String[] args) {
		
		int []marks= {99,95,71,84,81,75,60};
		
		for(int i=0;i<marks.length;i++) {
			int r=marks[i]%10;
			if(r>=5) {
				marks[i]=marks[i]+(10-r);
			}else {
				marks[i]=marks[i]-r;
			}
			System.out.println(marks[i]);
		}
	}
	
	
	

}
