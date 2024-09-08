package com.example.grpc_mtls;

import io.grpc.stub.StreamObserver;

@net.devh.boot.grpc.server.service.GrpcService
public class GrpcService extends com.example.grpc_mtls.HelloServiceGrpc.HelloServiceImplBase {
    @Override
 public void hello(com.example.grpc_mtls.HelloRequest request,
                   StreamObserver<com.example.grpc_mtls.HelloResponse> helloResponse) {
        com.example.grpc_mtls.HelloResponse response = com.example.grpc_mtls.HelloResponse.newBuilder().setGreeting("Hello "+ request.getFirstName()+" "+request.getLastName()+". Welcome").build();
        System.out.println("returning :"+response);
        helloResponse.onNext(response);
        helloResponse.onCompleted();
 }
}
