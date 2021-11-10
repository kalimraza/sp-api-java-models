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
import io.swagger.client.model.FeatureSettings;
import io.swagger.client.model.FeeList;
import io.swagger.client.model.FulfillmentPreviewShipmentList;
import io.swagger.client.model.ScheduledDeliveryInfo;
import io.swagger.client.model.ShippingSpeedCategory;
import io.swagger.client.model.StringList;
import io.swagger.client.model.UnfulfillablePreviewItemList;
import io.swagger.client.model.Weight;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Information about a fulfillment order preview, including delivery and fee information based on shipping method.
 */
@ApiModel(description = "Information about a fulfillment order preview, including delivery and fee information based on shipping method.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:37.300+05:00")
public class FulfillmentPreview {
  @SerializedName("shippingSpeedCategory")
  private ShippingSpeedCategory shippingSpeedCategory = null;

  @SerializedName("scheduledDeliveryInfo")
  private ScheduledDeliveryInfo scheduledDeliveryInfo = null;

  @SerializedName("isFulfillable")
  private Boolean isFulfillable = null;

  @SerializedName("isCODCapable")
  private Boolean isCODCapable = null;

  @SerializedName("estimatedShippingWeight")
  private Weight estimatedShippingWeight = null;

  @SerializedName("estimatedFees")
  private FeeList estimatedFees = null;

  @SerializedName("fulfillmentPreviewShipments")
  private FulfillmentPreviewShipmentList fulfillmentPreviewShipments = null;

  @SerializedName("unfulfillablePreviewItems")
  private UnfulfillablePreviewItemList unfulfillablePreviewItems = null;

  @SerializedName("orderUnfulfillableReasons")
  private StringList orderUnfulfillableReasons = null;

  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("featureConstraints")
  private List<FeatureSettings> featureConstraints = null;

  public FulfillmentPreview shippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
    this.shippingSpeedCategory = shippingSpeedCategory;
    return this;
  }

   /**
   * Get shippingSpeedCategory
   * @return shippingSpeedCategory
  **/
  @ApiModelProperty(required = true, value = "")
  public ShippingSpeedCategory getShippingSpeedCategory() {
    return shippingSpeedCategory;
  }

  public void setShippingSpeedCategory(ShippingSpeedCategory shippingSpeedCategory) {
    this.shippingSpeedCategory = shippingSpeedCategory;
  }

  public FulfillmentPreview scheduledDeliveryInfo(ScheduledDeliveryInfo scheduledDeliveryInfo) {
    this.scheduledDeliveryInfo = scheduledDeliveryInfo;
    return this;
  }

   /**
   * Get scheduledDeliveryInfo
   * @return scheduledDeliveryInfo
  **/
  @ApiModelProperty(value = "")
  public ScheduledDeliveryInfo getScheduledDeliveryInfo() {
    return scheduledDeliveryInfo;
  }

  public void setScheduledDeliveryInfo(ScheduledDeliveryInfo scheduledDeliveryInfo) {
    this.scheduledDeliveryInfo = scheduledDeliveryInfo;
  }

  public FulfillmentPreview isFulfillable(Boolean isFulfillable) {
    this.isFulfillable = isFulfillable;
    return this;
  }

   /**
   * When true, this fulfillment order preview is fulfillable.
   * @return isFulfillable
  **/
  @ApiModelProperty(required = true, value = "When true, this fulfillment order preview is fulfillable.")
  public Boolean isIsFulfillable() {
    return isFulfillable;
  }

  public void setIsFulfillable(Boolean isFulfillable) {
    this.isFulfillable = isFulfillable;
  }

  public FulfillmentPreview isCODCapable(Boolean isCODCapable) {
    this.isCODCapable = isCODCapable;
    return this;
  }

   /**
   * When true, this fulfillment order preview is for COD (Cash On Delivery).
   * @return isCODCapable
  **/
  @ApiModelProperty(required = true, value = "When true, this fulfillment order preview is for COD (Cash On Delivery).")
  public Boolean isIsCODCapable() {
    return isCODCapable;
  }

  public void setIsCODCapable(Boolean isCODCapable) {
    this.isCODCapable = isCODCapable;
  }

  public FulfillmentPreview estimatedShippingWeight(Weight estimatedShippingWeight) {
    this.estimatedShippingWeight = estimatedShippingWeight;
    return this;
  }

   /**
   * Estimated shipping weight for this fulfillment order preview.
   * @return estimatedShippingWeight
  **/
  @ApiModelProperty(value = "Estimated shipping weight for this fulfillment order preview.")
  public Weight getEstimatedShippingWeight() {
    return estimatedShippingWeight;
  }

  public void setEstimatedShippingWeight(Weight estimatedShippingWeight) {
    this.estimatedShippingWeight = estimatedShippingWeight;
  }

  public FulfillmentPreview estimatedFees(FeeList estimatedFees) {
    this.estimatedFees = estimatedFees;
    return this;
  }

   /**
   * The estimated fulfillment fees for this fulfillment order preview, if applicable.
   * @return estimatedFees
  **/
  @ApiModelProperty(value = "The estimated fulfillment fees for this fulfillment order preview, if applicable.")
  public FeeList getEstimatedFees() {
    return estimatedFees;
  }

  public void setEstimatedFees(FeeList estimatedFees) {
    this.estimatedFees = estimatedFees;
  }

  public FulfillmentPreview fulfillmentPreviewShipments(FulfillmentPreviewShipmentList fulfillmentPreviewShipments) {
    this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
    return this;
  }

   /**
   * Get fulfillmentPreviewShipments
   * @return fulfillmentPreviewShipments
  **/
  @ApiModelProperty(value = "")
  public FulfillmentPreviewShipmentList getFulfillmentPreviewShipments() {
    return fulfillmentPreviewShipments;
  }

  public void setFulfillmentPreviewShipments(FulfillmentPreviewShipmentList fulfillmentPreviewShipments) {
    this.fulfillmentPreviewShipments = fulfillmentPreviewShipments;
  }

  public FulfillmentPreview unfulfillablePreviewItems(UnfulfillablePreviewItemList unfulfillablePreviewItems) {
    this.unfulfillablePreviewItems = unfulfillablePreviewItems;
    return this;
  }

   /**
   * Get unfulfillablePreviewItems
   * @return unfulfillablePreviewItems
  **/
  @ApiModelProperty(value = "")
  public UnfulfillablePreviewItemList getUnfulfillablePreviewItems() {
    return unfulfillablePreviewItems;
  }

  public void setUnfulfillablePreviewItems(UnfulfillablePreviewItemList unfulfillablePreviewItems) {
    this.unfulfillablePreviewItems = unfulfillablePreviewItems;
  }

  public FulfillmentPreview orderUnfulfillableReasons(StringList orderUnfulfillableReasons) {
    this.orderUnfulfillableReasons = orderUnfulfillableReasons;
    return this;
  }

   /**
   * Error codes associated with the fulfillment order preview that indicate why the order is not fulfillable.  Error code examples:  DeliverySLAUnavailable InvalidDestinationAddress
   * @return orderUnfulfillableReasons
  **/
  @ApiModelProperty(value = "Error codes associated with the fulfillment order preview that indicate why the order is not fulfillable.  Error code examples:  DeliverySLAUnavailable InvalidDestinationAddress")
  public StringList getOrderUnfulfillableReasons() {
    return orderUnfulfillableReasons;
  }

  public void setOrderUnfulfillableReasons(StringList orderUnfulfillableReasons) {
    this.orderUnfulfillableReasons = orderUnfulfillableReasons;
  }

  public FulfillmentPreview marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace the fulfillment order is placed against.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "The marketplace the fulfillment order is placed against.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public FulfillmentPreview featureConstraints(List<FeatureSettings> featureConstraints) {
    this.featureConstraints = featureConstraints;
    return this;
  }

  public FulfillmentPreview addFeatureConstraintsItem(FeatureSettings featureConstraintsItem) {
    if (this.featureConstraints == null) {
      this.featureConstraints = new ArrayList<FeatureSettings>();
    }
    this.featureConstraints.add(featureConstraintsItem);
    return this;
  }

   /**
   * A list of features and their fulfillment policies to apply to the order.
   * @return featureConstraints
  **/
  @ApiModelProperty(value = "A list of features and their fulfillment policies to apply to the order.")
  public List<FeatureSettings> getFeatureConstraints() {
    return featureConstraints;
  }

  public void setFeatureConstraints(List<FeatureSettings> featureConstraints) {
    this.featureConstraints = featureConstraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FulfillmentPreview fulfillmentPreview = (FulfillmentPreview) o;
    return Objects.equals(this.shippingSpeedCategory, fulfillmentPreview.shippingSpeedCategory) &&
        Objects.equals(this.scheduledDeliveryInfo, fulfillmentPreview.scheduledDeliveryInfo) &&
        Objects.equals(this.isFulfillable, fulfillmentPreview.isFulfillable) &&
        Objects.equals(this.isCODCapable, fulfillmentPreview.isCODCapable) &&
        Objects.equals(this.estimatedShippingWeight, fulfillmentPreview.estimatedShippingWeight) &&
        Objects.equals(this.estimatedFees, fulfillmentPreview.estimatedFees) &&
        Objects.equals(this.fulfillmentPreviewShipments, fulfillmentPreview.fulfillmentPreviewShipments) &&
        Objects.equals(this.unfulfillablePreviewItems, fulfillmentPreview.unfulfillablePreviewItems) &&
        Objects.equals(this.orderUnfulfillableReasons, fulfillmentPreview.orderUnfulfillableReasons) &&
        Objects.equals(this.marketplaceId, fulfillmentPreview.marketplaceId) &&
        Objects.equals(this.featureConstraints, fulfillmentPreview.featureConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingSpeedCategory, scheduledDeliveryInfo, isFulfillable, isCODCapable, estimatedShippingWeight, estimatedFees, fulfillmentPreviewShipments, unfulfillablePreviewItems, orderUnfulfillableReasons, marketplaceId, featureConstraints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentPreview {\n");
    
    sb.append("    shippingSpeedCategory: ").append(toIndentedString(shippingSpeedCategory)).append("\n");
    sb.append("    scheduledDeliveryInfo: ").append(toIndentedString(scheduledDeliveryInfo)).append("\n");
    sb.append("    isFulfillable: ").append(toIndentedString(isFulfillable)).append("\n");
    sb.append("    isCODCapable: ").append(toIndentedString(isCODCapable)).append("\n");
    sb.append("    estimatedShippingWeight: ").append(toIndentedString(estimatedShippingWeight)).append("\n");
    sb.append("    estimatedFees: ").append(toIndentedString(estimatedFees)).append("\n");
    sb.append("    fulfillmentPreviewShipments: ").append(toIndentedString(fulfillmentPreviewShipments)).append("\n");
    sb.append("    unfulfillablePreviewItems: ").append(toIndentedString(unfulfillablePreviewItems)).append("\n");
    sb.append("    orderUnfulfillableReasons: ").append(toIndentedString(orderUnfulfillableReasons)).append("\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    featureConstraints: ").append(toIndentedString(featureConstraints)).append("\n");
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

