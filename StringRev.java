package com.dk.home;
import java.util.Scanner;

	
public class StringRev {
public static void main(String[] args) {
	Scanner  sc=new Scanner(System.in);
	
	System.out.println("Enter string to reve");
	String s=sc.next();
	///String s1="AMIT";
	String rev="";
	int lengt=s.length();
	for (int i =lengt-1; i >=0 ; i-- ) {
		rev=rev+s.charAt(i);
	}
	System.out.println( "string  no is : "+ s+" And The  rev String IS :"+ rev);
}
}
