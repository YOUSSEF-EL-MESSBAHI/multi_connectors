package com.mesbahi.multi_connecteurs.controller;

import com.mesbahi.multi_connecteurs.dto.CustomerRequest;
import com.mesbahi.multi_connecteurs.entity.Customer;
import com.mesbahi.multi_connecteurs.mapper.CustomerMapper;
import com.mesbahi.multi_connecteurs.repository.CustomerRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@WebService
public class CustomerSoapController {
  private CustomerRepository customerRepository;
  private CustomerMapper customerMapper;

  @WebMethod
  public List<Customer> customerList(){
    return customerRepository.findAll();
  }
  @WebMethod
  public Customer customerById(@WebParam(name="id") Long id){
    return customerRepository.findById(id).get();
  }
  @WebMethod
  public Customer saveCustomer(@WebParam(name = "customer") CustomerRequest customerRequest){
    Customer customer = customerMapper.fromRequestToEntity(customerRequest);
    return customerRepository.save(customer);
  }
}
