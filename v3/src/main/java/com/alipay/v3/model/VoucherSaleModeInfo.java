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
import com.alipay.v3.model.BizfundSettleInfo;
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
 * VoucherSaleModeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherSaleModeInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FUND_CUSTODY_MODE = "fund_custody_mode";
  @SerializedName(SERIALIZED_NAME_FUND_CUSTODY_MODE)
  private String fundCustodyMode;

  public static final String SERIALIZED_NAME_OVERDUE_REFUNDABLE = "overdue_refundable";
  @SerializedName(SERIALIZED_NAME_OVERDUE_REFUNDABLE)
  private Boolean overdueRefundable;

  public static final String SERIALIZED_NAME_PAYEE_PID = "payee_pid";
  @SerializedName(SERIALIZED_NAME_PAYEE_PID)
  private String payeePid;

  public static final String SERIALIZED_NAME_REFUNDABLE = "refundable";
  @SerializedName(SERIALIZED_NAME_REFUNDABLE)
  private Boolean refundable;

  public static final String SERIALIZED_NAME_SALE_AMOUNT = "sale_amount";
  @SerializedName(SERIALIZED_NAME_SALE_AMOUNT)
  private String saleAmount;

  public static final String SERIALIZED_NAME_SETTLE_INFO = "settle_info";
  @SerializedName(SERIALIZED_NAME_SETTLE_INFO)
  private BizfundSettleInfo settleInfo;

  public VoucherSaleModeInfo() { 
  }

  public VoucherSaleModeInfo fundCustodyMode(String fundCustodyMode) {
    
    this.fundCustodyMode = fundCustodyMode;
    return this;
  }

   /**
   * 资金托管方式
   * @return fundCustodyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "资金托管方式")

  public String getFundCustodyMode() {
    return fundCustodyMode;
  }


  public void setFundCustodyMode(String fundCustodyMode) {
    this.fundCustodyMode = fundCustodyMode;
  }


  public VoucherSaleModeInfo overdueRefundable(Boolean overdueRefundable) {
    
    this.overdueRefundable = overdueRefundable;
    return this;
  }

   /**
   * 是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否。自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。 如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。
   * @return overdueRefundable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否支持优惠券过期后，自动退款给用户。 不填默认否，枚举值： true：是 false：否。自动退款功能需要服务商在优惠券过期时，主动调用alipay.marketing.activity.order.refund接口进行退款。 如果配置优惠券时选择了过期自动退款，但是实际券过期后，服务商没有进行退款，那么用户投诉后，需要服务商进行解决。")

  public Boolean getOverdueRefundable() {
    return overdueRefundable;
  }


  public void setOverdueRefundable(Boolean overdueRefundable) {
    this.overdueRefundable = overdueRefundable;
  }


  public VoucherSaleModeInfo payeePid(String payeePid) {
    
    this.payeePid = payeePid;
    return this;
  }

   /**
   * 收款账号。 目前的结算规则是，每核销一笔优惠券，支付宝会打款到该收款账户。
   * @return payeePid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收款账号。 目前的结算规则是，每核销一笔优惠券，支付宝会打款到该收款账户。")

  public String getPayeePid() {
    return payeePid;
  }


  public void setPayeePid(String payeePid) {
    this.payeePid = payeePid;
  }


  public VoucherSaleModeInfo refundable(Boolean refundable) {
    
    this.refundable = refundable;
    return this;
  }

   /**
   * 购买的优惠券是否允许退款。 不填默认否，枚举值： true：是 false：否
   * @return refundable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "购买的优惠券是否允许退款。 不填默认否，枚举值： true：是 false：否")

  public Boolean getRefundable() {
    return refundable;
  }


  public void setRefundable(Boolean refundable) {
    this.refundable = refundable;
  }


  public VoucherSaleModeInfo saleAmount(String saleAmount) {
    
    this.saleAmount = saleAmount;
    return this;
  }

   /**
   * 用户购买优惠券需要支付的金额
   * @return saleAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户购买优惠券需要支付的金额")

  public String getSaleAmount() {
    return saleAmount;
  }


  public void setSaleAmount(String saleAmount) {
    this.saleAmount = saleAmount;
  }


  public VoucherSaleModeInfo settleInfo(BizfundSettleInfo settleInfo) {
    
    this.settleInfo = settleInfo;
    return this;
  }

   /**
   * Get settleInfo
   * @return settleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BizfundSettleInfo getSettleInfo() {
    return settleInfo;
  }


  public void setSettleInfo(BizfundSettleInfo settleInfo) {
    this.settleInfo = settleInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherSaleModeInfo voucherSaleModeInfo = (VoucherSaleModeInfo) o;
    return Objects.equals(this.fundCustodyMode, voucherSaleModeInfo.fundCustodyMode) &&
        Objects.equals(this.overdueRefundable, voucherSaleModeInfo.overdueRefundable) &&
        Objects.equals(this.payeePid, voucherSaleModeInfo.payeePid) &&
        Objects.equals(this.refundable, voucherSaleModeInfo.refundable) &&
        Objects.equals(this.saleAmount, voucherSaleModeInfo.saleAmount) &&
        Objects.equals(this.settleInfo, voucherSaleModeInfo.settleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundCustodyMode, overdueRefundable, payeePid, refundable, saleAmount, settleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSaleModeInfo {\n");
    sb.append("    fundCustodyMode: ").append(toIndentedString(fundCustodyMode)).append("\n");
    sb.append("    overdueRefundable: ").append(toIndentedString(overdueRefundable)).append("\n");
    sb.append("    payeePid: ").append(toIndentedString(payeePid)).append("\n");
    sb.append("    refundable: ").append(toIndentedString(refundable)).append("\n");
    sb.append("    saleAmount: ").append(toIndentedString(saleAmount)).append("\n");
    sb.append("    settleInfo: ").append(toIndentedString(settleInfo)).append("\n");
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
    openapiFields.add("fund_custody_mode");
    openapiFields.add("overdue_refundable");
    openapiFields.add("payee_pid");
    openapiFields.add("refundable");
    openapiFields.add("sale_amount");
    openapiFields.add("settle_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherSaleModeInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherSaleModeInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherSaleModeInfo is not found in the empty JSON string", VoucherSaleModeInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherSaleModeInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherSaleModeInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fund_custody_mode") != null && !jsonObj.get("fund_custody_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fund_custody_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fund_custody_mode").toString()));
      }
      if (jsonObj.get("payee_pid") != null && !jsonObj.get("payee_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_pid").toString()));
      }
      if (jsonObj.get("sale_amount") != null && !jsonObj.get("sale_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_amount").toString()));
      }
      // validate the optional field `settle_info`
      if (jsonObj.getAsJsonObject("settle_info") != null) {
        BizfundSettleInfo.validateJsonObject(jsonObj.getAsJsonObject("settle_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherSaleModeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherSaleModeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherSaleModeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherSaleModeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherSaleModeInfo>() {
           @Override
           public void write(JsonWriter out, VoucherSaleModeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherSaleModeInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherSaleModeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherSaleModeInfo
  * @throws IOException if the JSON string is invalid with respect to VoucherSaleModeInfo
  */
  public static VoucherSaleModeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherSaleModeInfo.class);
  }

 /**
  * Convert an instance of VoucherSaleModeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

