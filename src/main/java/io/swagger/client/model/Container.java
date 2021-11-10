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
import io.swagger.client.model.Dimensions;
import io.swagger.client.model.PackedItem;
import io.swagger.client.model.Weight;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Container
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:25.171+05:00")
public class Container {
  /**
   * The type of container.
   */
  @JsonAdapter(ContainerTypeEnum.Adapter.class)
  public enum ContainerTypeEnum {
    CARTON("carton"),
    
    PALLET("pallet");

    private String value;

    ContainerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContainerTypeEnum fromValue(String text) {
      for (ContainerTypeEnum b : ContainerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContainerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContainerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContainerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContainerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("containerType")
  private ContainerTypeEnum containerType = null;

  @SerializedName("containerIdentifier")
  private String containerIdentifier = null;

  @SerializedName("trackingNumber")
  private String trackingNumber = null;

  @SerializedName("manifestId")
  private String manifestId = null;

  @SerializedName("manifestDate")
  private String manifestDate = null;

  @SerializedName("shipMethod")
  private String shipMethod = null;

  @SerializedName("scacCode")
  private String scacCode = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("containerSequenceNumber")
  private Integer containerSequenceNumber = null;

  @SerializedName("dimensions")
  private Dimensions dimensions = null;

  @SerializedName("weight")
  private Weight weight = null;

  @SerializedName("packedItems")
  private List<PackedItem> packedItems = new ArrayList<PackedItem>();

  public Container containerType(ContainerTypeEnum containerType) {
    this.containerType = containerType;
    return this;
  }

   /**
   * The type of container.
   * @return containerType
  **/
  @ApiModelProperty(required = true, value = "The type of container.")
  public ContainerTypeEnum getContainerType() {
    return containerType;
  }

  public void setContainerType(ContainerTypeEnum containerType) {
    this.containerType = containerType;
  }

  public Container containerIdentifier(String containerIdentifier) {
    this.containerIdentifier = containerIdentifier;
    return this;
  }

   /**
   * The container identifier.
   * @return containerIdentifier
  **/
  @ApiModelProperty(required = true, value = "The container identifier.")
  public String getContainerIdentifier() {
    return containerIdentifier;
  }

  public void setContainerIdentifier(String containerIdentifier) {
    this.containerIdentifier = containerIdentifier;
  }

  public Container trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * The tracking number.
   * @return trackingNumber
  **/
  @ApiModelProperty(value = "The tracking number.")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public Container manifestId(String manifestId) {
    this.manifestId = manifestId;
    return this;
  }

   /**
   * The manifest identifier.
   * @return manifestId
  **/
  @ApiModelProperty(value = "The manifest identifier.")
  public String getManifestId() {
    return manifestId;
  }

  public void setManifestId(String manifestId) {
    this.manifestId = manifestId;
  }

  public Container manifestDate(String manifestDate) {
    this.manifestDate = manifestDate;
    return this;
  }

   /**
   * The date of the manifest.
   * @return manifestDate
  **/
  @ApiModelProperty(value = "The date of the manifest.")
  public String getManifestDate() {
    return manifestDate;
  }

  public void setManifestDate(String manifestDate) {
    this.manifestDate = manifestDate;
  }

  public Container shipMethod(String shipMethod) {
    this.shipMethod = shipMethod;
    return this;
  }

   /**
   * The shipment method.
   * @return shipMethod
  **/
  @ApiModelProperty(value = "The shipment method.")
  public String getShipMethod() {
    return shipMethod;
  }

  public void setShipMethod(String shipMethod) {
    this.shipMethod = shipMethod;
  }

  public Container scacCode(String scacCode) {
    this.scacCode = scacCode;
    return this;
  }

   /**
   * SCAC code required for NA VOC vendors only.
   * @return scacCode
  **/
  @ApiModelProperty(value = "SCAC code required for NA VOC vendors only.")
  public String getScacCode() {
    return scacCode;
  }

  public void setScacCode(String scacCode) {
    this.scacCode = scacCode;
  }

  public Container carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Carrier required for EU VOC vendors only.
   * @return carrier
  **/
  @ApiModelProperty(value = "Carrier required for EU VOC vendors only.")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public Container containerSequenceNumber(Integer containerSequenceNumber) {
    this.containerSequenceNumber = containerSequenceNumber;
    return this;
  }

   /**
   * An integer that must be submitted for multi-box shipments only, where one item may come in separate packages.
   * @return containerSequenceNumber
  **/
  @ApiModelProperty(value = "An integer that must be submitted for multi-box shipments only, where one item may come in separate packages.")
  public Integer getContainerSequenceNumber() {
    return containerSequenceNumber;
  }

  public void setContainerSequenceNumber(Integer containerSequenceNumber) {
    this.containerSequenceNumber = containerSequenceNumber;
  }

  public Container dimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(value = "")
  public Dimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Container weight(Weight weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Weight getWeight() {
    return weight;
  }

  public void setWeight(Weight weight) {
    this.weight = weight;
  }

  public Container packedItems(List<PackedItem> packedItems) {
    this.packedItems = packedItems;
    return this;
  }

  public Container addPackedItemsItem(PackedItem packedItemsItem) {
    this.packedItems.add(packedItemsItem);
    return this;
  }

   /**
   * A list of packed items.
   * @return packedItems
  **/
  @ApiModelProperty(required = true, value = "A list of packed items.")
  public List<PackedItem> getPackedItems() {
    return packedItems;
  }

  public void setPackedItems(List<PackedItem> packedItems) {
    this.packedItems = packedItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Container container = (Container) o;
    return Objects.equals(this.containerType, container.containerType) &&
        Objects.equals(this.containerIdentifier, container.containerIdentifier) &&
        Objects.equals(this.trackingNumber, container.trackingNumber) &&
        Objects.equals(this.manifestId, container.manifestId) &&
        Objects.equals(this.manifestDate, container.manifestDate) &&
        Objects.equals(this.shipMethod, container.shipMethod) &&
        Objects.equals(this.scacCode, container.scacCode) &&
        Objects.equals(this.carrier, container.carrier) &&
        Objects.equals(this.containerSequenceNumber, container.containerSequenceNumber) &&
        Objects.equals(this.dimensions, container.dimensions) &&
        Objects.equals(this.weight, container.weight) &&
        Objects.equals(this.packedItems, container.packedItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerType, containerIdentifier, trackingNumber, manifestId, manifestDate, shipMethod, scacCode, carrier, containerSequenceNumber, dimensions, weight, packedItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
    sb.append("    containerIdentifier: ").append(toIndentedString(containerIdentifier)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    manifestDate: ").append(toIndentedString(manifestDate)).append("\n");
    sb.append("    shipMethod: ").append(toIndentedString(shipMethod)).append("\n");
    sb.append("    scacCode: ").append(toIndentedString(scacCode)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    containerSequenceNumber: ").append(toIndentedString(containerSequenceNumber)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    packedItems: ").append(toIndentedString(packedItems)).append("\n");
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

