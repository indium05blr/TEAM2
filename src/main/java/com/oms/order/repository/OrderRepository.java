package com.oms.order.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oms.order.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	  
	public List<Order> findByStatus(String status);
}
