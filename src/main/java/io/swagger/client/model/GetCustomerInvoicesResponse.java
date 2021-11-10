/*
 * Selling Partner API for Direct Fulfillment Shipping
 * The Selling Partner API for Direct Fulfillment Shipping provides programmatic access to a direct fulfillment vendor's shipping data.
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
import io.swagger.client.model.CustomerInvoiceList;
import io.swagger.client.model.ErrorList;
import java.io.IOException;

/**
 * The response schema for the getCustomerInvoices operation.
 */
@ApiModel(description = "The response schema for the getCustomerInvoices operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:25.171+05:00")
public class GetCustomerInvoicesResponse {
  @SerializedName("payload")
  private CustomerInvoiceList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetCustomerInvoicesResponse payload(CustomerInvoiceList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * List of customer invoices.
   * @return payload
  **/
  @ApiModelProperty(value = "List of customer invoices.")
  public CustomerInvoiceList getPayload() {
    return payload;
  }

  public void setPayload(CustomerInvoiceList payload) {
    this.payload = payload;
  }

  public GetCustomerInvoicesResponse errors(ErrorList errors) {
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
    GetCustomerInvoicesResponse getCustomerInvoicesResponse = (GetCustomerInvoicesResponse) o;
    return Objects.equals(this.payload, getCustomerInvoicesResponse.payload) &&
        Objects.equals(this.errors, getCustomerInvoicesResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCustomerInvoicesResponse {\n");
    
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

