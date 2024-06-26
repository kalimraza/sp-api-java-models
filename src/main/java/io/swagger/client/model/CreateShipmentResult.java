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
import io.swagger.client.model.RateList;
import java.io.IOException;

/**
 * The payload schema for the createShipment operation.
 */
@ApiModel(description = "The payload schema for the createShipment operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:12.419+05:00")
public class CreateShipmentResult {
  @SerializedName("shipmentId")
  private String shipmentId = null;

  @SerializedName("eligibleRates")
  private RateList eligibleRates = null;

  public CreateShipmentResult shipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

   /**
   * Get shipmentId
   * @return shipmentId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShipmentId() {
    return shipmentId;
  }

  public void setShipmentId(String shipmentId) {
    this.shipmentId = shipmentId;
  }

  public CreateShipmentResult eligibleRates(RateList eligibleRates) {
    this.eligibleRates = eligibleRates;
    return this;
  }

   /**
   * Get eligibleRates
   * @return eligibleRates
  **/
  @ApiModelProperty(required = true, value = "")
  public RateList getEligibleRates() {
    return eligibleRates;
  }

  public void setEligibleRates(RateList eligibleRates) {
    this.eligibleRates = eligibleRates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateShipmentResult createShipmentResult = (CreateShipmentResult) o;
    return Objects.equals(this.shipmentId, createShipmentResult.shipmentId) &&
        Objects.equals(this.eligibleRates, createShipmentResult.eligibleRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipmentId, eligibleRates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateShipmentResult {\n");
    
    sb.append("    shipmentId: ").append(toIndentedString(shipmentId)).append("\n");
    sb.append("    eligibleRates: ").append(toIndentedString(eligibleRates)).append("\n");
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

