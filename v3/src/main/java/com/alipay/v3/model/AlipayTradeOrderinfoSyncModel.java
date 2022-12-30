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
 * AlipayTradeOrderinfoSyncModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeOrderinfoSyncModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_ORDER_BIZ_INFO = "order_biz_info";
  @SerializedName(SERIALIZED_NAME_ORDER_BIZ_INFO)
  private String orderBizInfo;

  public static final String SERIALIZED_NAME_ORIG_REQUEST_NO = "orig_request_no";
  @SerializedName(SERIALIZED_NAME_ORIG_REQUEST_NO)
  private String origRequestNo;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeOrderinfoSyncModel() { 
  }

  public AlipayTradeOrderinfoSyncModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 交易信息同步对应的业务类型，具体值与支付宝约定；  信用授权场景下传CREDIT_AUTH  信用代扣场景下传CREDIT_DEDUCT
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREDIT_AUTH", value = "交易信息同步对应的业务类型，具体值与支付宝约定；  信用授权场景下传CREDIT_AUTH  信用代扣场景下传CREDIT_DEDUCT")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public AlipayTradeOrderinfoSyncModel orderBizInfo(String orderBizInfo) {
    
    this.orderBizInfo = orderBizInfo;
    return this;
  }

   /**
   * 商户传入同步信息，具体值要和支付宝约定；用于芝麻信用租车、单次授权等信息同步场景，格式为json格式。  状态枚举如下：    COMPLETE：同步用户已履约  适用场景：发起扣款后，芝麻生成待履约记录，如果用户通过其他方式完成订单支付，请反馈该状态，芝麻将完结待履约记录对用户形成一条良好履约记录；    CLOSED： 同步履约已取消  适用场景：发起扣款后，芝麻生成待履约记录，如果发现该笔扣款无效需要取消，请反馈该状态，芝麻将取消用户待履约记录；    VIOLATED： 用户已违约  适用场景：如果用户在约定时间（具体根据行业约定，有一定宽限期）内未完成订单支付，反馈该状态，芝麻将对用户记录一条负面记录，请谨慎使用；
   * @return orderBizInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"status\":\"COMPLETE\"}", value = "商户传入同步信息，具体值要和支付宝约定；用于芝麻信用租车、单次授权等信息同步场景，格式为json格式。  状态枚举如下：    COMPLETE：同步用户已履约  适用场景：发起扣款后，芝麻生成待履约记录，如果用户通过其他方式完成订单支付，请反馈该状态，芝麻将完结待履约记录对用户形成一条良好履约记录；    CLOSED： 同步履约已取消  适用场景：发起扣款后，芝麻生成待履约记录，如果发现该笔扣款无效需要取消，请反馈该状态，芝麻将取消用户待履约记录；    VIOLATED： 用户已违约  适用场景：如果用户在约定时间（具体根据行业约定，有一定宽限期）内未完成订单支付，反馈该状态，芝麻将对用户记录一条负面记录，请谨慎使用；")

  public String getOrderBizInfo() {
    return orderBizInfo;
  }


  public void setOrderBizInfo(String orderBizInfo) {
    this.orderBizInfo = orderBizInfo;
  }


  public AlipayTradeOrderinfoSyncModel origRequestNo(String origRequestNo) {
    
    this.origRequestNo = origRequestNo;
    return this;
  }

   /**
   * 原始业务请求单号。如对某一次退款进行履约时，该字段传退款时的退款请求号
   * @return origRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ01RF001", value = "原始业务请求单号。如对某一次退款进行履约时，该字段传退款时的退款请求号")

  public String getOrigRequestNo() {
    return origRequestNo;
  }


  public void setOrigRequestNo(String origRequestNo) {
    this.origRequestNo = origRequestNo;
  }


  public AlipayTradeOrderinfoSyncModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 外部请求号，商家自定义。标识一笔交易多次请求，同一笔交易多次信息同步时需要保证唯一。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HZ01RF001", value = "外部请求号，商家自定义。标识一笔交易多次请求，同一笔交易多次信息同步时需要保证唯一。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeOrderinfoSyncModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018061021001004680073956707", value = "支付宝交易号")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeOrderinfoSyncModel alipayTradeOrderinfoSyncModel = (AlipayTradeOrderinfoSyncModel) o;
    return Objects.equals(this.bizType, alipayTradeOrderinfoSyncModel.bizType) &&
        Objects.equals(this.orderBizInfo, alipayTradeOrderinfoSyncModel.orderBizInfo) &&
        Objects.equals(this.origRequestNo, alipayTradeOrderinfoSyncModel.origRequestNo) &&
        Objects.equals(this.outRequestNo, alipayTradeOrderinfoSyncModel.outRequestNo) &&
        Objects.equals(this.tradeNo, alipayTradeOrderinfoSyncModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizType, orderBizInfo, origRequestNo, outRequestNo, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeOrderinfoSyncModel {\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    orderBizInfo: ").append(toIndentedString(orderBizInfo)).append("\n");
    sb.append("    origRequestNo: ").append(toIndentedString(origRequestNo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
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
    openapiFields.add("biz_type");
    openapiFields.add("order_biz_info");
    openapiFields.add("orig_request_no");
    openapiFields.add("out_request_no");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeOrderinfoSyncModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeOrderinfoSyncModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeOrderinfoSyncModel is not found in the empty JSON string", AlipayTradeOrderinfoSyncModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeOrderinfoSyncModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeOrderinfoSyncModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("order_biz_info") != null && !jsonObj.get("order_biz_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_biz_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_biz_info").toString()));
      }
      if (jsonObj.get("orig_request_no") != null && !jsonObj.get("orig_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orig_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orig_request_no").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeOrderinfoSyncModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeOrderinfoSyncModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeOrderinfoSyncModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeOrderinfoSyncModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeOrderinfoSyncModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeOrderinfoSyncModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeOrderinfoSyncModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeOrderinfoSyncModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeOrderinfoSyncModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeOrderinfoSyncModel
  */
  public static AlipayTradeOrderinfoSyncModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeOrderinfoSyncModel.class);
  }

 /**
  * Convert an instance of AlipayTradeOrderinfoSyncModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

