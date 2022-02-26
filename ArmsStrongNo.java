package com.dk.home;
// 0,1, 153=1*1*1=%*5*5*5+3*3*3=153 ,370,371,407
public class ArmsStrongNo {
public static void main(String[] args) {
	int no=153;
	int t1=no;
	int lenth=0;
	int rem;
	while (t1!=0) {
		lenth=lenth+1;
		t1=t1/10;
		
	}
	int t2=no;
	int arm=0;
	while(t2!=0) {
		int mul=1;
		
		rem=t2%10;
		for (int i =1; i <=lenth; i++) {
			mul=mul*rem;
			
		}
		arm=arm+mul;
		t2=t2/10;
	}
	if(arm==no) 
		System.out.println(no+ " :is Armstrong");

	else 
		System.out.println(no+ " :is  Not Armstrong");
	
}
}
