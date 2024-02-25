/*Problem 02: A rectangle width and length are: 9 and 13 inches.
Write a method to display the perimeter of rectangle in console output. */

package com.talentech.assignment1;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Problem2 myObject = new Problem2 ();
		myObject.myMethod2();
	}
	public void myMethod2() {
		int a = 9;
		int b = 13;
		int c = 2*(a+b);
	System.out.println("The perimeter of the rectangle with arm 9 and 13 is "+c);
		
	}
}

