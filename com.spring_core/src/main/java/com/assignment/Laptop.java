package com.assignment;

public class Laptop {
	
	private int price;
	private String brand;
	private String made;
	private String color;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", brand=" + brand + ", made=" + made + ", color=" + color + "]";
	}
	

}
