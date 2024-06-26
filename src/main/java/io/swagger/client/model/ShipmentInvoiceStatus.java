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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The shipment invoice status.
 */
@JsonAdapter(ShipmentInvoiceStatus.Adapter.class)
public enum ShipmentInvoiceStatus {
  
  PROCESSING("Processing"),
  
  ACCEPTED("Accepted"),
  
  ERRORED("Errored"),
  
  NOTFOUND("NotFound");

  private String value;

  ShipmentInvoiceStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShipmentInvoiceStatus fromValue(String text) {
    for (ShipmentInvoiceStatus b : ShipmentInvoiceStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ShipmentInvoiceStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShipmentInvoiceStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShipmentInvoiceStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShipmentInvoiceStatus.fromValue(String.valueOf(value));
    }
  }
}

