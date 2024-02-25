package com.upskill.java_6;

public class MutiThreadingThread extends Thread{

	public void run() {
		
		try{
		System.out.println("Thread Number # " + Thread.currentThread().getId());
		} catch (Exception e){
			 e.printStackTrace();
		}

	}

}
