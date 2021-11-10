/*
 * Selling Partner APIs for Fulfillment Outbound
 * The Selling Partner API for Fulfillment Outbound lets you create applications that help a seller fulfill Multi-Channel Fulfillment orders using their inventory in Amazon's fulfillment network. You can get information on both potential and existing fulfillment orders.
 *
 * OpenAPI spec version: 2020-07-01
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
import io.swagger.client.model.StringList;
import java.io.IOException;

/**
 * Information about unfulfillable items in a fulfillment order preview.
 */
@ApiModel(description = "Information about unfulfillable items in a fulfillment order preview.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:37.300+05:00")
public class UnfulfillablePreviewItem {
  @SerializedName("sellerSku")
  private String sellerSku = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("sellerFulfillmentOrderItemId")
  private String sellerFulfillmentOrderItemId = null;

  @SerializedName("itemUnfulfillableReasons")
  private StringList itemUnfulfillableReasons = null;

  public UnfulfillablePreviewItem sellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
    return this;
  }

   /**
   * The seller SKU of the item.
   * @return sellerSku
  **/
  @ApiModelProperty(required = true, value = "The seller SKU of the item.")
  public String getSellerSku() {
    return sellerSku;
  }

  public void setSellerSku(String sellerSku) {
    this.sellerSku = sellerSku;
  }

  public UnfulfillablePreviewItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public UnfulfillablePreviewItem sellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
    return this;
  }

   /**
   * A fulfillment order item identifier created with a call to the getFulfillmentPreview operation.
   * @return sellerFulfillmentOrderItemId
  **/
  @ApiModelProperty(required = true, value = "A fulfillment order item identifier created with a call to the getFulfillmentPreview operation.")
  public String getSellerFulfillmentOrderItemId() {
    return sellerFulfillmentOrderItemId;
  }

  public void setSellerFulfillmentOrderItemId(String sellerFulfillmentOrderItemId) {
    this.sellerFulfillmentOrderItemId = sellerFulfillmentOrderItemId;
  }

  public UnfulfillablePreviewItem itemUnfulfillableReasons(StringList itemUnfulfillableReasons) {
    this.itemUnfulfillableReasons = itemUnfulfillableReasons;
    return this;
  }

   /**
   * Error codes associated with the fulfillment order preview that indicate why the item is unfulfillable.
   * @return itemUnfulfillableReasons
  **/
  @ApiModelProperty(value = "Error codes associated with the fulfillment order preview that indicate why the item is unfulfillable.")
  public StringList getItemUnfulfillableReasons() {
    return itemUnfulfillableReasons;
  }

  public void setItemUnfulfillableReasons(StringList itemUnfulfillableReasons) {
    this.itemUnfulfillableReasons = itemUnfulfillableReasons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnfulfillablePreviewItem unfulfillablePreviewItem = (UnfulfillablePreviewItem) o;
    return Objects.equals(this.sellerSku, unfulfillablePreviewItem.sellerSku) &&
        Objects.equals(this.quantity, unfulfillablePreviewItem.quantity) &&
        Objects.equals(this.sellerFulfillmentOrderItemId, unfulfillablePreviewItem.sellerFulfillmentOrderItemId) &&
        Objects.equals(this.itemUnfulfillableReasons, unfulfillablePreviewItem.itemUnfulfillableReasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerSku, quantity, sellerFulfillmentOrderItemId, itemUnfulfillableReasons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnfulfillablePreviewItem {\n");
    
    sb.append("    sellerSku: ").append(toIndentedString(sellerSku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sellerFulfillmentOrderItemId: ").append(toIndentedString(sellerFulfillmentOrderItemId)).append("\n");
    sb.append("    itemUnfulfillableReasons: ").append(toIndentedString(itemUnfulfillableReasons)).append("\n");
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

