package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hasset_Hashtablejava {

	private static final String Car = null;

	public static void main(String[] args) {
	//Array store multiple data using index
		
		int age = 30;                                       //Variable
		
		int[] ageFalcon = new int[]{25, 30, 28, 35, 40};         // Array

		//Array Index               [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageFalcon[3]);
		System.out.println("Total Student : " + ageFalcon.length);
	    
		//Write an Array for student name nameFalcon ?

        String[] nameFalcon = new String[]{"Tahmid", "Lubna", "Salman", "Rumi"};
		System.out.println("Student Name : " + nameFalcon[1]);
		System.out.println("Total Student : " + nameFalcon.length);

		
		 boolean[] attendenceFalcon = new boolean[]{true, false, true, false};
			System.out.println("Student Name : " + attendenceFalcon[1]);
			System.out.println("Total Student : " + attendenceFalcon.length);
			
			
    // Multi-dimantional Array
			int[][] ageFalcon2D = {{25, 30, 28, 35, 40},     //[0][0] [0][1] [0][3] [0][4]
					               {24, 28, 32, 22}};        //[1][0] [1][1] [1][2] [1][4]
			System.out.println("Student Age 2D : " + ageFalcon2D[0][3]);
			
   // Hashmap store multipul data using key-value pair, implementation of Map interface
			
	HashMap<String, Integer> StudentAge = new HashMap<String,Integer>();
	
	StudentAge.put("Tahmid", 25);
	StudentAge.put("Lubna", 24);	
	StudentAge.put("Salman", 27);
	StudentAge.put("Rumi", 35);
	StudentAge.put("Sumaiya", 25);
	
	System.out.println("Hashmap Student Age : " + StudentAge.get("Lubna"));
	
	
	//Country - Capital
	
HashMap<String, String> CountryCity = new HashMap<String,String>();
	 
       CountryCity.put("BD", "Dhaka");
       CountryCity.put("UK", "London");
       CountryCity.put("USA", "NewYork");
	
          
       System.out.println("Hashmap Country City: " + CountryCity.get("USA"));
   	
	//HashTable store multiple data using key-value pair, no duplicate,
    //also is synchronized (only one thread can be modified)
     
       Hashtable<String, String> Region = new Hashtable<String,String>();
       Region.put("BD", "Asia");
       Region.put("USA", "America");
    
       System.out.println("Hashtable Region : " + Region.get("BD"));
       
      
       //Hashset store unordered collection containing unique value, Implementation of Set interface
       HashSet<String> car = new HashSet<>();
       car.add("BMW");
       car.add("TESLA");
       car.add("AUDI");
       car.add("FORD");
       System.out.println("Car : " + car);
       
       
	}

}

        