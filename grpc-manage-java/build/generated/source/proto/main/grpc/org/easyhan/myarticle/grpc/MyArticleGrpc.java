package org.easyhan.myarticle.grpc;

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
 * The myarticle service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: my/myarticle.proto")
public final class MyArticleGrpc {

  private MyArticleGrpc() {}

  public static final String SERVICE_NAME = "myarticle.MyArticle";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.myarticle.grpc.ListRequest,
      org.easyhan.myarticle.grpc.ListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.<org.easyhan.myarticle.grpc.ListRequest, org.easyhan.myarticle.grpc.ListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "myarticle.MyArticle", "List"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.myarticle.grpc.ListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.myarticle.grpc.ListResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyArticleStub newStub(io.grpc.Channel channel) {
    return new MyArticleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MyArticleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MyArticleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyArticleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MyArticleFutureStub(channel);
  }

  /**
   * <pre>
   * The myarticle service definition.
   * </pre>
   */
  public static abstract class MyArticleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains hanzis whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of hanzis.
     * </pre>
     */
    public void list(org.easyhan.myarticle.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.myarticle.grpc.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.easyhan.myarticle.grpc.ListRequest,
                org.easyhan.myarticle.grpc.ListResponse>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   * The myarticle service definition.
   * </pre>
   */
  public static final class MyArticleStub extends io.grpc.stub.AbstractStub<MyArticleStub> {
    private MyArticleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyArticleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyArticleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyArticleStub(channel, callOptions);
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
    public void list(org.easyhan.myarticle.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.myarticle.grpc.ListResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The myarticle service definition.
   * </pre>
   */
  public static final class MyArticleBlockingStub extends io.grpc.stub.AbstractStub<MyArticleBlockingStub> {
    private MyArticleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyArticleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyArticleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyArticleBlockingStub(channel, callOptions);
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
    public java.util.Iterator<org.easyhan.myarticle.grpc.ListResponse> list(
        org.easyhan.myarticle.grpc.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The myarticle service definition.
   * </pre>
   */
  public static final class MyArticleFutureStub extends io.grpc.stub.AbstractStub<MyArticleFutureStub> {
    private MyArticleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MyArticleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MyArticleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MyArticleFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MyArticleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MyArticleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((org.easyhan.myarticle.grpc.ListRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.myarticle.grpc.ListResponse>) responseObserver);
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

  private static final class MyArticleDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.easyhan.myarticle.grpc.MyArticleProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyArticleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyArticleDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .build();
        }
      }
    }
    return result;
  }
}
