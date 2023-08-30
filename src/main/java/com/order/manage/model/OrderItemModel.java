package com.order.manage.model;

public class OrderItemModel {

	private int bookId;

	private double price;

	private int quantity;

	private double subTotalAmount;

	public OrderItemModel() {
		super();
	}

	public OrderItemModel(int bookId, double price, int quantity, double subTotalAmount) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.quantity = quantity;
		this.subTotalAmount = subTotalAmount;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
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

	@Override
	public String toString() {
		return "OrderItemModel [bookId=" + bookId + ", price=" + price + ", quantity=" + quantity + ", subTotalAmount="
				+ subTotalAmount + "]";
	}

}
