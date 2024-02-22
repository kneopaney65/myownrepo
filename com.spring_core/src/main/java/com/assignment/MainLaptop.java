package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLaptop {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Laptop.xml");
		Laptop ll = (Laptop)context.getBean("laptop");
		System.out.println(ll);

	}

}
