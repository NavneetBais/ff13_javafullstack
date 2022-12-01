package com.labs.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFeaturesApplication implements CommandLineRunner {
	@Autowired
	ApplicationContext ctx ;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeaturesApplication.class, args);
		System.out.println("Springgggg");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(ctx.getBeanDefinitionCount());
//		for(String beanName : ctx.getBeanDefinitionNames()) {
//			System.out.println(beanName);
//		}
		Order order = ctx.getBean("order" , Order.class);
		System.out.println(order);
	}

}
