/*
 * Selling Partner API for FBA Small And Light
 * The Selling Partner API for FBA Small and Light lets you help sellers manage their listings in the Small and Light program. The program reduces the cost of fulfilling orders for small and lightweight FBA inventory. You can enroll or remove items from the program and check item eligibility and enrollment status. You can also preview the estimated program fees charged to a seller for items sold while enrolled in the program.
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
import io.swagger.client.model.MoneyType;
import java.io.IOException;

/**
 * Fee details for a specific fee.
 */
@ApiModel(description = "Fee details for a specific fee.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:26.200+05:00")
public class FeeLineItem {
  /**
   * The type of fee charged to the seller.
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
  public enum FeeTypeEnum {
    FBAWEIGHTBASEDFEE("FBAWeightBasedFee"),
    
    FBAPERORDERFULFILLMENTFEE("FBAPerOrderFulfillmentFee"),
    
    FBAPERUNITFULFILLMENTFEE("FBAPerUnitFulfillmentFee"),
    
    COMMISSION("Commission");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeeTypeEnum fromValue(String text) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FeeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FeeTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("feeType")
  private FeeTypeEnum feeType = null;

  @SerializedName("feeCharge")
  private MoneyType feeCharge = null;

  public FeeLineItem feeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
    return this;
  }

   /**
   * The type of fee charged to the seller.
   * @return feeType
  **/
  @ApiModelProperty(required = true, value = "The type of fee charged to the seller.")
  public FeeTypeEnum getFeeType() {
    return feeType;
  }

  public void setFeeType(FeeTypeEnum feeType) {
    this.feeType = feeType;
  }

  public FeeLineItem feeCharge(MoneyType feeCharge) {
    this.feeCharge = feeCharge;
    return this;
  }

   /**
   * Amount charged to the seller for the specific fee type.
   * @return feeCharge
  **/
  @ApiModelProperty(required = true, value = "Amount charged to the seller for the specific fee type.")
  public MoneyType getFeeCharge() {
    return feeCharge;
  }

  public void setFeeCharge(MoneyType feeCharge) {
    this.feeCharge = feeCharge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeeLineItem feeLineItem = (FeeLineItem) o;
    return Objects.equals(this.feeType, feeLineItem.feeType) &&
        Objects.equals(this.feeCharge, feeLineItem.feeCharge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, feeCharge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeLineItem {\n");
    
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    feeCharge: ").append(toIndentedString(feeCharge)).append("\n");
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

