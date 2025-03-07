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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * OrderExtInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderExtInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXT_KEY = "ext_key";
  @SerializedName(SERIALIZED_NAME_EXT_KEY)
  private String extKey;

  public static final String SERIALIZED_NAME_EXT_VALUE = "ext_value";
  @SerializedName(SERIALIZED_NAME_EXT_VALUE)
  private String extValue;

  public OrderExtInfo() { 
  }

  public OrderExtInfo extKey(String extKey) {
    
    this.extKey = extKey;
    return this;
  }

   /**
   * 键值
   * @return extKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "键值")

  public String getExtKey() {
    return extKey;
  }


  public void setExtKey(String extKey) {
    this.extKey = extKey;
  }


  public OrderExtInfo extValue(String extValue) {
    
    this.extValue = extValue;
    return this;
  }

   /**
   * 值
   * @return extValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "值")

  public String getExtValue() {
    return extValue;
  }


  public void setExtValue(String extValue) {
    this.extValue = extValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderExtInfo orderExtInfo = (OrderExtInfo) o;
    return Objects.equals(this.extKey, orderExtInfo.extKey) &&
        Objects.equals(this.extValue, orderExtInfo.extValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extKey, extValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderExtInfo {\n");
    sb.append("    extKey: ").append(toIndentedString(extKey)).append("\n");
    sb.append("    extValue: ").append(toIndentedString(extValue)).append("\n");
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
    openapiFields.add("ext_key");
    openapiFields.add("ext_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderExtInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderExtInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderExtInfo is not found in the empty JSON string", OrderExtInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderExtInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderExtInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ext_key") != null && !jsonObj.get("ext_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_key").toString()));
      }
      if (jsonObj.get("ext_value") != null && !jsonObj.get("ext_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderExtInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderExtInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderExtInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderExtInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderExtInfo>() {
           @Override
           public void write(JsonWriter out, OrderExtInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderExtInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderExtInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderExtInfo
  * @throws IOException if the JSON string is invalid with respect to OrderExtInfo
  */
  public static OrderExtInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderExtInfo.class);
  }

 /**
  * Convert an instance of OrderExtInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

