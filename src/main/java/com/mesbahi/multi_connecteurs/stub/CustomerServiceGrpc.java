package com.mesbahi.multi_connecteurs.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CustomerGRPC.proto")
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest,
      com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse> getGetAllCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCustomers",
      requestType = com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest.class,
      responseType = com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest,
      com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse> getGetAllCustomersMethod() {
    io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest, com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse> getGetAllCustomersMethod;
    if ((getGetAllCustomersMethod = CustomerServiceGrpc.getGetAllCustomersMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetAllCustomersMethod = CustomerServiceGrpc.getGetAllCustomersMethod) == null) {
          CustomerServiceGrpc.getGetAllCustomersMethod = getGetAllCustomersMethod = 
              io.grpc.MethodDescriptor.<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest, com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "getAllCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getAllCustomers"))
                  .build();
          }
        }
     }
     return getGetAllCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest,
      com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse> getGetCustomerByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCustomerById",
      requestType = com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest.class,
      responseType = com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest,
      com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse> getGetCustomerByIdMethod() {
    io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest, com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse> getGetCustomerByIdMethod;
    if ((getGetCustomerByIdMethod = CustomerServiceGrpc.getGetCustomerByIdMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerByIdMethod = CustomerServiceGrpc.getGetCustomerByIdMethod) == null) {
          CustomerServiceGrpc.getGetCustomerByIdMethod = getGetCustomerByIdMethod = 
              io.grpc.MethodDescriptor.<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest, com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "getCustomerById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("getCustomerById"))
                  .build();
          }
        }
     }
     return getGetCustomerByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest,
      com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse> getSaveCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCustomer",
      requestType = com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest.class,
      responseType = com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest,
      com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse> getSaveCustomerMethod() {
    io.grpc.MethodDescriptor<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest, com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse> getSaveCustomerMethod;
    if ((getSaveCustomerMethod = CustomerServiceGrpc.getSaveCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getSaveCustomerMethod = CustomerServiceGrpc.getSaveCustomerMethod) == null) {
          CustomerServiceGrpc.getSaveCustomerMethod = getSaveCustomerMethod = 
              io.grpc.MethodDescriptor.<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest, com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CustomerService", "saveCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CustomerServiceMethodDescriptorSupplier("saveCustomer"))
                  .build();
          }
        }
     }
     return getSaveCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCustomers(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCustomersMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerById(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest request,
        io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveCustomer(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest request,
        io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest,
                com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse>(
                  this, METHODID_GET_ALL_CUSTOMERS)))
          .addMethod(
            getGetCustomerByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest,
                com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse>(
                  this, METHODID_GET_CUSTOMER_BY_ID)))
          .addMethod(
            getSaveCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest,
                com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse>(
                  this, METHODID_SAVE_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCustomers(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest request,
        io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerById(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest request,
        io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveCustomer(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest request,
        io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse getAllCustomers(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse getCustomerById(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse saveCustomer(com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse> getAllCustomers(
        com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse> getCustomerById(
        com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse> saveCustomer(
        com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CUSTOMERS = 0;
  private static final int METHODID_GET_CUSTOMER_BY_ID = 1;
  private static final int METHODID_SAVE_CUSTOMER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CUSTOMERS:
          serviceImpl.getAllCustomers((com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetAllCustomersRequest) request,
              (io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomersResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_BY_ID:
          serviceImpl.getCustomerById((com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.GetCustomerByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_CUSTOMER:
          serviceImpl.saveCustomer((com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerRequest) request,
              (io.grpc.stub.StreamObserver<com.mesbahi.multi_connecteurs.stub.CustomerGRPC.SaveCustomerResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mesbahi.multi_connecteurs.stub.CustomerGRPC.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerService");
    }
  }

  private static final class CustomerServiceFileDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier {
    CustomerServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerServiceMethodDescriptorSupplier
      extends CustomerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerServiceFileDescriptorSupplier())
              .addMethod(getGetAllCustomersMethod())
              .addMethod(getGetCustomerByIdMethod())
              .addMethod(getSaveCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
