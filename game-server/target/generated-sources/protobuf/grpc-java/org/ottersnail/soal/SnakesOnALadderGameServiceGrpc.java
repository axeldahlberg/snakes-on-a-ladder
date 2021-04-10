package org.ottersnail.soal;

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
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: game-service.proto")
public final class SnakesOnALadderGameServiceGrpc {

  private SnakesOnALadderGameServiceGrpc() {}

  public static final String SERVICE_NAME = "SnakesOnALadderGameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.ottersnail.soal.DiceRollRequest,
      org.ottersnail.soal.DiceRollResponse> getRollDiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rollDice",
      requestType = org.ottersnail.soal.DiceRollRequest.class,
      responseType = org.ottersnail.soal.DiceRollResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.ottersnail.soal.DiceRollRequest,
      org.ottersnail.soal.DiceRollResponse> getRollDiceMethod() {
    io.grpc.MethodDescriptor<org.ottersnail.soal.DiceRollRequest, org.ottersnail.soal.DiceRollResponse> getRollDiceMethod;
    if ((getRollDiceMethod = SnakesOnALadderGameServiceGrpc.getRollDiceMethod) == null) {
      synchronized (SnakesOnALadderGameServiceGrpc.class) {
        if ((getRollDiceMethod = SnakesOnALadderGameServiceGrpc.getRollDiceMethod) == null) {
          SnakesOnALadderGameServiceGrpc.getRollDiceMethod = getRollDiceMethod = 
              io.grpc.MethodDescriptor.<org.ottersnail.soal.DiceRollRequest, org.ottersnail.soal.DiceRollResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SnakesOnALadderGameService", "rollDice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ottersnail.soal.DiceRollRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.ottersnail.soal.DiceRollResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SnakesOnALadderGameServiceMethodDescriptorSupplier("rollDice"))
                  .build();
          }
        }
     }
     return getRollDiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SnakesOnALadderGameServiceStub newStub(io.grpc.Channel channel) {
    return new SnakesOnALadderGameServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SnakesOnALadderGameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SnakesOnALadderGameServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SnakesOnALadderGameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SnakesOnALadderGameServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SnakesOnALadderGameServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.ottersnail.soal.DiceRollRequest> rollDice(
        io.grpc.stub.StreamObserver<org.ottersnail.soal.DiceRollResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRollDiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRollDiceMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                org.ottersnail.soal.DiceRollRequest,
                org.ottersnail.soal.DiceRollResponse>(
                  this, METHODID_ROLL_DICE)))
          .build();
    }
  }

  /**
   */
  public static final class SnakesOnALadderGameServiceStub extends io.grpc.stub.AbstractStub<SnakesOnALadderGameServiceStub> {
    private SnakesOnALadderGameServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnakesOnALadderGameServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnakesOnALadderGameServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnakesOnALadderGameServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.ottersnail.soal.DiceRollRequest> rollDice(
        io.grpc.stub.StreamObserver<org.ottersnail.soal.DiceRollResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRollDiceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SnakesOnALadderGameServiceBlockingStub extends io.grpc.stub.AbstractStub<SnakesOnALadderGameServiceBlockingStub> {
    private SnakesOnALadderGameServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnakesOnALadderGameServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnakesOnALadderGameServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnakesOnALadderGameServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SnakesOnALadderGameServiceFutureStub extends io.grpc.stub.AbstractStub<SnakesOnALadderGameServiceFutureStub> {
    private SnakesOnALadderGameServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SnakesOnALadderGameServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SnakesOnALadderGameServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SnakesOnALadderGameServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ROLL_DICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SnakesOnALadderGameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SnakesOnALadderGameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROLL_DICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.rollDice(
              (io.grpc.stub.StreamObserver<org.ottersnail.soal.DiceRollResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SnakesOnALadderGameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SnakesOnALadderGameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.ottersnail.soal.GameService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SnakesOnALadderGameService");
    }
  }

  private static final class SnakesOnALadderGameServiceFileDescriptorSupplier
      extends SnakesOnALadderGameServiceBaseDescriptorSupplier {
    SnakesOnALadderGameServiceFileDescriptorSupplier() {}
  }

  private static final class SnakesOnALadderGameServiceMethodDescriptorSupplier
      extends SnakesOnALadderGameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SnakesOnALadderGameServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SnakesOnALadderGameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SnakesOnALadderGameServiceFileDescriptorSupplier())
              .addMethod(getRollDiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
