/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Corresponds to xmpDM.TimeSignatureChoice
 */
@JsonAdapter(TimeSignature.Adapter.class)
public enum TimeSignature {
  
  _2_4("TIME_2_4"),
  
  _3_4("TIME_3_4"),
  
  _4_4("TIME_4_4"),
  
  _5_4("TIME_5_4"),
  
  _7_4("TIME_7_4"),
  
  _6_8("TIME_6_8"),
  
  _9_8("TIME_9_8"),
  
  _12_8("TIME_12_8"),
  
  OTHER("TIME_OTHER");

  private String value;

  TimeSignature(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TimeSignature fromValue(String text) {
    for (TimeSignature b : TimeSignature.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TimeSignature> {
    @Override
    public void write(final JsonWriter jsonWriter, final TimeSignature enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TimeSignature read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TimeSignature.fromValue(String.valueOf(value));
    }
  }
}

