// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: debug.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf type {@code StoreTestResponse}
 */
public  final class StoreTestResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StoreTestResponse)
    StoreTestResponseOrBuilder {
  // Use StoreTestResponse.newBuilder() to construct.
  private StoreTestResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoreTestResponse() {
    vertices_ = java.util.Collections.emptyList();
    edges_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StoreTestResponse(
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
              vertices_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.StoreTestVertex>();
              mutable_bitField0_ |= 0x00000001;
            }
            vertices_.add(
                input.readMessage(com.alibaba.maxgraph.proto.StoreTestVertex.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              edges_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.StoreTestEdge>();
              mutable_bitField0_ |= 0x00000002;
            }
            edges_.add(
                input.readMessage(com.alibaba.maxgraph.proto.StoreTestEdge.parser(), extensionRegistry));
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
        vertices_ = java.util.Collections.unmodifiableList(vertices_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        edges_ = java.util.Collections.unmodifiableList(edges_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.Debug.internal_static_StoreTestResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.maxgraph.proto.Debug.internal_static_StoreTestResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.maxgraph.proto.StoreTestResponse.class, com.alibaba.maxgraph.proto.StoreTestResponse.Builder.class);
  }

  public static final int VERTICES_FIELD_NUMBER = 1;
  private java.util.List<com.alibaba.maxgraph.proto.StoreTestVertex> vertices_;
  /**
   * <code>repeated .StoreTestVertex vertices = 1;</code>
   */
  public java.util.List<com.alibaba.maxgraph.proto.StoreTestVertex> getVerticesList() {
    return vertices_;
  }
  /**
   * <code>repeated .StoreTestVertex vertices = 1;</code>
   */
  public java.util.List<? extends com.alibaba.maxgraph.proto.StoreTestVertexOrBuilder> 
      getVerticesOrBuilderList() {
    return vertices_;
  }
  /**
   * <code>repeated .StoreTestVertex vertices = 1;</code>
   */
  public int getVerticesCount() {
    return vertices_.size();
  }
  /**
   * <code>repeated .StoreTestVertex vertices = 1;</code>
   */
  public com.alibaba.maxgraph.proto.StoreTestVertex getVertices(int index) {
    return vertices_.get(index);
  }
  /**
   * <code>repeated .StoreTestVertex vertices = 1;</code>
   */
  public com.alibaba.maxgraph.proto.StoreTestVertexOrBuilder getVerticesOrBuilder(
      int index) {
    return vertices_.get(index);
  }

  public static final int EDGES_FIELD_NUMBER = 2;
  private java.util.List<com.alibaba.maxgraph.proto.StoreTestEdge> edges_;
  /**
   * <code>repeated .StoreTestEdge edges = 2;</code>
   */
  public java.util.List<com.alibaba.maxgraph.proto.StoreTestEdge> getEdgesList() {
    return edges_;
  }
  /**
   * <code>repeated .StoreTestEdge edges = 2;</code>
   */
  public java.util.List<? extends com.alibaba.maxgraph.proto.StoreTestEdgeOrBuilder> 
      getEdgesOrBuilderList() {
    return edges_;
  }
  /**
   * <code>repeated .StoreTestEdge edges = 2;</code>
   */
  public int getEdgesCount() {
    return edges_.size();
  }
  /**
   * <code>repeated .StoreTestEdge edges = 2;</code>
   */
  public com.alibaba.maxgraph.proto.StoreTestEdge getEdges(int index) {
    return edges_.get(index);
  }
  /**
   * <code>repeated .StoreTestEdge edges = 2;</code>
   */
  public com.alibaba.maxgraph.proto.StoreTestEdgeOrBuilder getEdgesOrBuilder(
      int index) {
    return edges_.get(index);
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
    for (int i = 0; i < vertices_.size(); i++) {
      output.writeMessage(1, vertices_.get(i));
    }
    for (int i = 0; i < edges_.size(); i++) {
      output.writeMessage(2, edges_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < vertices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, vertices_.get(i));
    }
    for (int i = 0; i < edges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, edges_.get(i));
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
    if (!(obj instanceof com.alibaba.maxgraph.proto.StoreTestResponse)) {
      return super.equals(obj);
    }
    com.alibaba.maxgraph.proto.StoreTestResponse other = (com.alibaba.maxgraph.proto.StoreTestResponse) obj;

    boolean result = true;
    result = result && getVerticesList()
        .equals(other.getVerticesList());
    result = result && getEdgesList()
        .equals(other.getEdgesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getVerticesCount() > 0) {
      hash = (37 * hash) + VERTICES_FIELD_NUMBER;
      hash = (53 * hash) + getVerticesList().hashCode();
    }
    if (getEdgesCount() > 0) {
      hash = (37 * hash) + EDGES_FIELD_NUMBER;
      hash = (53 * hash) + getEdgesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.maxgraph.proto.StoreTestResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.maxgraph.proto.StoreTestResponse parseFrom(
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
  public static Builder newBuilder(com.alibaba.maxgraph.proto.StoreTestResponse prototype) {
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
   * Protobuf type {@code StoreTestResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StoreTestResponse)
      com.alibaba.maxgraph.proto.StoreTestResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_StoreTestResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_StoreTestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.maxgraph.proto.StoreTestResponse.class, com.alibaba.maxgraph.proto.StoreTestResponse.Builder.class);
    }

    // Construct using com.alibaba.maxgraph.proto.StoreTestResponse.newBuilder()
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
        getVerticesFieldBuilder();
        getEdgesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (verticesBuilder_ == null) {
        vertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        verticesBuilder_.clear();
      }
      if (edgesBuilder_ == null) {
        edges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        edgesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.maxgraph.proto.Debug.internal_static_StoreTestResponse_descriptor;
    }

    public com.alibaba.maxgraph.proto.StoreTestResponse getDefaultInstanceForType() {
      return com.alibaba.maxgraph.proto.StoreTestResponse.getDefaultInstance();
    }

    public com.alibaba.maxgraph.proto.StoreTestResponse build() {
      com.alibaba.maxgraph.proto.StoreTestResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.alibaba.maxgraph.proto.StoreTestResponse buildPartial() {
      com.alibaba.maxgraph.proto.StoreTestResponse result = new com.alibaba.maxgraph.proto.StoreTestResponse(this);
      int from_bitField0_ = bitField0_;
      if (verticesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          vertices_ = java.util.Collections.unmodifiableList(vertices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vertices_ = vertices_;
      } else {
        result.vertices_ = verticesBuilder_.build();
      }
      if (edgesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          edges_ = java.util.Collections.unmodifiableList(edges_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.edges_ = edges_;
      } else {
        result.edges_ = edgesBuilder_.build();
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
      if (other instanceof com.alibaba.maxgraph.proto.StoreTestResponse) {
        return mergeFrom((com.alibaba.maxgraph.proto.StoreTestResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.maxgraph.proto.StoreTestResponse other) {
      if (other == com.alibaba.maxgraph.proto.StoreTestResponse.getDefaultInstance()) return this;
      if (verticesBuilder_ == null) {
        if (!other.vertices_.isEmpty()) {
          if (vertices_.isEmpty()) {
            vertices_ = other.vertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVerticesIsMutable();
            vertices_.addAll(other.vertices_);
          }
          onChanged();
        }
      } else {
        if (!other.vertices_.isEmpty()) {
          if (verticesBuilder_.isEmpty()) {
            verticesBuilder_.dispose();
            verticesBuilder_ = null;
            vertices_ = other.vertices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            verticesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVerticesFieldBuilder() : null;
          } else {
            verticesBuilder_.addAllMessages(other.vertices_);
          }
        }
      }
      if (edgesBuilder_ == null) {
        if (!other.edges_.isEmpty()) {
          if (edges_.isEmpty()) {
            edges_ = other.edges_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureEdgesIsMutable();
            edges_.addAll(other.edges_);
          }
          onChanged();
        }
      } else {
        if (!other.edges_.isEmpty()) {
          if (edgesBuilder_.isEmpty()) {
            edgesBuilder_.dispose();
            edgesBuilder_ = null;
            edges_ = other.edges_;
            bitField0_ = (bitField0_ & ~0x00000002);
            edgesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEdgesFieldBuilder() : null;
          } else {
            edgesBuilder_.addAllMessages(other.edges_);
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
      com.alibaba.maxgraph.proto.StoreTestResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.maxgraph.proto.StoreTestResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.alibaba.maxgraph.proto.StoreTestVertex> vertices_ =
      java.util.Collections.emptyList();
    private void ensureVerticesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        vertices_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.StoreTestVertex>(vertices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.StoreTestVertex, com.alibaba.maxgraph.proto.StoreTestVertex.Builder, com.alibaba.maxgraph.proto.StoreTestVertexOrBuilder> verticesBuilder_;

    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.StoreTestVertex> getVerticesList() {
      if (verticesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vertices_);
      } else {
        return verticesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public int getVerticesCount() {
      if (verticesBuilder_ == null) {
        return vertices_.size();
      } else {
        return verticesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestVertex getVertices(int index) {
      if (verticesBuilder_ == null) {
        return vertices_.get(index);
      } else {
        return verticesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder setVertices(
        int index, com.alibaba.maxgraph.proto.StoreTestVertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.set(index, value);
        onChanged();
      } else {
        verticesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder setVertices(
        int index, com.alibaba.maxgraph.proto.StoreTestVertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.set(index, builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder addVertices(com.alibaba.maxgraph.proto.StoreTestVertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.add(value);
        onChanged();
      } else {
        verticesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder addVertices(
        int index, com.alibaba.maxgraph.proto.StoreTestVertex value) {
      if (verticesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVerticesIsMutable();
        vertices_.add(index, value);
        onChanged();
      } else {
        verticesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder addVertices(
        com.alibaba.maxgraph.proto.StoreTestVertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.add(builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder addVertices(
        int index, com.alibaba.maxgraph.proto.StoreTestVertex.Builder builderForValue) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.add(index, builderForValue.build());
        onChanged();
      } else {
        verticesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder addAllVertices(
        java.lang.Iterable<? extends com.alibaba.maxgraph.proto.StoreTestVertex> values) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, vertices_);
        onChanged();
      } else {
        verticesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder clearVertices() {
      if (verticesBuilder_ == null) {
        vertices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        verticesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public Builder removeVertices(int index) {
      if (verticesBuilder_ == null) {
        ensureVerticesIsMutable();
        vertices_.remove(index);
        onChanged();
      } else {
        verticesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestVertex.Builder getVerticesBuilder(
        int index) {
      return getVerticesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestVertexOrBuilder getVerticesOrBuilder(
        int index) {
      if (verticesBuilder_ == null) {
        return vertices_.get(index);  } else {
        return verticesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public java.util.List<? extends com.alibaba.maxgraph.proto.StoreTestVertexOrBuilder> 
         getVerticesOrBuilderList() {
      if (verticesBuilder_ != null) {
        return verticesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vertices_);
      }
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestVertex.Builder addVerticesBuilder() {
      return getVerticesFieldBuilder().addBuilder(
          com.alibaba.maxgraph.proto.StoreTestVertex.getDefaultInstance());
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestVertex.Builder addVerticesBuilder(
        int index) {
      return getVerticesFieldBuilder().addBuilder(
          index, com.alibaba.maxgraph.proto.StoreTestVertex.getDefaultInstance());
    }
    /**
     * <code>repeated .StoreTestVertex vertices = 1;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.StoreTestVertex.Builder> 
         getVerticesBuilderList() {
      return getVerticesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.StoreTestVertex, com.alibaba.maxgraph.proto.StoreTestVertex.Builder, com.alibaba.maxgraph.proto.StoreTestVertexOrBuilder> 
        getVerticesFieldBuilder() {
      if (verticesBuilder_ == null) {
        verticesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.alibaba.maxgraph.proto.StoreTestVertex, com.alibaba.maxgraph.proto.StoreTestVertex.Builder, com.alibaba.maxgraph.proto.StoreTestVertexOrBuilder>(
                vertices_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        vertices_ = null;
      }
      return verticesBuilder_;
    }

    private java.util.List<com.alibaba.maxgraph.proto.StoreTestEdge> edges_ =
      java.util.Collections.emptyList();
    private void ensureEdgesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        edges_ = new java.util.ArrayList<com.alibaba.maxgraph.proto.StoreTestEdge>(edges_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.StoreTestEdge, com.alibaba.maxgraph.proto.StoreTestEdge.Builder, com.alibaba.maxgraph.proto.StoreTestEdgeOrBuilder> edgesBuilder_;

    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.StoreTestEdge> getEdgesList() {
      if (edgesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(edges_);
      } else {
        return edgesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public int getEdgesCount() {
      if (edgesBuilder_ == null) {
        return edges_.size();
      } else {
        return edgesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestEdge getEdges(int index) {
      if (edgesBuilder_ == null) {
        return edges_.get(index);
      } else {
        return edgesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder setEdges(
        int index, com.alibaba.maxgraph.proto.StoreTestEdge value) {
      if (edgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgesIsMutable();
        edges_.set(index, value);
        onChanged();
      } else {
        edgesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder setEdges(
        int index, com.alibaba.maxgraph.proto.StoreTestEdge.Builder builderForValue) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        edges_.set(index, builderForValue.build());
        onChanged();
      } else {
        edgesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder addEdges(com.alibaba.maxgraph.proto.StoreTestEdge value) {
      if (edgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgesIsMutable();
        edges_.add(value);
        onChanged();
      } else {
        edgesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder addEdges(
        int index, com.alibaba.maxgraph.proto.StoreTestEdge value) {
      if (edgesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEdgesIsMutable();
        edges_.add(index, value);
        onChanged();
      } else {
        edgesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder addEdges(
        com.alibaba.maxgraph.proto.StoreTestEdge.Builder builderForValue) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        edges_.add(builderForValue.build());
        onChanged();
      } else {
        edgesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder addEdges(
        int index, com.alibaba.maxgraph.proto.StoreTestEdge.Builder builderForValue) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        edges_.add(index, builderForValue.build());
        onChanged();
      } else {
        edgesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder addAllEdges(
        java.lang.Iterable<? extends com.alibaba.maxgraph.proto.StoreTestEdge> values) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, edges_);
        onChanged();
      } else {
        edgesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder clearEdges() {
      if (edgesBuilder_ == null) {
        edges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        edgesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public Builder removeEdges(int index) {
      if (edgesBuilder_ == null) {
        ensureEdgesIsMutable();
        edges_.remove(index);
        onChanged();
      } else {
        edgesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestEdge.Builder getEdgesBuilder(
        int index) {
      return getEdgesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestEdgeOrBuilder getEdgesOrBuilder(
        int index) {
      if (edgesBuilder_ == null) {
        return edges_.get(index);  } else {
        return edgesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public java.util.List<? extends com.alibaba.maxgraph.proto.StoreTestEdgeOrBuilder> 
         getEdgesOrBuilderList() {
      if (edgesBuilder_ != null) {
        return edgesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(edges_);
      }
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestEdge.Builder addEdgesBuilder() {
      return getEdgesFieldBuilder().addBuilder(
          com.alibaba.maxgraph.proto.StoreTestEdge.getDefaultInstance());
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public com.alibaba.maxgraph.proto.StoreTestEdge.Builder addEdgesBuilder(
        int index) {
      return getEdgesFieldBuilder().addBuilder(
          index, com.alibaba.maxgraph.proto.StoreTestEdge.getDefaultInstance());
    }
    /**
     * <code>repeated .StoreTestEdge edges = 2;</code>
     */
    public java.util.List<com.alibaba.maxgraph.proto.StoreTestEdge.Builder> 
         getEdgesBuilderList() {
      return getEdgesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.alibaba.maxgraph.proto.StoreTestEdge, com.alibaba.maxgraph.proto.StoreTestEdge.Builder, com.alibaba.maxgraph.proto.StoreTestEdgeOrBuilder> 
        getEdgesFieldBuilder() {
      if (edgesBuilder_ == null) {
        edgesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.alibaba.maxgraph.proto.StoreTestEdge, com.alibaba.maxgraph.proto.StoreTestEdge.Builder, com.alibaba.maxgraph.proto.StoreTestEdgeOrBuilder>(
                edges_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        edges_ = null;
      }
      return edgesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:StoreTestResponse)
  }

  // @@protoc_insertion_point(class_scope:StoreTestResponse)
  private static final com.alibaba.maxgraph.proto.StoreTestResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.maxgraph.proto.StoreTestResponse();
  }

  public static com.alibaba.maxgraph.proto.StoreTestResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoreTestResponse>
      PARSER = new com.google.protobuf.AbstractParser<StoreTestResponse>() {
    public StoreTestResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StoreTestResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StoreTestResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoreTestResponse> getParserForType() {
    return PARSER;
  }

  public com.alibaba.maxgraph.proto.StoreTestResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

