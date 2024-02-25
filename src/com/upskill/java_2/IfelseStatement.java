package com.upskill.java_2;

public class IfelseStatement {

	public static void main(String[] args) {
		

		int age = 105;
		
		if (age < 13){
		    System.out.println("You are Children");
		} else if (age>=13 && age <18){
			System.out.println("You are Teenager");
		} else if (age >=65){
			if (age <100){
		    System.out.println("You are Senior");
			} else {
				System.out.println("You are Champion");
			}
		} else {
			System.out.println("You are adult");
		}
	}

}
