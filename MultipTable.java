package com.dk.home;
import java.util.Scanner;
public class MultipTable {
public static void main(String[] args) {
	Scanner  s=new Scanner(System.in);
	System.out.println("Enter no");
	int t=s.nextInt();
	for (int i = 1; i <=10; i++) {
	
	//System.out.println(t*i);  //or
		System.out.println(t +"*"+i +"="+t*i);
	}

}
}
