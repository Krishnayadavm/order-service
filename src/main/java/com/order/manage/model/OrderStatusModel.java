package com.order.manage.model;

public class OrderStatusModel {
	
	private int orderStatusId;

	private String statusName;

	public OrderStatusModel() {
		super();
	}

	public OrderStatusModel(int orderStatusId, String statusName) {
		super();
		this.orderStatusId = orderStatusId;
		this.statusName = statusName;
	}

	public int getOrderStatusId() {
		return orderStatusId;
	}

	public void setOrderStatusId(int orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	@Override
	public String toString() {
		return "OrderStatusModel [orderStatusId=" + orderStatusId + ", statusName=" + statusName + "]";
	}

}
