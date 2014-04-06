package com.test;

public class JavaGrading {

	public static void main(String[] args) {

		int john = 80;

		if (john >= 90) {
			System.out.println("A grade");

		}

		else if (john < 70) {
			System.out.println("B grade");
		} else if (john < 65) {
			System.out.println("C grade");
		} else {
			System.out.println("Fail");
		}
	}

}
