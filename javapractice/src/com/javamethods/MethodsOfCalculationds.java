package com.javamethods;

import java.util.Scanner;

public class MethodsOfCalculationds {
	Scanner sc=new Scanner(System.in);
	
	double Telugu() {
		System.out.println("Enter your Telugu Marks:");
		double Tel=sc.nextDouble();
		return Tel;
	}
	
	double Hindi() {
		System.out.println("Enter your Hindi Marks:");
		double Hin=sc.nextDouble();
		return Hin;
	}
	
	double English() {
		System.out.println("Enter your English Marks:");
		double Eng=sc.nextDouble();
		return Eng;
	}
	
	double Mathematics() {
		System.out.println("Enter your Mathematics Marks:");
		double Math=sc.nextDouble();
		return Math;
	}
	
	double Science() {
		System.out.println("Enter your Science Marks:");
		double Sce=sc.nextDouble();
		return Sce;
	}
	
	double Social() {
		System.out.println("Enter your Social Marks:");
		double Soc=sc.nextDouble();
		return Soc;
	}

	void main(String[] args) {
		
		double Tel=Telugu();
		double Hin=Hindi();
		double Eng=English();
		double Math=Mathematics();
		double Sce=Science();
		double Soc=Social();
		
		System.out.println("Telugu:"+Tel);
		System.out.println("Hindi:"+Hin);
		System.out.println("English:"+Eng);
		System.out.println("Mathematics:"+Math);
		System.out.println("Science:"+Sce);
		System.out.println("Social:"+Soc);

		System.out.println("Total Marks :"+(Tel+Hin+Eng+Math+Sce+Soc));
		
		System.out.println("Average Marks :"+(Tel+Hin+Eng+Math+Sce+Soc/6));

		


		
		
	}

}
