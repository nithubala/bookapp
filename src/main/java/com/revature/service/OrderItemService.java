package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.OrderItem;
import com.revature.repository.BookRepository;
import com.revature.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private BookRepository bookRepository;

	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}


}

