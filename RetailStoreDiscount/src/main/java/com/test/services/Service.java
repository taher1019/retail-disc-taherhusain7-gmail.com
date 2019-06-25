package com.test.services;

import com.test.entity.Bean;

@org.springframework.stereotype.Service
public class Service {

	public String calculateAmount(Bean obj) {
		
		String bill_id = obj.getId();
		
		String amount = obj.getAmount();
		
		double dblamount = Double.parseDouble(amount);
		
		double result;
		
		 switch(bill_id)
		 {
		 	 case "1" :
		 		 
		 		 result = dblamount - (dblamount * 0.3);
	            System.out.println("CAse 1!"); 
	            break;
	         case "2" :
	        	 result = dblamount - (dblamount * 0.1); 
	        	 
	        	 System.out.println("Case 2!"); 
		            break;
	         case "3" :
	        	 
	        	 result = dblamount - (dblamount * 0.05);
	            System.out.println("Case 3");
	            break;
	         case "4" :
	        	 
	        	 int x = (int) (dblamount/100);
	        	 
	        	 result = dblamount - (x * 5);
	        	 
	            System.out.println("Case 4");
	        break;
	         default :
	        	 result= 0.0;
	            System.out.println("no input");
		 }
		 
		 String finalResult = result+""; 
		
		return finalResult;
		
		
	}
	
}
