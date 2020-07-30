// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: debug.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code GetVertexRequest}
 */
public  final class GetVertexRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetVertexRequest)
    GetVertexRequestOrBuilder {
  // Use GetVertexRequest.newBuilder() to construct.
  private GetVertexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetVertexRequest() {
    id_ = java.util.Collections.emptyList();
    label_ = 0;
    snapshotId_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetVertexRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              id_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000001;
            }
            id_.add(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              id_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              id_.add(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 16: {

            label_ = input.readUInt32();
            break;
          }
          case 24: {

            snapshotId_ = input.readInt64();
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        id_ = java.util.Collections.unmodifiableList(id_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.Debug.internal_static_GetVertexRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.Debug.internal_static_GetVertexRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.GetVertexRequest.class, com.alibaba.maxgraph.proto.GetVertexRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Long> id_;
  /**
   * <code>repeated int64 id = 1;</code>
   */
  public java.util.List<java.lang.Long>
      getIdList() {
    return id_;
  }
  /**
   * <code>repeated int64 id = 1;</code>
   */
  public int getIdCount() {
    return id_.size();
  }
  /**
   * <code>repeated int64 id = 1;</code>
   */
  public long getId(int index) {
    return id_.get(index);
  }
  private int idMemoizedSerializedSize = -1;

  public static final int LABEL_FIELD_NUMBER = 2;
  private int label_;
  /**
   * <code>optional uint32 label = 2;</code>
   */
  public int getLabel() {
    return label_;
  }

  public static final int SNAPSHOT_ID_FIELD_NUMBER = 3;
  private long snapshotId_;
  /**
   * <code>optional int64 snapshot_id = 3;</code>
   */
  public long getSnapshotId() {
    return snapshotId_;
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
    getSerializedSize();
    if (getIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(idMemoizedSerializedSize);
    }
    for (int i = 0; i < id_.size(); i++) {
      output.writeInt64NoTag(id_.get(i));
    }
    if (label_ != 0) {
      output.writeUInt32(2, label_);
    }
    if (snapshotId_ != 0L) {
      output.writeInt64(3, snapshotId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < id_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(id_.get(i));
      }
      size += dataSize;
      if (!getIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idMemoizedSerializedSize = dataSize;
    }
    if (label_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, label_);
    }
    if (snapshotId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, snapshotId_);
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
    if (!(obj instanceof com.alibaba.maxgraph.proto.GetVertexRequest)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.GetVertexRequest other = (com.alibaba.maxgraph.proto.GetVertexRequest) obj;

    boolean result = true;
    result = result && getIdList()
        .equals(other.getIdList());
    result = result && (getLabel()
        == other.getLabel());
    result = result && (getSnapshotId()
        == other.getSnapshotId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getIdCount() > 0) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getIdList().hashCode();
    }
    hash = (37 * hash) + LABEL_FIELD_NUMBER;
    hash = (53 * hash) + getLabel();
    hash = (37 * hash) + SNAPSHOT_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSnapshotId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.GetVertexRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.GetVertexRequest parseFrom(
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
  public static Builder newBuilder(com.alibaba.maxgraph.proto.GetVertexRequest prototype) {
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
   * Protobuf type {@code GetVertexRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetVertexRequest)
      com.alibaba.maxgraph.proto.GetVertexRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_GetVertexRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_GetVertexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.GetVertexRequest.class, com.alibaba.maxgraph.proto.GetVertexRequest.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.GetVertexRequest.newBuilder()
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
      id_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      label_ = 0;

      snapshotId_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_GetVertexRequest_descriptor;
    }

    public com.alibaba.maxgraph.proto.GetVertexRequest getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.GetVertexRequest.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.GetVertexRequest build() {
      com.alibaba.maxgraph.proto.GetVertexRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.GetVertexRequest buildPartial() {
      com.alibaba.maxgraph.proto.GetVertexRequest result = new com.alibaba.maxgraph.proto.GetVertexRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        id_ = java.util.Collections.unmodifiableList(id_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.id_ = id_;
      result.label_ = label_;
      result.snapshotId_ = snapshotId_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.alibaba.maxgraph.proto.GetVertexRequest) {
        return mergeFrom((com.alibaba.maxgraph.proto.GetVertexRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.GetVertexRequest other) {
      if (other == com.alibaba.maxgraph.proto.GetVertexRequest.getDefaultInstance()) return this;
      if (!other.id_.isEmpty()) {
        if (id_.isEmpty()) {
          id_ = other.id_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdIsMutable();
          id_.addAll(other.id_);
        }
        onChanged();
      }
      if (other.getLabel() != 0) {
        setLabel(other.getLabel());
      }
      if (other.getSnapshotId() != 0L) {
        setSnapshotId(other.getSnapshotId());
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
      com.alibaba.maxgraph.proto.GetVertexRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.GetVertexRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Long> id_ = java.util.Collections.emptyList();
    private void ensureIdIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        id_ = new java.util.ArrayList<java.lang.Long>(id_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 id = 1;</code>
     */
    public java.util.List<java.lang.Long>
        getIdList() {
      return java.util.Collections.unmodifiableList(id_);
    }
    /**
     * <code>repeated int64 id = 1;</code>
     */
    public int getIdCount() {
      return id_.size();
    }
    /**
     * <code>repeated int64 id = 1;</code>
     */
    public long getId(int index) {
      return id_.get(index);
    }
    /**
     * <code>repeated int64 id = 1;</code>
     */
    public Builder setId(
        int index, long value) {
      ensureIdIsMutable();
      id_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 id = 1;</code>
     */
    public Builder addId(long value) {
      ensureIdIsMutable();
      id_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 id = 1;</code>
     */
    public Builder addAllId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, id_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 id = 1;</code>
     */
    public Builder clearId() {
      id_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int label_ ;
    /**
     * <code>optional uint32 label = 2;</code>
     */
    public int getLabel() {
      return label_;
    }
    /**
     * <code>optional uint32 label = 2;</code>
     */
    public Builder setLabel(int value) {
      
      label_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 label = 2;</code>
     */
    public Builder clearLabel() {
      
      label_ = 0;
      onChanged();
      return this;
    }

    private long snapshotId_ ;
    /**
     * <code>optional int64 snapshot_id = 3;</code>
     */
    public long getSnapshotId() {
      return snapshotId_;
    }
    /**
     * <code>optional int64 snapshot_id = 3;</code>
     */
    public Builder setSnapshotId(long value) {
      
      snapshotId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 snapshot_id = 3;</code>
     */
    public Builder clearSnapshotId() {
      
      snapshotId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:GetVertexRequest)
  }

  // @@protoc_insertion_point(class_scope:GetVertexRequest)
  private static final com.alibaba.maxgraph.proto.GetVertexRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.GetVertexRequest();
  }

  public static com.alibaba.maxgraph.proto.GetVertexRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetVertexRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetVertexRequest>() {
    public GetVertexRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetVertexRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetVertexRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetVertexRequest> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.GetVertexRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

