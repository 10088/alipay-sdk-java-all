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
 * AntMerchantExpandShopReceiptaccountSaveModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandShopReceiptaccountSaveModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PROMISE = "promise";
  @SerializedName(SERIALIZED_NAME_PROMISE)
  private String promise;

  public static final String SERIALIZED_NAME_RECEIPT_ACCOUNT_ID = "receipt_account_id";
  @SerializedName(SERIALIZED_NAME_RECEIPT_ACCOUNT_ID)
  private String receiptAccountId;

  public static final String SERIALIZED_NAME_SHOP_ID = "shop_id";
  @SerializedName(SERIALIZED_NAME_SHOP_ID)
  private String shopId;

  public AntMerchantExpandShopReceiptaccountSaveModel() { 
  }

  public AntMerchantExpandShopReceiptaccountSaveModel promise(String promise) {
    
    this.promise = promise;
    return this;
  }

   /**
   * 是否承诺收单账号信息准确。具体承诺信息可查看 &lt;a href&#x3D;\&quot;https://gw.alipayobjects.com/os/bmw-prod/922bafa8-a712-4f79-aa32-6f08d7359a5c.docx\&quot;&gt;门店信息承诺函&lt;/a&gt;。 Y 是 N 否
   * @return promise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Y", value = "是否承诺收单账号信息准确。具体承诺信息可查看 <a href=\"https://gw.alipayobjects.com/os/bmw-prod/922bafa8-a712-4f79-aa32-6f08d7359a5c.docx\">门店信息承诺函</a>。 Y 是 N 否")

  public String getPromise() {
    return promise;
  }


  public void setPromise(String promise) {
    this.promise = promise;
  }


  public AntMerchantExpandShopReceiptaccountSaveModel receiptAccountId(String receiptAccountId) {
    
    this.receiptAccountId = receiptAccountId;
    return this;
  }

   /**
   * 收单账号
   * @return receiptAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088502344354813", value = "收单账号")

  public String getReceiptAccountId() {
    return receiptAccountId;
  }


  public void setReceiptAccountId(String receiptAccountId) {
    this.receiptAccountId = receiptAccountId;
  }


  public AntMerchantExpandShopReceiptaccountSaveModel shopId(String shopId) {
    
    this.shopId = shopId;
    return this;
  }

   /**
   * 店铺ID
   * @return shopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022062300502007000073505619", value = "店铺ID")

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
    AntMerchantExpandShopReceiptaccountSaveModel antMerchantExpandShopReceiptaccountSaveModel = (AntMerchantExpandShopReceiptaccountSaveModel) o;
    return Objects.equals(this.promise, antMerchantExpandShopReceiptaccountSaveModel.promise) &&
        Objects.equals(this.receiptAccountId, antMerchantExpandShopReceiptaccountSaveModel.receiptAccountId) &&
        Objects.equals(this.shopId, antMerchantExpandShopReceiptaccountSaveModel.shopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promise, receiptAccountId, shopId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandShopReceiptaccountSaveModel {\n");
    sb.append("    promise: ").append(toIndentedString(promise)).append("\n");
    sb.append("    receiptAccountId: ").append(toIndentedString(receiptAccountId)).append("\n");
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
    openapiFields.add("promise");
    openapiFields.add("receipt_account_id");
    openapiFields.add("shop_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandShopReceiptaccountSaveModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandShopReceiptaccountSaveModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandShopReceiptaccountSaveModel is not found in the empty JSON string", AntMerchantExpandShopReceiptaccountSaveModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandShopReceiptaccountSaveModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandShopReceiptaccountSaveModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("promise") != null && !jsonObj.get("promise").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promise` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promise").toString()));
      }
      if (jsonObj.get("receipt_account_id") != null && !jsonObj.get("receipt_account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receipt_account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receipt_account_id").toString()));
      }
      if (jsonObj.get("shop_id") != null && !jsonObj.get("shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandShopReceiptaccountSaveModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandShopReceiptaccountSaveModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandShopReceiptaccountSaveModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandShopReceiptaccountSaveModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandShopReceiptaccountSaveModel>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandShopReceiptaccountSaveModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandShopReceiptaccountSaveModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandShopReceiptaccountSaveModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandShopReceiptaccountSaveModel
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandShopReceiptaccountSaveModel
  */
  public static AntMerchantExpandShopReceiptaccountSaveModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandShopReceiptaccountSaveModel.class);
  }

 /**
  * Convert an instance of AntMerchantExpandShopReceiptaccountSaveModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

