/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.
 *
 * OpenAPI spec version: v1
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
import io.swagger.client.model.Subscription;
import java.io.IOException;

/**
 * The response schema for the getSubscriptionById operation.
 */
@ApiModel(description = "The response schema for the getSubscriptionById operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:52.926+05:00")
public class GetSubscriptionByIdResponse {
  @SerializedName("payload")
  private Subscription payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetSubscriptionByIdResponse payload(Subscription payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getSubscriptionById operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getSubscriptionById operation.")
  public Subscription getPayload() {
    return payload;
  }

  public void setPayload(Subscription payload) {
    this.payload = payload;
  }

  public GetSubscriptionByIdResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * An unexpected condition occurred during the getSubscriptionById operation.
   * @return errors
  **/
  @ApiModelProperty(value = "An unexpected condition occurred during the getSubscriptionById operation.")
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
    GetSubscriptionByIdResponse getSubscriptionByIdResponse = (GetSubscriptionByIdResponse) o;
    return Objects.equals(this.payload, getSubscriptionByIdResponse.payload) &&
        Objects.equals(this.errors, getSubscriptionByIdResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSubscriptionByIdResponse {\n");
    
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

