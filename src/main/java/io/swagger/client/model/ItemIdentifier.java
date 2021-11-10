/*
 * Selling Partner API for Pricing
 * The Selling Partner API for Pricing helps you programmatically retrieve product pricing and offer information for Amazon Marketplace products.
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
import io.swagger.client.model.ConditionType;
import java.io.IOException;

/**
 * Information that identifies an item.
 */
@ApiModel(description = "Information that identifies an item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:59.024+05:00")
public class ItemIdentifier {
  @SerializedName("MarketplaceId")
  private String marketplaceId = null;

  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("ItemCondition")
  private ConditionType itemCondition = null;

  public ItemIdentifier marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

   /**
   * A marketplace identifier. Specifies the marketplace from which prices are returned.
   * @return marketplaceId
  **/
  @ApiModelProperty(required = true, value = "A marketplace identifier. Specifies the marketplace from which prices are returned.")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public ItemIdentifier ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public ItemIdentifier sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller stock keeping unit (SKU) of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(value = "The seller stock keeping unit (SKU) of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public ItemIdentifier itemCondition(ConditionType itemCondition) {
    this.itemCondition = itemCondition;
    return this;
  }

   /**
   * The condition of the item.
   * @return itemCondition
  **/
  @ApiModelProperty(required = true, value = "The condition of the item.")
  public ConditionType getItemCondition() {
    return itemCondition;
  }

  public void setItemCondition(ConditionType itemCondition) {
    this.itemCondition = itemCondition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemIdentifier itemIdentifier = (ItemIdentifier) o;
    return Objects.equals(this.marketplaceId, itemIdentifier.marketplaceId) &&
        Objects.equals(this.ASIN, itemIdentifier.ASIN) &&
        Objects.equals(this.sellerSKU, itemIdentifier.sellerSKU) &&
        Objects.equals(this.itemCondition, itemIdentifier.itemCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, ASIN, sellerSKU, itemCondition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemIdentifier {\n");
    
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    itemCondition: ").append(toIndentedString(itemCondition)).append("\n");
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

