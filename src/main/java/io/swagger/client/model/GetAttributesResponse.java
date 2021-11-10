/*
 * Selling Partner API for Messaging
 * With the Messaging API you can build applications that send messages to buyers. You can get a list of message types that are available for an order that you specify, then call an operation that sends a message to the buyer for that order. The Messaging API returns responses that are formed according to the <a href=https://tools.ietf.org/html/draft-kelly-json-hal-08>JSON Hypertext Application Language</a> (HAL) standard.
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
import io.swagger.client.model.GetAttributesResponseBuyer;
import java.io.IOException;

/**
 * The response schema for the GetAttributes operation.
 */
@ApiModel(description = "The response schema for the GetAttributes operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:50.009+05:00")
public class GetAttributesResponse {
  @SerializedName("buyer")
  private GetAttributesResponseBuyer buyer = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetAttributesResponse buyer(GetAttributesResponseBuyer buyer) {
    this.buyer = buyer;
    return this;
  }

   /**
   * Get buyer
   * @return buyer
  **/
  @ApiModelProperty(value = "")
  public GetAttributesResponseBuyer getBuyer() {
    return buyer;
  }

  public void setBuyer(GetAttributesResponseBuyer buyer) {
    this.buyer = buyer;
  }

  public GetAttributesResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
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
    GetAttributesResponse getAttributesResponse = (GetAttributesResponse) o;
    return Objects.equals(this.buyer, getAttributesResponse.buyer) &&
        Objects.equals(this.errors, getAttributesResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyer, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttributesResponse {\n");
    
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
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

