package be.vdab.customers.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.customers.entities.Customer;
import be.vdab.customers.repositories.CustomerRepository;

@Service
@Transactional(readOnly=true, isolation=Isolation.READ_COMMITTED)
class DefaultCustomerService implements CustomerService {

	private final CustomerRepository customerRepository;
	
	DefaultCustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository; 
	}
	
	@Override
	@Transactional(readOnly=false, isolation=Isolation.READ_COMMITTED) 
	public void save(Customer customer) {
		customerRepository.save(customer); 
	}
	
}