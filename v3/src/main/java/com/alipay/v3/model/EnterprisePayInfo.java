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
 * EnterprisePayInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterprisePayInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_INFO = "biz_info";
  @SerializedName(SERIALIZED_NAME_BIZ_INFO)
  private String bizInfo;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT = "invoice_amount";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT)
  private String invoiceAmount;

  public static final String SERIALIZED_NAME_IS_USE_ENTERPRISE_PAY = "is_use_enterprise_pay";
  @SerializedName(SERIALIZED_NAME_IS_USE_ENTERPRISE_PAY)
  private Boolean isUseEnterprisePay;

  public EnterprisePayInfo() { 
  }

  public EnterprisePayInfo bizInfo(String bizInfo) {
    
    this.bizInfo = bizInfo;
    return this;
  }

   /**
   * 因公付业务信息
   * @return bizInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "因公付业务信息")

  public String getBizInfo() {
    return bizInfo;
  }


  public void setBizInfo(String bizInfo) {
    this.bizInfo = bizInfo;
  }


  public EnterprisePayInfo invoiceAmount(String invoiceAmount) {
    
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * 开票金额
   * @return invoiceAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开票金额")

  public String getInvoiceAmount() {
    return invoiceAmount;
  }


  public void setInvoiceAmount(String invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }


  public EnterprisePayInfo isUseEnterprisePay(Boolean isUseEnterprisePay) {
    
    this.isUseEnterprisePay = isUseEnterprisePay;
    return this;
  }

   /**
   * 是否包含因公付资产
   * @return isUseEnterprisePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否包含因公付资产")

  public Boolean getIsUseEnterprisePay() {
    return isUseEnterprisePay;
  }


  public void setIsUseEnterprisePay(Boolean isUseEnterprisePay) {
    this.isUseEnterprisePay = isUseEnterprisePay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterprisePayInfo enterprisePayInfo = (EnterprisePayInfo) o;
    return Objects.equals(this.bizInfo, enterprisePayInfo.bizInfo) &&
        Objects.equals(this.invoiceAmount, enterprisePayInfo.invoiceAmount) &&
        Objects.equals(this.isUseEnterprisePay, enterprisePayInfo.isUseEnterprisePay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizInfo, invoiceAmount, isUseEnterprisePay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterprisePayInfo {\n");
    sb.append("    bizInfo: ").append(toIndentedString(bizInfo)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    isUseEnterprisePay: ").append(toIndentedString(isUseEnterprisePay)).append("\n");
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
    openapiFields.add("biz_info");
    openapiFields.add("invoice_amount");
    openapiFields.add("is_use_enterprise_pay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnterprisePayInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EnterprisePayInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterprisePayInfo is not found in the empty JSON string", EnterprisePayInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnterprisePayInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterprisePayInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_info") != null && !jsonObj.get("biz_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_info").toString()));
      }
      if (jsonObj.get("invoice_amount") != null && !jsonObj.get("invoice_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterprisePayInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterprisePayInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterprisePayInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterprisePayInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterprisePayInfo>() {
           @Override
           public void write(JsonWriter out, EnterprisePayInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterprisePayInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterprisePayInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterprisePayInfo
  * @throws IOException if the JSON string is invalid with respect to EnterprisePayInfo
  */
  public static EnterprisePayInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterprisePayInfo.class);
  }

 /**
  * Convert an instance of EnterprisePayInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

