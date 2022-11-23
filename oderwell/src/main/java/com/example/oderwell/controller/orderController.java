package com.example.oderwell.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
		//StagingStoreOrder sto= new st
		return repo.findAll();
	}
	@GetMapping("/getlines")
	public List<StagingOrderStoreLine> getlines() {
		StagingStoreOrder sto= new StagingStoreOrder();
		List<StagingOrderStoreLine> stl = lrepo.findAll();
//		System.out.println(lrepo.findAll());
//		List<StagingOrderStoreLine> stl = sto.getStagingOrderStoreLine();
//		System.out.println("getter .. "+stl);
		sto.setStagingOrderStoreLine(stl);
//		return repo.findByuplorderid();
		return lrepo.findAll();
	}
}
