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
import com.alipay.v3.model.EcOrderItem;
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
 * EcOrderInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EcOrderInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORDER_INFO = "order_info";
  @SerializedName(SERIALIZED_NAME_ORDER_INFO)
  private EcOrderItem orderInfo;

  public static final String SERIALIZED_NAME_SUB_ORDER_LIST = "sub_order_list";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_LIST)
  private List<EcOrderItem> subOrderList = null;

  public EcOrderInfo() { 
  }

  public EcOrderInfo orderInfo(EcOrderItem orderInfo) {
    
    this.orderInfo = orderInfo;
    return this;
  }

   /**
   * Get orderInfo
   * @return orderInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EcOrderItem getOrderInfo() {
    return orderInfo;
  }


  public void setOrderInfo(EcOrderItem orderInfo) {
    this.orderInfo = orderInfo;
  }


  public EcOrderInfo subOrderList(List<EcOrderItem> subOrderList) {
    
    this.subOrderList = subOrderList;
    return this;
  }

  public EcOrderInfo addSubOrderListItem(EcOrderItem subOrderListItem) {
    if (this.subOrderList == null) {
      this.subOrderList = new ArrayList<>();
    }
    this.subOrderList.add(subOrderListItem);
    return this;
  }

   /**
   * 子订单详情列表
   * @return subOrderList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "子订单详情列表")

  public List<EcOrderItem> getSubOrderList() {
    return subOrderList;
  }


  public void setSubOrderList(List<EcOrderItem> subOrderList) {
    this.subOrderList = subOrderList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EcOrderInfo ecOrderInfo = (EcOrderInfo) o;
    return Objects.equals(this.orderInfo, ecOrderInfo.orderInfo) &&
        Objects.equals(this.subOrderList, ecOrderInfo.subOrderList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderInfo, subOrderList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EcOrderInfo {\n");
    sb.append("    orderInfo: ").append(toIndentedString(orderInfo)).append("\n");
    sb.append("    subOrderList: ").append(toIndentedString(subOrderList)).append("\n");
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
    openapiFields.add("order_info");
    openapiFields.add("sub_order_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EcOrderInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EcOrderInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EcOrderInfo is not found in the empty JSON string", EcOrderInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EcOrderInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EcOrderInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `order_info`
      if (jsonObj.getAsJsonObject("order_info") != null) {
        EcOrderItem.validateJsonObject(jsonObj.getAsJsonObject("order_info"));
      }
      JsonArray jsonArraysubOrderList = jsonObj.getAsJsonArray("sub_order_list");
      if (jsonArraysubOrderList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sub_order_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sub_order_list` to be an array in the JSON string but got `%s`", jsonObj.get("sub_order_list").toString()));
        }

        // validate the optional field `sub_order_list` (array)
        for (int i = 0; i < jsonArraysubOrderList.size(); i++) {
          EcOrderItem.validateJsonObject(jsonArraysubOrderList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EcOrderInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EcOrderInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EcOrderInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EcOrderInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EcOrderInfo>() {
           @Override
           public void write(JsonWriter out, EcOrderInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EcOrderInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EcOrderInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EcOrderInfo
  * @throws IOException if the JSON string is invalid with respect to EcOrderInfo
  */
  public static EcOrderInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EcOrderInfo.class);
  }

 /**
  * Convert an instance of EcOrderInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

