package com.library.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.model.book;
import com.library.model.library;
import com.library.repository.bookRepository;
import com.library.repository.libraryRepository;

@RestController
@RequestMapping("/")
public class controllerclass {
	@Autowired
	private libraryRepository libraryrepo;
	
	@Autowired
	private bookRepository bookrepo;

	@GetMapping("/books")
	public List<book> getbooks(){
		System.out.println(bookrepo.findAll());
		return bookrepo.findAll();
	}
	@GetMapping("/{libraryId}/books")
	public List<book> getbookByLId(@PathVariable int libraryId){
		List<book> books= bookrepo.findByLibraryLibraryId(libraryId);
		System.out.println(books);
		return books;
	}
	@GetMapping("/library")
	public List<library> getlibrary() {
		System.out.println(libraryrepo.findById(101));
		return libraryrepo.findAll();
	}
//	@GetMapping("/book")
//	public List<book> getbooksByTime(@RequestParam(name = "bookDate") String book_date) throws ParseException{
//		System.out.println("book_date ... "+book_date);
//				  SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//		  Date newbookdate=formatter1.parse(book_date);
//		  
//		System.out.println("newbookdate .. "+newbookdate);
//		List<book> books= bookrepo.findByBookdate(newbookdate);
//		System.out.println("after date... "+books);
//		//2003-11-21T01:11:11Z
//		return books;
//		
//	}
	
	@GetMapping("/book")
	public List<book> getbooksByTime(@RequestParam(name = "bookDate") 	@DateTimeFormat(pattern="yyyy-MM-dd") Date book_date) throws ParseException{
		System.out.println("book_date ... "+book_date);
//				  SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
//		  Date newbookdate=formatter1.parse(book_date);
		  Date newbookdate= book_date;
		System.out.println("newbookdate .. "+newbookdate);
		System.out.println("all boooks... "+ bookrepo.findAll());
		List<book> books= bookrepo.findByBookdate(newbookdate);
		System.out.println("after date... "+books);
		//2003-11-21T01:11:11Z
		return books;
		
	}

}
