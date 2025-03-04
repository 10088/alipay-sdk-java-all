/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2022-12-30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.AuthFieldDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * AuthFieldResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthFieldResponse {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<AuthFieldDTO> records = null;

  public AuthFieldResponse() { 
  }

  public AuthFieldResponse records(List<AuthFieldDTO> records) {
    
    this.records = records;
    return this;
  }

  public AuthFieldResponse addRecordsItem(AuthFieldDTO recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * 用户信息申请记录列表
   * @return records
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户信息申请记录列表")

  public List<AuthFieldDTO> getRecords() {
    return records;
  }


  public void setRecords(List<AuthFieldDTO> records) {
    this.records = records;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthFieldResponse authFieldResponse = (AuthFieldResponse) o;
    return Objects.equals(this.records, authFieldResponse.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthFieldResponse {\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("records");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthFieldResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthFieldResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthFieldResponse is not found in the empty JSON string", AuthFieldResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthFieldResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthFieldResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("records");
      if (jsonArrayrecords != null) {
        // ensure the json data is an array
        if (!jsonObj.get("records").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `records` to be an array in the JSON string but got `%s`", jsonObj.get("records").toString()));
        }

        // validate the optional field `records` (array)
        for (int i = 0; i < jsonArrayrecords.size(); i++) {
          AuthFieldDTO.validateJsonObject(jsonArrayrecords.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthFieldResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthFieldResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthFieldResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthFieldResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthFieldResponse>() {
           @Override
           public void write(JsonWriter out, AuthFieldResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthFieldResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthFieldResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthFieldResponse
  * @throws IOException if the JSON string is invalid with respect to AuthFieldResponse
  */
  public static AuthFieldResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthFieldResponse.class);
  }

 /**
  * Convert an instance of AuthFieldResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

