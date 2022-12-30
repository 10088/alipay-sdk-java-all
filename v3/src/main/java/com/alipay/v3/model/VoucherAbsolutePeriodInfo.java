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
 * VoucherAbsolutePeriodInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAbsolutePeriodInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VALID_BEGIN_TIME = "valid_begin_time";
  @SerializedName(SERIALIZED_NAME_VALID_BEGIN_TIME)
  private String validBeginTime;

  public static final String SERIALIZED_NAME_VALID_END_TIME = "valid_end_time";
  @SerializedName(SERIALIZED_NAME_VALID_END_TIME)
  private String validEndTime;

  public VoucherAbsolutePeriodInfo() { 
  }

  public VoucherAbsolutePeriodInfo validBeginTime(String validBeginTime) {
    
    this.validBeginTime = validBeginTime;
    return this;
  }

   /**
   * 券可使用的开始时间。 格式为：yyyy-MM-dd HH:mm:ss。
   * @return validBeginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可使用的开始时间。 格式为：yyyy-MM-dd HH:mm:ss。")

  public String getValidBeginTime() {
    return validBeginTime;
  }


  public void setValidBeginTime(String validBeginTime) {
    this.validBeginTime = validBeginTime;
  }


  public VoucherAbsolutePeriodInfo validEndTime(String validEndTime) {
    
    this.validEndTime = validEndTime;
    return this;
  }

   /**
   * 券可使用的结束时间。 格式为yyyy-MM-dd HH:mm:ss。
   * @return validEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可使用的结束时间。 格式为yyyy-MM-dd HH:mm:ss。")

  public String getValidEndTime() {
    return validEndTime;
  }


  public void setValidEndTime(String validEndTime) {
    this.validEndTime = validEndTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherAbsolutePeriodInfo voucherAbsolutePeriodInfo = (VoucherAbsolutePeriodInfo) o;
    return Objects.equals(this.validBeginTime, voucherAbsolutePeriodInfo.validBeginTime) &&
        Objects.equals(this.validEndTime, voucherAbsolutePeriodInfo.validEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validBeginTime, validEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAbsolutePeriodInfo {\n");
    sb.append("    validBeginTime: ").append(toIndentedString(validBeginTime)).append("\n");
    sb.append("    validEndTime: ").append(toIndentedString(validEndTime)).append("\n");
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
    openapiFields.add("valid_begin_time");
    openapiFields.add("valid_end_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAbsolutePeriodInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAbsolutePeriodInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAbsolutePeriodInfo is not found in the empty JSON string", VoucherAbsolutePeriodInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherAbsolutePeriodInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherAbsolutePeriodInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("valid_begin_time") != null && !jsonObj.get("valid_begin_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_begin_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_begin_time").toString()));
      }
      if (jsonObj.get("valid_end_time") != null && !jsonObj.get("valid_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valid_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valid_end_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAbsolutePeriodInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAbsolutePeriodInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAbsolutePeriodInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAbsolutePeriodInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAbsolutePeriodInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAbsolutePeriodInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherAbsolutePeriodInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherAbsolutePeriodInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAbsolutePeriodInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAbsolutePeriodInfo
  */
  public static VoucherAbsolutePeriodInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAbsolutePeriodInfo.class);
  }

 /**
  * Convert an instance of VoucherAbsolutePeriodInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

