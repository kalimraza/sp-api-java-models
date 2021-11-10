/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
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
import io.swagger.client.model.AdditionalSellerInput;
import java.io.IOException;

/**
 * An additional set of seller inputs required to purchase shipping.
 */
@ApiModel(description = "An additional set of seller inputs required to purchase shipping.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:45.729+05:00")
public class AdditionalSellerInputs {
  @SerializedName("AdditionalInputFieldName")
  private String additionalInputFieldName = null;

  @SerializedName("AdditionalSellerInput")
  private AdditionalSellerInput additionalSellerInput = null;

  public AdditionalSellerInputs additionalInputFieldName(String additionalInputFieldName) {
    this.additionalInputFieldName = additionalInputFieldName;
    return this;
  }

   /**
   * The name of the additional input field.
   * @return additionalInputFieldName
  **/
  @ApiModelProperty(required = true, value = "The name of the additional input field.")
  public String getAdditionalInputFieldName() {
    return additionalInputFieldName;
  }

  public void setAdditionalInputFieldName(String additionalInputFieldName) {
    this.additionalInputFieldName = additionalInputFieldName;
  }

  public AdditionalSellerInputs additionalSellerInput(AdditionalSellerInput additionalSellerInput) {
    this.additionalSellerInput = additionalSellerInput;
    return this;
  }

   /**
   * Get additionalSellerInput
   * @return additionalSellerInput
  **/
  @ApiModelProperty(required = true, value = "")
  public AdditionalSellerInput getAdditionalSellerInput() {
    return additionalSellerInput;
  }

  public void setAdditionalSellerInput(AdditionalSellerInput additionalSellerInput) {
    this.additionalSellerInput = additionalSellerInput;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalSellerInputs additionalSellerInputs = (AdditionalSellerInputs) o;
    return Objects.equals(this.additionalInputFieldName, additionalSellerInputs.additionalInputFieldName) &&
        Objects.equals(this.additionalSellerInput, additionalSellerInputs.additionalSellerInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInputFieldName, additionalSellerInput);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalSellerInputs {\n");
    
    sb.append("    additionalInputFieldName: ").append(toIndentedString(additionalInputFieldName)).append("\n");
    sb.append("    additionalSellerInput: ").append(toIndentedString(additionalSellerInput)).append("\n");
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
