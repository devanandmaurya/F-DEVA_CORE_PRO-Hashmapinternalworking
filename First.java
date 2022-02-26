package com.dk.star_pattern;

///i for row always fixed and j for colmun , star pattern k liye
public class First {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				// just reverse
				// for (int j =4; j >=i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
