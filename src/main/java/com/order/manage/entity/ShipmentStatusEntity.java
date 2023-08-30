package com.order.manage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipment_status", schema = "orders_schema")
public class ShipmentStatusEntity {

	@Id
	@Column(name = "shipment_status_id")
	private int shipmentStatusId;

	@Column(name = "tracking_id")
	private int trackingId;

	@Column(name = "shipping_address")
	private String shippingAddress;

	public ShipmentStatusEntity() {
	}

	public ShipmentStatusEntity(int shipmentStatusId, int trackingId, String shippingAddress) {
		super();
		this.shipmentStatusId = shipmentStatusId;
		this.trackingId = trackingId;
		this.shippingAddress = shippingAddress;
	}

	public int getShipmentStatusId() {
		return shipmentStatusId;
	}

	public void setShipmentStatusId(int shipmentStatusId) {
		this.shipmentStatusId = shipmentStatusId;
	}

	public int getTrackingId() {
		return trackingId;
	}

	public void setTrackingId(int trackingId) {
		this.trackingId = trackingId;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
