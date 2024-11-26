package com.spring.bioMedical.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author aravind reddy
 * @github AravindReddy-cyber
 *
 */
@Controller
public class LoginController {


	@RequestMapping("/showMyLoginPage")
	public String showHome()
	{
		
		return "login";
	}

	
/*
	@RequestMapping("/authenticateTheUser")
	public String shwHome()
	{
		
		return "user/success";
	}*/


}
