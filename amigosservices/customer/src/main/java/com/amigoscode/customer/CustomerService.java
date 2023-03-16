package com.amigoscode.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService  {
    private final CustomerRepository customerRepository;
    public void registerCustomer(CustomerRegistrationRequest request)
    {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //todo: check is valid/not

        //save data
        customerRepository.save(customer);
        System.out.println("save has done");
    }
}
