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

public interface DeleteObjectRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.storage.v2.DeleteObjectRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the bucket in which the object resides.
   * </pre>
   *
   * <code>
   * string bucket = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * Required. Name of the bucket in which the object resides.
   * </pre>
   *
   * <code>
   * string bucket = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the finalized object to delete.
   * Note: If you want to delete an unfinalized resumable upload please use
   * `CancelResumableWrite`.
   * </pre>
   *
   * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The object.
   */
  java.lang.String getObject();
  /**
   *
   *
   * <pre>
   * Required. The name of the finalized object to delete.
   * Note: If you want to delete an unfinalized resumable upload please use
   * `CancelResumableWrite`.
   * </pre>
   *
   * <code>string object = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for object.
   */
  com.google.protobuf.ByteString getObjectBytes();

  /**
   *
   *
   * <pre>
   * If present, permanently deletes a specific revision of this object (as
   * opposed to the latest version, the default).
   * </pre>
   *
   * <code>int64 generation = 4;</code>
   *
   * @return The generation.
   */
  long getGeneration();

  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current generation
   * matches the given value. Setting to 0 makes the operation succeed only if
   * there are no live versions of the object.
   * </pre>
   *
   * <code>optional int64 if_generation_match = 5;</code>
   *
   * @return Whether the ifGenerationMatch field is set.
   */
  boolean hasIfGenerationMatch();
  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current generation
   * matches the given value. Setting to 0 makes the operation succeed only if
   * there are no live versions of the object.
   * </pre>
   *
   * <code>optional int64 if_generation_match = 5;</code>
   *
   * @return The ifGenerationMatch.
   */
  long getIfGenerationMatch();

  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's live generation
   * does not match the given value. If no live object exists, the precondition
   * fails. Setting to 0 makes the operation succeed only if there is a live
   * version of the object.
   * </pre>
   *
   * <code>optional int64 if_generation_not_match = 6;</code>
   *
   * @return Whether the ifGenerationNotMatch field is set.
   */
  boolean hasIfGenerationNotMatch();
  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's live generation
   * does not match the given value. If no live object exists, the precondition
   * fails. Setting to 0 makes the operation succeed only if there is a live
   * version of the object.
   * </pre>
   *
   * <code>optional int64 if_generation_not_match = 6;</code>
   *
   * @return The ifGenerationNotMatch.
   */
  long getIfGenerationNotMatch();

  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current
   * metageneration matches the given value.
   * </pre>
   *
   * <code>optional int64 if_metageneration_match = 7;</code>
   *
   * @return Whether the ifMetagenerationMatch field is set.
   */
  boolean hasIfMetagenerationMatch();
  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current
   * metageneration matches the given value.
   * </pre>
   *
   * <code>optional int64 if_metageneration_match = 7;</code>
   *
   * @return The ifMetagenerationMatch.
   */
  long getIfMetagenerationMatch();

  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current
   * metageneration does not match the given value.
   * </pre>
   *
   * <code>optional int64 if_metageneration_not_match = 8;</code>
   *
   * @return Whether the ifMetagenerationNotMatch field is set.
   */
  boolean hasIfMetagenerationNotMatch();
  /**
   *
   *
   * <pre>
   * Makes the operation conditional on whether the object's current
   * metageneration does not match the given value.
   * </pre>
   *
   * <code>optional int64 if_metageneration_not_match = 8;</code>
   *
   * @return The ifMetagenerationNotMatch.
   */
  long getIfMetagenerationNotMatch();

  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 10;</code>
   *
   * @return Whether the commonObjectRequestParams field is set.
   */
  boolean hasCommonObjectRequestParams();
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 10;</code>
   *
   * @return The commonObjectRequestParams.
   */
  com.google.storage.v2.CommonObjectRequestParams getCommonObjectRequestParams();
  /**
   *
   *
   * <pre>
   * A set of parameters common to Storage API requests concerning an object.
   * </pre>
   *
   * <code>.google.storage.v2.CommonObjectRequestParams common_object_request_params = 10;</code>
   */
  com.google.storage.v2.CommonObjectRequestParamsOrBuilder getCommonObjectRequestParamsOrBuilder();
}
