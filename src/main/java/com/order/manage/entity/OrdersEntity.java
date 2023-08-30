package com.order.manage.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.order.manage.model.OrderItemModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders", schema = "orders_schema")
public class OrdersEntity {

	@Id
	@Column(name = "order_id")
	private int orderId;

	private String description;

	@Column(name = "order_date")
	private LocalDate orderDate;

	@Column(name = "order_total_amount")
	private double orderTotalAmount;

	@Column(name = "total_items")
	private int totalItems;

	@Column(name = "customer_id")
	private int customerId;

	@JsonManagedReference("orders-order_item")
	@OneToMany(mappedBy = "ordersEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<OrderItemEntity> orderItemList;

	@OneToOne
	@JoinColumn(name = "order_status_id")
	private OrderStatusEntity orderStatusEntity;

	@OneToOne
	@JoinColumn(name = "payment_status_id")
	private PaymentStatusEntity paymentStatusEntity;

	@OneToOne
	@JoinColumn(name = "shipment_status_id")
	private ShipmentStatusEntity shipmentStatusEntity;

	public OrdersEntity() {
	}

	public OrdersEntity(int orderId, String description, LocalDate orderDate, double orderTotalAmount, int totalItems,
			int customerId, List<OrderItemEntity> orderItemList, OrderStatusEntity orderStatusEntity,
			PaymentStatusEntity paymentStatusEntity, ShipmentStatusEntity shipmentStatusEntity) {
		super();
		this.orderId = orderId;
		this.description = description;
		this.orderDate = orderDate;
		this.orderTotalAmount = orderTotalAmount;
		this.totalItems = totalItems;
		this.customerId = customerId;
		this.orderItemList = orderItemList;
		this.orderStatusEntity = orderStatusEntity;
		this.paymentStatusEntity = paymentStatusEntity;
		this.shipmentStatusEntity = shipmentStatusEntity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderTotalAmount() {
		return orderTotalAmount;
	}

	public void setOrderTotalAmount(double orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<OrderItemEntity> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItemEntity> orderItemList) {
		this.orderItemList = orderItemList;
	}

	public OrderStatusEntity getOrderStatusEntity() {
		return orderStatusEntity;
	}

	public void setOrderStatusEntity(OrderStatusEntity orderStatusEntity) {
		this.orderStatusEntity = orderStatusEntity;
	}

	public PaymentStatusEntity getPaymentStatusEntity() {
		return paymentStatusEntity;
	}

	public void setPaymentStatusEntity(PaymentStatusEntity paymentStatusEntity) {
		this.paymentStatusEntity = paymentStatusEntity;
	}

	public ShipmentStatusEntity getShipmentStatusEntity() {
		return shipmentStatusEntity;
	}

	public void setShipmentStatusEntity(ShipmentStatusEntity shipmentStatusEntity) {
		this.shipmentStatusEntity = shipmentStatusEntity;
	}


}
