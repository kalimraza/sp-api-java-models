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
import io.swagger.client.model.PackingSlip;
import io.swagger.client.model.Pagination;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A list of packing slips.
 */
@ApiModel(description = "A list of packing slips.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:25.171+05:00")
public class PackingSlipList {
  @SerializedName("pagination")
  private Pagination pagination = null;

  @SerializedName("packingSlips")
  private List<PackingSlip> packingSlips = null;

  public PackingSlipList pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public PackingSlipList packingSlips(List<PackingSlip> packingSlips) {
    this.packingSlips = packingSlips;
    return this;
  }

  public PackingSlipList addPackingSlipsItem(PackingSlip packingSlipsItem) {
    if (this.packingSlips == null) {
      this.packingSlips = new ArrayList<PackingSlip>();
    }
    this.packingSlips.add(packingSlipsItem);
    return this;
  }

   /**
   * Get packingSlips
   * @return packingSlips
  **/
  @ApiModelProperty(value = "")
  public List<PackingSlip> getPackingSlips() {
    return packingSlips;
  }

  public void setPackingSlips(List<PackingSlip> packingSlips) {
    this.packingSlips = packingSlips;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackingSlipList packingSlipList = (PackingSlipList) o;
    return Objects.equals(this.pagination, packingSlipList.pagination) &&
        Objects.equals(this.packingSlips, packingSlipList.packingSlips);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, packingSlips);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackingSlipList {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    packingSlips: ").append(toIndentedString(packingSlips)).append("\n");
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

