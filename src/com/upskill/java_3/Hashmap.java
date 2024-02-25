package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap {

	public static void main(String[] args) {
	     
		

		
		HashMap<String, Boolean> attendance = new HashMap<String, Boolean>();
		
		attendance.put("caty", false);
		attendance.put("mimi", true);
		System.out.println(attendance.get("mimi"));
		System.out.println(attendance.get("caty"));
		
		 
		
		HashSet<String> StudentID = new HashSet<>();
		 StudentID.add("1234");
		 StudentID.add("4678");
		 StudentID.add("4567");
	       
	       System.out.println("StudentID : " + StudentID);
	       
	}

}
