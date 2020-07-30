// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/common.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code EndpointProto}
 */
public  final class EndpointProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EndpointProto)
    EndpointProtoOrBuilder {
  // Use EndpointProto.newBuilder() to construct.
  private EndpointProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EndpointProto() {
    host_ = "";
    port_ = 0;
    gremlinServerPort_ = 0;
    runtimePort_ = 0;
    runtimCtrlAndAsyncPort_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EndpointProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
            java.lang.String s = input.readStringRequireUtf8();

            host_ = s;
            break;
          }
          case 16: {

            port_ = input.readInt32();
            break;
          }
          case 24: {

            gremlinServerPort_ = input.readInt32();
            break;
          }
          case 32: {

            runtimePort_ = input.readInt32();
            break;
          }
          case 40: {

            runtimCtrlAndAsyncPort_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.CommonProto.internal_static_EndpointProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.CommonProto.internal_static_EndpointProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.EndpointProto.class, com.alibaba.maxgraph.proto.EndpointProto.Builder.class);
  }

  public static final int HOST_FIELD_NUMBER = 1;
  private volatile java.lang.Object host_;
  /**
   * <code>optional string host = 1;</code>
   */
  public java.lang.String getHost() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      host_ = s;
      return s;
    }
  }
  /**
   * <code>optional string host = 1;</code>
   */
  public com.google.protobuf.ByteString
      getHostBytes() {
    java.lang.Object ref = host_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      host_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <pre>
   * default rpc port
   * </pre>
   *
   * <code>optional int32 port = 2;</code>
   */
  public int getPort() {
    return port_;
  }

  public static final int GREMLINSERVERPORT_FIELD_NUMBER = 3;
  private int gremlinServerPort_;
  /**
   * <pre>
   * gremlin server port, frontend only
   * </pre>
   *
   * <code>optional int32 gremlinServerPort = 3;</code>
   */
  public int getGremlinServerPort() {
    return gremlinServerPort_;
  }

  public static final int RUNTIMEPORT_FIELD_NUMBER = 4;
  private int runtimePort_;
  /**
   * <pre>
   * timely's port, executor only
   * </pre>
   *
   * <code>optional int32 runtimePort = 4;</code>
   */
  public int getRuntimePort() {
    return runtimePort_;
  }

  public static final int RUNTIMCTRLANDASYNCPORT_FIELD_NUMBER = 5;
  private int runtimCtrlAndAsyncPort_;
  /**
   * <pre>
   * runtime control port to query or cancel running job, and async timely's port, executor only.
   * </pre>
   *
   * <code>optional int32 runtimCtrlAndAsyncPort = 5;</code>
   */
  public int getRuntimCtrlAndAsyncPort() {
    return runtimCtrlAndAsyncPort_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getHostBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, host_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (gremlinServerPort_ != 0) {
      output.writeInt32(3, gremlinServerPort_);
    }
    if (runtimePort_ != 0) {
      output.writeInt32(4, runtimePort_);
    }
    if (runtimCtrlAndAsyncPort_ != 0) {
      output.writeInt32(5, runtimCtrlAndAsyncPort_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHostBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, host_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, port_);
    }
    if (gremlinServerPort_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, gremlinServerPort_);
    }
    if (runtimePort_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, runtimePort_);
    }
    if (runtimCtrlAndAsyncPort_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, runtimCtrlAndAsyncPort_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.maxgraph.proto.EndpointProto)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.EndpointProto other = (com.alibaba.maxgraph.proto.EndpointProto) obj;

    boolean result = true;
    result = result && getHost()
        .equals(other.getHost());
    result = result && (getPort()
        == other.getPort());
    result = result && (getGremlinServerPort()
        == other.getGremlinServerPort());
    result = result && (getRuntimePort()
        == other.getRuntimePort());
    result = result && (getRuntimCtrlAndAsyncPort()
        == other.getRuntimCtrlAndAsyncPort());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + HOST_FIELD_NUMBER;
    hash = (53 * hash) + getHost().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + GREMLINSERVERPORT_FIELD_NUMBER;
    hash = (53 * hash) + getGremlinServerPort();
    hash = (37 * hash) + RUNTIMEPORT_FIELD_NUMBER;
    hash = (53 * hash) + getRuntimePort();
    hash = (37 * hash) + RUNTIMCTRLANDASYNCPORT_FIELD_NUMBER;
    hash = (53 * hash) + getRuntimCtrlAndAsyncPort();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.EndpointProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.EndpointProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.alibaba.maxgraph.proto.EndpointProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code EndpointProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EndpointProto)
      com.alibaba.maxgraph.proto.EndpointProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.CommonProto.internal_static_EndpointProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.CommonProto.internal_static_EndpointProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.EndpointProto.class, com.alibaba.maxgraph.proto.EndpointProto.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.EndpointProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      host_ = "";

      port_ = 0;

      gremlinServerPort_ = 0;

      runtimePort_ = 0;

      runtimCtrlAndAsyncPort_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.CommonProto.internal_static_EndpointProto_descriptor;
    }

    public com.alibaba.maxgraph.proto.EndpointProto getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.EndpointProto.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.EndpointProto build() {
      com.alibaba.maxgraph.proto.EndpointProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.EndpointProto buildPartial() {
      com.alibaba.maxgraph.proto.EndpointProto result = new com.alibaba.maxgraph.proto.EndpointProto(this);
      result.host_ = host_;
      result.port_ = port_;
      result.gremlinServerPort_ = gremlinServerPort_;
      result.runtimePort_ = runtimePort_;
      result.runtimCtrlAndAsyncPort_ = runtimCtrlAndAsyncPort_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.maxgraph.proto.EndpointProto) {
        return mergeFrom((com.alibaba.maxgraph.proto.EndpointProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.EndpointProto other) {
      if (other == com.alibaba.maxgraph.proto.EndpointProto.getDefaultInstance()) return this;
      if (!other.getHost().isEmpty()) {
        host_ = other.host_;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (other.getGremlinServerPort() != 0) {
        setGremlinServerPort(other.getGremlinServerPort());
      }
      if (other.getRuntimePort() != 0) {
        setRuntimePort(other.getRuntimePort());
      }
      if (other.getRuntimCtrlAndAsyncPort() != 0) {
        setRuntimCtrlAndAsyncPort(other.getRuntimCtrlAndAsyncPort());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.alibaba.maxgraph.proto.EndpointProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.EndpointProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object host_ = "";
    /**
     * <code>optional string host = 1;</code>
     */
    public java.lang.String getHost() {
      java.lang.Object ref = host_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        host_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string host = 1;</code>
     */
    public com.google.protobuf.ByteString
        getHostBytes() {
      java.lang.Object ref = host_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        host_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string host = 1;</code>
     */
    public Builder setHost(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      host_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string host = 1;</code>
     */
    public Builder clearHost() {
      
      host_ = getDefaultInstance().getHost();
      onChanged();
      return this;
    }
    /**
     * <code>optional string host = 1;</code>
     */
    public Builder setHostBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      host_ = value;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <pre>
     * default rpc port
     * </pre>
     *
     * <code>optional int32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <pre>
     * default rpc port
     * </pre>
     *
     * <code>optional int32 port = 2;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * default rpc port
     * </pre>
     *
     * <code>optional int32 port = 2;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private int gremlinServerPort_ ;
    /**
     * <pre>
     * gremlin server port, frontend only
     * </pre>
     *
     * <code>optional int32 gremlinServerPort = 3;</code>
     */
    public int getGremlinServerPort() {
      return gremlinServerPort_;
    }
    /**
     * <pre>
     * gremlin server port, frontend only
     * </pre>
     *
     * <code>optional int32 gremlinServerPort = 3;</code>
     */
    public Builder setGremlinServerPort(int value) {
      
      gremlinServerPort_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * gremlin server port, frontend only
     * </pre>
     *
     * <code>optional int32 gremlinServerPort = 3;</code>
     */
    public Builder clearGremlinServerPort() {
      
      gremlinServerPort_ = 0;
      onChanged();
      return this;
    }

    private int runtimePort_ ;
    /**
     * <pre>
     * timely's port, executor only
     * </pre>
     *
     * <code>optional int32 runtimePort = 4;</code>
     */
    public int getRuntimePort() {
      return runtimePort_;
    }
    /**
     * <pre>
     * timely's port, executor only
     * </pre>
     *
     * <code>optional int32 runtimePort = 4;</code>
     */
    public Builder setRuntimePort(int value) {
      
      runtimePort_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * timely's port, executor only
     * </pre>
     *
     * <code>optional int32 runtimePort = 4;</code>
     */
    public Builder clearRuntimePort() {
      
      runtimePort_ = 0;
      onChanged();
      return this;
    }

    private int runtimCtrlAndAsyncPort_ ;
    /**
     * <pre>
     * runtime control port to query or cancel running job, and async timely's port, executor only.
     * </pre>
     *
     * <code>optional int32 runtimCtrlAndAsyncPort = 5;</code>
     */
    public int getRuntimCtrlAndAsyncPort() {
      return runtimCtrlAndAsyncPort_;
    }
    /**
     * <pre>
     * runtime control port to query or cancel running job, and async timely's port, executor only.
     * </pre>
     *
     * <code>optional int32 runtimCtrlAndAsyncPort = 5;</code>
     */
    public Builder setRuntimCtrlAndAsyncPort(int value) {
      
      runtimCtrlAndAsyncPort_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * runtime control port to query or cancel running job, and async timely's port, executor only.
     * </pre>
     *
     * <code>optional int32 runtimCtrlAndAsyncPort = 5;</code>
     */
    public Builder clearRuntimCtrlAndAsyncPort() {
      
      runtimCtrlAndAsyncPort_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EndpointProto)
  }

  // @@protoc_insertion_point(class_scope:EndpointProto)
  private static final com.alibaba.maxgraph.proto.EndpointProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.EndpointProto();
  }

  public static com.alibaba.maxgraph.proto.EndpointProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EndpointProto>
      PARSER = new com.google.protobuf.AbstractParser<EndpointProto>() {
    public EndpointProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EndpointProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EndpointProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EndpointProto> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.EndpointProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

