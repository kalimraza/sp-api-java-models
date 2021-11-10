/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ContentDocument;
import io.swagger.client.model.ContentMetadata;
import java.io.IOException;

/**
 * A content document with additional information for content management.
 */
@ApiModel(description = "A content document with additional information for content management.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:18.330+05:00")
public class ContentRecord {
  @SerializedName("contentReferenceKey")
  private String contentReferenceKey = null;

  @SerializedName("contentMetadata")
  private ContentMetadata contentMetadata = null;

  @SerializedName("contentDocument")
  private ContentDocument contentDocument = null;

  public ContentRecord contentReferenceKey(String contentReferenceKey) {
    this.contentReferenceKey = contentReferenceKey;
    return this;
  }

   /**
   * Get contentReferenceKey
   * @return contentReferenceKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getContentReferenceKey() {
    return contentReferenceKey;
  }

  public void setContentReferenceKey(String contentReferenceKey) {
    this.contentReferenceKey = contentReferenceKey;
  }

  public ContentRecord contentMetadata(ContentMetadata contentMetadata) {
    this.contentMetadata = contentMetadata;
    return this;
  }

   /**
   * Get contentMetadata
   * @return contentMetadata
  **/
  @ApiModelProperty(value = "")
  public ContentMetadata getContentMetadata() {
    return contentMetadata;
  }

  public void setContentMetadata(ContentMetadata contentMetadata) {
    this.contentMetadata = contentMetadata;
  }

  public ContentRecord contentDocument(ContentDocument contentDocument) {
    this.contentDocument = contentDocument;
    return this;
  }

   /**
   * Get contentDocument
   * @return contentDocument
  **/
  @ApiModelProperty(value = "")
  public ContentDocument getContentDocument() {
    return contentDocument;
  }

  public void setContentDocument(ContentDocument contentDocument) {
    this.contentDocument = contentDocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentRecord contentRecord = (ContentRecord) o;
    return Objects.equals(this.contentReferenceKey, contentRecord.contentReferenceKey) &&
        Objects.equals(this.contentMetadata, contentRecord.contentMetadata) &&
        Objects.equals(this.contentDocument, contentRecord.contentDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentReferenceKey, contentMetadata, contentDocument);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentRecord {\n");
    
    sb.append("    contentReferenceKey: ").append(toIndentedString(contentReferenceKey)).append("\n");
    sb.append("    contentMetadata: ").append(toIndentedString(contentMetadata)).append("\n");
    sb.append("    contentDocument: ").append(toIndentedString(contentDocument)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

