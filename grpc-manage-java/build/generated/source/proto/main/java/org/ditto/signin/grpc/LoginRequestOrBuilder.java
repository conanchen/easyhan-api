// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: singin/singin.proto

package org.ditto.signin.grpc;

public interface LoginRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:signin.LoginRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string clientId = 1;</code>
   */
  java.lang.String getClientId();
  /**
   * <code>string clientId = 1;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string clientSecret = 2;</code>
   */
  java.lang.String getClientSecret();
  /**
   * <code>string clientSecret = 2;</code>
   */
  com.google.protobuf.ByteString
      getClientSecretBytes();

  /**
   * <code>string accessToken = 3;</code>
   */
  java.lang.String getAccessToken();
  /**
   * <code>string accessToken = 3;</code>
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <code>.signin.LoginRequest.LoginType loginType = 4;</code>
   */
  int getLoginTypeValue();
  /**
   * <code>.signin.LoginRequest.LoginType loginType = 4;</code>
   */
  org.ditto.signin.grpc.LoginRequest.LoginType getLoginType();
}
