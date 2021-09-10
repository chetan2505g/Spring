package com.chetan.lifecycle;

public class Somosa {
	private double price;

	public void init() {
		System.out.println("Somosa Initialize the method");
	}

	public void destroy() {
		System.out.println("Somosa Destroy object");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Somosa [price=" + price + "]";
	}

	public Somosa() {
		super();
		// TODO Auto-generated constructor stub
	}

}
