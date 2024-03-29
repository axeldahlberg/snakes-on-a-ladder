// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game-service.proto

package org.ottersnail.soal;

/**
 * Protobuf type {@code GameBoardStatus}
 */
public  final class GameBoardStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GameBoardStatus)
    GameBoardStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GameBoardStatus.newBuilder() to construct.
  private GameBoardStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameBoardStatus() {
    position_ = 0;
    event_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GameBoardStatus(
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
          case 8: {

            position_ = input.readInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            event_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.ottersnail.soal.GameService.internal_static_GameBoardStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.ottersnail.soal.GameService.internal_static_GameBoardStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.ottersnail.soal.GameBoardStatus.class, org.ottersnail.soal.GameBoardStatus.Builder.class);
  }

  public static final int POSITION_FIELD_NUMBER = 1;
  private int position_;
  /**
   * <code>int32 position = 1;</code>
   */
  public int getPosition() {
    return position_;
  }

  public static final int EVENT_FIELD_NUMBER = 2;
  private int event_;
  /**
   * <code>.Event event = 2;</code>
   */
  public int getEventValue() {
    return event_;
  }
  /**
   * <code>.Event event = 2;</code>
   */
  public org.ottersnail.soal.Event getEvent() {
    @SuppressWarnings("deprecation")
    org.ottersnail.soal.Event result = org.ottersnail.soal.Event.valueOf(event_);
    return result == null ? org.ottersnail.soal.Event.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (position_ != 0) {
      output.writeInt32(1, position_);
    }
    if (event_ != org.ottersnail.soal.Event.MOVE.getNumber()) {
      output.writeEnum(2, event_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (position_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, position_);
    }
    if (event_ != org.ottersnail.soal.Event.MOVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, event_);
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
    if (!(obj instanceof org.ottersnail.soal.GameBoardStatus)) {
      return super.equals(obj);
    }
    org.ottersnail.soal.GameBoardStatus other = (org.ottersnail.soal.GameBoardStatus) obj;

    boolean result = true;
    result = result && (getPosition()
        == other.getPosition());
    result = result && event_ == other.event_;
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
    hash = (37 * hash) + POSITION_FIELD_NUMBER;
    hash = (53 * hash) + getPosition();
    hash = (37 * hash) + EVENT_FIELD_NUMBER;
    hash = (53 * hash) + event_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.ottersnail.soal.GameBoardStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ottersnail.soal.GameBoardStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.ottersnail.soal.GameBoardStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.ottersnail.soal.GameBoardStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.ottersnail.soal.GameBoardStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code GameBoardStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GameBoardStatus)
      org.ottersnail.soal.GameBoardStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.ottersnail.soal.GameService.internal_static_GameBoardStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.ottersnail.soal.GameService.internal_static_GameBoardStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.ottersnail.soal.GameBoardStatus.class, org.ottersnail.soal.GameBoardStatus.Builder.class);
    }

    // Construct using org.ottersnail.soal.GameBoardStatus.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      position_ = 0;

      event_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.ottersnail.soal.GameService.internal_static_GameBoardStatus_descriptor;
    }

    @java.lang.Override
    public org.ottersnail.soal.GameBoardStatus getDefaultInstanceForType() {
      return org.ottersnail.soal.GameBoardStatus.getDefaultInstance();
    }

    @java.lang.Override
    public org.ottersnail.soal.GameBoardStatus build() {
      org.ottersnail.soal.GameBoardStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.ottersnail.soal.GameBoardStatus buildPartial() {
      org.ottersnail.soal.GameBoardStatus result = new org.ottersnail.soal.GameBoardStatus(this);
      result.position_ = position_;
      result.event_ = event_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.ottersnail.soal.GameBoardStatus) {
        return mergeFrom((org.ottersnail.soal.GameBoardStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.ottersnail.soal.GameBoardStatus other) {
      if (other == org.ottersnail.soal.GameBoardStatus.getDefaultInstance()) return this;
      if (other.getPosition() != 0) {
        setPosition(other.getPosition());
      }
      if (other.event_ != 0) {
        setEventValue(other.getEventValue());
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
      org.ottersnail.soal.GameBoardStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.ottersnail.soal.GameBoardStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int position_ ;
    /**
     * <code>int32 position = 1;</code>
     */
    public int getPosition() {
      return position_;
    }
    /**
     * <code>int32 position = 1;</code>
     */
    public Builder setPosition(int value) {
      
      position_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 position = 1;</code>
     */
    public Builder clearPosition() {
      
      position_ = 0;
      onChanged();
      return this;
    }

    private int event_ = 0;
    /**
     * <code>.Event event = 2;</code>
     */
    public int getEventValue() {
      return event_;
    }
    /**
     * <code>.Event event = 2;</code>
     */
    public Builder setEventValue(int value) {
      event_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Event event = 2;</code>
     */
    public org.ottersnail.soal.Event getEvent() {
      @SuppressWarnings("deprecation")
      org.ottersnail.soal.Event result = org.ottersnail.soal.Event.valueOf(event_);
      return result == null ? org.ottersnail.soal.Event.UNRECOGNIZED : result;
    }
    /**
     * <code>.Event event = 2;</code>
     */
    public Builder setEvent(org.ottersnail.soal.Event value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      event_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Event event = 2;</code>
     */
    public Builder clearEvent() {
      
      event_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:GameBoardStatus)
  }

  // @@protoc_insertion_point(class_scope:GameBoardStatus)
  private static final org.ottersnail.soal.GameBoardStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.ottersnail.soal.GameBoardStatus();
  }

  public static org.ottersnail.soal.GameBoardStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameBoardStatus>
      PARSER = new com.google.protobuf.AbstractParser<GameBoardStatus>() {
    @java.lang.Override
    public GameBoardStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GameBoardStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GameBoardStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameBoardStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.ottersnail.soal.GameBoardStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

