/*
 * Selling Partner API for Shipment Invoicing
 * The Selling Partner API for Shipment Invoicing helps you programmatically retrieve shipment invoice information in the Brazil marketplace for a selling partner’s Fulfillment by Amazon (FBA) orders.
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
import io.swagger.client.model.ShipmentInvoiceStatus;
import java.io.IOException;

/**
 * The shipment invoice status information.
 */
@ApiModel(description = "The shipment invoice status information.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:10.529+05:00")
public class ShipmentInvoiceStatusInfo {
  @SerializedName("AmazonShipmentId")
  private String amazonShipmentId = null;

  @SerializedName("InvoiceStatus")
  private ShipmentInvoiceStatus invoiceStatus = null;

  public ShipmentInvoiceStatusInfo amazonShipmentId(String amazonShipmentId) {
    this.amazonShipmentId = amazonShipmentId;
    return this;
  }

   /**
   * The Amazon-defined shipment identifier.
   * @return amazonShipmentId
  **/
  @ApiModelProperty(value = "The Amazon-defined shipment identifier.")
  public String getAmazonShipmentId() {
    return amazonShipmentId;
  }

  public void setAmazonShipmentId(String amazonShipmentId) {
    this.amazonShipmentId = amazonShipmentId;
  }

  public ShipmentInvoiceStatusInfo invoiceStatus(ShipmentInvoiceStatus invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * Get invoiceStatus
   * @return invoiceStatus
  **/
  @ApiModelProperty(value = "")
  public ShipmentInvoiceStatus getInvoiceStatus() {
    return invoiceStatus;
  }

  public void setInvoiceStatus(ShipmentInvoiceStatus invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentInvoiceStatusInfo shipmentInvoiceStatusInfo = (ShipmentInvoiceStatusInfo) o;
    return Objects.equals(this.amazonShipmentId, shipmentInvoiceStatusInfo.amazonShipmentId) &&
        Objects.equals(this.invoiceStatus, shipmentInvoiceStatusInfo.invoiceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amazonShipmentId, invoiceStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentInvoiceStatusInfo {\n");
    
    sb.append("    amazonShipmentId: ").append(toIndentedString(amazonShipmentId)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
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
