package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
	public static void main(String[] args) {
		car();
		
    Polymorphism obj = new Polymorphism();
    obj.annualIncomevoid();
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to overrides

	public void annualIncomevoid(){
		int CalculteAnnualInciome = hourlyincome * 2000;
		int rentalIncome = 15000;
		int sideHussel = 25000;
		int newCalculteAnnualInciome = CalculteAnnualInciome + rentalIncome + sideHussel);
		    System.out.println("My Annual Income =" + newCalculteAnnualInciome);
	}
	
	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature

public static void car() {
	    System.out.println("My car is Tesla !");
}
public static void car(int door){
	    System.out.println("My car is Tesla !, it has door : " + door);
	
}
public static void car(String color){
	    System.out.println("My car is Tesla !, it has color : " + color);
}
public static void car(Boolean dualMotor){
		System.out.println("My car is Tesla !, it has dualmotor: " + dualMotor);
}		
public static void car(int seat, String bodytype){
		System.out.println("My car is Tesla !, it has seat : " + seat + "it has bodytype :" + bodytype);
}
public static void car(int door, int Mirror){
		System.out.println("My car is Tesla !, it has door : " + door + "it has two mirror : "+ Mirror);
  }	

}