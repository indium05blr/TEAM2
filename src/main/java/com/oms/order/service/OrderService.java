package com.oms.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.oms.order.entity.Order;
import com.oms.order.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public void createOrder(Order order) {
		orderRepository.save(order);
	}
	
	@GetMapping("/{orderId}")
	public Order getOrderByOrderId(@PathVariable("orderId")String orderId) {
		return orderRepository.findById(orderId).orElseGet(null);
	}
	
	@GetMapping
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}
	
	@GetMapping("/{status}")
	public List<Order>	getOrderByStatus(@PathVariable("status") String status) {
		return orderRepository.findByStatus(status);
	}
	
	@PostMapping("/update")
	public void modifyOrder(Order order) {
		orderRepository.save(order);
	}
}
