// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/common.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code AllMetricsInfoProto}
 */
public  final class AllMetricsInfoProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AllMetricsInfoProto)
    AllMetricsInfoProtoOrBuilder {
  // Use AllMetricsInfoProto.newBuilder() to construct.
  private AllMetricsInfoProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllMetricsInfoProto() {
    metricName_ = "";
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AllMetricsInfoProto(
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

            metricName_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              values_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.ServerMetricValue>();
              mutable_bitField0_ |= 0x00000002;
            }
            values_.add(
                input.readMessage(com.alibaba.maxgraph.proto.ServerMetricValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.CommonProto.internal_static_AllMetricsInfoProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.CommonProto.internal_static_AllMetricsInfoProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.AllMetricsInfoProto.class, com.alibaba.maxgraph.proto.AllMetricsInfoProto.Builder.class);
  }

  private int bitField0_;
  public static final int METRICNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object metricName_;
  /**
   * <code>optional string metricName = 1;</code>
   */
  public java.lang.String getMetricName() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      metricName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string metricName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMetricNameBytes() {
    java.lang.Object ref = metricName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      metricName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 2;
  private java.util.List<com.alibaba.maxgraph.proto.ServerMetricValue> values_;
  /**
   * <code>repeated .ServerMetricValue values = 2;</code>
   */
  public java.util.List<com.alibaba.maxgraph.proto.ServerMetricValue> getValuesList() {
    return values_;
  }
  /**
   * <code>repeated .ServerMetricValue values = 2;</code>
   */
  public java.util.List<? extends com.alibaba.maxgraph.proto.ServerMetricValueOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <code>repeated .ServerMetricValue values = 2;</code>
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated .ServerMetricValue values = 2;</code>
   */
  public com.alibaba.maxgraph.proto.ServerMetricValue getValues(int index) {
    return values_.get(index);
  }
  /**
   * <code>repeated .ServerMetricValue values = 2;</code>
   */
  public com.alibaba.maxgraph.proto.ServerMetricValueOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    if (!getMetricNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, metricName_);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(2, values_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMetricNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, metricName_);
    }
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, values_.get(i));
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
    if (!(obj instanceof com.alibaba.maxgraph.proto.AllMetricsInfoProto)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.AllMetricsInfoProto other = (com.alibaba.maxgraph.proto.AllMetricsInfoProto) obj;

    boolean result = true;
    result = result && getMetricName()
        .equals(other.getMetricName());
    result = result && getValuesList()
        .equals(other.getValuesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + METRICNAME_FIELD_NUMBER;
    hash = (53 * hash) + getMetricName().hashCode();
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto parseFrom(
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
  public static Builder newBuilder(com.alibaba.maxgraph.proto.AllMetricsInfoProto prototype) {
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
   * Protobuf type {@code AllMetricsInfoProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AllMetricsInfoProto)
      com.alibaba.maxgraph.proto.AllMetricsInfoProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.CommonProto.internal_static_AllMetricsInfoProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.CommonProto.internal_static_AllMetricsInfoProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.AllMetricsInfoProto.class, com.alibaba.maxgraph.proto.AllMetricsInfoProto.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.AllMetricsInfoProto.newBuilder()
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
        getValuesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      metricName_ = "";

      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.CommonProto.internal_static_AllMetricsInfoProto_descriptor;
    }

    public com.alibaba.maxgraph.proto.AllMetricsInfoProto getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.AllMetricsInfoProto.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.AllMetricsInfoProto build() {
      com.alibaba.maxgraph.proto.AllMetricsInfoProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.AllMetricsInfoProto buildPartial() {
      com.alibaba.maxgraph.proto.AllMetricsInfoProto result = new com.alibaba.maxgraph.proto.AllMetricsInfoProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.metricName_ = metricName_;
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
      }
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
      if (other instanceof com.alibaba.maxgraph.proto.AllMetricsInfoProto) {
        return mergeFrom((com.alibaba.maxgraph.proto.AllMetricsInfoProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.AllMetricsInfoProto other) {
      if (other == com.alibaba.maxgraph.proto.AllMetricsInfoProto.getDefaultInstance()) return this;
      if (!other.getMetricName().isEmpty()) {
        metricName_ = other.metricName_;
        onChanged();
      }
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000002);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
          }
        }
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
      com.alibaba.maxgraph.proto.AllMetricsInfoProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.AllMetricsInfoProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object metricName_ = "";
    /**
     * <code>optional string metricName = 1;</code>
     */
    public java.lang.String getMetricName() {
      java.lang.Object ref = metricName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metricName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string metricName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMetricNameBytes() {
      java.lang.Object ref = metricName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metricName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string metricName = 1;</code>
     */
    public Builder setMetricName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      metricName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string metricName = 1;</code>
     */
    public Builder clearMetricName() {
      
      metricName_ = getDefaultInstance().getMetricName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string metricName = 1;</code>
     */
    public Builder setMetricNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      metricName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.alibaba.maxgraph.proto.ServerMetricValue> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        values_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.ServerMetricValue>(values_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.ServerMetricValue, com.alibaba.maxgraph.proto.ServerMetricValue.Builder, com.alibaba.maxgraph.proto.ServerMetricValueOrBuilder> valuesBuilder_;

    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.ServerMetricValue> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public com.alibaba.maxgraph.proto.ServerMetricValue getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder setValues(
        int index, com.alibaba.maxgraph.proto.ServerMetricValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder setValues(
        int index, com.alibaba.maxgraph.proto.ServerMetricValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder addValues(com.alibaba.maxgraph.proto.ServerMetricValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder addValues(
        int index, com.alibaba.maxgraph.proto.ServerMetricValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder addValues(
        com.alibaba.maxgraph.proto.ServerMetricValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder addValues(
        int index, com.alibaba.maxgraph.proto.ServerMetricValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends com.alibaba.maxgraph.proto.ServerMetricValue> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public com.alibaba.maxgraph.proto.ServerMetricValue.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public com.alibaba.maxgraph.proto.ServerMetricValueOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public java.util.List<? extends com.alibaba.maxgraph.proto.ServerMetricValueOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public com.alibaba.maxgraph.proto.ServerMetricValue.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          com.alibaba.maxgraph.proto.ServerMetricValue.getDefaultInstance());
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public com.alibaba.maxgraph.proto.ServerMetricValue.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, com.alibaba.maxgraph.proto.ServerMetricValue.getDefaultInstance());
    }
    /**
     * <code>repeated .ServerMetricValue values = 2;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.ServerMetricValue.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.ServerMetricValue, com.alibaba.maxgraph.proto.ServerMetricValue.Builder, com.alibaba.maxgraph.proto.ServerMetricValueOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.alibaba.maxgraph.proto.ServerMetricValue, com.alibaba.maxgraph.proto.ServerMetricValue.Builder, com.alibaba.maxgraph.proto.ServerMetricValueOrBuilder>(
                values_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:AllMetricsInfoProto)
  }

  // @@protoc_insertion_point(class_scope:AllMetricsInfoProto)
  private static final com.alibaba.maxgraph.proto.AllMetricsInfoProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.AllMetricsInfoProto();
  }

  public static com.alibaba.maxgraph.proto.AllMetricsInfoProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllMetricsInfoProto>
      PARSER = new com.google.protobuf.AbstractParser<AllMetricsInfoProto>() {
    public AllMetricsInfoProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AllMetricsInfoProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllMetricsInfoProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllMetricsInfoProto> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.AllMetricsInfoProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

