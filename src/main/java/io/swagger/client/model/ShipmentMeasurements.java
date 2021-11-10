/*
 * Selling Partner API for Retail Procurement Shipments
 * The Selling Partner API for Retail Procurement Shipments provides programmatic access to retail shipping data for vendors.
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
import io.swagger.client.model.Volume;
import io.swagger.client.model.Weight;
import java.io.IOException;

/**
 * Shipment measurement details.
 */
@ApiModel(description = "Shipment measurement details.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:34.010+05:00")
public class ShipmentMeasurements {
  @SerializedName("grossShipmentWeight")
  private Weight grossShipmentWeight = null;

  @SerializedName("shipmentVolume")
  private Volume shipmentVolume = null;

  @SerializedName("cartonCount")
  private Integer cartonCount = null;

  @SerializedName("palletCount")
  private Integer palletCount = null;

  public ShipmentMeasurements grossShipmentWeight(Weight grossShipmentWeight) {
    this.grossShipmentWeight = grossShipmentWeight;
    return this;
  }

   /**
   * Gross weight of the shipment.
   * @return grossShipmentWeight
  **/
  @ApiModelProperty(value = "Gross weight of the shipment.")
  public Weight getGrossShipmentWeight() {
    return grossShipmentWeight;
  }

  public void setGrossShipmentWeight(Weight grossShipmentWeight) {
    this.grossShipmentWeight = grossShipmentWeight;
  }

  public ShipmentMeasurements shipmentVolume(Volume shipmentVolume) {
    this.shipmentVolume = shipmentVolume;
    return this;
  }

   /**
   * Volume of the shipment.
   * @return shipmentVolume
  **/
  @ApiModelProperty(value = "Volume of the shipment.")
  public Volume getShipmentVolume() {
    return shipmentVolume;
  }

  public void setShipmentVolume(Volume shipmentVolume) {
    this.shipmentVolume = shipmentVolume;
  }

  public ShipmentMeasurements cartonCount(Integer cartonCount) {
    this.cartonCount = cartonCount;
    return this;
  }

   /**
   * Number of cartons present in the shipment. Provide the cartonCount only for unpalletized shipments.
   * @return cartonCount
  **/
  @ApiModelProperty(value = "Number of cartons present in the shipment. Provide the cartonCount only for unpalletized shipments.")
  public Integer getCartonCount() {
    return cartonCount;
  }

  public void setCartonCount(Integer cartonCount) {
    this.cartonCount = cartonCount;
  }

  public ShipmentMeasurements palletCount(Integer palletCount) {
    this.palletCount = palletCount;
    return this;
  }

   /**
   * Number of pallets present in the shipment. Provide the palletCount only for palletized shipments.
   * @return palletCount
  **/
  @ApiModelProperty(value = "Number of pallets present in the shipment. Provide the palletCount only for palletized shipments.")
  public Integer getPalletCount() {
    return palletCount;
  }

  public void setPalletCount(Integer palletCount) {
    this.palletCount = palletCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentMeasurements shipmentMeasurements = (ShipmentMeasurements) o;
    return Objects.equals(this.grossShipmentWeight, shipmentMeasurements.grossShipmentWeight) &&
        Objects.equals(this.shipmentVolume, shipmentMeasurements.shipmentVolume) &&
        Objects.equals(this.cartonCount, shipmentMeasurements.cartonCount) &&
        Objects.equals(this.palletCount, shipmentMeasurements.palletCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossShipmentWeight, shipmentVolume, cartonCount, palletCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentMeasurements {\n");
    
    sb.append("    grossShipmentWeight: ").append(toIndentedString(grossShipmentWeight)).append("\n");
    sb.append("    shipmentVolume: ").append(toIndentedString(shipmentVolume)).append("\n");
    sb.append("    cartonCount: ").append(toIndentedString(cartonCount)).append("\n");
    sb.append("    palletCount: ").append(toIndentedString(palletCount)).append("\n");
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

