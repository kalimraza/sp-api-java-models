/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Where the seller provided box contents information for a shipment.
 */
@JsonAdapter(BoxContentsSource.Adapter.class)
public enum BoxContentsSource {
  
  NONE("NONE"),
  
  FEED("FEED"),
  
  _2D_BARCODE("2D_BARCODE"),
  
  INTERACTIVE("INTERACTIVE");

  private String value;

  BoxContentsSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BoxContentsSource fromValue(String text) {
    for (BoxContentsSource b : BoxContentsSource.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BoxContentsSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final BoxContentsSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BoxContentsSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BoxContentsSource.fromValue(String.valueOf(value));
    }
  }
}

