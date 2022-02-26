package com.dk.home;

import java.util.Scanner;

public class FactorialWithRecersion {
	static int fact=1;
public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);
//	System.out.println("Enter No..");

	int no=5;
	//int no = sc.nextInt();
	FactorialWithRecersion f= new FactorialWithRecersion();
	f. calFact(no) ;
	System.out.println("The facr od "+ no + "is "+ fact);
}	

	void calFact(int num) {
		if(num>=1) {
			fact =fact*num;
			calFact(num-1);
		}
	}
}

