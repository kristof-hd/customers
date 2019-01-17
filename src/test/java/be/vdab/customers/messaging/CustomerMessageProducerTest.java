package be.vdab.customers.messaging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import be.vdab.customers.entities.Customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMessageProducerTest {

	@Autowired
	RabbitTemplate template;

	@Test
	public void produceMessage() {
	
		Customer customer = new Customer();
		customer.setFirstname("customer3");
		customer.setSurname("customer3");
		template.convertAndSend("newCustomerQueue", customer);
	
	}
	
}
