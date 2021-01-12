/**
 * 
 */
package guru.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.Customer;

/**
 * @author kadam.sachin
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see guru.springframework.msscbrewery.services.CustomerService#getCustomerById(java.util.UUID)
	 */
	@Override
	public Customer getCustomerById(UUID customerId) {
		return Customer.builder().id(UUID.randomUUID()).name("username").build();
	}

	@Override
	public Customer create(Customer customer) {
		return Customer.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateCustomer(UUID customerId, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(UUID customerId) {
		// TODO Auto-generated method stub
		
	}

}
