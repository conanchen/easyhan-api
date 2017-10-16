// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: singin/singin.proto

package org.ditto.signin.grpc;

public final class LoginProto {
  private LoginProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_signin_LoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_signin_LoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_signin_LoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_signin_LoginResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023singin/singin.proto\022\006signin\"\265\001\n\014LoginR" +
      "equest\022\020\n\010clientId\030\001 \001(\t\022\024\n\014clientSecret" +
      "\030\002 \001(\t\022\023\n\013accessToken\030\003 \001(\t\0221\n\tloginType" +
      "\030\004 \001(\0162\036.signin.LoginRequest.LoginType\"5" +
      "\n\tLoginType\022\006\n\002QQ\020\000\022\n\n\006WECHAT\020\001\022\t\n\005WEIBO" +
      "\020\002\022\t\n\005DITTO\020\003\"\262\001\n\rLoginResponse\022\021\n\tsessi" +
      "onId\030\001 \001(\t\022\017\n\007expires\030\002 \001(\t\022\022\n\ncookieNam" +
      "e\030\003 \001(\t\022\021\n\ttokenType\030\005 \001(\t\022\024\n\014refreshTok" +
      "en\030\006 \001(\t\022\021\n\texpiresIn\030\007 \001(\t\022\r\n\005scope\030\010 \001" +
      "(\t\022\014\n\004uuid\030\t \001(\t\022\020\n\010clientId\030\n \001(\t2F\n\014Lo",
      "ginService\0226\n\005Login\022\024.signin.LoginReques" +
      "t\032\025.signin.LoginResponse\"\000B%\n\025org.ditto." +
      "signin.grpcB\nLoginProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_signin_LoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_signin_LoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_signin_LoginRequest_descriptor,
        new java.lang.String[] { "ClientId", "ClientSecret", "AccessToken", "LoginType", });
    internal_static_signin_LoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_signin_LoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_signin_LoginResponse_descriptor,
        new java.lang.String[] { "SessionId", "Expires", "CookieName", "TokenType", "RefreshToken", "ExpiresIn", "Scope", "Uuid", "ClientId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
