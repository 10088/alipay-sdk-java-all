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
 * VoucherPackageSalesInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherPackageSalesInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Integer budget;

  public static final String SERIALIZED_NAME_PAY_CHANNEL = "pay_channel";
  @SerializedName(SERIALIZED_NAME_PAY_CHANNEL)
  private String payChannel;

  public static final String SERIALIZED_NAME_PURCHASE_URL = "purchase_url";
  @SerializedName(SERIALIZED_NAME_PURCHASE_URL)
  private String purchaseUrl;

  public static final String SERIALIZED_NAME_SALE_COUNT_LIMIT_IN_PERIOD = "sale_count_limit_in_period";
  @SerializedName(SERIALIZED_NAME_SALE_COUNT_LIMIT_IN_PERIOD)
  private Integer saleCountLimitInPeriod;

  public static final String SERIALIZED_NAME_SALE_PERIOD_LIMIT = "sale_period_limit";
  @SerializedName(SERIALIZED_NAME_SALE_PERIOD_LIMIT)
  private String salePeriodLimit;

  public static final String SERIALIZED_NAME_SALE_PRICE = "sale_price";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE)
  private String salePrice;

  public VoucherPackageSalesInfo() { 
  }

  public VoucherPackageSalesInfo budget(Integer budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 券包售卖预算，单位是份数
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "券包售卖预算，单位是份数")

  public Integer getBudget() {
    return budget;
  }


  public void setBudget(Integer budget) {
    this.budget = budget;
  }


  public VoucherPackageSalesInfo payChannel(String payChannel) {
    
    this.payChannel = payChannel;
    return this;
  }

   /**
   * 券包购买支付渠道 pcredit：花呗 creditCard：信用卡 credit_group：花呗与信用卡 为空则不限渠道
   * @return payChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pcredit", value = "券包购买支付渠道 pcredit：花呗 creditCard：信用卡 credit_group：花呗与信用卡 为空则不限渠道")

  public String getPayChannel() {
    return payChannel;
  }


  public void setPayChannel(String payChannel) {
    this.payChannel = payChannel;
  }


  public VoucherPackageSalesInfo purchaseUrl(String purchaseUrl) {
    
    this.purchaseUrl = purchaseUrl;
    return this;
  }

   /**
   * 券包购买链接
   * @return purchaseUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://123.htm", value = "券包购买链接")

  public String getPurchaseUrl() {
    return purchaseUrl;
  }


  public void setPurchaseUrl(String purchaseUrl) {
    this.purchaseUrl = purchaseUrl;
  }


  public VoucherPackageSalesInfo saleCountLimitInPeriod(Integer saleCountLimitInPeriod) {
    
    this.saleCountLimitInPeriod = saleCountLimitInPeriod;
    return this;
  }

   /**
   * 券包售卖期限内最大购买次数
   * @return saleCountLimitInPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "券包售卖期限内最大购买次数")

  public Integer getSaleCountLimitInPeriod() {
    return saleCountLimitInPeriod;
  }


  public void setSaleCountLimitInPeriod(Integer saleCountLimitInPeriod) {
    this.saleCountLimitInPeriod = saleCountLimitInPeriod;
  }


  public VoucherPackageSalesInfo salePeriodLimit(String salePeriodLimit) {
    
    this.salePeriodLimit = salePeriodLimit;
    return this;
  }

   /**
   * 券包购买期限类型 NO：不限制  ALL：售卖时间内  DAY：天  WEEK：周  MONTH：月
   * @return salePeriodLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO", value = "券包购买期限类型 NO：不限制  ALL：售卖时间内  DAY：天  WEEK：周  MONTH：月")

  public String getSalePeriodLimit() {
    return salePeriodLimit;
  }


  public void setSalePeriodLimit(String salePeriodLimit) {
    this.salePeriodLimit = salePeriodLimit;
  }


  public VoucherPackageSalesInfo salePrice(String salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * 券包售卖价格，单位是元
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.99", value = "券包售卖价格，单位是元")

  public String getSalePrice() {
    return salePrice;
  }


  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherPackageSalesInfo voucherPackageSalesInfo = (VoucherPackageSalesInfo) o;
    return Objects.equals(this.budget, voucherPackageSalesInfo.budget) &&
        Objects.equals(this.payChannel, voucherPackageSalesInfo.payChannel) &&
        Objects.equals(this.purchaseUrl, voucherPackageSalesInfo.purchaseUrl) &&
        Objects.equals(this.saleCountLimitInPeriod, voucherPackageSalesInfo.saleCountLimitInPeriod) &&
        Objects.equals(this.salePeriodLimit, voucherPackageSalesInfo.salePeriodLimit) &&
        Objects.equals(this.salePrice, voucherPackageSalesInfo.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, payChannel, purchaseUrl, saleCountLimitInPeriod, salePeriodLimit, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherPackageSalesInfo {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    payChannel: ").append(toIndentedString(payChannel)).append("\n");
    sb.append("    purchaseUrl: ").append(toIndentedString(purchaseUrl)).append("\n");
    sb.append("    saleCountLimitInPeriod: ").append(toIndentedString(saleCountLimitInPeriod)).append("\n");
    sb.append("    salePeriodLimit: ").append(toIndentedString(salePeriodLimit)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("pay_channel");
    openapiFields.add("purchase_url");
    openapiFields.add("sale_count_limit_in_period");
    openapiFields.add("sale_period_limit");
    openapiFields.add("sale_price");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherPackageSalesInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherPackageSalesInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherPackageSalesInfo is not found in the empty JSON string", VoucherPackageSalesInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherPackageSalesInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherPackageSalesInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("pay_channel") != null && !jsonObj.get("pay_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_channel").toString()));
      }
      if (jsonObj.get("purchase_url") != null && !jsonObj.get("purchase_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchase_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("purchase_url").toString()));
      }
      if (jsonObj.get("sale_period_limit") != null && !jsonObj.get("sale_period_limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_period_limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_period_limit").toString()));
      }
      if (jsonObj.get("sale_price") != null && !jsonObj.get("sale_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_price").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherPackageSalesInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherPackageSalesInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherPackageSalesInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherPackageSalesInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherPackageSalesInfo>() {
           @Override
           public void write(JsonWriter out, VoucherPackageSalesInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherPackageSalesInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherPackageSalesInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherPackageSalesInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherPackageSalesInfo
  */
  public static VoucherPackageSalesInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherPackageSalesInfo.class);
  }

 /**
  * Convert an instance of VoucherPackageSalesInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

