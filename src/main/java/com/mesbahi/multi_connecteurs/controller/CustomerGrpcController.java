package com.mesbahi.multi_connecteurs.controller;

import com.mesbahi.multi_connecteurs.entity.Customer;
import com.mesbahi.multi_connecteurs.mapper.CustomerMapper;
import com.mesbahi.multi_connecteurs.repository.CustomerRepository;
import com.mesbahi.multi_connecteurs.stub.CustomerGRPC;
import com.mesbahi.multi_connecteurs.stub.CustomerServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class CustomerGrpcController extends CustomerServiceGrpc.CustomerServiceImplBase {
  @Autowired
  private CustomerRepository customerRepository;
  @Autowired
  private CustomerMapper customerMapper;
  @Override
  public void getAllCustomers(CustomerGRPC.GetAllCustomersRequest request, StreamObserver<CustomerGRPC.GetCustomersResponse> responseObserver) {
    List<Customer> customers = customerRepository.findAll();
    List<CustomerGRPC.Customer> customerList =
            customers.stream().map(customerMapper::fromCustomer).collect(Collectors.toList());
    CustomerGRPC.GetCustomersResponse response = CustomerGRPC.GetCustomersResponse.newBuilder().addAllCustomers(customerList).build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
    super.getAllCustomers(request, responseObserver);
  }

  @Override
  public void getCustomerById(CustomerGRPC.GetCustomerByIdRequest request, StreamObserver<CustomerGRPC.GetCustomerByIdResponse> responseObserver) {
    Customer customer = customerRepository.findById(request.getCustomerId()).get();
    CustomerGRPC.Customer customerResponse = customerMapper.fromCustomer(customer);
    CustomerGRPC.GetCustomerByIdResponse response = CustomerGRPC.GetCustomerByIdResponse.newBuilder().setCustomer(customerResponse).build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
    super.getCustomerById(request, responseObserver);
  }

  @Override
  public void saveCustomer(CustomerGRPC.SaveCustomerRequest request, StreamObserver<CustomerGRPC.SaveCustomerResponse> responseObserver) {
      Customer customer = customerMapper.fromGrpcCustomerRequest(request.getCustomer());
      Customer saveCustomer= customerRepository.save(customer);
      CustomerGRPC.SaveCustomerResponse response =
                      CustomerGRPC.SaveCustomerResponse
                        .newBuilder().setCustomer(customerMapper.fromCustomer(saveCustomer)).build();
      responseObserver.onNext(response);
      responseObserver.onCompleted();
    super.saveCustomer(request, responseObserver);

  }
}
