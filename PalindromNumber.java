package com.dk.home;

public class PalindromNumber {

	public static void main(String[] args) {
		int no=116431;
		 int temp=no;
		int rev=0;
		int rem;
		while (temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;	
		}
		if(no==rev) 
			System.out.println(no+ " palindrom number");
		
		else 
			System.out.println(no+" Not Palindrom number");
	}
}
