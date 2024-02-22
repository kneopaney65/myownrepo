package com.classwork;

public class Dog {
	 private String color;
	 private String breed;
	 private int year;
	 private Food food;
	 
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", year=" + year + ", food=" + food + "]";
	}

	 
	

}
