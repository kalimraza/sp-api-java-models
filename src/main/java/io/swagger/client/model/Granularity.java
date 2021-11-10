/*
 * Selling Partner API for FBA Inventory
 * The Selling Partner API for FBA Inventory lets you programmatically retrieve information about inventory in Amazon's fulfillment network. Today this API is available only in the North America region. In 2021 we plan to release this API in the Europe and Far East regions.
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
import java.io.IOException;

/**
 * Describes a granularity at which inventory data can be aggregated. For example, if you use Marketplace granularity, the fulfillable quantity will reflect inventory that could be fulfilled in the given marketplace.
 */
@ApiModel(description = "Describes a granularity at which inventory data can be aggregated. For example, if you use Marketplace granularity, the fulfillable quantity will reflect inventory that could be fulfilled in the given marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:24.702+05:00")
public class Granularity {
  @SerializedName("granularityType")
  private String granularityType = null;

  @SerializedName("granularityId")
  private String granularityId = null;

  public Granularity granularityType(String granularityType) {
    this.granularityType = granularityType;
    return this;
  }

   /**
   * The granularity type for the inventory aggregation level.
   * @return granularityType
  **/
  @ApiModelProperty(value = "The granularity type for the inventory aggregation level.")
  public String getGranularityType() {
    return granularityType;
  }

  public void setGranularityType(String granularityType) {
    this.granularityType = granularityType;
  }

  public Granularity granularityId(String granularityId) {
    this.granularityId = granularityId;
    return this;
  }

   /**
   * The granularity ID for the specified granularity type. When granularityType is Marketplace, specify the marketplaceId.
   * @return granularityId
  **/
  @ApiModelProperty(value = "The granularity ID for the specified granularity type. When granularityType is Marketplace, specify the marketplaceId.")
  public String getGranularityId() {
    return granularityId;
  }

  public void setGranularityId(String granularityId) {
    this.granularityId = granularityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Granularity granularity = (Granularity) o;
    return Objects.equals(this.granularityType, granularity.granularityType) &&
        Objects.equals(this.granularityId, granularity.granularityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(granularityType, granularityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Granularity {\n");
    
    sb.append("    granularityType: ").append(toIndentedString(granularityType)).append("\n");
    sb.append("    granularityId: ").append(toIndentedString(granularityId)).append("\n");
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

