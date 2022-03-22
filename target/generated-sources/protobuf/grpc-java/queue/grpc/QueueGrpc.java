package queue.grpc;

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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: Service.proto")
public final class QueueGrpc {

  private QueueGrpc() {}

  public static final String SERVICE_NAME = "queue.grpc.Queue";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<queue.grpc.Service.QueueRequest,
      queue.grpc.Service.QueueResponse> getAboutQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "aboutQueue",
      requestType = queue.grpc.Service.QueueRequest.class,
      responseType = queue.grpc.Service.QueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<queue.grpc.Service.QueueRequest,
      queue.grpc.Service.QueueResponse> getAboutQueueMethod() {
    io.grpc.MethodDescriptor<queue.grpc.Service.QueueRequest, queue.grpc.Service.QueueResponse> getAboutQueueMethod;
    if ((getAboutQueueMethod = QueueGrpc.getAboutQueueMethod) == null) {
      synchronized (QueueGrpc.class) {
        if ((getAboutQueueMethod = QueueGrpc.getAboutQueueMethod) == null) {
          QueueGrpc.getAboutQueueMethod = getAboutQueueMethod =
              io.grpc.MethodDescriptor.<queue.grpc.Service.QueueRequest, queue.grpc.Service.QueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "aboutQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  queue.grpc.Service.QueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  queue.grpc.Service.QueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueueMethodDescriptorSupplier("aboutQueue"))
              .build();
        }
      }
    }
    return getAboutQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<queue.grpc.Service.addRequest,
      queue.grpc.Service.resultOfAdditionsToQueue> getAddNewStudentToQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addNewStudentToQueue",
      requestType = queue.grpc.Service.addRequest.class,
      responseType = queue.grpc.Service.resultOfAdditionsToQueue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<queue.grpc.Service.addRequest,
      queue.grpc.Service.resultOfAdditionsToQueue> getAddNewStudentToQueueMethod() {
    io.grpc.MethodDescriptor<queue.grpc.Service.addRequest, queue.grpc.Service.resultOfAdditionsToQueue> getAddNewStudentToQueueMethod;
    if ((getAddNewStudentToQueueMethod = QueueGrpc.getAddNewStudentToQueueMethod) == null) {
      synchronized (QueueGrpc.class) {
        if ((getAddNewStudentToQueueMethod = QueueGrpc.getAddNewStudentToQueueMethod) == null) {
          QueueGrpc.getAddNewStudentToQueueMethod = getAddNewStudentToQueueMethod =
              io.grpc.MethodDescriptor.<queue.grpc.Service.addRequest, queue.grpc.Service.resultOfAdditionsToQueue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addNewStudentToQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  queue.grpc.Service.addRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  queue.grpc.Service.resultOfAdditionsToQueue.getDefaultInstance()))
              .setSchemaDescriptor(new QueueMethodDescriptorSupplier("addNewStudentToQueue"))
              .build();
        }
      }
    }
    return getAddNewStudentToQueueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueueStub newStub(io.grpc.Channel channel) {
    return new QueueStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueueBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueueBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueueFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueueFutureStub(channel);
  }

  /**
   */
  public static abstract class QueueImplBase implements io.grpc.BindableService {

    /**
     */
    public void aboutQueue(queue.grpc.Service.QueueRequest request,
        io.grpc.stub.StreamObserver<queue.grpc.Service.QueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAboutQueueMethod(), responseObserver);
    }

    /**
     */
    public void addNewStudentToQueue(queue.grpc.Service.addRequest request,
        io.grpc.stub.StreamObserver<queue.grpc.Service.resultOfAdditionsToQueue> responseObserver) {
      asyncUnimplementedUnaryCall(getAddNewStudentToQueueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAboutQueueMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                queue.grpc.Service.QueueRequest,
                queue.grpc.Service.QueueResponse>(
                  this, METHODID_ABOUT_QUEUE)))
          .addMethod(
            getAddNewStudentToQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                queue.grpc.Service.addRequest,
                queue.grpc.Service.resultOfAdditionsToQueue>(
                  this, METHODID_ADD_NEW_STUDENT_TO_QUEUE)))
          .build();
    }
  }

  /**
   */
  public static final class QueueStub extends io.grpc.stub.AbstractStub<QueueStub> {
    private QueueStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueStub(channel, callOptions);
    }

    /**
     */
    public void aboutQueue(queue.grpc.Service.QueueRequest request,
        io.grpc.stub.StreamObserver<queue.grpc.Service.QueueResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAboutQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addNewStudentToQueue(queue.grpc.Service.addRequest request,
        io.grpc.stub.StreamObserver<queue.grpc.Service.resultOfAdditionsToQueue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddNewStudentToQueueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueueBlockingStub extends io.grpc.stub.AbstractStub<QueueBlockingStub> {
    private QueueBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<queue.grpc.Service.QueueResponse> aboutQueue(
        queue.grpc.Service.QueueRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAboutQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public queue.grpc.Service.resultOfAdditionsToQueue addNewStudentToQueue(queue.grpc.Service.addRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddNewStudentToQueueMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueueFutureStub extends io.grpc.stub.AbstractStub<QueueFutureStub> {
    private QueueFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<queue.grpc.Service.resultOfAdditionsToQueue> addNewStudentToQueue(
        queue.grpc.Service.addRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddNewStudentToQueueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ABOUT_QUEUE = 0;
  private static final int METHODID_ADD_NEW_STUDENT_TO_QUEUE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueueImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueueImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ABOUT_QUEUE:
          serviceImpl.aboutQueue((queue.grpc.Service.QueueRequest) request,
              (io.grpc.stub.StreamObserver<queue.grpc.Service.QueueResponse>) responseObserver);
          break;
        case METHODID_ADD_NEW_STUDENT_TO_QUEUE:
          serviceImpl.addNewStudentToQueue((queue.grpc.Service.addRequest) request,
              (io.grpc.stub.StreamObserver<queue.grpc.Service.resultOfAdditionsToQueue>) responseObserver);
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

  private static abstract class QueueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueueBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return queue.grpc.Service.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Queue");
    }
  }

  private static final class QueueFileDescriptorSupplier
      extends QueueBaseDescriptorSupplier {
    QueueFileDescriptorSupplier() {}
  }

  private static final class QueueMethodDescriptorSupplier
      extends QueueBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueueMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueueGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueueFileDescriptorSupplier())
              .addMethod(getAboutQueueMethod())
              .addMethod(getAddNewStudentToQueueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
