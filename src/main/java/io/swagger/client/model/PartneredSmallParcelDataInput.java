/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
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
import io.swagger.client.model.PartneredSmallParcelPackageInputList;
import java.io.IOException;

/**
 * Information that is required by an Amazon-partnered carrier to ship a Small Parcel inbound shipment.
 */
@ApiModel(description = "Information that is required by an Amazon-partnered carrier to ship a Small Parcel inbound shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:32.854+05:00")
public class PartneredSmallParcelDataInput {
  @SerializedName("PackageList")
  private PartneredSmallParcelPackageInputList packageList = null;

  @SerializedName("CarrierName")
  private String carrierName = null;

  public PartneredSmallParcelDataInput packageList(PartneredSmallParcelPackageInputList packageList) {
    this.packageList = packageList;
    return this;
  }

   /**
   * Get packageList
   * @return packageList
  **/
  @ApiModelProperty(value = "")
  public PartneredSmallParcelPackageInputList getPackageList() {
    return packageList;
  }

  public void setPackageList(PartneredSmallParcelPackageInputList packageList) {
    this.packageList = packageList;
  }

  public PartneredSmallParcelDataInput carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The Amazon-partnered carrier to use for the inbound shipment.
   * @return carrierName
  **/
  @ApiModelProperty(value = "The Amazon-partnered carrier to use for the inbound shipment.")
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartneredSmallParcelDataInput partneredSmallParcelDataInput = (PartneredSmallParcelDataInput) o;
    return Objects.equals(this.packageList, partneredSmallParcelDataInput.packageList) &&
        Objects.equals(this.carrierName, partneredSmallParcelDataInput.carrierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageList, carrierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartneredSmallParcelDataInput {\n");
    
    sb.append("    packageList: ").append(toIndentedString(packageList)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
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
