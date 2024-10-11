package com.hiken.ecommerce;

import com.hiken.ecommerce.entities.Order;
import com.hiken.ecommerce.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {

	private OrderService orderService;

	public EcommerceApplication(OrderService orderService) {
		this.orderService = orderService;
	}
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Change these values:
		int code = 1309;
		double basic = 95.90;
		double discount = 0.0;
		// ...
		Order order = new Order(code, basic, discount);
		System.out.printf("Pedido código %d\n", order.getCode());
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));
	}
}
