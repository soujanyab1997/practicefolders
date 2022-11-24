package com.example.oderwell.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.oderwell.model.StagingOrderStoreLine;
import com.example.oderwell.model.StagingStoreOrder;
import com.example.oderwell.repository.lineRepository;
import com.example.oderwell.repository.orderRepository;

@RestController
@RequestMapping("/")
public class orderController {

	@Autowired
	private orderRepository repo;
	@Autowired
	private lineRepository lrepo;
	@GetMapping("/orders")
	public List<StagingStoreOrder> getOrderbyDate() {
		return repo.findAll();
	}
	@GetMapping("/getlines")
	public List<StagingOrderStoreLine> getlines() {
		return lrepo.findAll();
	}
	
	@GetMapping("/order")
	public List<StagingStoreOrder> 
	getbooksByTime(@RequestParam(name = "orderDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date order_date) {
		System.out.println("book_date ... "+order_date);
		return repo.findByOrderDownloadDate(order_date);
	}
	
	@GetMapping("/orderbyId/{uplorderid}")
	public List<StagingStoreOrder> getOrderbyId(@PathVariable  String uplorderid){
		return repo.findByuplorderid(uplorderid);
	}
	
}
