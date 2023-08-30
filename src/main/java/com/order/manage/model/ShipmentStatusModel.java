package com.order.manage.model;

import java.time.LocalDate;

public class ShipmentStatusModel {

	private int shipmentStatusId;
	
	private int trackingId;
	
	public ShipmentStatusModel() {
		super();
	}

	public ShipmentStatusModel(int shipmentStatusId, int trackingId) {
		super();
		this.shipmentStatusId = shipmentStatusId;
		this.trackingId = trackingId;
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

	@Override
	public String toString() {
		return "ShipmentStatusModel [shipmentStatusId=" + shipmentStatusId + ", trackingId=" + trackingId + "]";
	}
	
	
}
