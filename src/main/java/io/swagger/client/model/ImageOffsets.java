/*
 * Selling Partner API for A+ Content Management
 * With the A+ Content API, you can build applications that help selling partners add rich marketing content to their Amazon product detail pages. A+ content helps selling partners share their brand and product story, which helps buyers make informed purchasing decisions. Selling partners assemble content by choosing from content modules and adding images and text.
 *
 * OpenAPI spec version: 2020-11-01
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
import io.swagger.client.model.IntegerWithUnits;
import java.io.IOException;

/**
 * The top left corner of the cropped image, specified in the original image&#39;s coordinate space.
 */
@ApiModel(description = "The top left corner of the cropped image, specified in the original image's coordinate space.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:18.330+05:00")
public class ImageOffsets {
  @SerializedName("x")
  private IntegerWithUnits x = null;

  @SerializedName("y")
  private IntegerWithUnits y = null;

  public ImageOffsets x(IntegerWithUnits x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(required = true, value = "")
  public IntegerWithUnits getX() {
    return x;
  }

  public void setX(IntegerWithUnits x) {
    this.x = x;
  }

  public ImageOffsets y(IntegerWithUnits y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(required = true, value = "")
  public IntegerWithUnits getY() {
    return y;
  }

  public void setY(IntegerWithUnits y) {
    this.y = y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageOffsets imageOffsets = (ImageOffsets) o;
    return Objects.equals(this.x, imageOffsets.x) &&
        Objects.equals(this.y, imageOffsets.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageOffsets {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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

