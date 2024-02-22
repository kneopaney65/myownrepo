package spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCar {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Car.xml");
		Car audi = (Car) context.getBean("car");
		System.out.println(audi);
		
		
		
		

	}

}
