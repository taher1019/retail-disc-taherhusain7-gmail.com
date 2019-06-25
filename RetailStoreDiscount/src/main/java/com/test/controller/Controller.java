package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.entity.Bean;
import com.test.services.Service;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	Service serviceObj;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getMethod(ModelMap model) {
		return "billingForm";
	}
	
	@RequestMapping(value="/calculate-bill",method=RequestMethod.POST)
	public String calculateAmount(Model model, @RequestParam String bill_amount,@RequestParam String grocery_amount,@RequestParam String dropdown) {
		
		
		try {
			
			if(bill_amount != null && grocery_amount != null && dropdown != null && !bill_amount.equals("") && !grocery_amount.equals("") && !dropdown.equals("") && (Double.parseDouble(bill_amount)>0) && (Double.parseDouble(grocery_amount)>0))
			{
		
				if(dropdown.equals("1") || dropdown.equals("2") || dropdown.equals("3") || dropdown.equals("4"))
				{
				
		double ba = Double.parseDouble(bill_amount);
		double ga = Double.parseDouble(grocery_amount);
		
		String bastring = (ba - ga) + "";
		
		System.out.println("Value of final amount : "+bastring+ " case "+dropdown);
		
		Bean obj = new Bean();
		
		obj.setAmount(bastring);
		obj.setId(dropdown);
		
		bastring = serviceObj.calculateAmount(obj);
		
		ba = Double.parseDouble(bastring);
		
		System.out.println("Value after discount : "+ba);
		
		bastring = (ba+ga) + "";
		
		System.out.println("Final value to be displayed of amount : "+bastring);
		
		model.addAttribute("amount",bastring);
	        
	        return "result";
				}else
				{
					model.addAttribute("amount","Please enter valid id");
					return "result";
				}
			}
			else
			{
				model.addAttribute("amount","Please enter valid parameters");
				return "result";
			}
		}
		catch(Exception e)
		 {
			model.addAttribute("amount","Invalid entry "+e.getMessage());
			return "result";
		 }
		
	}
}
