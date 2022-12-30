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
 * AlipayTradeSettleReceivablesQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeSettleReceivablesQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ON_SETTLE_AMOUNT = "on_settle_amount";
  @SerializedName(SERIALIZED_NAME_ON_SETTLE_AMOUNT)
  private String onSettleAmount;

  public static final String SERIALIZED_NAME_UNSETTLED_AMOUNT = "unsettled_amount";
  @SerializedName(SERIALIZED_NAME_UNSETTLED_AMOUNT)
  private String unsettledAmount;

  public AlipayTradeSettleReceivablesQueryResponseModel() { 
  }

  public AlipayTradeSettleReceivablesQueryResponseModel onSettleAmount(String onSettleAmount) {
    
    this.onSettleAmount = onSettleAmount;
    return this;
  }

   /**
   * 直付通请款模式下的结算在途金额，发起结算后 T+N 日到账场景下的处理中金额，人民币，单位为元
   * @return onSettleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.00", value = "直付通请款模式下的结算在途金额，发起结算后 T+N 日到账场景下的处理中金额，人民币，单位为元")

  public String getOnSettleAmount() {
    return onSettleAmount;
  }


  public void setOnSettleAmount(String onSettleAmount) {
    this.onSettleAmount = onSettleAmount;
  }


  public AlipayTradeSettleReceivablesQueryResponseModel unsettledAmount(String unsettledAmount) {
    
    this.unsettledAmount = unsettledAmount;
    return this;
  }

   /**
   * 待结算金额，人民币，单位为元
   * @return unsettledAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10000.00", value = "待结算金额，人民币，单位为元")

  public String getUnsettledAmount() {
    return unsettledAmount;
  }


  public void setUnsettledAmount(String unsettledAmount) {
    this.unsettledAmount = unsettledAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeSettleReceivablesQueryResponseModel alipayTradeSettleReceivablesQueryResponseModel = (AlipayTradeSettleReceivablesQueryResponseModel) o;
    return Objects.equals(this.onSettleAmount, alipayTradeSettleReceivablesQueryResponseModel.onSettleAmount) &&
        Objects.equals(this.unsettledAmount, alipayTradeSettleReceivablesQueryResponseModel.unsettledAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onSettleAmount, unsettledAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeSettleReceivablesQueryResponseModel {\n");
    sb.append("    onSettleAmount: ").append(toIndentedString(onSettleAmount)).append("\n");
    sb.append("    unsettledAmount: ").append(toIndentedString(unsettledAmount)).append("\n");
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
    openapiFields.add("on_settle_amount");
    openapiFields.add("unsettled_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeSettleReceivablesQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeSettleReceivablesQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeSettleReceivablesQueryResponseModel is not found in the empty JSON string", AlipayTradeSettleReceivablesQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeSettleReceivablesQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeSettleReceivablesQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("on_settle_amount") != null && !jsonObj.get("on_settle_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `on_settle_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("on_settle_amount").toString()));
      }
      if (jsonObj.get("unsettled_amount") != null && !jsonObj.get("unsettled_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unsettled_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unsettled_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeSettleReceivablesQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeSettleReceivablesQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeSettleReceivablesQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeSettleReceivablesQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeSettleReceivablesQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeSettleReceivablesQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeSettleReceivablesQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeSettleReceivablesQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeSettleReceivablesQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeSettleReceivablesQueryResponseModel
  */
  public static AlipayTradeSettleReceivablesQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeSettleReceivablesQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeSettleReceivablesQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

