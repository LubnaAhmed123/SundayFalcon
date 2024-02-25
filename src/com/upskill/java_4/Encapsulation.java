package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
		
   private String name = "rasel";
   public int mobileNumber = 12345678;
   private int ssn = 5586547;                               //Update, write only
   private String Username = "Upskill";                    //Retrieve, Read only
   private String password = "Upskill1234";               //Update, write only
   
   
   //setter Method - name
    public void setName(String value){
    	name = value;
    }
    //getter method - name
    public void getName(){
    	return name;
    }
    //Getter Method - mobileNumber
    public int getmobileNumber(){
        return mobileNumber;
    }

    //setter Method - ssn
    public void setssn(int value){
        ssn = value;
    }
    //getter method - Username
    public String getusername(){
    	return name;
    }
    //setter Method - password
    public void setpassword(String value){
        password = value;
    }
}
    


