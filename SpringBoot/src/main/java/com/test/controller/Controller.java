package com.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Bean;
import com.test.services.Service;

@RestController
public class Controller {

	@Autowired
	Service serviceObj;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getMethod() {
		return "Helloooo from Spring.. Select Post request for bill calculation";
	}
	
	@RequestMapping(method=RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public String calculateAmount(@RequestBody Bean obj) {
		
		try {
		
		if(obj != null && obj.getAmount() != null && obj.getGrocery_amount() != null && obj.getId()!= null && !obj.getAmount().equals("") && !obj.getGrocery_amount().equals("") && !obj.getId().equals("") && (Double.parseDouble(obj.getAmount())>0) && (Double.parseDouble(obj.getGrocery_amount())>0))
		{
			if(obj.getId().equals("1") || obj.getId().equals("2") || obj.getId().equals("3") || obj.getId().equals("4"))
				return serviceObj.calculateAmount(obj);
			else
				return "Please enter valid id";
		}
		else
		{
			return "Please enter valid parameters";
		}
		}
		catch(Exception e)
		 {
			return "Invalid entry "+e.getMessage();
		 }
		
	}
}
