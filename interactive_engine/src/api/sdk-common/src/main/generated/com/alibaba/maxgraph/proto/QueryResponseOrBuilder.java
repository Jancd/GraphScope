// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/client_frontend_protocol.proto

package com.alibaba.maxgraph.proto;

public interface QueryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:QueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bytes result = 1;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getResultList();
  /**
   * <code>repeated bytes result = 1;</code>
   */
  int getResultCount();
  /**
   * <code>repeated bytes result = 1;</code>
   */
  com.google.protobuf.ByteString getResult(int index);

  /**
   * <code>optional .Response response = 2;</code>
   */
  boolean hasResponse();
  /**
   * <code>optional .Response response = 2;</code>
   */
  com.alibaba.maxgraph.proto.Response getResponse();
  /**
   * <code>optional .Response response = 2;</code>
   */
  com.alibaba.maxgraph.proto.ResponseOrBuilder getResponseOrBuilder();
}
