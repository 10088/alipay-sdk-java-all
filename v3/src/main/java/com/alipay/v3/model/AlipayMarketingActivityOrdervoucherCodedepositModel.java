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
import java.util.ArrayList;
import java.util.List;
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
 * AlipayMarketingActivityOrdervoucherCodedepositModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityOrdervoucherCodedepositModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MERCHANT_ACCESS_MODE = "merchant_access_mode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCESS_MODE)
  private String merchantAccessMode;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_VOUCHER_CODES = "voucher_codes";
  @SerializedName(SERIALIZED_NAME_VOUCHER_CODES)
  private List<String> voucherCodes = null;

  public AlipayMarketingActivityOrdervoucherCodedepositModel() { 
  }

  public AlipayMarketingActivityOrdervoucherCodedepositModel merchantAccessMode(String merchantAccessMode) {
    
    this.merchantAccessMode = merchantAccessMode;
    return this;
  }

   /**
   * 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式
   * @return merchantAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SELF_MODE", value = "商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式")

  public String getMerchantAccessMode() {
    return merchantAccessMode;
  }


  public void setMerchantAccessMode(String merchantAccessMode) {
    this.merchantAccessMode = merchantAccessMode;
  }


  public AlipayMarketingActivityOrdervoucherCodedepositModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务单号，用作幂等控制。  幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。  外部接入方需保证业务单号唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170101000001654bb46ba", value = "外部业务单号，用作幂等控制。  幂等作用： 参数不变的情况下，再次请求返回与上一次相同的结果。  外部接入方需保证业务单号唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayMarketingActivityOrdervoucherCodedepositModel voucherCodes(List<String> voucherCodes) {
    
    this.voucherCodes = voucherCodes;
    return this;
  }

  public AlipayMarketingActivityOrdervoucherCodedepositModel addVoucherCodesItem(String voucherCodesItem) {
    if (this.voucherCodes == null) {
      this.voucherCodes = new ArrayList<>();
    }
    this.voucherCodes.add(voucherCodesItem);
    return this;
  }

   /**
   * 券码的数量列表。接口参数为列表类型。  限制： 目前最大上传 1000 个。  单个code最长64位。  商户上传的券code列表，code允许包含的字符有0-9、a-z、A-Z、-、_、+、&#x3D;、|。
   * @return voucherCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"123AB\",\"45zz6\",\"789CE\"]", value = "券码的数量列表。接口参数为列表类型。  限制： 目前最大上传 1000 个。  单个code最长64位。  商户上传的券code列表，code允许包含的字符有0-9、a-z、A-Z、-、_、+、=、|。")

  public List<String> getVoucherCodes() {
    return voucherCodes;
  }


  public void setVoucherCodes(List<String> voucherCodes) {
    this.voucherCodes = voucherCodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityOrdervoucherCodedepositModel alipayMarketingActivityOrdervoucherCodedepositModel = (AlipayMarketingActivityOrdervoucherCodedepositModel) o;
    return Objects.equals(this.merchantAccessMode, alipayMarketingActivityOrdervoucherCodedepositModel.merchantAccessMode) &&
        Objects.equals(this.outBizNo, alipayMarketingActivityOrdervoucherCodedepositModel.outBizNo) &&
        Objects.equals(this.voucherCodes, alipayMarketingActivityOrdervoucherCodedepositModel.voucherCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccessMode, outBizNo, voucherCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityOrdervoucherCodedepositModel {\n");
    sb.append("    merchantAccessMode: ").append(toIndentedString(merchantAccessMode)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    voucherCodes: ").append(toIndentedString(voucherCodes)).append("\n");
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
    openapiFields.add("merchant_access_mode");
    openapiFields.add("out_biz_no");
    openapiFields.add("voucher_codes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityOrdervoucherCodedepositModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityOrdervoucherCodedepositModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityOrdervoucherCodedepositModel is not found in the empty JSON string", AlipayMarketingActivityOrdervoucherCodedepositModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityOrdervoucherCodedepositModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityOrdervoucherCodedepositModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("merchant_access_mode") != null && !jsonObj.get("merchant_access_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_access_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_access_mode").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("voucher_codes") != null && !jsonObj.get("voucher_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_codes` to be an array in the JSON string but got `%s`", jsonObj.get("voucher_codes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityOrdervoucherCodedepositModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityOrdervoucherCodedepositModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityOrdervoucherCodedepositModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityOrdervoucherCodedepositModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityOrdervoucherCodedepositModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityOrdervoucherCodedepositModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityOrdervoucherCodedepositModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityOrdervoucherCodedepositModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityOrdervoucherCodedepositModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityOrdervoucherCodedepositModel
  */
  public static AlipayMarketingActivityOrdervoucherCodedepositModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityOrdervoucherCodedepositModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityOrdervoucherCodedepositModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

