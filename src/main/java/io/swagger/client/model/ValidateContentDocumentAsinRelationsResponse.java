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
import io.swagger.client.model.AplusResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.ErrorList;
import io.swagger.client.model.MessageSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidateContentDocumentAsinRelationsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:18.330+05:00")
public class ValidateContentDocumentAsinRelationsResponse {
  @SerializedName("warnings")
  private MessageSet warnings = null;

  @SerializedName("errors")
  private List<Error> errors = new ArrayList<Error>();

  public ValidateContentDocumentAsinRelationsResponse warnings(MessageSet warnings) {
    this.warnings = warnings;
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @ApiModelProperty(value = "")
  public MessageSet getWarnings() {
    return warnings;
  }

  public void setWarnings(MessageSet warnings) {
    this.warnings = warnings;
  }

  public ValidateContentDocumentAsinRelationsResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ValidateContentDocumentAsinRelationsResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A list of error responses returned when a request is unsuccessful.
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "A list of error responses returned when a request is unsuccessful.")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateContentDocumentAsinRelationsResponse validateContentDocumentAsinRelationsResponse = (ValidateContentDocumentAsinRelationsResponse) o;
    return Objects.equals(this.warnings, validateContentDocumentAsinRelationsResponse.warnings) &&
        Objects.equals(this.errors, validateContentDocumentAsinRelationsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warnings, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateContentDocumentAsinRelationsResponse {\n");
    
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

