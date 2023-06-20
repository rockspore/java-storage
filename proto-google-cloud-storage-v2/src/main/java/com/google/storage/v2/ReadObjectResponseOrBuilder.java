/*
 * Copyright 2020 Google LLC
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

package com.google.storage.v2;

public interface ReadObjectResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.ReadObjectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A portion of the data for the object. The service **may** leave `data`
   * empty for any given `ReadResponse`. This enables the service to inform the
   * client that the request is still live while it is running an operation to
   * generate more data.
   * </pre>
   *
   * <code>.google.storage.v2.ChecksummedData checksummed_data = 1;</code>
   *
   * @return Whether the checksummedData field is set.
   */
  boolean hasChecksummedData();
  /**
   *
   *
   * <pre>
   * A portion of the data for the object. The service **may** leave `data`
   * empty for any given `ReadResponse`. This enables the service to inform the
   * client that the request is still live while it is running an operation to
   * generate more data.
   * </pre>
   *
   * <code>.google.storage.v2.ChecksummedData checksummed_data = 1;</code>
   *
   * @return The checksummedData.
   */
  com.google.storage.v2.ChecksummedData getChecksummedData();
  /**
   *
   *
   * <pre>
   * A portion of the data for the object. The service **may** leave `data`
   * empty for any given `ReadResponse`. This enables the service to inform the
   * client that the request is still live while it is running an operation to
   * generate more data.
   * </pre>
   *
   * <code>.google.storage.v2.ChecksummedData checksummed_data = 1;</code>
   */
  com.google.storage.v2.ChecksummedDataOrBuilder getChecksummedDataOrBuilder();

  /**
   *
   *
   * <pre>
   * The checksums of the complete object. If the object is downloaded in full,
   * the client should compute one of these checksums over the downloaded object
   * and compare it against the value provided here.
   * </pre>
   *
   * <code>.google.storage.v2.ObjectChecksums object_checksums = 2;</code>
   *
   * @return Whether the objectChecksums field is set.
   */
  boolean hasObjectChecksums();
  /**
   *
   *
   * <pre>
   * The checksums of the complete object. If the object is downloaded in full,
   * the client should compute one of these checksums over the downloaded object
   * and compare it against the value provided here.
   * </pre>
   *
   * <code>.google.storage.v2.ObjectChecksums object_checksums = 2;</code>
   *
   * @return The objectChecksums.
   */
  com.google.storage.v2.ObjectChecksums getObjectChecksums();
  /**
   *
   *
   * <pre>
   * The checksums of the complete object. If the object is downloaded in full,
   * the client should compute one of these checksums over the downloaded object
   * and compare it against the value provided here.
   * </pre>
   *
   * <code>.google.storage.v2.ObjectChecksums object_checksums = 2;</code>
   */
  com.google.storage.v2.ObjectChecksumsOrBuilder getObjectChecksumsOrBuilder();

  /**
   *
   *
   * <pre>
   * If read_offset and or read_limit was specified on the
   * ReadObjectRequest, ContentRange will be populated on the first
   * ReadObjectResponse message of the read stream.
   * </pre>
   *
   * <code>.google.storage.v2.ContentRange content_range = 3;</code>
   *
   * @return Whether the contentRange field is set.
   */
  boolean hasContentRange();
  /**
   *
   *
   * <pre>
   * If read_offset and or read_limit was specified on the
   * ReadObjectRequest, ContentRange will be populated on the first
   * ReadObjectResponse message of the read stream.
   * </pre>
   *
   * <code>.google.storage.v2.ContentRange content_range = 3;</code>
   *
   * @return The contentRange.
   */
  com.google.storage.v2.ContentRange getContentRange();
  /**
   *
   *
   * <pre>
   * If read_offset and or read_limit was specified on the
   * ReadObjectRequest, ContentRange will be populated on the first
   * ReadObjectResponse message of the read stream.
   * </pre>
   *
   * <code>.google.storage.v2.ContentRange content_range = 3;</code>
   */
  com.google.storage.v2.ContentRangeOrBuilder getContentRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Metadata of the object whose media is being returned.
   * Only populated in the first response in the stream.
   * </pre>
   *
   * <code>.google.storage.v2.Object metadata = 4;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Metadata of the object whose media is being returned.
   * Only populated in the first response in the stream.
   * </pre>
   *
   * <code>.google.storage.v2.Object metadata = 4;</code>
   *
   * @return The metadata.
   */
  com.google.storage.v2.Object getMetadata();
  /**
   *
   *
   * <pre>
   * Metadata of the object whose media is being returned.
   * Only populated in the first response in the stream.
   * </pre>
   *
   * <code>.google.storage.v2.Object metadata = 4;</code>
   */
  com.google.storage.v2.ObjectOrBuilder getMetadataOrBuilder();
}
