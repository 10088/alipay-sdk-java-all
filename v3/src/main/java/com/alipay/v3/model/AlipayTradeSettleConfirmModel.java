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
import com.alipay.v3.model.SettleConfirmExtendParams;
import com.alipay.v3.model.SettleInfo;
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
 * AlipayTradeSettleConfirmModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeSettleConfirmModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private SettleConfirmExtendParams extendParams;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_SETTLE_INFO = "settle_info";
  @SerializedName(SERIALIZED_NAME_SETTLE_INFO)
  private SettleInfo settleInfo;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public AlipayTradeSettleConfirmModel() { 
  }

  public AlipayTradeSettleConfirmModel extendParams(SettleConfirmExtendParams extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * Get extendParams
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SettleConfirmExtendParams getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(SettleConfirmExtendParams extendParams) {
    this.extendParams = extendParams;
  }


  public AlipayTradeSettleConfirmModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 确认结算请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160727001", value = "确认结算请求流水号，开发者自行生成并保证唯一性，作为业务幂等性控制")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayTradeSettleConfirmModel settleInfo(SettleInfo settleInfo) {
    
    this.settleInfo = settleInfo;
    return this;
  }

   /**
   * Get settleInfo
   * @return settleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SettleInfo getSettleInfo() {
    return settleInfo;
  }


  public void setSettleInfo(SettleInfo settleInfo) {
    this.settleInfo = settleInfo;
  }


  public AlipayTradeSettleConfirmModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 支付宝交易号
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015070921001004130000127421", value = "支付宝交易号")

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
    AlipayTradeSettleConfirmModel alipayTradeSettleConfirmModel = (AlipayTradeSettleConfirmModel) o;
    return Objects.equals(this.extendParams, alipayTradeSettleConfirmModel.extendParams) &&
        Objects.equals(this.outRequestNo, alipayTradeSettleConfirmModel.outRequestNo) &&
        Objects.equals(this.settleInfo, alipayTradeSettleConfirmModel.settleInfo) &&
        Objects.equals(this.tradeNo, alipayTradeSettleConfirmModel.tradeNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendParams, outRequestNo, settleInfo, tradeNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeSettleConfirmModel {\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    settleInfo: ").append(toIndentedString(settleInfo)).append("\n");
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
    openapiFields.add("extend_params");
    openapiFields.add("out_request_no");
    openapiFields.add("settle_info");
    openapiFields.add("trade_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeSettleConfirmModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeSettleConfirmModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeSettleConfirmModel is not found in the empty JSON string", AlipayTradeSettleConfirmModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeSettleConfirmModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeSettleConfirmModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `extend_params`
      if (jsonObj.getAsJsonObject("extend_params") != null) {
        SettleConfirmExtendParams.validateJsonObject(jsonObj.getAsJsonObject("extend_params"));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      // validate the optional field `settle_info`
      if (jsonObj.getAsJsonObject("settle_info") != null) {
        SettleInfo.validateJsonObject(jsonObj.getAsJsonObject("settle_info"));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeSettleConfirmModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeSettleConfirmModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeSettleConfirmModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeSettleConfirmModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeSettleConfirmModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeSettleConfirmModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeSettleConfirmModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeSettleConfirmModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeSettleConfirmModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeSettleConfirmModel
  */
  public static AlipayTradeSettleConfirmModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeSettleConfirmModel.class);
  }

 /**
  * Convert an instance of AlipayTradeSettleConfirmModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

