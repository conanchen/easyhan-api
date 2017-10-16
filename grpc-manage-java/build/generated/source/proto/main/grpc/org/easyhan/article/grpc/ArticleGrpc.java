package org.easyhan.article.grpc;

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
 * The article service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: article/article.proto")
public final class ArticleGrpc {

  private ArticleGrpc() {}

  public static final String SERVICE_NAME = "article.Article";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.article.grpc.ListRequest,
      org.easyhan.article.grpc.ListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.<org.easyhan.article.grpc.ListRequest, org.easyhan.article.grpc.ListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "article.Article", "List"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.article.grpc.ListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.article.grpc.ListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.article.grpc.GetRequest,
      org.easyhan.article.grpc.GetResponse> METHOD_GET =
      io.grpc.MethodDescriptor.<org.easyhan.article.grpc.GetRequest, org.easyhan.article.grpc.GetResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "article.Article", "Get"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.article.grpc.GetRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.article.grpc.GetResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.article.grpc.VisitRequest,
      org.easyhan.article.grpc.VisitResponse> METHOD_VISIT =
      io.grpc.MethodDescriptor.<org.easyhan.article.grpc.VisitRequest, org.easyhan.article.grpc.VisitResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "article.Article", "Visit"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.article.grpc.VisitRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.article.grpc.VisitResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ArticleStub newStub(io.grpc.Channel channel) {
    return new ArticleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ArticleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ArticleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ArticleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ArticleFutureStub(channel);
  }

  /**
   * <pre>
   * The article service definition.
   * </pre>
   */
  public static abstract class ArticleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains hanzis whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of hanzis.
     * </pre>
     */
    public void list(org.easyhan.article.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.article.grpc.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void get(org.easyhan.article.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.article.grpc.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET, responseObserver);
    }

    /**
     */
    public void visit(org.easyhan.article.grpc.VisitRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.article.grpc.VisitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VISIT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.easyhan.article.grpc.ListRequest,
                org.easyhan.article.grpc.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_GET,
            asyncUnaryCall(
              new MethodHandlers<
                org.easyhan.article.grpc.GetRequest,
                org.easyhan.article.grpc.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            METHOD_VISIT,
            asyncUnaryCall(
              new MethodHandlers<
                org.easyhan.article.grpc.VisitRequest,
                org.easyhan.article.grpc.VisitResponse>(
                  this, METHODID_VISIT)))
          .build();
    }
  }

  /**
   * <pre>
   * The article service definition.
   * </pre>
   */
  public static final class ArticleStub extends io.grpc.stub.AbstractStub<ArticleStub> {
    private ArticleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleStub(channel, callOptions);
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
    public void list(org.easyhan.article.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.article.grpc.ListResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(org.easyhan.article.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.article.grpc.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void visit(org.easyhan.article.grpc.VisitRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.article.grpc.VisitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VISIT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The article service definition.
   * </pre>
   */
  public static final class ArticleBlockingStub extends io.grpc.stub.AbstractStub<ArticleBlockingStub> {
    private ArticleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleBlockingStub(channel, callOptions);
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
    public java.util.Iterator<org.easyhan.article.grpc.ListResponse> list(
        org.easyhan.article.grpc.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public org.easyhan.article.grpc.GetResponse get(org.easyhan.article.grpc.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET, getCallOptions(), request);
    }

    /**
     */
    public org.easyhan.article.grpc.VisitResponse visit(org.easyhan.article.grpc.VisitRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VISIT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The article service definition.
   * </pre>
   */
  public static final class ArticleFutureStub extends io.grpc.stub.AbstractStub<ArticleFutureStub> {
    private ArticleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ArticleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ArticleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ArticleFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.easyhan.article.grpc.GetResponse> get(
        org.easyhan.article.grpc.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.easyhan.article.grpc.VisitResponse> visit(
        org.easyhan.article.grpc.VisitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VISIT, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_GET = 1;
  private static final int METHODID_VISIT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ArticleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ArticleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((org.easyhan.article.grpc.ListRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.article.grpc.ListResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((org.easyhan.article.grpc.GetRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.article.grpc.GetResponse>) responseObserver);
          break;
        case METHODID_VISIT:
          serviceImpl.visit((org.easyhan.article.grpc.VisitRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.article.grpc.VisitResponse>) responseObserver);
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

  private static final class ArticleDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.easyhan.article.grpc.ArticleProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ArticleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ArticleDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_GET)
              .addMethod(METHOD_VISIT)
              .build();
        }
      }
    }
    return result;
  }
}
