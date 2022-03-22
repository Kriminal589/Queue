package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new ServiceImp())
                .build();

        server.start();

        System.out.println("Server start!");

        server.awaitTermination();
    }
}
