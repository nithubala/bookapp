package com.revature.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



import com.revature.model.Book;
import com.revature.service.BookService;


@Controller
@RequestMapping(value="Book")
public class BookController {
	@Autowired
	public BookService bookService;
	@GetMapping
	public String list(ModelMap modelMap){

	System.out.println("controller called");
	List<Book> books = bookService.findAll();
	System.out.println(books);
	modelMap.addAttribute("books", books);
	return "booklist";

	}

	/*@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addBook(@RequestParam("id") int id, @RequestParam("name") String bookname,
			@RequestParam("Authorname") String authorname,@RequestParam("publishdate")LocalDate publishdate,@RequestParam("Price") float price,@RequestParam("Content")
	  String content,@RequestParam("Status") String status ) {
		System.out.println("Controller called");
		Book book = new Book( isbn,bookname, authorname, publishdate, price, content , status);
		System.out.println("Inside the controller");
		bookService.save(book);
		
	}*/
	
	@GetMapping("/{id}")
	public String View(@PathVariable("id") int id,HttpSession session)
	{
	System.out.println("viewbook"+id);	
	Book book=bookService.findOne(id);
	session.setAttribute("selectbook", book);
	return "/details";
	
	}

	@GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "/loginuser";
    }
}

