package com.mesbahi.multi_connecteurs.controller;

import com.mesbahi.multi_connecteurs.dto.CustomerRequest;
import com.mesbahi.multi_connecteurs.entity.Customer;
import com.mesbahi.multi_connecteurs.mapper.CustomerMapper;
import com.mesbahi.multi_connecteurs.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerGraphQLController {
  private CustomerRepository customerRepository;
  private CustomerMapper customerMapper;
  @QueryMapping
  public List<Customer> allCustomers(){
    return customerRepository.findAll();
  }
  @QueryMapping
  public Customer customerById(@Argument Long id){
    Customer customer = customerRepository.findById(id).orElse(null);
    if(customer==null) throw new RuntimeException(String.format("Customer %s not found",id));
    return customer;
  }
  @MutationMapping
  public Customer saveCustomer(@Argument CustomerRequest customer){
    Customer c = customerMapper.fromRequestToEntity(customer);
    return customerRepository.save(c);
  }
}
