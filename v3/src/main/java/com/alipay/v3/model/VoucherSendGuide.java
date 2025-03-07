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
 * VoucherSendGuide
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherSendGuide {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_URL = "voucher_detail_url";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_URL)
  private String voucherDetailUrl;

  public VoucherSendGuide() { 
  }

  public VoucherSendGuide voucherDetailUrl(String voucherDetailUrl) {
    
    this.voucherDetailUrl = voucherDetailUrl;
    return this;
  }

   /**
   * 领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。
   * @return voucherDetailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。")

  public String getVoucherDetailUrl() {
    return voucherDetailUrl;
  }


  public void setVoucherDetailUrl(String voucherDetailUrl) {
    this.voucherDetailUrl = voucherDetailUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherSendGuide voucherSendGuide = (VoucherSendGuide) o;
    return Objects.equals(this.voucherDetailUrl, voucherSendGuide.voucherDetailUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherDetailUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSendGuide {\n");
    sb.append("    voucherDetailUrl: ").append(toIndentedString(voucherDetailUrl)).append("\n");
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
    openapiFields.add("voucher_detail_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherSendGuide
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherSendGuide.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherSendGuide is not found in the empty JSON string", VoucherSendGuide.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherSendGuide.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherSendGuide` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("voucher_detail_url") != null && !jsonObj.get("voucher_detail_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_detail_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_detail_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherSendGuide.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherSendGuide' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherSendGuide> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherSendGuide.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherSendGuide>() {
           @Override
           public void write(JsonWriter out, VoucherSendGuide value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherSendGuide read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherSendGuide given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherSendGuide
  * @throws IOException if the JSON string is invalid with respect to VoucherSendGuide
  */
  public static VoucherSendGuide fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherSendGuide.class);
  }

 /**
  * Convert an instance of VoucherSendGuide to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

