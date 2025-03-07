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
 * AlipayUserAgreementTransferResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserAgreementTransferResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_EXECUTE_TIME = "execute_time";
  @SerializedName(SERIALIZED_NAME_EXECUTE_TIME)
  private String executeTime;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private String period;

  public static final String SERIALIZED_NAME_PERIOD_TYPE = "period_type";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPE)
  private String periodType;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TOTAL_PAYMENTS = "total_payments";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAYMENTS)
  private String totalPayments;

  public AlipayUserAgreementTransferResponseModel() { 
  }

  public AlipayUserAgreementTransferResponseModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 单次金额限制
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "单次金额限制")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayUserAgreementTransferResponseModel executeTime(String executeTime) {
    
    this.executeTime = executeTime;
    return this;
  }

   /**
   * 执行时间
   * @return executeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-23", value = "执行时间")

  public String getExecuteTime() {
    return executeTime;
  }


  public void setExecuteTime(String executeTime) {
    this.executeTime = executeTime;
  }


  public AlipayUserAgreementTransferResponseModel period(String period) {
    
    this.period = period;
    return this;
  }

   /**
   * 周期
   * @return period
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "周期")

  public String getPeriod() {
    return period;
  }


  public void setPeriod(String period) {
    this.period = period;
  }


  public AlipayUserAgreementTransferResponseModel periodType(String periodType) {
    
    this.periodType = periodType;
    return this;
  }

   /**
   * 周期类型
   * @return periodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAY", value = "周期类型")

  public String getPeriodType() {
    return periodType;
  }


  public void setPeriodType(String periodType) {
    this.periodType = periodType;
  }


  public AlipayUserAgreementTransferResponseModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 总金额限制
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "600", value = "总金额限制")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public AlipayUserAgreementTransferResponseModel totalPayments(String totalPayments) {
    
    this.totalPayments = totalPayments;
    return this;
  }

   /**
   * 总支付次数
   * @return totalPayments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "总支付次数")

  public String getTotalPayments() {
    return totalPayments;
  }


  public void setTotalPayments(String totalPayments) {
    this.totalPayments = totalPayments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserAgreementTransferResponseModel alipayUserAgreementTransferResponseModel = (AlipayUserAgreementTransferResponseModel) o;
    return Objects.equals(this.amount, alipayUserAgreementTransferResponseModel.amount) &&
        Objects.equals(this.executeTime, alipayUserAgreementTransferResponseModel.executeTime) &&
        Objects.equals(this.period, alipayUserAgreementTransferResponseModel.period) &&
        Objects.equals(this.periodType, alipayUserAgreementTransferResponseModel.periodType) &&
        Objects.equals(this.totalAmount, alipayUserAgreementTransferResponseModel.totalAmount) &&
        Objects.equals(this.totalPayments, alipayUserAgreementTransferResponseModel.totalPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, executeTime, period, periodType, totalAmount, totalPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserAgreementTransferResponseModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalPayments: ").append(toIndentedString(totalPayments)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("execute_time");
    openapiFields.add("period");
    openapiFields.add("period_type");
    openapiFields.add("total_amount");
    openapiFields.add("total_payments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserAgreementTransferResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserAgreementTransferResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserAgreementTransferResponseModel is not found in the empty JSON string", AlipayUserAgreementTransferResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserAgreementTransferResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserAgreementTransferResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("execute_time") != null && !jsonObj.get("execute_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `execute_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("execute_time").toString()));
      }
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
      if (jsonObj.get("period_type") != null && !jsonObj.get("period_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_type").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
      if (jsonObj.get("total_payments") != null && !jsonObj.get("total_payments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_payments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_payments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserAgreementTransferResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserAgreementTransferResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserAgreementTransferResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserAgreementTransferResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserAgreementTransferResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserAgreementTransferResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserAgreementTransferResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserAgreementTransferResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserAgreementTransferResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserAgreementTransferResponseModel
  */
  public static AlipayUserAgreementTransferResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserAgreementTransferResponseModel.class);
  }

 /**
  * Convert an instance of AlipayUserAgreementTransferResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

