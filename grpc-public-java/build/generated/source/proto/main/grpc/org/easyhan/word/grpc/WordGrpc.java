package org.easyhan.word.grpc;

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
 * The word service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: word/word.proto")
public final class WordGrpc {

  private WordGrpc() {}

  public static final String SERVICE_NAME = "word.Word";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.word.grpc.ListRequest,
      org.easyhan.word.grpc.ListResponse> METHOD_LIST =
      io.grpc.MethodDescriptor.<org.easyhan.word.grpc.ListRequest, org.easyhan.word.grpc.ListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "word.Word", "List"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.word.grpc.ListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.word.grpc.ListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.easyhan.word.grpc.VisitRequest,
      org.easyhan.word.grpc.VisitResponse> METHOD_VISIT =
      io.grpc.MethodDescriptor.<org.easyhan.word.grpc.VisitRequest, org.easyhan.word.grpc.VisitResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "word.Word", "Visit"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.word.grpc.VisitRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.easyhan.word.grpc.VisitResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WordStub newStub(io.grpc.Channel channel) {
    return new WordStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WordBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WordBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WordFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WordFutureStub(channel);
  }

  /**
   * <pre>
   * The word service definition.
   * </pre>
   */
  public static abstract class WordImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains hanzis whose types are the given normal/poster/sexy/porn.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the lastUpsertd maybe an very old time and contain a
     * huge number of hanzis.
     * </pre>
     */
    public void list(org.easyhan.word.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.word.grpc.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void visit(org.easyhan.word.grpc.VisitRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.word.grpc.VisitResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VISIT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncServerStreamingCall(
              new MethodHandlers<
                org.easyhan.word.grpc.ListRequest,
                org.easyhan.word.grpc.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_VISIT,
            asyncUnaryCall(
              new MethodHandlers<
                org.easyhan.word.grpc.VisitRequest,
                org.easyhan.word.grpc.VisitResponse>(
                  this, METHODID_VISIT)))
          .build();
    }
  }

  /**
   * <pre>
   * The word service definition.
   * </pre>
   */
  public static final class WordStub extends io.grpc.stub.AbstractStub<WordStub> {
    private WordStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WordStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WordStub(channel, callOptions);
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
    public void list(org.easyhan.word.grpc.ListRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.word.grpc.ListResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void visit(org.easyhan.word.grpc.VisitRequest request,
        io.grpc.stub.StreamObserver<org.easyhan.word.grpc.VisitResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VISIT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The word service definition.
   * </pre>
   */
  public static final class WordBlockingStub extends io.grpc.stub.AbstractStub<WordBlockingStub> {
    private WordBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WordBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WordBlockingStub(channel, callOptions);
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
    public java.util.Iterator<org.easyhan.word.grpc.ListResponse> list(
        org.easyhan.word.grpc.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public org.easyhan.word.grpc.VisitResponse visit(org.easyhan.word.grpc.VisitRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VISIT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The word service definition.
   * </pre>
   */
  public static final class WordFutureStub extends io.grpc.stub.AbstractStub<WordFutureStub> {
    private WordFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WordFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WordFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.easyhan.word.grpc.VisitResponse> visit(
        org.easyhan.word.grpc.VisitRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VISIT, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_VISIT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WordImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WordImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((org.easyhan.word.grpc.ListRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.word.grpc.ListResponse>) responseObserver);
          break;
        case METHODID_VISIT:
          serviceImpl.visit((org.easyhan.word.grpc.VisitRequest) request,
              (io.grpc.stub.StreamObserver<org.easyhan.word.grpc.VisitResponse>) responseObserver);
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

  private static final class WordDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.easyhan.word.grpc.WordProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WordGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WordDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_VISIT)
              .build();
        }
      }
    }
    return result;
  }
}
