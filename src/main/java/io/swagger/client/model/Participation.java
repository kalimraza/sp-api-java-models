/*
 * Selling Partner API for Sellers
 * The Selling Partner API for Sellers lets you retrieve information on behalf of sellers about their seller account, such as the marketplaces they participate in. Along with listing the marketplaces that a seller can sell in, the API also provides additional information about the marketplace such as the default language and the default currency. The API also provides seller-specific information such as whether the seller has suspended listings in that marketplace.
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
 * Detailed information that is specific to a seller in a Marketplace.
 */
@ApiModel(description = "Detailed information that is specific to a seller in a Marketplace.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:39:06.842+05:00")
public class Participation {
  @SerializedName("isParticipating")
  private Boolean isParticipating = null;

  @SerializedName("hasSuspendedListings")
  private Boolean hasSuspendedListings = null;

  public Participation isParticipating(Boolean isParticipating) {
    this.isParticipating = isParticipating;
    return this;
  }

   /**
   * Get isParticipating
   * @return isParticipating
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsParticipating() {
    return isParticipating;
  }

  public void setIsParticipating(Boolean isParticipating) {
    this.isParticipating = isParticipating;
  }

  public Participation hasSuspendedListings(Boolean hasSuspendedListings) {
    this.hasSuspendedListings = hasSuspendedListings;
    return this;
  }

   /**
   * Specifies if the seller has suspended listings. True if the seller Listing Status is set to Inactive, otherwise False.
   * @return hasSuspendedListings
  **/
  @ApiModelProperty(required = true, value = "Specifies if the seller has suspended listings. True if the seller Listing Status is set to Inactive, otherwise False.")
  public Boolean isHasSuspendedListings() {
    return hasSuspendedListings;
  }

  public void setHasSuspendedListings(Boolean hasSuspendedListings) {
    this.hasSuspendedListings = hasSuspendedListings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Participation participation = (Participation) o;
    return Objects.equals(this.isParticipating, participation.isParticipating) &&
        Objects.equals(this.hasSuspendedListings, participation.hasSuspendedListings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isParticipating, hasSuspendedListings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Participation {\n");
    
    sb.append("    isParticipating: ").append(toIndentedString(isParticipating)).append("\n");
    sb.append("    hasSuspendedListings: ").append(toIndentedString(hasSuspendedListings)).append("\n");
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

