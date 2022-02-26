package com.dk.home;
import java.util.Scanner;
public class ReversNo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter rev no");
	//int no=sc.nextInt();
	int no=65432 ,rev=0,rem=0;
	System.out.println(no);
	while(no!=0) {
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
		
	}
	System.out.println("The revs no is"+rev);
}
}
