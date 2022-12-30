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
import com.alipay.v3.model.VoucherAvailableGeographyCityInfo;
import com.alipay.v3.model.VoucherAvailableGeographyShopInfo;
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
 * VoucherAvailableGeographyScopeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherAvailableGeographyScopeInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_CITY_INFO = "available_geography_city_info";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_CITY_INFO)
  private VoucherAvailableGeographyCityInfo availableGeographyCityInfo;

  public static final String SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_SCOPE_TYPE = "available_geography_scope_type";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_SCOPE_TYPE)
  private String availableGeographyScopeType;

  public static final String SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_SHOP_INFO = "available_geography_shop_info";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_GEOGRAPHY_SHOP_INFO)
  private VoucherAvailableGeographyShopInfo availableGeographyShopInfo;

  public VoucherAvailableGeographyScopeInfo() { 
  }

  public VoucherAvailableGeographyScopeInfo availableGeographyCityInfo(VoucherAvailableGeographyCityInfo availableGeographyCityInfo) {
    
    this.availableGeographyCityInfo = availableGeographyCityInfo;
    return this;
  }

   /**
   * Get availableGeographyCityInfo
   * @return availableGeographyCityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableGeographyCityInfo getAvailableGeographyCityInfo() {
    return availableGeographyCityInfo;
  }


  public void setAvailableGeographyCityInfo(VoucherAvailableGeographyCityInfo availableGeographyCityInfo) {
    this.availableGeographyCityInfo = availableGeographyCityInfo;
  }


  public VoucherAvailableGeographyScopeInfo availableGeographyScopeType(String availableGeographyScopeType) {
    
    this.availableGeographyScopeType = availableGeographyScopeType;
    return this;
  }

   /**
   * 券可用地理位置类型。
   * @return availableGeographyScopeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可用地理位置类型。")

  public String getAvailableGeographyScopeType() {
    return availableGeographyScopeType;
  }


  public void setAvailableGeographyScopeType(String availableGeographyScopeType) {
    this.availableGeographyScopeType = availableGeographyScopeType;
  }


  public VoucherAvailableGeographyScopeInfo availableGeographyShopInfo(VoucherAvailableGeographyShopInfo availableGeographyShopInfo) {
    
    this.availableGeographyShopInfo = availableGeographyShopInfo;
    return this;
  }

   /**
   * Get availableGeographyShopInfo
   * @return availableGeographyShopInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableGeographyShopInfo getAvailableGeographyShopInfo() {
    return availableGeographyShopInfo;
  }


  public void setAvailableGeographyShopInfo(VoucherAvailableGeographyShopInfo availableGeographyShopInfo) {
    this.availableGeographyShopInfo = availableGeographyShopInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherAvailableGeographyScopeInfo voucherAvailableGeographyScopeInfo = (VoucherAvailableGeographyScopeInfo) o;
    return Objects.equals(this.availableGeographyCityInfo, voucherAvailableGeographyScopeInfo.availableGeographyCityInfo) &&
        Objects.equals(this.availableGeographyScopeType, voucherAvailableGeographyScopeInfo.availableGeographyScopeType) &&
        Objects.equals(this.availableGeographyShopInfo, voucherAvailableGeographyScopeInfo.availableGeographyShopInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableGeographyCityInfo, availableGeographyScopeType, availableGeographyShopInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherAvailableGeographyScopeInfo {\n");
    sb.append("    availableGeographyCityInfo: ").append(toIndentedString(availableGeographyCityInfo)).append("\n");
    sb.append("    availableGeographyScopeType: ").append(toIndentedString(availableGeographyScopeType)).append("\n");
    sb.append("    availableGeographyShopInfo: ").append(toIndentedString(availableGeographyShopInfo)).append("\n");
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
    openapiFields.add("available_geography_city_info");
    openapiFields.add("available_geography_scope_type");
    openapiFields.add("available_geography_shop_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherAvailableGeographyScopeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherAvailableGeographyScopeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherAvailableGeographyScopeInfo is not found in the empty JSON string", VoucherAvailableGeographyScopeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherAvailableGeographyScopeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherAvailableGeographyScopeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `available_geography_city_info`
      if (jsonObj.getAsJsonObject("available_geography_city_info") != null) {
        VoucherAvailableGeographyCityInfo.validateJsonObject(jsonObj.getAsJsonObject("available_geography_city_info"));
      }
      if (jsonObj.get("available_geography_scope_type") != null && !jsonObj.get("available_geography_scope_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_geography_scope_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_geography_scope_type").toString()));
      }
      // validate the optional field `available_geography_shop_info`
      if (jsonObj.getAsJsonObject("available_geography_shop_info") != null) {
        VoucherAvailableGeographyShopInfo.validateJsonObject(jsonObj.getAsJsonObject("available_geography_shop_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherAvailableGeographyScopeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherAvailableGeographyScopeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherAvailableGeographyScopeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherAvailableGeographyScopeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherAvailableGeographyScopeInfo>() {
           @Override
           public void write(JsonWriter out, VoucherAvailableGeographyScopeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherAvailableGeographyScopeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherAvailableGeographyScopeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherAvailableGeographyScopeInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherAvailableGeographyScopeInfo
  */
  public static VoucherAvailableGeographyScopeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherAvailableGeographyScopeInfo.class);
  }

 /**
  * Convert an instance of VoucherAvailableGeographyScopeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

