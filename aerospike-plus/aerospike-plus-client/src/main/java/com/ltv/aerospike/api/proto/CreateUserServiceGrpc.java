package com.ltv.aerospike.api.proto;

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
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: CreateUserServices.proto")
public final class CreateUserServiceGrpc {

  private CreateUserServiceGrpc() {}

  public static final String SERVICE_NAME = "com.ltv.aerospike.api.proto.CreateUserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest,
      com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest.class,
      responseType = com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest,
      com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest, com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = CreateUserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (CreateUserServiceGrpc.class) {
        if ((getCreateUserMethod = CreateUserServiceGrpc.getCreateUserMethod) == null) {
          CreateUserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest, com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CreateUserServiceMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateUserServiceStub newStub(io.grpc.Channel channel) {
    return new CreateUserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateUserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreateUserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreateUserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreateUserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreateUserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest,
                com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse>(
                  this, METHODID_CREATE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class CreateUserServiceStub extends io.grpc.stub.AbstractStub<CreateUserServiceStub> {
    private CreateUserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateUserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateUserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateUserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreateUserServiceBlockingStub extends io.grpc.stub.AbstractStub<CreateUserServiceBlockingStub> {
    private CreateUserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateUserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateUserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateUserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse createUser(com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreateUserServiceFutureStub extends io.grpc.stub.AbstractStub<CreateUserServiceFutureStub> {
    private CreateUserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateUserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateUserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateUserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse> createUser(
        com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreateUserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreateUserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.ltv.aerospike.api.proto.CreateUserServices.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.ltv.aerospike.api.proto.CreateUserServices.CreateUserResponse>) responseObserver);
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

  private static abstract class CreateUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CreateUserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ltv.aerospike.api.proto.CreateUserServices.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CreateUserService");
    }
  }

  private static final class CreateUserServiceFileDescriptorSupplier
      extends CreateUserServiceBaseDescriptorSupplier {
    CreateUserServiceFileDescriptorSupplier() {}
  }

  private static final class CreateUserServiceMethodDescriptorSupplier
      extends CreateUserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CreateUserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CreateUserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreateUserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
