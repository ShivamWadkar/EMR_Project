package study.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import study.dao.BookDAO;
import study.dao.LoginDAO;
import study.entity.Books;

@Controller
public class WebController {

	@Autowired
	BookDAO dao;
	
	@Autowired
	LoginDAO dao1;
	
//	@RequestMapping("/index")
//	public String showIndex() {
//		
//		return "index";
//	}
	
//	@RequestMapping("/login")
//	public String toLogin() {
//		
//		return "login"; //view login.jsp page
//	}
//	
//	
//	
//	
//	@PostMapping("/verify")
//	public String verifyUser(Model model,@RequestParam String uname,@RequestParam String pass) {
//		
//		Boolean result = dao1.verifyUser(uname, pass);
//		if(result == true) {
//			
//			model.addAttribute("user", uname);
//			return "home";
//		}
//		else {
//			
//			model.addAttribute("errormsg", "Wrong username or password please try again !!");
//			return "login";
//		}
//	}
//	
//	@GetMapping("/showbook")
//	public ModelAndView getListOfBooks(){
//		
//		ModelAndView mv = new ModelAndView();
//	
//		List<Books> list = dao.getAllBooks();
//		
//		mv.addObject("books", list);
//		mv.setViewName("booklist");
//		
//		return mv;
//	}
//	
//	@GetMapping("/getdetails")
//	public ModelAndView getDetails(Model model,@RequestParam String books) {
//		
//		ModelAndView mv = new ModelAndView();
//		
//		List<Books> list = dao.getBookDetails(books);
//		
//		mv.addObject("book", list);
//		mv.setViewName("bookbyname");
//		
//		return mv;
//	}
//	
//	
//	@GetMapping("/deletebook")
//	public ModelAndView deleteBook() {
//		
//		ModelAndView mv = new ModelAndView();
//		
//		List<Books> list = dao.getAllBooks();
//		
//		mv.addObject("books", list);
//		mv.setViewName("delete");
//		
//		return mv;
//	}
//	
//	@GetMapping("/deletebook1")
//	public String deleteBook1(@RequestParam int id) {
//		
//		dao.deleteBook(id);
//		return "home";
//	}
//	
//	@RequestMapping("/home")
//	public String homeJSP() {
//		
//		return "home";
//	}
//	
//	
//	@RequestMapping("/addbook")
//	public String add2() {
//		
//		return "addbook"; //view addbook.jsp page
//	}
//	
//	@PostMapping("/addbk")
//	public ModelAndView add(@RequestParam int id,@RequestParam String name ,@RequestParam int cost) {
//		ModelAndView mv = new ModelAndView();
//		
//		dao.addBook(id, name, cost);
//		
//		
//		
//		mv.addObject("user", name);
//		mv.setViewName("addbook"); //view addbook.jsp page
//		
//		return mv;
//		
//	}
//	
//	@RequestMapping("/welcome")
//	public String wel() {
//		
//		return "welcome"; //view welcome.jsp page
//	}
//	
//	@RequestMapping("/sign_up")
//	public String sign() {
//		
//		return "sign_up"; //view sign_up.jsp page
//	}
//	
//	
//	@GetMapping("/showall")
//	public ModelAndView showAll()
//	{
//		ModelAndView mv = new ModelAndView();
//		
//		List<Books> list = dao.getAllBooks();
//		
//		mv.addObject("booklist",list);
//		mv.setViewName("home");
//		
//		return mv;
//	}
//	

}
