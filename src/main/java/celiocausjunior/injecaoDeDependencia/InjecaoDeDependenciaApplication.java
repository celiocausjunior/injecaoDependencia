package celiocausjunior.injecaoDeDependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import celiocausjunior.injecaoDeDependencia.models.OrderModel;
import celiocausjunior.injecaoDeDependencia.services.OrderService;

@SpringBootApplication
public class InjecaoDeDependenciaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(InjecaoDeDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		OrderModel order1 = new OrderModel(1034, 150.00, 20.00);
		OrderModel order2 = new OrderModel(2282, 800.00, 10.00);
		OrderModel order3 = new OrderModel(1309, 95.90, 0.00);

		System.out.println("Order number: " + order1.getCode() + " Total: " + orderService.total(order1));
		System.out.println("Order number: " + order2.getCode() + " Total: " + orderService.total(order2));
		System.out.println("Order number: " + order3.getCode() + " Total: " + orderService.total(order3));
	
	}

}
