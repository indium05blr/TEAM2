package com.oms.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oms.order.entity.Order;
import com.oms.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;

	@PostMapping
	public void createOrder(@RequestBody Order order) {
		orderService.createOrder(order);
	}
	
	@GetMapping("/{orderId}")
	public Order getOrderByOrderId(@PathVariable("orderId")int orderId) {
		return orderService.getOrderByOrderId(orderId);
	}
	
	@GetMapping
	public List<Order> getAllOrders() {
		
		return orderService.getAllOrders();
	}
	
	@GetMapping("/{status}")
	public List<Order>	getOrderByStatus(@PathVariable("status") String status) {
		
		return orderService.getOrderByStatus(status);
	}
	
	@PostMapping("/update")
	public void modifyOrder(Order order) {
		orderService.modifyOrder(order);
	}
}
