package com.order.manage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment_status", schema = "orders_schema")
public class PaymentStatusEntity {

	@Id
	@Column(name = "payment_status_id")
	private int paymentStatusId;

	@Column(name = "payment_type")
	private String paymentType;

	@Column(name = "payment_id")
	private int paymentId;

	public PaymentStatusEntity() {
	}

	public PaymentStatusEntity(int paymentStatusId, String paymentType, int paymentId) {
		super();
		this.paymentStatusId = paymentStatusId;
		this.paymentType = paymentType;
		this.paymentId = paymentId;
	}

	public int getPaymentStatusId() {
		return paymentStatusId;
	}

	public void setPaymentStatusId(int paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

}
