// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: debug.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code ScanVertexRequest}
 */
public  final class ScanVertexRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ScanVertexRequest)
    ScanVertexRequestOrBuilder {
  // Use ScanVertexRequest.newBuilder() to construct.
  private ScanVertexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScanVertexRequest() {
    label_ = 0;
    snapshotId_ = 0L;
    limit_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ScanVertexRequest(
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
          case 8: {

            label_ = input.readUInt32();
            break;
          }
          case 16: {

            snapshotId_ = input.readInt64();
            break;
          }
          case 24: {

            limit_ = input.readUInt64();
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
    return com.alibaba.maxgraph.proto.Debug.internal_static_ScanVertexRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.Debug.internal_static_ScanVertexRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.ScanVertexRequest.class, com.alibaba.maxgraph.proto.ScanVertexRequest.Builder.class);
  }

  public static final int LABEL_FIELD_NUMBER = 1;
  private int label_;
  /**
   * <code>optional uint32 label = 1;</code>
   */
  public int getLabel() {
    return label_;
  }

  public static final int SNAPSHOT_ID_FIELD_NUMBER = 2;
  private long snapshotId_;
  /**
   * <code>optional int64 snapshot_id = 2;</code>
   */
  public long getSnapshotId() {
    return snapshotId_;
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private long limit_;
  /**
   * <code>optional uint64 limit = 3;</code>
   */
  public long getLimit() {
    return limit_;
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
    if (label_ != 0) {
      output.writeUInt32(1, label_);
    }
    if (snapshotId_ != 0L) {
      output.writeInt64(2, snapshotId_);
    }
    if (limit_ != 0L) {
      output.writeUInt64(3, limit_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (label_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, label_);
    }
    if (snapshotId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, snapshotId_);
    }
    if (limit_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, limit_);
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
    if (!(obj instanceof com.alibaba.maxgraph.proto.ScanVertexRequest)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.ScanVertexRequest other = (com.alibaba.maxgraph.proto.ScanVertexRequest) obj;

    boolean result = true;
    result = result && (getLabel()
        == other.getLabel());
    result = result && (getSnapshotId()
        == other.getSnapshotId());
    result = result && (getLimit()
        == other.getLimit());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getLabel();
    hash = (37 * hash) + SNAPSHOT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSnapshotId());
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLimit());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.ScanVertexRequest parseFrom(
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
  public static Builder newBuilder(com.alibaba.maxgraph.proto.ScanVertexRequest prototype) {
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
   * Protobuf type {@code ScanVertexRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ScanVertexRequest)
      com.alibaba.maxgraph.proto.ScanVertexRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_ScanVertexRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_ScanVertexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.ScanVertexRequest.class, com.alibaba.maxgraph.proto.ScanVertexRequest.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.ScanVertexRequest.newBuilder()
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
      label_ = 0;

      snapshotId_ = 0L;

      limit_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_ScanVertexRequest_descriptor;
    }

    public com.alibaba.maxgraph.proto.ScanVertexRequest getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.ScanVertexRequest.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.ScanVertexRequest build() {
      com.alibaba.maxgraph.proto.ScanVertexRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.ScanVertexRequest buildPartial() {
      com.alibaba.maxgraph.proto.ScanVertexRequest result = new com.alibaba.maxgraph.proto.ScanVertexRequest(this);
      result.label_ = label_;
      result.snapshotId_ = snapshotId_;
      result.limit_ = limit_;
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
      if (other instanceof com.alibaba.maxgraph.proto.ScanVertexRequest) {
        return mergeFrom((com.alibaba.maxgraph.proto.ScanVertexRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.ScanVertexRequest other) {
      if (other == com.alibaba.maxgraph.proto.ScanVertexRequest.getDefaultInstance()) return this;
      if (other.getLabel() != 0) {
        setLabel(other.getLabel());
      }
      if (other.getSnapshotId() != 0L) {
        setSnapshotId(other.getSnapshotId());
      }
      if (other.getLimit() != 0L) {
        setLimit(other.getLimit());
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
      com.alibaba.maxgraph.proto.ScanVertexRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.ScanVertexRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int label_ ;
    /**
     * <code>optional uint32 label = 1;</code>
     */
    public int getLabel() {
      return label_;
    }
    /**
     * <code>optional uint32 label = 1;</code>
     */
    public Builder setLabel(int value) {
      
      label_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 label = 1;</code>
     */
    public Builder clearLabel() {
      
      label_ = 0;
      onChanged();
      return this;
    }

    private long snapshotId_ ;
    /**
     * <code>optional int64 snapshot_id = 2;</code>
     */
    public long getSnapshotId() {
      return snapshotId_;
    }
    /**
     * <code>optional int64 snapshot_id = 2;</code>
     */
    public Builder setSnapshotId(long value) {
      
      snapshotId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 snapshot_id = 2;</code>
     */
    public Builder clearSnapshotId() {
      
      snapshotId_ = 0L;
      onChanged();
      return this;
    }

    private long limit_ ;
    /**
     * <code>optional uint64 limit = 3;</code>
     */
    public long getLimit() {
      return limit_;
    }
    /**
     * <code>optional uint64 limit = 3;</code>
     */
    public Builder setLimit(long value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 limit = 3;</code>
     */
    public Builder clearLimit() {
      
      limit_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ScanVertexRequest)
  }

  // @@protoc_insertion_point(class_scope:ScanVertexRequest)
  private static final com.alibaba.maxgraph.proto.ScanVertexRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.ScanVertexRequest();
  }

  public static com.alibaba.maxgraph.proto.ScanVertexRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScanVertexRequest>
      PARSER = new com.google.protobuf.AbstractParser<ScanVertexRequest>() {
    public ScanVertexRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScanVertexRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScanVertexRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScanVertexRequest> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.ScanVertexRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

