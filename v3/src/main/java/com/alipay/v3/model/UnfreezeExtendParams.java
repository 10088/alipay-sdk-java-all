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
 * UnfreezeExtendParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnfreezeExtendParams {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_QUIT_TYPE = "quit_type";
  @SerializedName(SERIALIZED_NAME_QUIT_TYPE)
  private String quitType;

  public static final String SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT = "total_discount_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_DISCOUNT_AMOUNT)
  private String totalDiscountAmount;

  public static final String SERIALIZED_NAME_TOTAL_REAL_PAY_AMOUNT = "total_real_pay_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_REAL_PAY_AMOUNT)
  private String totalRealPayAmount;

  public static final String SERIALIZED_NAME_TOTAL_TASK_COUNT = "total_task_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASK_COUNT)
  private String totalTaskCount;

  public UnfreezeExtendParams() { 
  }

  public UnfreezeExtendParams quitType(String quitType) {
    
    this.quitType = quitType;
    return this;
  }

   /**
   * 退出类型
   * @return quitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SETTLE_APPLY_QUIT", value = "退出类型")

  public String getQuitType() {
    return quitType;
  }


  public void setQuitType(String quitType) {
    this.quitType = quitType;
  }


  public UnfreezeExtendParams totalDiscountAmount(String totalDiscountAmount) {
    
    this.totalDiscountAmount = totalDiscountAmount;
    return this;
  }

   /**
   * 芝麻Go开始到到期过程中享受的优惠总金额
   * @return totalDiscountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "芝麻Go开始到到期过程中享受的优惠总金额")

  public String getTotalDiscountAmount() {
    return totalDiscountAmount;
  }


  public void setTotalDiscountAmount(String totalDiscountAmount) {
    this.totalDiscountAmount = totalDiscountAmount;
  }


  public UnfreezeExtendParams totalRealPayAmount(String totalRealPayAmount) {
    
    this.totalRealPayAmount = totalRealPayAmount;
    return this;
  }

   /**
   * 芝麻Go开始到到期过程中任务相关支付的总金额。
   * @return totalRealPayAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "芝麻Go开始到到期过程中任务相关支付的总金额。")

  public String getTotalRealPayAmount() {
    return totalRealPayAmount;
  }


  public void setTotalRealPayAmount(String totalRealPayAmount) {
    this.totalRealPayAmount = totalRealPayAmount;
  }


  public UnfreezeExtendParams totalTaskCount(String totalTaskCount) {
    
    this.totalTaskCount = totalTaskCount;
    return this;
  }

   /**
   * 芝麻Go开始到到期过程中和任务相关的完成次数
   * @return totalTaskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "芝麻Go开始到到期过程中和任务相关的完成次数")

  public String getTotalTaskCount() {
    return totalTaskCount;
  }


  public void setTotalTaskCount(String totalTaskCount) {
    this.totalTaskCount = totalTaskCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnfreezeExtendParams unfreezeExtendParams = (UnfreezeExtendParams) o;
    return Objects.equals(this.quitType, unfreezeExtendParams.quitType) &&
        Objects.equals(this.totalDiscountAmount, unfreezeExtendParams.totalDiscountAmount) &&
        Objects.equals(this.totalRealPayAmount, unfreezeExtendParams.totalRealPayAmount) &&
        Objects.equals(this.totalTaskCount, unfreezeExtendParams.totalTaskCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quitType, totalDiscountAmount, totalRealPayAmount, totalTaskCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnfreezeExtendParams {\n");
    sb.append("    quitType: ").append(toIndentedString(quitType)).append("\n");
    sb.append("    totalDiscountAmount: ").append(toIndentedString(totalDiscountAmount)).append("\n");
    sb.append("    totalRealPayAmount: ").append(toIndentedString(totalRealPayAmount)).append("\n");
    sb.append("    totalTaskCount: ").append(toIndentedString(totalTaskCount)).append("\n");
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
    openapiFields.add("quit_type");
    openapiFields.add("total_discount_amount");
    openapiFields.add("total_real_pay_amount");
    openapiFields.add("total_task_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UnfreezeExtendParams
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UnfreezeExtendParams.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnfreezeExtendParams is not found in the empty JSON string", UnfreezeExtendParams.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UnfreezeExtendParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnfreezeExtendParams` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("quit_type") != null && !jsonObj.get("quit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quit_type").toString()));
      }
      if (jsonObj.get("total_discount_amount") != null && !jsonObj.get("total_discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_discount_amount").toString()));
      }
      if (jsonObj.get("total_real_pay_amount") != null && !jsonObj.get("total_real_pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_real_pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_real_pay_amount").toString()));
      }
      if (jsonObj.get("total_task_count") != null && !jsonObj.get("total_task_count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_task_count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_task_count").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnfreezeExtendParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnfreezeExtendParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnfreezeExtendParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnfreezeExtendParams.class));

       return (TypeAdapter<T>) new TypeAdapter<UnfreezeExtendParams>() {
           @Override
           public void write(JsonWriter out, UnfreezeExtendParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnfreezeExtendParams read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UnfreezeExtendParams given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnfreezeExtendParams
  * @throws IOException if the JSON string is invalid with respect to UnfreezeExtendParams
  */
  public static UnfreezeExtendParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnfreezeExtendParams.class);
  }

 /**
  * Convert an instance of UnfreezeExtendParams to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

