/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/storage/v2/storage.proto

// Protobuf Java Version: 3.25.5
package com.google.storage.v2;

/**
 *
 *
 * <pre>
 * The owner of a specific resource.
 * </pre>
 *
 * Protobuf type {@code google.storage.v2.Owner}
 */
public final class Owner extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v2.Owner)
    OwnerOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Owner.newBuilder() to construct.
  private Owner(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Owner() {
    entity_ = "";
    entityId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Owner();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v2.StorageProto.internal_static_google_storage_v2_Owner_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_Owner_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v2.Owner.class, com.google.storage.v2.Owner.Builder.class);
  }

  public static final int ENTITY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entity_ = "";
  /**
   *
   *
   * <pre>
   * The entity, in the form `user-`*userId*.
   * </pre>
   *
   * <code>string entity = 1;</code>
   *
   * @return The entity.
   */
  @java.lang.Override
  public java.lang.String getEntity() {
    java.lang.Object ref = entity_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entity_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The entity, in the form `user-`*userId*.
   * </pre>
   *
   * <code>string entity = 1;</code>
   *
   * @return The bytes for entity.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntityBytes() {
    java.lang.Object ref = entity_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entity_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object entityId_ = "";
  /**
   *
   *
   * <pre>
   * The ID for the entity.
   * </pre>
   *
   * <code>string entity_id = 2;</code>
   *
   * @return The entityId.
   */
  @java.lang.Override
  public java.lang.String getEntityId() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID for the entity.
   * </pre>
   *
   * <code>string entity_id = 2;</code>
   *
   * @return The bytes for entityId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEntityIdBytes() {
    java.lang.Object ref = entityId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      entityId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entity_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, entity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, entityId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entity_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, entity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, entityId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.storage.v2.Owner)) {
      return super.equals(obj);
    }
    com.google.storage.v2.Owner other = (com.google.storage.v2.Owner) obj;

    if (!getEntity().equals(other.getEntity())) return false;
    if (!getEntityId().equals(other.getEntityId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENTITY_FIELD_NUMBER;
    hash = (53 * hash) + getEntity().hashCode();
    hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v2.Owner parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.Owner parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.Owner parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.Owner parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.Owner parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.Owner parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.Owner parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.Owner parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.Owner parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.Owner parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.Owner parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.Owner parseFrom(
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

  public static Builder newBuilder(com.google.storage.v2.Owner prototype) {
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
   * The owner of a specific resource.
   * </pre>
   *
   * Protobuf type {@code google.storage.v2.Owner}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v2.Owner)
      com.google.storage.v2.OwnerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v2.StorageProto.internal_static_google_storage_v2_Owner_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_Owner_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v2.Owner.class, com.google.storage.v2.Owner.Builder.class);
    }

    // Construct using com.google.storage.v2.Owner.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entity_ = "";
      entityId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v2.StorageProto.internal_static_google_storage_v2_Owner_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v2.Owner getDefaultInstanceForType() {
      return com.google.storage.v2.Owner.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v2.Owner build() {
      com.google.storage.v2.Owner result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v2.Owner buildPartial() {
      com.google.storage.v2.Owner result = new com.google.storage.v2.Owner(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storage.v2.Owner result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entity_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entityId_ = entityId_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.storage.v2.Owner) {
        return mergeFrom((com.google.storage.v2.Owner) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v2.Owner other) {
      if (other == com.google.storage.v2.Owner.getDefaultInstance()) return this;
      if (!other.getEntity().isEmpty()) {
        entity_ = other.entity_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getEntityId().isEmpty()) {
        entityId_ = other.entityId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                entity_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                entityId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object entity_ = "";
    /**
     *
     *
     * <pre>
     * The entity, in the form `user-`*userId*.
     * </pre>
     *
     * <code>string entity = 1;</code>
     *
     * @return The entity.
     */
    public java.lang.String getEntity() {
      java.lang.Object ref = entity_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entity_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The entity, in the form `user-`*userId*.
     * </pre>
     *
     * <code>string entity = 1;</code>
     *
     * @return The bytes for entity.
     */
    public com.google.protobuf.ByteString getEntityBytes() {
      java.lang.Object ref = entity_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entity_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The entity, in the form `user-`*userId*.
     * </pre>
     *
     * <code>string entity = 1;</code>
     *
     * @param value The entity to set.
     * @return This builder for chaining.
     */
    public Builder setEntity(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The entity, in the form `user-`*userId*.
     * </pre>
     *
     * <code>string entity = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntity() {
      entity_ = getDefaultInstance().getEntity();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The entity, in the form `user-`*userId*.
     * </pre>
     *
     * <code>string entity = 1;</code>
     *
     * @param value The bytes for entity to set.
     * @return This builder for chaining.
     */
    public Builder setEntityBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object entityId_ = "";
    /**
     *
     *
     * <pre>
     * The ID for the entity.
     * </pre>
     *
     * <code>string entity_id = 2;</code>
     *
     * @return The entityId.
     */
    public java.lang.String getEntityId() {
      java.lang.Object ref = entityId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID for the entity.
     * </pre>
     *
     * <code>string entity_id = 2;</code>
     *
     * @return The bytes for entityId.
     */
    public com.google.protobuf.ByteString getEntityIdBytes() {
      java.lang.Object ref = entityId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        entityId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID for the entity.
     * </pre>
     *
     * <code>string entity_id = 2;</code>
     *
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      entityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID for the entity.
     * </pre>
     *
     * <code>string entity_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntityId() {
      entityId_ = getDefaultInstance().getEntityId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID for the entity.
     * </pre>
     *
     * <code>string entity_id = 2;</code>
     *
     * @param value The bytes for entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      entityId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.storage.v2.Owner)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v2.Owner)
  private static final com.google.storage.v2.Owner DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v2.Owner();
  }

  public static com.google.storage.v2.Owner getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Owner> PARSER =
      new com.google.protobuf.AbstractParser<Owner>() {
        @java.lang.Override
        public Owner parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<Owner> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Owner> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v2.Owner getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
