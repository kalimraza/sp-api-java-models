/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
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
import io.swagger.client.model.ChargeComponentList;
import io.swagger.client.model.DirectPaymentList;
import io.swagger.client.model.FeeComponentList;
import io.swagger.client.model.ShipmentItemList;
import java.io.IOException;

/**
 * A shipment, refund, guarantee claim, or chargeback.
 */
@ApiModel(description = "A shipment, refund, guarantee claim, or chargeback.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:29.606+05:00")
public class ShipmentEvent {
  @SerializedName("AmazonOrderId")
  private String amazonOrderId = null;

  @SerializedName("SellerOrderId")
  private String sellerOrderId = null;

  @SerializedName("MarketplaceName")
  private String marketplaceName = null;

  @SerializedName("OrderChargeList")
  private ChargeComponentList orderChargeList = null;

  @SerializedName("OrderChargeAdjustmentList")
  private ChargeComponentList orderChargeAdjustmentList = null;

  @SerializedName("ShipmentFeeList")
  private FeeComponentList shipmentFeeList = null;

  @SerializedName("ShipmentFeeAdjustmentList")
  private FeeComponentList shipmentFeeAdjustmentList = null;

  @SerializedName("OrderFeeList")
  private FeeComponentList orderFeeList = null;

  @SerializedName("OrderFeeAdjustmentList")
  private FeeComponentList orderFeeAdjustmentList = null;

  @SerializedName("DirectPaymentList")
  private DirectPaymentList directPaymentList = null;

  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("ShipmentItemList")
  private ShipmentItemList shipmentItemList = null;

  @SerializedName("ShipmentItemAdjustmentList")
  private ShipmentItemList shipmentItemAdjustmentList = null;

  public ShipmentEvent amazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
    return this;
  }

   /**
   * An Amazon-defined identifier for an order.
   * @return amazonOrderId
  **/
  @ApiModelProperty(value = "An Amazon-defined identifier for an order.")
  public String getAmazonOrderId() {
    return amazonOrderId;
  }

  public void setAmazonOrderId(String amazonOrderId) {
    this.amazonOrderId = amazonOrderId;
  }

  public ShipmentEvent sellerOrderId(String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
    return this;
  }

   /**
   * A seller-defined identifier for an order.
   * @return sellerOrderId
  **/
  @ApiModelProperty(value = "A seller-defined identifier for an order.")
  public String getSellerOrderId() {
    return sellerOrderId;
  }

  public void setSellerOrderId(String sellerOrderId) {
    this.sellerOrderId = sellerOrderId;
  }

  public ShipmentEvent marketplaceName(String marketplaceName) {
    this.marketplaceName = marketplaceName;
    return this;
  }

   /**
   * The name of the marketplace where the event occurred.
   * @return marketplaceName
  **/
  @ApiModelProperty(value = "The name of the marketplace where the event occurred.")
  public String getMarketplaceName() {
    return marketplaceName;
  }

  public void setMarketplaceName(String marketplaceName) {
    this.marketplaceName = marketplaceName;
  }

  public ShipmentEvent orderChargeList(ChargeComponentList orderChargeList) {
    this.orderChargeList = orderChargeList;
    return this;
  }

   /**
   * A list of order-level charges. These charges are applicable to Multi-Channel Fulfillment COD orders.
   * @return orderChargeList
  **/
  @ApiModelProperty(value = "A list of order-level charges. These charges are applicable to Multi-Channel Fulfillment COD orders.")
  public ChargeComponentList getOrderChargeList() {
    return orderChargeList;
  }

  public void setOrderChargeList(ChargeComponentList orderChargeList) {
    this.orderChargeList = orderChargeList;
  }

  public ShipmentEvent orderChargeAdjustmentList(ChargeComponentList orderChargeAdjustmentList) {
    this.orderChargeAdjustmentList = orderChargeAdjustmentList;
    return this;
  }

   /**
   * A list of order-level charge adjustments. These adjustments are applicable to Multi-Channel Fulfillment COD orders.
   * @return orderChargeAdjustmentList
  **/
  @ApiModelProperty(value = "A list of order-level charge adjustments. These adjustments are applicable to Multi-Channel Fulfillment COD orders.")
  public ChargeComponentList getOrderChargeAdjustmentList() {
    return orderChargeAdjustmentList;
  }

  public void setOrderChargeAdjustmentList(ChargeComponentList orderChargeAdjustmentList) {
    this.orderChargeAdjustmentList = orderChargeAdjustmentList;
  }

  public ShipmentEvent shipmentFeeList(FeeComponentList shipmentFeeList) {
    this.shipmentFeeList = shipmentFeeList;
    return this;
  }

   /**
   * A list of shipment-level fees.
   * @return shipmentFeeList
  **/
  @ApiModelProperty(value = "A list of shipment-level fees.")
  public FeeComponentList getShipmentFeeList() {
    return shipmentFeeList;
  }

  public void setShipmentFeeList(FeeComponentList shipmentFeeList) {
    this.shipmentFeeList = shipmentFeeList;
  }

  public ShipmentEvent shipmentFeeAdjustmentList(FeeComponentList shipmentFeeAdjustmentList) {
    this.shipmentFeeAdjustmentList = shipmentFeeAdjustmentList;
    return this;
  }

   /**
   * A list of shipment-level fee adjustments.
   * @return shipmentFeeAdjustmentList
  **/
  @ApiModelProperty(value = "A list of shipment-level fee adjustments.")
  public FeeComponentList getShipmentFeeAdjustmentList() {
    return shipmentFeeAdjustmentList;
  }

  public void setShipmentFeeAdjustmentList(FeeComponentList shipmentFeeAdjustmentList) {
    this.shipmentFeeAdjustmentList = shipmentFeeAdjustmentList;
  }

  public ShipmentEvent orderFeeList(FeeComponentList orderFeeList) {
    this.orderFeeList = orderFeeList;
    return this;
  }

   /**
   * A list of order-level fees. These charges are applicable to Multi-Channel Fulfillment orders.
   * @return orderFeeList
  **/
  @ApiModelProperty(value = "A list of order-level fees. These charges are applicable to Multi-Channel Fulfillment orders.")
  public FeeComponentList getOrderFeeList() {
    return orderFeeList;
  }

  public void setOrderFeeList(FeeComponentList orderFeeList) {
    this.orderFeeList = orderFeeList;
  }

  public ShipmentEvent orderFeeAdjustmentList(FeeComponentList orderFeeAdjustmentList) {
    this.orderFeeAdjustmentList = orderFeeAdjustmentList;
    return this;
  }

   /**
   * A list of order-level fee adjustments. These adjustments are applicable to Multi-Channel Fulfillment orders.
   * @return orderFeeAdjustmentList
  **/
  @ApiModelProperty(value = "A list of order-level fee adjustments. These adjustments are applicable to Multi-Channel Fulfillment orders.")
  public FeeComponentList getOrderFeeAdjustmentList() {
    return orderFeeAdjustmentList;
  }

  public void setOrderFeeAdjustmentList(FeeComponentList orderFeeAdjustmentList) {
    this.orderFeeAdjustmentList = orderFeeAdjustmentList;
  }

  public ShipmentEvent directPaymentList(DirectPaymentList directPaymentList) {
    this.directPaymentList = directPaymentList;
    return this;
  }

   /**
   * A list of transactions where buyers pay Amazon through one of the credit cards offered by Amazon or where buyers pay a seller directly through COD.
   * @return directPaymentList
  **/
  @ApiModelProperty(value = "A list of transactions where buyers pay Amazon through one of the credit cards offered by Amazon or where buyers pay a seller directly through COD.")
  public DirectPaymentList getDirectPaymentList() {
    return directPaymentList;
  }

  public void setDirectPaymentList(DirectPaymentList directPaymentList) {
    this.directPaymentList = directPaymentList;
  }

  public ShipmentEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public ShipmentEvent shipmentItemList(ShipmentItemList shipmentItemList) {
    this.shipmentItemList = shipmentItemList;
    return this;
  }

   /**
   * Get shipmentItemList
   * @return shipmentItemList
  **/
  @ApiModelProperty(value = "")
  public ShipmentItemList getShipmentItemList() {
    return shipmentItemList;
  }

  public void setShipmentItemList(ShipmentItemList shipmentItemList) {
    this.shipmentItemList = shipmentItemList;
  }

  public ShipmentEvent shipmentItemAdjustmentList(ShipmentItemList shipmentItemAdjustmentList) {
    this.shipmentItemAdjustmentList = shipmentItemAdjustmentList;
    return this;
  }

   /**
   * A list of shipment item adjustments.
   * @return shipmentItemAdjustmentList
  **/
  @ApiModelProperty(value = "A list of shipment item adjustments.")
  public ShipmentItemList getShipmentItemAdjustmentList() {
    return shipmentItemAdjustmentList;
  }

  public void setShipmentItemAdjustmentList(ShipmentItemList shipmentItemAdjustmentList) {
    this.shipmentItemAdjustmentList = shipmentItemAdjustmentList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentEvent shipmentEvent = (ShipmentEvent) o;
    return Objects.equals(this.amazonOrderId, shipmentEvent.amazonOrderId) &&
        Objects.equals(this.sellerOrderId, shipmentEvent.sellerOrderId) &&
        Objects.equals(this.marketplaceName, shipmentEvent.marketplaceName) &&
        Objects.equals(this.orderChargeList, shipmentEvent.orderChargeList) &&
        Objects.equals(this.orderChargeAdjustmentList, shipmentEvent.orderChargeAdjustmentList) &&
        Objects.equals(this.shipmentFeeList, shipmentEvent.shipmentFeeList) &&
        Objects.equals(this.shipmentFeeAdjustmentList, shipmentEvent.shipmentFeeAdjustmentList) &&
        Objects.equals(this.orderFeeList, shipmentEvent.orderFeeList) &&
        Objects.equals(this.orderFeeAdjustmentList, shipmentEvent.orderFeeAdjustmentList) &&
        Objects.equals(this.directPaymentList, shipmentEvent.directPaymentList) &&
        Objects.equals(this.postedDate, shipmentEvent.postedDate) &&
        Objects.equals(this.shipmentItemList, shipmentEvent.shipmentItemList) &&
        Objects.equals(this.shipmentItemAdjustmentList, shipmentEvent.shipmentItemAdjustmentList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonOrderId, sellerOrderId, marketplaceName, orderChargeList, orderChargeAdjustmentList, shipmentFeeList, shipmentFeeAdjustmentList, orderFeeList, orderFeeAdjustmentList, directPaymentList, postedDate, shipmentItemList, shipmentItemAdjustmentList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentEvent {\n");
    
    sb.append("    amazonOrderId: ").append(toIndentedString(amazonOrderId)).append("\n");
    sb.append("    sellerOrderId: ").append(toIndentedString(sellerOrderId)).append("\n");
    sb.append("    marketplaceName: ").append(toIndentedString(marketplaceName)).append("\n");
    sb.append("    orderChargeList: ").append(toIndentedString(orderChargeList)).append("\n");
    sb.append("    orderChargeAdjustmentList: ").append(toIndentedString(orderChargeAdjustmentList)).append("\n");
    sb.append("    shipmentFeeList: ").append(toIndentedString(shipmentFeeList)).append("\n");
    sb.append("    shipmentFeeAdjustmentList: ").append(toIndentedString(shipmentFeeAdjustmentList)).append("\n");
    sb.append("    orderFeeList: ").append(toIndentedString(orderFeeList)).append("\n");
    sb.append("    orderFeeAdjustmentList: ").append(toIndentedString(orderFeeAdjustmentList)).append("\n");
    sb.append("    directPaymentList: ").append(toIndentedString(directPaymentList)).append("\n");
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    shipmentItemList: ").append(toIndentedString(shipmentItemList)).append("\n");
    sb.append("    shipmentItemAdjustmentList: ").append(toIndentedString(shipmentItemAdjustmentList)).append("\n");
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

