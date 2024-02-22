package com.classwork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainDog {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Dog.xml");
		Dog dd = (Dog)context.getBean("dog");
		System.out.println(dd);
		
		Food ff = (Food)context.getBean("food1");
		System.out.println(ff);

	}

}
