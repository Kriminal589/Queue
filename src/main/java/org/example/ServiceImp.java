package org.example;

import io.grpc.stub.StreamObserver;
import queue.grpc.QueueGrpc;
import queue.grpc.Service;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceImp extends QueueGrpc.QueueImplBase {

    Queue<String> queue = new LinkedList<>();


    @Override
    public void aboutQueue(Service.QueueRequest request, StreamObserver<Service.QueueResponse> responseObserver){

        for (String student : queue) {
            Service.QueueResponse response = Service.QueueResponse.newBuilder()
                    .setQueue(student)
                    .build();

            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();
    }

    @Override
    public void addNewStudentToQueue(Service.addRequest request,
                                     StreamObserver<Service.resultOfAdditionsToQueue> responseObserver){

        Service.resultOfAdditionsToQueue response;

        try {
            queue.add(request.getName());

             response = Service.resultOfAdditionsToQueue.newBuilder()
                    .setResult(true)
                    .build();


        }catch (Exception e){
            response = Service.resultOfAdditionsToQueue.newBuilder()
                    .setResult(false)
                    .build();
        }

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }

}
