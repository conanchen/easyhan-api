package org.easyhan.manage.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The hanzi service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: manage/hanziman.proto")
public final class HanziManGrpc {

  private HanziManGrpc() {}

  public static final String SERVICE_NAME = "manage.HanziMan";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.manage.grpc.DeleteRequest,
      org.easyhan.common.grpc.StatusResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.<org.easyhan.manage.grpc.DeleteRequest, org.easyhan.common.grpc.StatusResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "manage.HanziMan", "Delete"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.manage.grpc.DeleteRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.common.grpc.StatusResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.manage.grpc.UpsertRequest,
      org.easyhan.common.grpc.StatusResponse> METHOD_UPSERT =
      io.grpc.MethodDescriptor.<org.easyhan.manage.grpc.UpsertRequest, org.easyhan.common.grpc.StatusResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "manage.HanziMan", "Upsert"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.manage.grpc.UpsertRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.common.grpc.StatusResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HanziManStub newStub(io.grpc.Channel channel) {
    return new HanziManStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HanziManBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HanziManBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HanziManFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HanziManFutureStub(channel);
  }

  /**
   * <pre>
   * The hanzi service definition.
   * </pre>
   */
  public static abstract class HanziManImplBase implements io.grpc.BindableService {

    /**
     */
    public void delete(org.easyhan.manage.grpc.DeleteRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.common.grpc.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    /**
     */
    public void upsert(org.easyhan.manage.grpc.UpsertRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.common.grpc.StatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPSERT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                org.easyhan.manage.grpc.DeleteRequest,
                org.easyhan.common.grpc.StatusResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            METHOD_UPSERT,
            asyncUnaryCall(
              new MethodHandlers<
                org.easyhan.manage.grpc.UpsertRequest,
                org.easyhan.common.grpc.StatusResponse>(
                  this, METHODID_UPSERT)))
          .build();
    }
  }

  /**
   * <pre>
   * The hanzi service definition.
   * </pre>
   */
  public static final class HanziManStub extends io.grpc.stub.AbstractStub<HanziManStub> {
    private HanziManStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HanziManStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HanziManStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HanziManStub(channel, callOptions);
    }

    /**
     */
    public void delete(org.easyhan.manage.grpc.DeleteRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.common.grpc.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsert(org.easyhan.manage.grpc.UpsertRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.common.grpc.StatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPSERT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The hanzi service definition.
   * </pre>
   */
  public static final class HanziManBlockingStub extends io.grpc.stub.AbstractStub<HanziManBlockingStub> {
    private HanziManBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HanziManBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HanziManBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HanziManBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.easyhan.common.grpc.StatusResponse delete(org.easyhan.manage.grpc.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }

    /**
     */
    public org.easyhan.common.grpc.StatusResponse upsert(org.easyhan.manage.grpc.UpsertRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPSERT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The hanzi service definition.
   * </pre>
   */
  public static final class HanziManFutureStub extends io.grpc.stub.AbstractStub<HanziManFutureStub> {
    private HanziManFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HanziManFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HanziManFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HanziManFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.easyhan.common.grpc.StatusResponse> delete(
        org.easyhan.manage.grpc.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.easyhan.common.grpc.StatusResponse> upsert(
        org.easyhan.manage.grpc.UpsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPSERT, getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE = 0;
  private static final int METHODID_UPSERT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HanziManImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HanziManImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE:
          serviceImpl.delete((org.easyhan.manage.grpc.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.common.grpc.StatusResponse>) responseObserver);
          break;
        case METHODID_UPSERT:
          serviceImpl.upsert((org.easyhan.manage.grpc.UpsertRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.common.grpc.StatusResponse>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HanziManGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_DELETE)
              .addMethod(METHOD_UPSERT)
              .build();
        }
      }
    }
    return result;
  }
}
