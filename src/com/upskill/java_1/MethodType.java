package com.upskill.java_1;

public class MethodType extends Variables {


 /*  types of method
     1.Void Method
     2.Static Method
     3.Return type Method 
 */
		
	public static int hourlyincome = 65;
	
	public static void main(String[] args) {	
	MethodType obj = new MethodType();
	obj.annualIncomevoid();
	
	System.out.println("My monthly income = " + obj.monthlyincomeReturn());
	
	weeklyIncomeStatic();
	}

	
	//void method
	public void annualIncomevoid(){
			int CalculteAnnualInciome = hourlyincome * 2000;
			System.out.println("My Annual Income =" + CalculteAnnualInciome);
					
}
  
	//return type method
			public int monthlyincomeReturn(){
			int calculateMonthlyIncome = hourlyincome * 200;
			return calculateMonthlyIncome;
			
}
			
    //satic Method
			public static void weeklyIncomeStatic(){
			int calculateweeklyIncome = hourlyincome * 40;
			System.out.println("My weekly Income = " + calculateweeklyIncome);
			}
			}
			
			
			
			
			