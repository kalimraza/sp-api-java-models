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
import io.swagger.client.model.Address;
import io.swagger.client.model.FeatureSettings;
import io.swagger.client.model.GetFulfillmentPreviewItemList;
import io.swagger.client.model.ShippingSpeedCategoryList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The request body schema for the getFulfillmentPreview operation.
 */
@ApiModel(description = "The request body schema for the getFulfillmentPreview operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:37.300+05:00")
public class GetFulfillmentPreviewRequest {
  @SerializedName("marketplaceId")
  private String marketplaceId = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("items")
  private GetFulfillmentPreviewItemList items = null;

  @SerializedName("shippingSpeedCategories")
  private ShippingSpeedCategoryList shippingSpeedCategories = null;

  @SerializedName("includeCODFulfillmentPreview")
  private Boolean includeCODFulfillmentPreview = null;

  @SerializedName("includeDeliveryWindows")
  private Boolean includeDeliveryWindows = null;

  @SerializedName("featureConstraints")
  private List<FeatureSettings> featureConstraints = null;

  public GetFulfillmentPreviewRequest marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * The marketplace the fulfillment order is placed against.
   * @return marketplaceId
  **/
  @ApiModelProperty(value = "The marketplace the fulfillment order is placed against.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public GetFulfillmentPreviewRequest address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * The destination address for the fulfillment order preview.
   * @return address
  **/
  @ApiModelProperty(required = true, value = "The destination address for the fulfillment order preview.")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public GetFulfillmentPreviewRequest items(GetFulfillmentPreviewItemList items) {
    this.items = items;
    return this;
  }

   /**
   * Identifying information and quantity information for the items in the fulfillment order preview.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Identifying information and quantity information for the items in the fulfillment order preview.")
  public GetFulfillmentPreviewItemList getItems() {
    return items;
  }

  public void setItems(GetFulfillmentPreviewItemList items) {
    this.items = items;
  }

  public GetFulfillmentPreviewRequest shippingSpeedCategories(ShippingSpeedCategoryList shippingSpeedCategories) {
    this.shippingSpeedCategories = shippingSpeedCategories;
    return this;
  }

   /**
   * A list of shipping methods used for creating fulfillment order previews.  Possible values:  * Standard - Standard shipping method. * Expedited - Expedited shipping method. * Priority - Priority shipping method. * ScheduledDelivery - Scheduled Delivery shipping method. Note: Shipping method service level agreements vary by marketplace. Sellers should see the Seller Central website in their marketplace for shipping method service level agreements and fulfillment fees.
   * @return shippingSpeedCategories
  **/
  @ApiModelProperty(value = "A list of shipping methods used for creating fulfillment order previews.  Possible values:  * Standard - Standard shipping method. * Expedited - Expedited shipping method. * Priority - Priority shipping method. * ScheduledDelivery - Scheduled Delivery shipping method. Note: Shipping method service level agreements vary by marketplace. Sellers should see the Seller Central website in their marketplace for shipping method service level agreements and fulfillment fees.")
  public ShippingSpeedCategoryList getShippingSpeedCategories() {
    return shippingSpeedCategories;
  }

  public void setShippingSpeedCategories(ShippingSpeedCategoryList shippingSpeedCategories) {
    this.shippingSpeedCategories = shippingSpeedCategories;
  }

  public GetFulfillmentPreviewRequest includeCODFulfillmentPreview(Boolean includeCODFulfillmentPreview) {
    this.includeCODFulfillmentPreview = includeCODFulfillmentPreview;
    return this;
  }

   /**
   * Specifies whether to return fulfillment order previews that are for COD (Cash On Delivery).  Possible values:  * true - Returns all fulfillment order previews (both for COD and not for COD). * false - Returns only fulfillment order previews that are not for COD.
   * @return includeCODFulfillmentPreview
  **/
  @ApiModelProperty(value = "Specifies whether to return fulfillment order previews that are for COD (Cash On Delivery).  Possible values:  * true - Returns all fulfillment order previews (both for COD and not for COD). * false - Returns only fulfillment order previews that are not for COD.")
  public Boolean isIncludeCODFulfillmentPreview() {
    return includeCODFulfillmentPreview;
  }

  public void setIncludeCODFulfillmentPreview(Boolean includeCODFulfillmentPreview) {
    this.includeCODFulfillmentPreview = includeCODFulfillmentPreview;
  }

  public GetFulfillmentPreviewRequest includeDeliveryWindows(Boolean includeDeliveryWindows) {
    this.includeDeliveryWindows = includeDeliveryWindows;
    return this;
  }

   /**
   * Specifies whether to return the ScheduledDeliveryInfo response object, which contains the available delivery windows for a Scheduled Delivery. The ScheduledDeliveryInfo response object can only be returned for fulfillment order previews with ShippingSpeedCategories &#x3D; ScheduledDelivery.
   * @return includeDeliveryWindows
  **/
  @ApiModelProperty(value = "Specifies whether to return the ScheduledDeliveryInfo response object, which contains the available delivery windows for a Scheduled Delivery. The ScheduledDeliveryInfo response object can only be returned for fulfillment order previews with ShippingSpeedCategories = ScheduledDelivery.")
  public Boolean isIncludeDeliveryWindows() {
    return includeDeliveryWindows;
  }

  public void setIncludeDeliveryWindows(Boolean includeDeliveryWindows) {
    this.includeDeliveryWindows = includeDeliveryWindows;
  }

  public GetFulfillmentPreviewRequest featureConstraints(List<FeatureSettings> featureConstraints) {
    this.featureConstraints = featureConstraints;
    return this;
  }

  public GetFulfillmentPreviewRequest addFeatureConstraintsItem(FeatureSettings featureConstraintsItem) {
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
    GetFulfillmentPreviewRequest getFulfillmentPreviewRequest = (GetFulfillmentPreviewRequest) o;
    return Objects.equals(this.marketplaceId, getFulfillmentPreviewRequest.marketplaceId) &&
        Objects.equals(this.address, getFulfillmentPreviewRequest.address) &&
        Objects.equals(this.items, getFulfillmentPreviewRequest.items) &&
        Objects.equals(this.shippingSpeedCategories, getFulfillmentPreviewRequest.shippingSpeedCategories) &&
        Objects.equals(this.includeCODFulfillmentPreview, getFulfillmentPreviewRequest.includeCODFulfillmentPreview) &&
        Objects.equals(this.includeDeliveryWindows, getFulfillmentPreviewRequest.includeDeliveryWindows) &&
        Objects.equals(this.featureConstraints, getFulfillmentPreviewRequest.featureConstraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, address, items, shippingSpeedCategories, includeCODFulfillmentPreview, includeDeliveryWindows, featureConstraints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFulfillmentPreviewRequest {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    shippingSpeedCategories: ").append(toIndentedString(shippingSpeedCategories)).append("\n");
    sb.append("    includeCODFulfillmentPreview: ").append(toIndentedString(includeCODFulfillmentPreview)).append("\n");
    sb.append("    includeDeliveryWindows: ").append(toIndentedString(includeDeliveryWindows)).append("\n");
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
