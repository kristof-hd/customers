package be.vdab.customers.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import be.vdab.customers.entities.Customer;
import be.vdab.customers.services.CustomerService;

@Component
public class CustomerMessageConsumer {

	private final CustomerService customerService; 
	
	CustomerMessageConsumer(CustomerService customerService) {
		this.customerService=customerService; 
	}
	
	@RabbitListener(queues="newCustomerQueue")
	void processMessage(Customer customer) {
		customerService.save(customer);
	}
	
}