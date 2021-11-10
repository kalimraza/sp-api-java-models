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
 * Indicates who will prepare the item.
 */
@JsonAdapter(PrepOwner.Adapter.class)
public enum PrepOwner {
  
  AMAZON("AMAZON"),
  
  SELLER("SELLER");

  private String value;

  PrepOwner(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PrepOwner fromValue(String text) {
    for (PrepOwner b : PrepOwner.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PrepOwner> {
    @Override
    public void write(final JsonWriter jsonWriter, final PrepOwner enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PrepOwner read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PrepOwner.fromValue(String.valueOf(value));
    }
  }
}

