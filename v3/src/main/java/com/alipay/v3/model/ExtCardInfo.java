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
 * ExtCardInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ExtCardInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BANK_ACC_NAME = "bank_acc_name";
  @SerializedName(SERIALIZED_NAME_BANK_ACC_NAME)
  private String bankAccName;

  public static final String SERIALIZED_NAME_CARD_BANK = "card_bank";
  @SerializedName(SERIALIZED_NAME_CARD_BANK)
  private String cardBank;

  public static final String SERIALIZED_NAME_CARD_BRANCH = "card_branch";
  @SerializedName(SERIALIZED_NAME_CARD_BRANCH)
  private String cardBranch;

  public static final String SERIALIZED_NAME_CARD_DEPOSIT = "card_deposit";
  @SerializedName(SERIALIZED_NAME_CARD_DEPOSIT)
  private String cardDeposit;

  public static final String SERIALIZED_NAME_CARD_LOCATION = "card_location";
  @SerializedName(SERIALIZED_NAME_CARD_LOCATION)
  private String cardLocation;

  public static final String SERIALIZED_NAME_CARD_NO = "card_no";
  @SerializedName(SERIALIZED_NAME_CARD_NO)
  private String cardNo;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ExtCardInfo() { 
  }

  public ExtCardInfo bankAccName(String bankAccName) {
    
    this.bankAccName = bankAccName;
    return this;
  }

   /**
   * 记账的外卡户名
   * @return bankAccName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "记账的外卡户名")

  public String getBankAccName() {
    return bankAccName;
  }


  public void setBankAccName(String bankAccName) {
    this.bankAccName = bankAccName;
  }


  public ExtCardInfo cardBank(String cardBank) {
    
    this.cardBank = cardBank;
    return this;
  }

   /**
   * 记账的外卡开户行
   * @return cardBank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "记账的外卡开户行")

  public String getCardBank() {
    return cardBank;
  }


  public void setCardBank(String cardBank) {
    this.cardBank = cardBank;
  }


  public ExtCardInfo cardBranch(String cardBranch) {
    
    this.cardBranch = cardBranch;
    return this;
  }

   /**
   * 记账的外卡支行
   * @return cardBranch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "记账的外卡支行")

  public String getCardBranch() {
    return cardBranch;
  }


  public void setCardBranch(String cardBranch) {
    this.cardBranch = cardBranch;
  }


  public ExtCardInfo cardDeposit(String cardDeposit) {
    
    this.cardDeposit = cardDeposit;
    return this;
  }

   /**
   * 记账的外卡联行号
   * @return cardDeposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "记账的外卡联行号")

  public String getCardDeposit() {
    return cardDeposit;
  }


  public void setCardDeposit(String cardDeposit) {
    this.cardDeposit = cardDeposit;
  }


  public ExtCardInfo cardLocation(String cardLocation) {
    
    this.cardLocation = cardLocation;
    return this;
  }

   /**
   * 记账的外卡开户地址
   * @return cardLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "记账的外卡开户地址")

  public String getCardLocation() {
    return cardLocation;
  }


  public void setCardLocation(String cardLocation) {
    this.cardLocation = cardLocation;
  }


  public ExtCardInfo cardNo(String cardNo) {
    
    this.cardNo = cardNo;
    return this;
  }

   /**
   * 记账的外卡卡号
   * @return cardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "记账的外卡卡号")

  public String getCardNo() {
    return cardNo;
  }


  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }


  public ExtCardInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 记账的外卡状态, A：正常状态;  其他：异常
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "记账的外卡状态, A：正常状态;  其他：异常")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtCardInfo extCardInfo = (ExtCardInfo) o;
    return Objects.equals(this.bankAccName, extCardInfo.bankAccName) &&
        Objects.equals(this.cardBank, extCardInfo.cardBank) &&
        Objects.equals(this.cardBranch, extCardInfo.cardBranch) &&
        Objects.equals(this.cardDeposit, extCardInfo.cardDeposit) &&
        Objects.equals(this.cardLocation, extCardInfo.cardLocation) &&
        Objects.equals(this.cardNo, extCardInfo.cardNo) &&
        Objects.equals(this.status, extCardInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankAccName, cardBank, cardBranch, cardDeposit, cardLocation, cardNo, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtCardInfo {\n");
    sb.append("    bankAccName: ").append(toIndentedString(bankAccName)).append("\n");
    sb.append("    cardBank: ").append(toIndentedString(cardBank)).append("\n");
    sb.append("    cardBranch: ").append(toIndentedString(cardBranch)).append("\n");
    sb.append("    cardDeposit: ").append(toIndentedString(cardDeposit)).append("\n");
    sb.append("    cardLocation: ").append(toIndentedString(cardLocation)).append("\n");
    sb.append("    cardNo: ").append(toIndentedString(cardNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("bank_acc_name");
    openapiFields.add("card_bank");
    openapiFields.add("card_branch");
    openapiFields.add("card_deposit");
    openapiFields.add("card_location");
    openapiFields.add("card_no");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExtCardInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExtCardInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExtCardInfo is not found in the empty JSON string", ExtCardInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExtCardInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExtCardInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bank_acc_name") != null && !jsonObj.get("bank_acc_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_acc_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_acc_name").toString()));
      }
      if (jsonObj.get("card_bank") != null && !jsonObj.get("card_bank").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_bank` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_bank").toString()));
      }
      if (jsonObj.get("card_branch") != null && !jsonObj.get("card_branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_branch").toString()));
      }
      if (jsonObj.get("card_deposit") != null && !jsonObj.get("card_deposit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_deposit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_deposit").toString()));
      }
      if (jsonObj.get("card_location") != null && !jsonObj.get("card_location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_location").toString()));
      }
      if (jsonObj.get("card_no") != null && !jsonObj.get("card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_no").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExtCardInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExtCardInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExtCardInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExtCardInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ExtCardInfo>() {
           @Override
           public void write(JsonWriter out, ExtCardInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExtCardInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExtCardInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExtCardInfo
  * @throws IOException if the JSON string is invalid with respect to ExtCardInfo
  */
  public static ExtCardInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExtCardInfo.class);
  }

 /**
  * Convert an instance of ExtCardInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

