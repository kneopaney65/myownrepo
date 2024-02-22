package spring_core;

public class Car {
	 private String color;
	 private String brand;
	 private int price;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", price=" + price + "]";
	}
	 

}
