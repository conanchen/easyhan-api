// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: manage/hanziman.proto

package org.easyhan.manage.grpc;

/**
 * Protobuf type {@code manage.UpsertRequest}
 */
public  final class UpsertRequest extends
    com.google.protobuf.GeneratedMessageLite<
        UpsertRequest, UpsertRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:manage.UpsertRequest)
    UpsertRequestOrBuilder {
  private UpsertRequest() {
    word_ = "";
  }
  public static final int WORD_FIELD_NUMBER = 1;
  private java.lang.String word_;
  /**
   * <code>optional string word = 1;</code>
   */
  public java.lang.String getWord() {
    return word_;
  }
  /**
   * <code>optional string word = 1;</code>
   */
  public com.google.protobuf.ByteString
      getWordBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(word_);
  }
  /**
   * <code>optional string word = 1;</code>
   */
  private void setWord(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    word_ = value;
  }
  /**
   * <code>optional string word = 1;</code>
   */
  private void clearWord() {
    
    word_ = getDefaultInstance().getWord();
  }
  /**
   * <code>optional string word = 1;</code>
   */
  private void setWordBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    word_ = value.toStringUtf8();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>optional .common.HanziLevel type = 2;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>optional .common.HanziLevel type = 2;</code>
   */
  public org.easyhan.common.grpc.HanziLevel getType() {
    org.easyhan.common.grpc.HanziLevel result = org.easyhan.common.grpc.HanziLevel.forNumber(type_);
    return result == null ? org.easyhan.common.grpc.HanziLevel.UNRECOGNIZED : result;
  }
  /**
   * <code>optional .common.HanziLevel type = 2;</code>
   */
  private void setTypeValue(int value) {
      type_ = value;
  }
  /**
   * <code>optional .common.HanziLevel type = 2;</code>
   */
  private void setType(org.easyhan.common.grpc.HanziLevel value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    type_ = value.getNumber();
  }
  /**
   * <code>optional .common.HanziLevel type = 2;</code>
   */
  private void clearType() {
    
    type_ = 0;
  }

  public static final int ACTIVE_FIELD_NUMBER = 6;
  private boolean active_;
  /**
   * <code>optional bool active = 6;</code>
   */
  public boolean getActive() {
    return active_;
  }
  /**
   * <code>optional bool active = 6;</code>
   */
  private void setActive(boolean value) {
    
    active_ = value;
  }
  /**
   * <code>optional bool active = 6;</code>
   */
  private void clearActive() {
    
    active_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!word_.isEmpty()) {
      output.writeString(1, getWord());
    }
    if (type_ != org.easyhan.common.grpc.HanziLevel.NONE.getNumber()) {
      output.writeEnum(2, type_);
    }
    if (active_ != false) {
      output.writeBool(6, active_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!word_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getWord());
    }
    if (type_ != org.easyhan.common.grpc.HanziLevel.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, type_);
    }
    if (active_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, active_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static org.easyhan.manage.grpc.UpsertRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.easyhan.manage.grpc.UpsertRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.easyhan.manage.grpc.UpsertRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code manage.UpsertRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.easyhan.manage.grpc.UpsertRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:manage.UpsertRequest)
      org.easyhan.manage.grpc.UpsertRequestOrBuilder {
    // Construct using org.easyhan.manage.grpc.UpsertRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string word = 1;</code>
     */
    public java.lang.String getWord() {
      return instance.getWord();
    }
    /**
     * <code>optional string word = 1;</code>
     */
    public com.google.protobuf.ByteString
        getWordBytes() {
      return instance.getWordBytes();
    }
    /**
     * <code>optional string word = 1;</code>
     */
    public Builder setWord(
        java.lang.String value) {
      copyOnWrite();
      instance.setWord(value);
      return this;
    }
    /**
     * <code>optional string word = 1;</code>
     */
    public Builder clearWord() {
      copyOnWrite();
      instance.clearWord();
      return this;
    }
    /**
     * <code>optional string word = 1;</code>
     */
    public Builder setWordBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setWordBytes(value);
      return this;
    }

    /**
     * <code>optional .common.HanziLevel type = 2;</code>
     */
    public int getTypeValue() {
      return instance.getTypeValue();
    }
    /**
     * <code>optional .common.HanziLevel type = 2;</code>
     */
    public Builder setTypeValue(int value) {
      copyOnWrite();
      instance.setTypeValue(value);
      return this;
    }
    /**
     * <code>optional .common.HanziLevel type = 2;</code>
     */
    public org.easyhan.common.grpc.HanziLevel getType() {
      return instance.getType();
    }
    /**
     * <code>optional .common.HanziLevel type = 2;</code>
     */
    public Builder setType(org.easyhan.common.grpc.HanziLevel value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>optional .common.HanziLevel type = 2;</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <code>optional bool active = 6;</code>
     */
    public boolean getActive() {
      return instance.getActive();
    }
    /**
     * <code>optional bool active = 6;</code>
     */
    public Builder setActive(boolean value) {
      copyOnWrite();
      instance.setActive(value);
      return this;
    }
    /**
     * <code>optional bool active = 6;</code>
     */
    public Builder clearActive() {
      copyOnWrite();
      instance.clearActive();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:manage.UpsertRequest)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.easyhan.manage.grpc.UpsertRequest();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.easyhan.manage.grpc.UpsertRequest other = (org.easyhan.manage.grpc.UpsertRequest) arg1;
        word_ = visitor.visitString(!word_.isEmpty(), word_,
            !other.word_.isEmpty(), other.word_);
        type_ = visitor.visitInt(type_ != 0, type_,    other.type_ != 0, other.type_);
        active_ = visitor.visitBoolean(active_ != false, active_,
            other.active_ != false, other.active_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                word_ = s;
                break;
              }
              case 16: {
                int rawValue = input.readEnum();

                type_ = rawValue;
                break;
              }
              case 48: {

                active_ = input.readBool();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.easyhan.manage.grpc.UpsertRequest.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:manage.UpsertRequest)
  private static final org.easyhan.manage.grpc.UpsertRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new UpsertRequest();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.easyhan.manage.grpc.UpsertRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UpsertRequest> PARSER;

  public static com.google.protobuf.Parser<UpsertRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

