package emr.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import emr.dao.PatientDao;
import emr.pojo.Patient;




@Controller
public class WebController {

	
	@Autowired
	PatientDao dao;
	
	@RequestMapping("/index")
	public String showIndex() {
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String toLogin() {
		
		return "login";
	}
	
	@PostMapping("/verify")
	public String verifyUser(Model model,@RequestParam String uname,@RequestParam String pass) {
		
		Patient result = dao.verifyUser(uname, pass);
		if(result != null) {
			
			model.addAttribute("patient", result);
			return "home";
		}
		else {
			
			model.addAttribute("errormsg", "Wrong username or password please try again !!");
			return "login";
		}
	}
	
	
}
