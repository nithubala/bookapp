package com.revature.controller;



import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.revature.model.User;
import com.revature.service.UserService;

@Controller
@RequestMapping(value = "User")
public class UserController {
	private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

	@Autowired
	public UserService userservice;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {

			System.out.println("Controller called");	
		return "registeruser";
	}

	

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public String addUser(@RequestParam("id") int id, @RequestParam("name") String name,@RequestParam("uname") String username,
			@RequestParam("psw") String password, @RequestParam("mobno") long mobileno,@RequestParam("mailid")
	  String emailid,@RequestParam("Role") String role ) {
		
		User user = new User(id,name,username,password,mobileno,emailid,"yes",role);
		System.out.println("Inside the controller");
		userservice.save(user);
		return "loginuser";
		

}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login()
	{
		System.out.println("login controller called");
		return "loginuser";
	}
	
	
		
	
	@RequestMapping(value = "/addlogin",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,@RequestParam("password") String password,ModelMap modelMap, HttpSession session )
    {
        
        
        System.out.println("controller logged in");
        LOGGER.info("Entering Login" +username +"-"+password);
        LOGGER.debug(new Object[] {username,password});
        
        User user = userservice.login(username,password);
        LOGGER.info("User:"+ username);
        
        
        if(user !=null){
        	session.setAttribute("LOGGED_IN_USER",user);
            LOGGER.info(" login success");
            return "redirect:../Book";
            
            }
        else{
        	modelMap.addAttribute("USERNAME",username);
        	modelMap.addAttribute("ERROR_MESSAGE","Invalid username/password");
            LOGGER.error("failure");
            return "User/login";
        }
        
    }
}
