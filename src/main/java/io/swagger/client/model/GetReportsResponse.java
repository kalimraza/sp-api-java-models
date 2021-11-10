/*
 * Selling Partner API for Reports
 * The Selling Partner API for Reports lets you retrieve and manage a variety of reports that can help selling partners manage their businesses.
 *
 * OpenAPI spec version: 2020-09-04
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
import io.swagger.client.model.ReportList;
import java.io.IOException;

/**
 * The response for the getReports operation.
 */
@ApiModel(description = "The response for the getReports operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:03.277+05:00")
public class GetReportsResponse {
  @SerializedName("payload")
  private ReportList payload = null;

  @SerializedName("nextToken")
  private String nextToken = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetReportsResponse payload(ReportList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getReports operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getReports operation.")
  public ReportList getPayload() {
    return payload;
  }

  public void setPayload(ReportList payload) {
    this.payload = payload;
  }

  public GetReportsResponse nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * Returned when the number of results exceeds pageSize. To get the next page of results, call getReports with this token as the only parameter.
   * @return nextToken
  **/
  @ApiModelProperty(value = "Returned when the number of results exceeds pageSize. To get the next page of results, call getReports with this token as the only parameter.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public GetReportsResponse errors(ErrorList errors) {
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
    GetReportsResponse getReportsResponse = (GetReportsResponse) o;
    return Objects.equals(this.payload, getReportsResponse.payload) &&
        Objects.equals(this.nextToken, getReportsResponse.nextToken) &&
        Objects.equals(this.errors, getReportsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, nextToken, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetReportsResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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

