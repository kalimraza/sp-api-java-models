/*
 * Selling Partner API for Shipping
 * Provides programmatic access to Amazon Shipping APIs.
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
import io.swagger.client.model.ServiceRateList;
import java.io.IOException;

/**
 * The payload schema for the getRates operation.
 */
@ApiModel(description = "The payload schema for the getRates operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:12.419+05:00")
public class GetRatesResult {
  @SerializedName("serviceRates")
  private ServiceRateList serviceRates = null;

  public GetRatesResult serviceRates(ServiceRateList serviceRates) {
    this.serviceRates = serviceRates;
    return this;
  }

   /**
   * Get serviceRates
   * @return serviceRates
  **/
  @ApiModelProperty(required = true, value = "")
  public ServiceRateList getServiceRates() {
    return serviceRates;
  }

  public void setServiceRates(ServiceRateList serviceRates) {
    this.serviceRates = serviceRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRatesResult getRatesResult = (GetRatesResult) o;
    return Objects.equals(this.serviceRates, getRatesResult.serviceRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRatesResult {\n");
    
    sb.append("    serviceRates: ").append(toIndentedString(serviceRates)).append("\n");
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

