package be.vdab.customers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.customers.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}