// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 *
 *
 * <pre>
 * Request to retrieve a list of media items.
 * </pre>
 *
 * Protobuf type {@code google.photos.library.v1.BatchGetMediaItemsRequest}
 */
public final class BatchGetMediaItemsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.photos.library.v1.BatchGetMediaItemsRequest)
    BatchGetMediaItemsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchGetMediaItemsRequest.newBuilder() to construct.
  private BatchGetMediaItemsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchGetMediaItemsRequest() {
    mediaItemIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchGetMediaItemsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                mediaItemIds_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              mediaItemIds_.add(s);
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        mediaItemIds_ = mediaItemIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_BatchGetMediaItemsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.photos.library.v1.proto.LibraryServiceProto
        .internal_static_google_photos_library_v1_BatchGetMediaItemsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.photos.library.v1.proto.BatchGetMediaItemsRequest.class,
            com.google.photos.library.v1.proto.BatchGetMediaItemsRequest.Builder.class);
  }

  public static final int MEDIA_ITEM_IDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList mediaItemIds_;
  /**
   *
   *
   * <pre>
   * Identifiers of the media items to be requested.
   * Must not contain repeated identifiers and cannot be empty. The maximum
   * number of media items that can be retrieved in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList getMediaItemIdsList() {
    return mediaItemIds_;
  }
  /**
   *
   *
   * <pre>
   * Identifiers of the media items to be requested.
   * Must not contain repeated identifiers and cannot be empty. The maximum
   * number of media items that can be retrieved in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   */
  public int getMediaItemIdsCount() {
    return mediaItemIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Identifiers of the media items to be requested.
   * Must not contain repeated identifiers and cannot be empty. The maximum
   * number of media items that can be retrieved in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   */
  public java.lang.String getMediaItemIds(int index) {
    return mediaItemIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Identifiers of the media items to be requested.
   * Must not contain repeated identifiers and cannot be empty. The maximum
   * number of media items that can be retrieved in one call is 50.
   * </pre>
   *
   * <code>repeated string media_item_ids = 1;</code>
   */
  public com.google.protobuf.ByteString getMediaItemIdsBytes(int index) {
    return mediaItemIds_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < mediaItemIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mediaItemIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < mediaItemIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(mediaItemIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMediaItemIdsList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.photos.library.v1.proto.BatchGetMediaItemsRequest)) {
      return super.equals(obj);
    }
    com.google.photos.library.v1.proto.BatchGetMediaItemsRequest other =
        (com.google.photos.library.v1.proto.BatchGetMediaItemsRequest) obj;

    boolean result = true;
    result = result && getMediaItemIdsList().equals(other.getMediaItemIdsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMediaItemIdsCount() > 0) {
      hash = (37 * hash) + MEDIA_ITEM_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getMediaItemIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.photos.library.v1.proto.BatchGetMediaItemsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request to retrieve a list of media items.
   * </pre>
   *
   * Protobuf type {@code google.photos.library.v1.BatchGetMediaItemsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.photos.library.v1.BatchGetMediaItemsRequest)
      com.google.photos.library.v1.proto.BatchGetMediaItemsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_BatchGetMediaItemsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_BatchGetMediaItemsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.photos.library.v1.proto.BatchGetMediaItemsRequest.class,
              com.google.photos.library.v1.proto.BatchGetMediaItemsRequest.Builder.class);
    }

    // Construct using com.google.photos.library.v1.proto.BatchGetMediaItemsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      mediaItemIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.photos.library.v1.proto.LibraryServiceProto
          .internal_static_google_photos_library_v1_BatchGetMediaItemsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.BatchGetMediaItemsRequest
        getDefaultInstanceForType() {
      return com.google.photos.library.v1.proto.BatchGetMediaItemsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.BatchGetMediaItemsRequest build() {
      com.google.photos.library.v1.proto.BatchGetMediaItemsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.BatchGetMediaItemsRequest buildPartial() {
      com.google.photos.library.v1.proto.BatchGetMediaItemsRequest result =
          new com.google.photos.library.v1.proto.BatchGetMediaItemsRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        mediaItemIds_ = mediaItemIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.mediaItemIds_ = mediaItemIds_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.photos.library.v1.proto.BatchGetMediaItemsRequest) {
        return mergeFrom((com.google.photos.library.v1.proto.BatchGetMediaItemsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.photos.library.v1.proto.BatchGetMediaItemsRequest other) {
      if (other
          == com.google.photos.library.v1.proto.BatchGetMediaItemsRequest.getDefaultInstance())
        return this;
      if (!other.mediaItemIds_.isEmpty()) {
        if (mediaItemIds_.isEmpty()) {
          mediaItemIds_ = other.mediaItemIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMediaItemIdsIsMutable();
          mediaItemIds_.addAll(other.mediaItemIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.photos.library.v1.proto.BatchGetMediaItemsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.photos.library.v1.proto.BatchGetMediaItemsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList mediaItemIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureMediaItemIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        mediaItemIds_ = new com.google.protobuf.LazyStringArrayList(mediaItemIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList getMediaItemIdsList() {
      return mediaItemIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public int getMediaItemIdsCount() {
      return mediaItemIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public java.lang.String getMediaItemIds(int index) {
      return mediaItemIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public com.google.protobuf.ByteString getMediaItemIdsBytes(int index) {
      return mediaItemIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public Builder setMediaItemIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMediaItemIdsIsMutable();
      mediaItemIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public Builder addMediaItemIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMediaItemIdsIsMutable();
      mediaItemIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public Builder addAllMediaItemIds(java.lang.Iterable<java.lang.String> values) {
      ensureMediaItemIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, mediaItemIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public Builder clearMediaItemIds() {
      mediaItemIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifiers of the media items to be requested.
     * Must not contain repeated identifiers and cannot be empty. The maximum
     * number of media items that can be retrieved in one call is 50.
     * </pre>
     *
     * <code>repeated string media_item_ids = 1;</code>
     */
    public Builder addMediaItemIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureMediaItemIdsIsMutable();
      mediaItemIds_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.photos.library.v1.BatchGetMediaItemsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.photos.library.v1.BatchGetMediaItemsRequest)
  private static final com.google.photos.library.v1.proto.BatchGetMediaItemsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.BatchGetMediaItemsRequest();
  }

  public static com.google.photos.library.v1.proto.BatchGetMediaItemsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchGetMediaItemsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchGetMediaItemsRequest>() {
        @java.lang.Override
        public BatchGetMediaItemsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchGetMediaItemsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchGetMediaItemsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchGetMediaItemsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.photos.library.v1.proto.BatchGetMediaItemsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}