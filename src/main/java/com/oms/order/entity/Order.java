package com.oms.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String orderId;
	
	private String userId;
	
	private String stockId;
	
	private int noOfStocks;
	
	private String status;
	
	private double amount;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public int getNoOfStocks() {
		return noOfStocks;
	}

	public void setNoOfStocks(int noOfStocks) {
		this.noOfStocks = noOfStocks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
}
