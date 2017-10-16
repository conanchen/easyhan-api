package org.easyhan.myword.grpc;

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
 * My word dictionary service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: my/myword.proto")
public final class MyWordGrpc {

  private MyWordGrpc() {}

  public static final String SERVICE_NAME = "myword.MyWord";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.myword.grpc.ListRequest,
      org.easyhan.myword.grpc.ListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.<org.easyhan.myword.grpc.ListRequest, org.easyhan.myword.grpc.ListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "myword.MyWord", "List"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.myword.grpc.ListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.myword.grpc.ListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.myword.grpc.AddRequest,
      org.easyhan.myword.grpc.AddResponse> METHOD_ADD =
      io.grpc.MethodDescriptor.<org.easyhan.myword.grpc.AddRequest, org.easyhan.myword.grpc.AddResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "myword.MyWord", "Add"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.myword.grpc.AddRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.myword.grpc.AddResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.myword.grpc.DeleteRequest,
      org.easyhan.myword.grpc.DeleteResponse> METHOD_DELETE =
      io.grpc.MethodDescriptor.<org.easyhan.myword.grpc.DeleteRequest, org.easyhan.myword.grpc.DeleteResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "myword.MyWord", "Delete"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.myword.grpc.DeleteRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              org.easyhan.myword.grpc.DeleteResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyWordStub newStub(io.grpc.Channel channel) {
    return new MyWordStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyWordBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MyWordBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyWordFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MyWordFutureStub(channel);
  }

  /**
   * <pre>
   * My word dictionary service definition.
   * </pre>
   */
  public static abstract class MyWordImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains hanzis whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of hanzis.
     * </pre>
     */
    public void list(org.easyhan.myword.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void add(org.easyhan.myword.grpc.AddRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.AddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD, responseObserver);
    }

    /**
     */
    public void delete(org.easyhan.myword.grpc.DeleteRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.easyhan.myword.grpc.ListRequest,
                org.easyhan.myword.grpc.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_ADD,
            asyncUnaryCall(
              new MethodHandlers<
                org.easyhan.myword.grpc.AddRequest,
                org.easyhan.myword.grpc.AddResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                org.easyhan.myword.grpc.DeleteRequest,
                org.easyhan.myword.grpc.DeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * My word dictionary service definition.
   * </pre>
   */
  public static final class MyWordStub extends io.grpc.stub.AbstractStub<MyWordStub> {
    private MyWordStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyWordStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyWordStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyWordStub(channel, callOptions);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains hanzis whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of hanzis.
     * </pre>
     */
    public void list(org.easyhan.myword.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.ListResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void add(org.easyhan.myword.grpc.AddRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.AddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(org.easyhan.myword.grpc.DeleteRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * My word dictionary service definition.
   * </pre>
   */
  public static final class MyWordBlockingStub extends io.grpc.stub.AbstractStub<MyWordBlockingStub> {
    private MyWordBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyWordBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyWordBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyWordBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains hanzis whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of hanzis.
     * </pre>
     */
    public java.util.Iterator<org.easyhan.myword.grpc.ListResponse> list(
        org.easyhan.myword.grpc.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public org.easyhan.myword.grpc.AddResponse add(org.easyhan.myword.grpc.AddRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD, getCallOptions(), request);
    }

    /**
     */
    public org.easyhan.myword.grpc.DeleteResponse delete(org.easyhan.myword.grpc.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * My word dictionary service definition.
   * </pre>
   */
  public static final class MyWordFutureStub extends io.grpc.stub.AbstractStub<MyWordFutureStub> {
    private MyWordFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyWordFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyWordFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyWordFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.easyhan.myword.grpc.AddResponse> add(
        org.easyhan.myword.grpc.AddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.easyhan.myword.grpc.DeleteResponse> delete(
        org.easyhan.myword.grpc.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_ADD = 1;
  private static final int METHODID_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyWordImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyWordImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((org.easyhan.myword.grpc.ListRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.ListResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((org.easyhan.myword.grpc.AddRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.AddResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((org.easyhan.myword.grpc.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.myword.grpc.DeleteResponse>) responseObserver);
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
      synchronized (MyWordGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_ADD)
              .addMethod(METHOD_DELETE)
              .build();
        }
      }
    }
    return result;
  }
}
