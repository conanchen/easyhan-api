// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: article/article.proto

package org.easyhan.article.grpc;

public interface GetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:article.GetResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional string content = 1;</code>
   */
  java.lang.String getContent();
  /**
   * <code>optional string content = 1;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <code>optional .common.Error error = 2;</code>
   */
  boolean hasError();
  /**
   * <code>optional .common.Error error = 2;</code>
   */
  org.easyhan.common.grpc.Error getError();
}
