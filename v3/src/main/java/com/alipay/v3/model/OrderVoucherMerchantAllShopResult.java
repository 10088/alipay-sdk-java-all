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
import com.alipay.v3.model.OrderVoucherShopFailInfo;
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
 * OrderVoucherMerchantAllShopResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderVoucherMerchantAllShopResult {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXCLUDE_SHOP_FAIL_INFOS = "exclude_shop_fail_infos";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_SHOP_FAIL_INFOS)
  private List<OrderVoucherShopFailInfo> excludeShopFailInfos = null;

  public static final String SERIALIZED_NAME_SUCCESS_EXCLUDE_SHOP_IDS = "success_exclude_shop_ids";
  @SerializedName(SERIALIZED_NAME_SUCCESS_EXCLUDE_SHOP_IDS)
  private List<String> successExcludeShopIds = null;

  public OrderVoucherMerchantAllShopResult() { 
  }

  public OrderVoucherMerchantAllShopResult excludeShopFailInfos(List<OrderVoucherShopFailInfo> excludeShopFailInfos) {
    
    this.excludeShopFailInfos = excludeShopFailInfos;
    return this;
  }

  public OrderVoucherMerchantAllShopResult addExcludeShopFailInfosItem(OrderVoucherShopFailInfo excludeShopFailInfosItem) {
    if (this.excludeShopFailInfos == null) {
      this.excludeShopFailInfos = new ArrayList<>();
    }
    this.excludeShopFailInfos.add(excludeShopFailInfosItem);
    return this;
  }

   /**
   * 请求失败的不可用门店详情。
   * @return excludeShopFailInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求失败的不可用门店详情。")

  public List<OrderVoucherShopFailInfo> getExcludeShopFailInfos() {
    return excludeShopFailInfos;
  }


  public void setExcludeShopFailInfos(List<OrderVoucherShopFailInfo> excludeShopFailInfos) {
    this.excludeShopFailInfos = excludeShopFailInfos;
  }


  public OrderVoucherMerchantAllShopResult successExcludeShopIds(List<String> successExcludeShopIds) {
    
    this.successExcludeShopIds = successExcludeShopIds;
    return this;
  }

  public OrderVoucherMerchantAllShopResult addSuccessExcludeShopIdsItem(String successExcludeShopIdsItem) {
    if (this.successExcludeShopIds == null) {
      this.successExcludeShopIds = new ArrayList<>();
    }
    this.successExcludeShopIds.add(successExcludeShopIdsItem);
    return this;
  }

   /**
   * 请求成功的不可用门店列表。
   * @return successExcludeShopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "请求成功的不可用门店列表。")

  public List<String> getSuccessExcludeShopIds() {
    return successExcludeShopIds;
  }


  public void setSuccessExcludeShopIds(List<String> successExcludeShopIds) {
    this.successExcludeShopIds = successExcludeShopIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderVoucherMerchantAllShopResult orderVoucherMerchantAllShopResult = (OrderVoucherMerchantAllShopResult) o;
    return Objects.equals(this.excludeShopFailInfos, orderVoucherMerchantAllShopResult.excludeShopFailInfos) &&
        Objects.equals(this.successExcludeShopIds, orderVoucherMerchantAllShopResult.successExcludeShopIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeShopFailInfos, successExcludeShopIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderVoucherMerchantAllShopResult {\n");
    sb.append("    excludeShopFailInfos: ").append(toIndentedString(excludeShopFailInfos)).append("\n");
    sb.append("    successExcludeShopIds: ").append(toIndentedString(successExcludeShopIds)).append("\n");
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
    openapiFields.add("exclude_shop_fail_infos");
    openapiFields.add("success_exclude_shop_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderVoucherMerchantAllShopResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderVoucherMerchantAllShopResult.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderVoucherMerchantAllShopResult is not found in the empty JSON string", OrderVoucherMerchantAllShopResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderVoucherMerchantAllShopResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderVoucherMerchantAllShopResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayexcludeShopFailInfos = jsonObj.getAsJsonArray("exclude_shop_fail_infos");
      if (jsonArrayexcludeShopFailInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("exclude_shop_fail_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `exclude_shop_fail_infos` to be an array in the JSON string but got `%s`", jsonObj.get("exclude_shop_fail_infos").toString()));
        }

        // validate the optional field `exclude_shop_fail_infos` (array)
        for (int i = 0; i < jsonArrayexcludeShopFailInfos.size(); i++) {
          OrderVoucherShopFailInfo.validateJsonObject(jsonArrayexcludeShopFailInfos.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("success_exclude_shop_ids") != null && !jsonObj.get("success_exclude_shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `success_exclude_shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("success_exclude_shop_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderVoucherMerchantAllShopResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderVoucherMerchantAllShopResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderVoucherMerchantAllShopResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderVoucherMerchantAllShopResult.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderVoucherMerchantAllShopResult>() {
           @Override
           public void write(JsonWriter out, OrderVoucherMerchantAllShopResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderVoucherMerchantAllShopResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderVoucherMerchantAllShopResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderVoucherMerchantAllShopResult
  * @throws IOException if the JSON string is invalid with respect to OrderVoucherMerchantAllShopResult
  */
  public static OrderVoucherMerchantAllShopResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderVoucherMerchantAllShopResult.class);
  }

 /**
  * Convert an instance of OrderVoucherMerchantAllShopResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

