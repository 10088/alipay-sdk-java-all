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
 * RoyaltyDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RoyaltyDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_DESC = "error_desc";
  @SerializedName(SERIALIZED_NAME_ERROR_DESC)
  private String errorDesc;

  public static final String SERIALIZED_NAME_EXECUTE_DT = "execute_dt";
  @SerializedName(SERIALIZED_NAME_EXECUTE_DT)
  private String executeDt;

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "operation_type";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private String operationType;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_TRANS_IN = "trans_in";
  @SerializedName(SERIALIZED_NAME_TRANS_IN)
  private String transIn;

  public static final String SERIALIZED_NAME_TRANS_IN_OPEN_ID = "trans_in_open_id";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_OPEN_ID)
  private String transInOpenId;

  public static final String SERIALIZED_NAME_TRANS_IN_TYPE = "trans_in_type";
  @SerializedName(SERIALIZED_NAME_TRANS_IN_TYPE)
  private String transInType;

  public static final String SERIALIZED_NAME_TRANS_OUT = "trans_out";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT)
  private String transOut;

  public static final String SERIALIZED_NAME_TRANS_OUT_OPEN_ID = "trans_out_open_id";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_OPEN_ID)
  private String transOutOpenId;

  public static final String SERIALIZED_NAME_TRANS_OUT_TYPE = "trans_out_type";
  @SerializedName(SERIALIZED_NAME_TRANS_OUT_TYPE)
  private String transOutType;

  public RoyaltyDetail() { 
  }

  public RoyaltyDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 分账金额
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.00", value = "分账金额")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public RoyaltyDetail errorCode(String errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * 分账失败错误码，只在分账失败时返回
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TXN_RESULT_ACCOUNT_BALANCE_NOT_ENOUGH", value = "分账失败错误码，只在分账失败时返回")

  public String getErrorCode() {
    return errorCode;
  }


  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  public RoyaltyDetail errorDesc(String errorDesc) {
    
    this.errorDesc = errorDesc;
    return this;
  }

   /**
   * 分账错误描述信息
   * @return errorDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "分账余额不足", value = "分账错误描述信息")

  public String getErrorDesc() {
    return errorDesc;
  }


  public void setErrorDesc(String errorDesc) {
    this.errorDesc = errorDesc;
  }


  public RoyaltyDetail executeDt(String executeDt) {
    
    this.executeDt = executeDt;
    return this;
  }

   /**
   * 分账执行时间
   * @return executeDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-07-30 12:00:00", value = "分账执行时间")

  public String getExecuteDt() {
    return executeDt;
  }


  public void setExecuteDt(String executeDt) {
    this.executeDt = executeDt;
  }


  public RoyaltyDetail operationType(String operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * 分账操作类型。有以下几种类型： replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transfer", value = "分账操作类型。有以下几种类型： replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)")

  public String getOperationType() {
    return operationType;
  }


  public void setOperationType(String operationType) {
    this.operationType = operationType;
  }


  public RoyaltyDetail state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FAIL", value = "分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public RoyaltyDetail transIn(String transIn) {
    
    this.transIn = transIn;
    return this;
  }

   /**
   * 分账转入账号，只有在operation_type为replenish_refund(退补差)，transfer(分账)才返回该字段或trans_in_open_id。trans_in_open_id为分账转入方的openId，当trans_in_open_id不为空的时候，请优先使用trans_in_open_id。
   * @return transIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111111112222", value = "分账转入账号，只有在operation_type为replenish_refund(退补差)，transfer(分账)才返回该字段或trans_in_open_id。trans_in_open_id为分账转入方的openId，当trans_in_open_id不为空的时候，请优先使用trans_in_open_id。")

  public String getTransIn() {
    return transIn;
  }


  public void setTransIn(String transIn) {
    this.transIn = transIn;
  }


  public RoyaltyDetail transInOpenId(String transInOpenId) {
    
    this.transInOpenId = transInOpenId;
    return this;
  }

   /**
   * 分账转入方的OpenId，OpenId为用户在该应用下支付宝的唯一用户标识。
   * @return transInOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "095PJtAPYb2UkQ0mXk_X86Z_Pd7PtySKX-U3zUEwONcu3wc", value = "分账转入方的OpenId，OpenId为用户在该应用下支付宝的唯一用户标识。")

  public String getTransInOpenId() {
    return transInOpenId;
  }


  public void setTransInOpenId(String transInOpenId) {
    this.transInOpenId = transInOpenId;
  }


  public RoyaltyDetail transInType(String transInType) {
    
    this.transInType = transInType;
    return this;
  }

   /**
   * 分账转入账号类型，userId表示是支付宝账号对应的支付宝唯一用户号，loginName表示是支付宝登录号，secondMerchantID表示是二级商户id。 只有在operation_type为replenish_refund(退补差)，transfer(分账)才返回该字段
   * @return transInType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "userId", value = "分账转入账号类型，userId表示是支付宝账号对应的支付宝唯一用户号，loginName表示是支付宝登录号，secondMerchantID表示是二级商户id。 只有在operation_type为replenish_refund(退补差)，transfer(分账)才返回该字段")

  public String getTransInType() {
    return transInType;
  }


  public void setTransInType(String transInType) {
    this.transInType = transInType;
  }


  public RoyaltyDetail transOut(String transOut) {
    
    this.transOut = transOut;
    return this;
  }

   /**
   * 分账转出账号，只有在operation_type为replenish(补差),transfer_refund(退分账)类型才返回该字段或trans_out_open_id字段。trans_out_open_id字段为分账转出方的openId，当trans_out_open_id 字段不为空时，请优先使用trans_out_open_id。
   * @return transOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088111111111111", value = "分账转出账号，只有在operation_type为replenish(补差),transfer_refund(退分账)类型才返回该字段或trans_out_open_id字段。trans_out_open_id字段为分账转出方的openId，当trans_out_open_id 字段不为空时，请优先使用trans_out_open_id。")

  public String getTransOut() {
    return transOut;
  }


  public void setTransOut(String transOut) {
    this.transOut = transOut;
  }


  public RoyaltyDetail transOutOpenId(String transOutOpenId) {
    
    this.transOutOpenId = transOutOpenId;
    return this;
  }

   /**
   * 分账转出方的OpenId，OpenId为用户在该应用下支付宝内的唯一用户标识。
   * @return transOutOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "095PJtAPYb2UkQ0mXk_X86Z_Pd7PtySKX-U3zUEwONcu3wc", value = "分账转出方的OpenId，OpenId为用户在该应用下支付宝内的唯一用户标识。")

  public String getTransOutOpenId() {
    return transOutOpenId;
  }


  public void setTransOutOpenId(String transOutOpenId) {
    this.transOutOpenId = transOutOpenId;
  }


  public RoyaltyDetail transOutType(String transOutType) {
    
    this.transOutType = transOutType;
    return this;
  }

   /**
   * 分账转出账号类型，userId表示是支付宝账号对应的支付宝唯一用户号，loginName表示是支付宝登录号，secondMerchantID表示是二级商户id。 只有在operation_type为replenish(补差)，transfer_refund(退分账)类型才返回该字段
   * @return transOutType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "userId", value = "分账转出账号类型，userId表示是支付宝账号对应的支付宝唯一用户号，loginName表示是支付宝登录号，secondMerchantID表示是二级商户id。 只有在operation_type为replenish(补差)，transfer_refund(退分账)类型才返回该字段")

  public String getTransOutType() {
    return transOutType;
  }


  public void setTransOutType(String transOutType) {
    this.transOutType = transOutType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoyaltyDetail royaltyDetail = (RoyaltyDetail) o;
    return Objects.equals(this.amount, royaltyDetail.amount) &&
        Objects.equals(this.errorCode, royaltyDetail.errorCode) &&
        Objects.equals(this.errorDesc, royaltyDetail.errorDesc) &&
        Objects.equals(this.executeDt, royaltyDetail.executeDt) &&
        Objects.equals(this.operationType, royaltyDetail.operationType) &&
        Objects.equals(this.state, royaltyDetail.state) &&
        Objects.equals(this.transIn, royaltyDetail.transIn) &&
        Objects.equals(this.transInOpenId, royaltyDetail.transInOpenId) &&
        Objects.equals(this.transInType, royaltyDetail.transInType) &&
        Objects.equals(this.transOut, royaltyDetail.transOut) &&
        Objects.equals(this.transOutOpenId, royaltyDetail.transOutOpenId) &&
        Objects.equals(this.transOutType, royaltyDetail.transOutType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, errorCode, errorDesc, executeDt, operationType, state, transIn, transInOpenId, transInType, transOut, transOutOpenId, transOutType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoyaltyDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDesc: ").append(toIndentedString(errorDesc)).append("\n");
    sb.append("    executeDt: ").append(toIndentedString(executeDt)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transIn: ").append(toIndentedString(transIn)).append("\n");
    sb.append("    transInOpenId: ").append(toIndentedString(transInOpenId)).append("\n");
    sb.append("    transInType: ").append(toIndentedString(transInType)).append("\n");
    sb.append("    transOut: ").append(toIndentedString(transOut)).append("\n");
    sb.append("    transOutOpenId: ").append(toIndentedString(transOutOpenId)).append("\n");
    sb.append("    transOutType: ").append(toIndentedString(transOutType)).append("\n");
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
    openapiFields.add("error_code");
    openapiFields.add("error_desc");
    openapiFields.add("execute_dt");
    openapiFields.add("operation_type");
    openapiFields.add("state");
    openapiFields.add("trans_in");
    openapiFields.add("trans_in_open_id");
    openapiFields.add("trans_in_type");
    openapiFields.add("trans_out");
    openapiFields.add("trans_out_open_id");
    openapiFields.add("trans_out_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoyaltyDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RoyaltyDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoyaltyDetail is not found in the empty JSON string", RoyaltyDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RoyaltyDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RoyaltyDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("error_code") != null && !jsonObj.get("error_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_code").toString()));
      }
      if (jsonObj.get("error_desc") != null && !jsonObj.get("error_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_desc").toString()));
      }
      if (jsonObj.get("execute_dt") != null && !jsonObj.get("execute_dt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `execute_dt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("execute_dt").toString()));
      }
      if (jsonObj.get("operation_type") != null && !jsonObj.get("operation_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operation_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operation_type").toString()));
      }
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (jsonObj.get("trans_in") != null && !jsonObj.get("trans_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in").toString()));
      }
      if (jsonObj.get("trans_in_open_id") != null && !jsonObj.get("trans_in_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_open_id").toString()));
      }
      if (jsonObj.get("trans_in_type") != null && !jsonObj.get("trans_in_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_in_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_in_type").toString()));
      }
      if (jsonObj.get("trans_out") != null && !jsonObj.get("trans_out").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out").toString()));
      }
      if (jsonObj.get("trans_out_open_id") != null && !jsonObj.get("trans_out_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_open_id").toString()));
      }
      if (jsonObj.get("trans_out_type") != null && !jsonObj.get("trans_out_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_out_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_out_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoyaltyDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoyaltyDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoyaltyDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoyaltyDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<RoyaltyDetail>() {
           @Override
           public void write(JsonWriter out, RoyaltyDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RoyaltyDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RoyaltyDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoyaltyDetail
  * @throws IOException if the JSON string is invalid with respect to RoyaltyDetail
  */
  public static RoyaltyDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoyaltyDetail.class);
  }

 /**
  * Convert an instance of RoyaltyDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

