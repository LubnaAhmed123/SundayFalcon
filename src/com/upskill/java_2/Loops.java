package com.upskill.java_2;

public class Loops {
	/*
	Type of Loops
	     1. For Loop
	     2. While Loop
	     3. Do While Loop
	     4. Infinite Loop
	 */

	public static void main(String[] args) {
		practiceForLoop();
		practiceWhileLoop();
		practiceDoWhileLoop();
		practiceinfiniteLoop();
		practiceNestedLoop();
	}
   
	public static void practiceForLoop(){                             //For Loop- Do again and Again limit
		                                                  
		int i;                                                         //Initialize the variables
    	for (i = 1; i <=10; i++){                                     //Setting lower limit, Upper limit, Increment or decrement
            System.out.println("For Loops number = " + i);           //Statement
    	}
    }



 //While Loop
public static void practiceWhileLoop(){                               //While Loop- Do again and again until condition match
	int i = 1;                                                        //Initialize the variables
	while(i<=0){                                                     //Setting Condition
		 System.out.println("While Loops number = " + i);             //Statement
	i++;                                                              //Increment or decrement
	   }
    }



//Do while Loop
public static void practiceDoWhileLoop(){                               //DoWhileLoop- Do action then match condition
	int i = 1;
    do {
       System.out.println("Do While Loops number = " + i);
       i++;
    } while(i<=0);   
}
   




//Infinite Loop                                                 //Never ending loop
public static void practiceinfiniteLoop(){  
	int i;
	for (i = 1; i <= 10; i++){
	System.out.println("For Loops number = " + i);
	 }
   }
 

  //Nested Loop                                                   //loop inside loop
public static void practiceNestedLoop(){  
	int i;
	int j;
	for (i = 1; i <= 10; i++){
		for(j = 1; j <=10; j++){
			int multificationTable = i * j;
			System.out.print(multificationTable + " ");
		}
		System.out.println(" ");
	 }
   }
}