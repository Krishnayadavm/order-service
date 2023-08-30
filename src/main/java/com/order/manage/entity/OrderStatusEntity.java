package com.order.manage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_status", schema = "orders_schema")
public class OrderStatusEntity {

	@Id
	@Column(name = "order_status_id")
	private int orderStatusId;
	@Column(name = "status_name")
	private String statusName;

	public OrderStatusEntity() {
	}

	public OrderStatusEntity(int orderStatusId, String statusName) {
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

}
