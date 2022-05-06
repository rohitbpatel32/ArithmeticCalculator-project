package com.try1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Email_List {
	 public static void main(String[] args)
	    {
	        // creating an Empty String List
	        List<String> arr = new ArrayList<String>();
	  
	        // using add() to initialize values
	       
	        arr.add("rohitbpatel33@gmail.com");
	        arr.add("nvnpatel4@gmail.com");
	        arr.add("rakesh123@yahoo.com");
	        arr.add("skyyang@hotmail.com");
	        arr.add("girish224@yahoo.com");
	        arr.add("rekhanaveen@outlook.in");
	        arr.add("jigneshdahiya@gmail.com");
	        arr.add("niravsof@yahoo.com");
	        arr.add("manojvajpayee@gmail.com");
	        //System.out.println("List of email address :\n"+arr);
	       // System.out.println(arr.size());
	        	String email;
	        	Scanner sc =new Scanner(System.in);
	        	System.out.println("enter the email to validate");
	        	email=sc.next();
	        // use contains() to check if the element present or not.
	        
	        boolean ans = arr.contains(email);
	  
	        if (ans)
	            System.out.println("The list contains Email ID: " +email+" provided by user");
	        else
	            System.out.println("The list does not contains Email ID: " +email+" provided by user");
	  
	      // System.console();
	    }
		
}

