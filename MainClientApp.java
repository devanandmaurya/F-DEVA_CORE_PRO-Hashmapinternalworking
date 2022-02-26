package com.home.dk;

public class MainClientApp {

	public static void main(String[] args) {
		Address address = new Address("Maharashtra", "Mumbai", "Malad");
		Student st = new Student("Devanand", 1, address);
		// Student st= new Student();
		// st.setId(1);
		// st.setName("Devanand");

		System.out.println("Main The Details is : " + st);
		System.out.println(st.hashCode());
		// st.setId(2);
		// st.setName("Sunil");
//BY THE BELLOW LINE ITS MAKES IMMUTABLE OBJECT BUT NOT PROPER MANNER HOW TO PROTECTED 
		// BY USING SOME WAY
		// HERE NO DIRECT ACCESS OF THE OBJECT CLONE OBJECT CHANGE
		Address newAddress = st.getAddress();
		newAddress.setCity("mumbai");
		newAddress.setState("Maha");
		newAddress.setStreet("Mirali");
		System.out.println(st + "hashcode" + st.hashCode());
		System.out.println("From muatable of st " + newAddress);
		System.out.println(newAddress.hashCode());
	}

	// someone can used getinstance method.

}
