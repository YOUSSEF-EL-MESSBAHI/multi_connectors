package com.mesbahi.multi_connecteurs.mapper;

import com.mesbahi.multi_connecteurs.dto.CustomerRequest;
import com.mesbahi.multi_connecteurs.entity.Customer;
import com.mesbahi.multi_connecteurs.stub.CustomerGRPC;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomerMapper {
  private ModelMapper modelMapper = new ModelMapper();
  //we can use modelmapper to map request to entity but it neeed that CustomerRequest is a class with getter and setter and not a record
  public Customer fromRequestToEntity(CustomerRequest request) {
    return new Customer(null, request.name(), request.email());
//    return modelMapper.map(request, Customer.class);
  }

  public CustomerGRPC.Customer fromCustomer(Customer customer){
    return modelMapper.map(customer, CustomerGRPC.Customer.Builder.class).build();
  }
  public Customer fromGrpcCustomerRequest(CustomerGRPC.CustomerRequest customer){
    return modelMapper.map(customer, Customer.class);
  }
}
