package com.dk.home;

import java.util.Scanner;

public class FactRecThirdway {
//static	int fact=1;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No..");
		int no = s.nextInt();
		int fact;
		FactRecThirdway fs = new FactRecThirdway();
		fact = fs.calFact(no);
		System.out.println("The fact of" + no + "is" + fact);

	}

	int calFact(int no) {
		if (no >= 1) {
			return (no * calFact(no - 1));
		}
		return 1;
	}
}
