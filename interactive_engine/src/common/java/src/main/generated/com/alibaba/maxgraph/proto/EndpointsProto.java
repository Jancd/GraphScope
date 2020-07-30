// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hb.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code EndpointsProto}
 */
public  final class EndpointsProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EndpointsProto)
    EndpointsProtoOrBuilder {
  // Use EndpointsProto.newBuilder() to construct.
  private EndpointsProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EndpointsProto() {
    addrs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EndpointsProto(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              addrs_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.EndpointProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            addrs_.add(
                input.readMessage(com.alibaba.maxgraph.proto.EndpointProto.parser(), extensionRegistry));
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
        addrs_ = java.util.Collections.unmodifiableList(addrs_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.Hb.internal_static_EndpointsProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.Hb.internal_static_EndpointsProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.EndpointsProto.class, com.alibaba.maxgraph.proto.EndpointsProto.Builder.class);
  }

  public static final int ADDRS_FIELD_NUMBER = 1;
  private java.util.List<com.alibaba.maxgraph.proto.EndpointProto> addrs_;
  /**
   * <code>repeated .EndpointProto addrs = 1;</code>
   */
  public java.util.List<com.alibaba.maxgraph.proto.EndpointProto> getAddrsList() {
    return addrs_;
  }
  /**
   * <code>repeated .EndpointProto addrs = 1;</code>
   */
  public java.util.List<? extends com.alibaba.maxgraph.proto.EndpointProtoOrBuilder> 
      getAddrsOrBuilderList() {
    return addrs_;
  }
  /**
   * <code>repeated .EndpointProto addrs = 1;</code>
   */
  public int getAddrsCount() {
    return addrs_.size();
  }
  /**
   * <code>repeated .EndpointProto addrs = 1;</code>
   */
  public com.alibaba.maxgraph.proto.EndpointProto getAddrs(int index) {
    return addrs_.get(index);
  }
  /**
   * <code>repeated .EndpointProto addrs = 1;</code>
   */
  public com.alibaba.maxgraph.proto.EndpointProtoOrBuilder getAddrsOrBuilder(
      int index) {
    return addrs_.get(index);
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
    for (int i = 0; i < addrs_.size(); i++) {
      output.writeMessage(1, addrs_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < addrs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, addrs_.get(i));
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
    if (!(obj instanceof com.alibaba.maxgraph.proto.EndpointsProto)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.EndpointsProto other = (com.alibaba.maxgraph.proto.EndpointsProto) obj;

    boolean result = true;
    result = result && getAddrsList()
        .equals(other.getAddrsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getAddrsCount() > 0) {
      hash = (37 * hash) + ADDRS_FIELD_NUMBER;
      hash = (53 * hash) + getAddrsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.EndpointsProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.EndpointsProto parseFrom(
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
  public static Builder newBuilder(com.alibaba.maxgraph.proto.EndpointsProto prototype) {
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
   * Protobuf type {@code EndpointsProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EndpointsProto)
      com.alibaba.maxgraph.proto.EndpointsProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.Hb.internal_static_EndpointsProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.Hb.internal_static_EndpointsProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.EndpointsProto.class, com.alibaba.maxgraph.proto.EndpointsProto.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.EndpointsProto.newBuilder()
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
        getAddrsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (addrsBuilder_ == null) {
        addrs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        addrsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.Hb.internal_static_EndpointsProto_descriptor;
    }

    public com.alibaba.maxgraph.proto.EndpointsProto getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.EndpointsProto.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.EndpointsProto build() {
      com.alibaba.maxgraph.proto.EndpointsProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.EndpointsProto buildPartial() {
      com.alibaba.maxgraph.proto.EndpointsProto result = new com.alibaba.maxgraph.proto.EndpointsProto(this);
      int from_bitField0_ = bitField0_;
      if (addrsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          addrs_ = java.util.Collections.unmodifiableList(addrs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.addrs_ = addrs_;
      } else {
        result.addrs_ = addrsBuilder_.build();
      }
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
      if (other instanceof com.alibaba.maxgraph.proto.EndpointsProto) {
        return mergeFrom((com.alibaba.maxgraph.proto.EndpointsProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.EndpointsProto other) {
      if (other == com.alibaba.maxgraph.proto.EndpointsProto.getDefaultInstance()) return this;
      if (addrsBuilder_ == null) {
        if (!other.addrs_.isEmpty()) {
          if (addrs_.isEmpty()) {
            addrs_ = other.addrs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAddrsIsMutable();
            addrs_.addAll(other.addrs_);
          }
          onChanged();
        }
      } else {
        if (!other.addrs_.isEmpty()) {
          if (addrsBuilder_.isEmpty()) {
            addrsBuilder_.dispose();
            addrsBuilder_ = null;
            addrs_ = other.addrs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            addrsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAddrsFieldBuilder() : null;
          } else {
            addrsBuilder_.addAllMessages(other.addrs_);
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
      com.alibaba.maxgraph.proto.EndpointsProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.EndpointsProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.alibaba.maxgraph.proto.EndpointProto> addrs_ =
      java.util.Collections.emptyList();
    private void ensureAddrsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        addrs_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.EndpointProto>(addrs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.EndpointProto, com.alibaba.maxgraph.proto.EndpointProto.Builder, com.alibaba.maxgraph.proto.EndpointProtoOrBuilder> addrsBuilder_;

    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.EndpointProto> getAddrsList() {
      if (addrsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(addrs_);
      } else {
        return addrsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public int getAddrsCount() {
      if (addrsBuilder_ == null) {
        return addrs_.size();
      } else {
        return addrsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public com.alibaba.maxgraph.proto.EndpointProto getAddrs(int index) {
      if (addrsBuilder_ == null) {
        return addrs_.get(index);
      } else {
        return addrsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder setAddrs(
        int index, com.alibaba.maxgraph.proto.EndpointProto value) {
      if (addrsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddrsIsMutable();
        addrs_.set(index, value);
        onChanged();
      } else {
        addrsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder setAddrs(
        int index, com.alibaba.maxgraph.proto.EndpointProto.Builder builderForValue) {
      if (addrsBuilder_ == null) {
        ensureAddrsIsMutable();
        addrs_.set(index, builderForValue.build());
        onChanged();
      } else {
        addrsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder addAddrs(com.alibaba.maxgraph.proto.EndpointProto value) {
      if (addrsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddrsIsMutable();
        addrs_.add(value);
        onChanged();
      } else {
        addrsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder addAddrs(
        int index, com.alibaba.maxgraph.proto.EndpointProto value) {
      if (addrsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddrsIsMutable();
        addrs_.add(index, value);
        onChanged();
      } else {
        addrsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder addAddrs(
        com.alibaba.maxgraph.proto.EndpointProto.Builder builderForValue) {
      if (addrsBuilder_ == null) {
        ensureAddrsIsMutable();
        addrs_.add(builderForValue.build());
        onChanged();
      } else {
        addrsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder addAddrs(
        int index, com.alibaba.maxgraph.proto.EndpointProto.Builder builderForValue) {
      if (addrsBuilder_ == null) {
        ensureAddrsIsMutable();
        addrs_.add(index, builderForValue.build());
        onChanged();
      } else {
        addrsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder addAllAddrs(
        java.lang.Iterable<? extends com.alibaba.maxgraph.proto.EndpointProto> values) {
      if (addrsBuilder_ == null) {
        ensureAddrsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, addrs_);
        onChanged();
      } else {
        addrsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder clearAddrs() {
      if (addrsBuilder_ == null) {
        addrs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        addrsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public Builder removeAddrs(int index) {
      if (addrsBuilder_ == null) {
        ensureAddrsIsMutable();
        addrs_.remove(index);
        onChanged();
      } else {
        addrsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public com.alibaba.maxgraph.proto.EndpointProto.Builder getAddrsBuilder(
        int index) {
      return getAddrsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public com.alibaba.maxgraph.proto.EndpointProtoOrBuilder getAddrsOrBuilder(
        int index) {
      if (addrsBuilder_ == null) {
        return addrs_.get(index);  } else {
        return addrsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public java.util.List<? extends com.alibaba.maxgraph.proto.EndpointProtoOrBuilder> 
         getAddrsOrBuilderList() {
      if (addrsBuilder_ != null) {
        return addrsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(addrs_);
      }
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public com.alibaba.maxgraph.proto.EndpointProto.Builder addAddrsBuilder() {
      return getAddrsFieldBuilder().addBuilder(
          com.alibaba.maxgraph.proto.EndpointProto.getDefaultInstance());
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public com.alibaba.maxgraph.proto.EndpointProto.Builder addAddrsBuilder(
        int index) {
      return getAddrsFieldBuilder().addBuilder(
          index, com.alibaba.maxgraph.proto.EndpointProto.getDefaultInstance());
    }
    /**
     * <code>repeated .EndpointProto addrs = 1;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.EndpointProto.Builder> 
         getAddrsBuilderList() {
      return getAddrsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.EndpointProto, com.alibaba.maxgraph.proto.EndpointProto.Builder, com.alibaba.maxgraph.proto.EndpointProtoOrBuilder> 
        getAddrsFieldBuilder() {
      if (addrsBuilder_ == null) {
        addrsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.alibaba.maxgraph.proto.EndpointProto, com.alibaba.maxgraph.proto.EndpointProto.Builder, com.alibaba.maxgraph.proto.EndpointProtoOrBuilder>(
                addrs_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        addrs_ = null;
      }
      return addrsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EndpointsProto)
  }

  // @@protoc_insertion_point(class_scope:EndpointsProto)
  private static final com.alibaba.maxgraph.proto.EndpointsProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.EndpointsProto();
  }

  public static com.alibaba.maxgraph.proto.EndpointsProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EndpointsProto>
      PARSER = new com.google.protobuf.AbstractParser<EndpointsProto>() {
    public EndpointsProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EndpointsProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EndpointsProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EndpointsProto> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.EndpointsProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

