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
 * DepositBackInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DepositBackInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BANK_ACK_TIME = "bank_ack_time";
  @SerializedName(SERIALIZED_NAME_BANK_ACK_TIME)
  private String bankAckTime;

  public static final String SERIALIZED_NAME_DBACK_AMOUNT = "dback_amount";
  @SerializedName(SERIALIZED_NAME_DBACK_AMOUNT)
  private String dbackAmount;

  public static final String SERIALIZED_NAME_DBACK_STATUS = "dback_status";
  @SerializedName(SERIALIZED_NAME_DBACK_STATUS)
  private String dbackStatus;

  public static final String SERIALIZED_NAME_EST_BANK_RECEIPT_TIME = "est_bank_receipt_time";
  @SerializedName(SERIALIZED_NAME_EST_BANK_RECEIPT_TIME)
  private String estBankReceiptTime;

  public static final String SERIALIZED_NAME_HAS_DEPOSIT_BACK = "has_deposit_back";
  @SerializedName(SERIALIZED_NAME_HAS_DEPOSIT_BACK)
  private String hasDepositBack;

  public DepositBackInfo() { 
  }

  public DepositBackInfo bankAckTime(String bankAckTime) {
    
    this.bankAckTime = bankAckTime;
    return this;
  }

   /**
   * 银行响应时间，格式为yyyy-MM-dd HH:mm:ss
   * @return bankAckTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-02 14:03:48", value = "银行响应时间，格式为yyyy-MM-dd HH:mm:ss")

  public String getBankAckTime() {
    return bankAckTime;
  }


  public void setBankAckTime(String bankAckTime) {
    this.bankAckTime = bankAckTime;
  }


  public DepositBackInfo dbackAmount(String dbackAmount) {
    
    this.dbackAmount = dbackAmount;
    return this;
  }

   /**
   * 银行卡冲退金额
   * @return dbackAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.01", value = "银行卡冲退金额")

  public String getDbackAmount() {
    return dbackAmount;
  }


  public void setDbackAmount(String dbackAmount) {
    this.dbackAmount = dbackAmount;
  }


  public DepositBackInfo dbackStatus(String dbackStatus) {
    
    this.dbackStatus = dbackStatus;
    return this;
  }

   /**
   * 银行卡冲退状态。S-成功，F-失败，P-处理中。银行卡冲退失败，资金自动转入用户支付宝余额。
   * @return dbackStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S", value = "银行卡冲退状态。S-成功，F-失败，P-处理中。银行卡冲退失败，资金自动转入用户支付宝余额。")

  public String getDbackStatus() {
    return dbackStatus;
  }


  public void setDbackStatus(String dbackStatus) {
    this.dbackStatus = dbackStatus;
  }


  public DepositBackInfo estBankReceiptTime(String estBankReceiptTime) {
    
    this.estBankReceiptTime = estBankReceiptTime;
    return this;
  }

   /**
   * 预估银行到账时间，格式为yyyy-MM-dd HH:mm:ss
   * @return estBankReceiptTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-06-02 14:03:48", value = "预估银行到账时间，格式为yyyy-MM-dd HH:mm:ss")

  public String getEstBankReceiptTime() {
    return estBankReceiptTime;
  }


  public void setEstBankReceiptTime(String estBankReceiptTime) {
    this.estBankReceiptTime = estBankReceiptTime;
  }


  public DepositBackInfo hasDepositBack(String hasDepositBack) {
    
    this.hasDepositBack = hasDepositBack;
    return this;
  }

   /**
   * 是否存在银行卡冲退信息。
   * @return hasDepositBack
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否存在银行卡冲退信息。")

  public String getHasDepositBack() {
    return hasDepositBack;
  }


  public void setHasDepositBack(String hasDepositBack) {
    this.hasDepositBack = hasDepositBack;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositBackInfo depositBackInfo = (DepositBackInfo) o;
    return Objects.equals(this.bankAckTime, depositBackInfo.bankAckTime) &&
        Objects.equals(this.dbackAmount, depositBackInfo.dbackAmount) &&
        Objects.equals(this.dbackStatus, depositBackInfo.dbackStatus) &&
        Objects.equals(this.estBankReceiptTime, depositBackInfo.estBankReceiptTime) &&
        Objects.equals(this.hasDepositBack, depositBackInfo.hasDepositBack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAckTime, dbackAmount, dbackStatus, estBankReceiptTime, hasDepositBack);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositBackInfo {\n");
    sb.append("    bankAckTime: ").append(toIndentedString(bankAckTime)).append("\n");
    sb.append("    dbackAmount: ").append(toIndentedString(dbackAmount)).append("\n");
    sb.append("    dbackStatus: ").append(toIndentedString(dbackStatus)).append("\n");
    sb.append("    estBankReceiptTime: ").append(toIndentedString(estBankReceiptTime)).append("\n");
    sb.append("    hasDepositBack: ").append(toIndentedString(hasDepositBack)).append("\n");
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
    openapiFields.add("bank_ack_time");
    openapiFields.add("dback_amount");
    openapiFields.add("dback_status");
    openapiFields.add("est_bank_receipt_time");
    openapiFields.add("has_deposit_back");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DepositBackInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DepositBackInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DepositBackInfo is not found in the empty JSON string", DepositBackInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DepositBackInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DepositBackInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bank_ack_time") != null && !jsonObj.get("bank_ack_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_ack_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_ack_time").toString()));
      }
      if (jsonObj.get("dback_amount") != null && !jsonObj.get("dback_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dback_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dback_amount").toString()));
      }
      if (jsonObj.get("dback_status") != null && !jsonObj.get("dback_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dback_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dback_status").toString()));
      }
      if (jsonObj.get("est_bank_receipt_time") != null && !jsonObj.get("est_bank_receipt_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `est_bank_receipt_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("est_bank_receipt_time").toString()));
      }
      if (jsonObj.get("has_deposit_back") != null && !jsonObj.get("has_deposit_back").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `has_deposit_back` to be a primitive type in the JSON string but got `%s`", jsonObj.get("has_deposit_back").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DepositBackInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DepositBackInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DepositBackInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DepositBackInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DepositBackInfo>() {
           @Override
           public void write(JsonWriter out, DepositBackInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DepositBackInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DepositBackInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DepositBackInfo
  * @throws IOException if the JSON string is invalid with respect to DepositBackInfo
  */
  public static DepositBackInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DepositBackInfo.class);
  }

 /**
  * Convert an instance of DepositBackInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

