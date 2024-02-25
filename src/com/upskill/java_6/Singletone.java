package com.upskill.java_6;

public class Singleton {
	
	//Singleton is class that can have only one object
 
	 private Singleton(){
     }
	 
	 
	 //Private static object of the class
	 private static Singleton SingletonObj = new Singleton();
	 
	 public static Singleton getInstance(){
		 return SingletonObj;
	 }
	 protected static void demo(){
		 System.out.println("Demo method for singleton class");
	 }
}
