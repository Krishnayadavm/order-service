package com.order.manage.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_item", schema = "orders_schema")
public class OrderItemEntity {

	@Id
	@Column(name = "order_item_id")
	private int orderItemId;

	@Column(name = "product_id")
	private int productId;

	@Column(name = "price")
	private double price;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "sub_total_amount")
	private double subTotalAmount;

	@JsonBackReference("orders-order_item")
	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrdersEntity ordersEntity;

	public OrderItemEntity() {
	}

	public OrderItemEntity(int orderItemId, int productId, double price, int quantity, double subTotalAmount,
			OrdersEntity ordersEntity) {
		super();
		this.orderItemId = orderItemId;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.subTotalAmount = subTotalAmount;
		this.ordersEntity = ordersEntity;
	}

	public int getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotalAmount() {
		return subTotalAmount;
	}

	public void setSubTotalAmount(double subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}

	public OrdersEntity getOrdersEntity() {
		return ordersEntity;
	}

	public void setOrdersEntity(OrdersEntity ordersEntity) {
		this.ordersEntity = ordersEntity;
	}

}
