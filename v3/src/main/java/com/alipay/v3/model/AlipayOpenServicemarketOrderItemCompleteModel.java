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
 * AlipayOpenServicemarketOrderItemCompleteModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenServicemarketOrderItemCompleteModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMMODITY_ORDER_ID = "commodity_order_id";
  @SerializedName(SERIALIZED_NAME_COMMODITY_ORDER_ID)
  private String commodityOrderId;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public AlipayOpenServicemarketOrderItemCompleteModel() { 
  }

  public AlipayOpenServicemarketOrderItemCompleteModel commodityOrderId(String commodityOrderId) {
    
    this.commodityOrderId = commodityOrderId;
    return this;
  }

   /**
   * 订购服务插件订单号
   * @return commodityOrderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160010200000000033400", value = "订购服务插件订单号")

  public String getCommodityOrderId() {
    return commodityOrderId;
  }


  public void setCommodityOrderId(String commodityOrderId) {
    this.commodityOrderId = commodityOrderId;
  }


  public AlipayOpenServicemarketOrderItemCompleteModel miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 商家订购服务选择的某一小程序的APPID，如果该订单为蚂蚁服务市场发布的小程序插件服务所产生的订单，则此字段必填
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017121800945174", value = "商家订购服务选择的某一小程序的APPID，如果该订单为蚂蚁服务市场发布的小程序插件服务所产生的订单，则此字段必填")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public AlipayOpenServicemarketOrderItemCompleteModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 商家订购服务选择的某一门店的ID。若该订单： 为支付宝服务市场发布的服务所产生订单则该参数可选。 为口碑服务市场发布的服务所产生的订单，则此字段必填。口碑服务市场参见 http://fuwu.koubei.com/commodity/v2/merchandise/index.htm。
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015052000077000000000182140", value = "商家订购服务选择的某一门店的ID。若该订单： 为支付宝服务市场发布的服务所产生订单则该参数可选。 为口碑服务市场发布的服务所产生的订单，则此字段必填。口碑服务市场参见 http://fuwu.koubei.com/commodity/v2/merchandise/index.htm。")

  public String getShopId() {
    return shopId;
  }


  public void setShopId(String shopId) {
    this.shopId = shopId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenServicemarketOrderItemCompleteModel alipayOpenServicemarketOrderItemCompleteModel = (AlipayOpenServicemarketOrderItemCompleteModel) o;
    return Objects.equals(this.commodityOrderId, alipayOpenServicemarketOrderItemCompleteModel.commodityOrderId) &&
        Objects.equals(this.miniAppId, alipayOpenServicemarketOrderItemCompleteModel.miniAppId) &&
        Objects.equals(this.shopId, alipayOpenServicemarketOrderItemCompleteModel.shopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityOrderId, miniAppId, shopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenServicemarketOrderItemCompleteModel {\n");
    sb.append("    commodityOrderId: ").append(toIndentedString(commodityOrderId)).append("\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
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
    openapiFields.add("commodity_order_id");
    openapiFields.add("mini_app_id");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenServicemarketOrderItemCompleteModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenServicemarketOrderItemCompleteModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenServicemarketOrderItemCompleteModel is not found in the empty JSON string", AlipayOpenServicemarketOrderItemCompleteModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenServicemarketOrderItemCompleteModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenServicemarketOrderItemCompleteModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("commodity_order_id") != null && !jsonObj.get("commodity_order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_order_id").toString()));
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenServicemarketOrderItemCompleteModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenServicemarketOrderItemCompleteModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenServicemarketOrderItemCompleteModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenServicemarketOrderItemCompleteModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenServicemarketOrderItemCompleteModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenServicemarketOrderItemCompleteModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenServicemarketOrderItemCompleteModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenServicemarketOrderItemCompleteModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenServicemarketOrderItemCompleteModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenServicemarketOrderItemCompleteModel
  */
  public static AlipayOpenServicemarketOrderItemCompleteModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenServicemarketOrderItemCompleteModel.class);
  }

 /**
  * Convert an instance of AlipayOpenServicemarketOrderItemCompleteModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

