/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
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
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.GetFulfillmentPreviewResult;
import java.io.IOException;

/**
 * The response schema for the getFulfillmentPreview operation.
 */
@ApiModel(description = "The response schema for the getFulfillmentPreview operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:37.300+05:00")
public class GetFulfillmentPreviewResponse {
  @SerializedName("payload")
  private GetFulfillmentPreviewResult payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetFulfillmentPreviewResponse payload(GetFulfillmentPreviewResult payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The response payload for the getFulfillmentPreview operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The response payload for the getFulfillmentPreview operation.")
  public GetFulfillmentPreviewResult getPayload() {
    return payload;
  }

  public void setPayload(GetFulfillmentPreviewResult payload) {
    this.payload = payload;
  }

  public GetFulfillmentPreviewResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the getFulfillmentPreview operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the getFulfillmentPreview operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFulfillmentPreviewResponse getFulfillmentPreviewResponse = (GetFulfillmentPreviewResponse) o;
    return Objects.equals(this.payload, getFulfillmentPreviewResponse.payload) &&
        Objects.equals(this.errors, getFulfillmentPreviewResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFulfillmentPreviewResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
