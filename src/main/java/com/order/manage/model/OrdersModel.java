package com.order.manage.model;

import java.time.LocalDate;
import java.util.List;

import com.order.manage.entity.OrderItemEntity;
import com.order.manage.entity.OrderStatusEntity;
import com.order.manage.entity.PaymentStatusEntity;
import com.order.manage.entity.ShipmentStatusEntity;

import jakarta.validation.constraints.NotBlank;

public class OrdersModel {
	private int orderId;

	private String description;

	@NotBlank(message="orderdate not in null ")
	private LocalDate orderDate;
	
	@NotBlank(message="order total amount not in null ")
	private double orderTotalAmount;

	private int totalItems;

	private List<OrderItemModel> orderItemModelList;

	private OrderStatusModel orderStatusModel;

	private PaymentStatusModel paymentStatusModel;

	private ShipmentStatusModel shipmentStatusModel;

	public OrdersModel() {
		super();
	}

	public OrdersModel(int orderId, String description, LocalDate orderDate, double orderTotalAmount, int totalItems,
			List<OrderItemModel> orderItemModelList, OrderStatusModel orderStatusModel,
			PaymentStatusModel paymentStatusModel, ShipmentStatusModel shipmentStatusModel) {
		super();
		this.orderId = orderId;
		this.description = description;
		this.orderDate = orderDate;
		this.orderTotalAmount = orderTotalAmount;
		this.totalItems = totalItems;
		this.orderItemModelList = orderItemModelList;
		this.orderStatusModel = orderStatusModel;
		this.paymentStatusModel = paymentStatusModel;
		this.shipmentStatusModel = shipmentStatusModel;
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

	public List<OrderItemModel> getOrderItemModelList() {
		return orderItemModelList;
	}

	public void setOrderItemModelList(List<OrderItemModel> orderItemModelList) {
		this.orderItemModelList = orderItemModelList;
	}

	public OrderStatusModel getOrderStatusModel() {
		return orderStatusModel;
	}

	public void setOrderStatusModel(OrderStatusModel orderStatusModel) {
		this.orderStatusModel = orderStatusModel;
	}

	public PaymentStatusModel getPaymentStatusModel() {
		return paymentStatusModel;
	}

	public void setPaymentStatusModel(PaymentStatusModel paymentStatusModel) {
		this.paymentStatusModel = paymentStatusModel;
	}

	public ShipmentStatusModel getShipmentStatusModel() {
		return shipmentStatusModel;
	}

	public void setShipmentStatusModel(ShipmentStatusModel shipmentStatusModel) {
		this.shipmentStatusModel = shipmentStatusModel;
	}

	@Override
	public String toString() {
		return "OrdersModel [orderId=" + orderId + ", description=" + description + ", orderDate=" + orderDate
				+ ", orderTotalAmount=" + orderTotalAmount + ", totalItems=" + totalItems + ", orderItemModelList="
				+ orderItemModelList + ", orderStatusModel=" + orderStatusModel + ", paymentStatusModel="
				+ paymentStatusModel + ", shipmentStatusModel=" + shipmentStatusModel + "]";
	}


}