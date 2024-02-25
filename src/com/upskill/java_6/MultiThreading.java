package com.upskill.java_6;

public class MultiThreading {
	

	public static void main(String[] args) {
		int n = 3 ;
		for(int i = 0; i < n; i++){
			MutiThreadingThread obj = new MutiThreadingThread();
			obj.start();
		}
	}
}
