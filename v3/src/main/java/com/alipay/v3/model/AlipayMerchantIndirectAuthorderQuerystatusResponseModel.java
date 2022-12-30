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
import com.alipay.v3.model.IndirectAuthOrderFailedReason;
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
 * AlipayMerchantIndirectAuthorderQuerystatusResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMerchantIndirectAuthorderQuerystatusResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ORDER_NO = "order_no";
  @SerializedName(SERIALIZED_NAME_ORDER_NO)
  private String orderNo;

  public static final String SERIALIZED_NAME_ORDER_STATUS = "order_status";
  @SerializedName(SERIALIZED_NAME_ORDER_STATUS)
  private String orderStatus;

  public static final String SERIALIZED_NAME_QR_CODE = "qr_code";
  @SerializedName(SERIALIZED_NAME_QR_CODE)
  private String qrCode;

  public static final String SERIALIZED_NAME_VERIFY_LIST = "verify_list";
  @SerializedName(SERIALIZED_NAME_VERIFY_LIST)
  private List<IndirectAuthOrderFailedReason> verifyList = null;

  public AlipayMerchantIndirectAuthorderQuerystatusResponseModel() { 
  }

  public AlipayMerchantIndirectAuthorderQuerystatusResponseModel orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 商家认证申请单号
   * @return orderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220000666660001", value = "商家认证申请单号")

  public String getOrderNo() {
    return orderNo;
  }


  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public AlipayMerchantIndirectAuthorderQuerystatusResponseModel orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * 商家认证申请单状态，枚举值：审核中(AUDITING)、待联系人确认（CONTACT_CONFIRM），待法人确认（LEGAL_CONFIRM）、审核通过(AUDIT_PASS)、审核失败(AUDIT_REJECT)、已冻结(AUDIT_FREEZE)、已撤回(CANCELED)
   * @return orderStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUDITING", value = "商家认证申请单状态，枚举值：审核中(AUDITING)、待联系人确认（CONTACT_CONFIRM），待法人确认（LEGAL_CONFIRM）、审核通过(AUDIT_PASS)、审核失败(AUDIT_REJECT)、已冻结(AUDIT_FREEZE)、已撤回(CANCELED)")

  public String getOrderStatus() {
    return orderStatus;
  }


  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public AlipayMerchantIndirectAuthorderQuerystatusResponseModel qrCode(String qrCode) {
    
    this.qrCode = qrCode;
    return this;
  }

   /**
   * 商家认证小程序二维码图片链接，申请单状态处于审核通过、待联系人确认、待法人确认、已冻结时返回，商户使用支付宝APP扫码后完成后续确认动作。 此字段是平台生成并返回的二维码码值，通过浏览器访问即可获得一个二维码的图片。服务商在推广过程中，可引导商家使用支付宝APP扫描此二维码，进入认证申请单页面，完成认证申请的后续确认操作。
   * @return qrCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://qrcode.alipay.com/token/test", value = "商家认证小程序二维码图片链接，申请单状态处于审核通过、待联系人确认、待法人确认、已冻结时返回，商户使用支付宝APP扫码后完成后续确认动作。 此字段是平台生成并返回的二维码码值，通过浏览器访问即可获得一个二维码的图片。服务商在推广过程中，可引导商家使用支付宝APP扫描此二维码，进入认证申请单页面，完成认证申请的后续确认操作。")

  public String getQrCode() {
    return qrCode;
  }


  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }


  public AlipayMerchantIndirectAuthorderQuerystatusResponseModel verifyList(List<IndirectAuthOrderFailedReason> verifyList) {
    
    this.verifyList = verifyList;
    return this;
  }

  public AlipayMerchantIndirectAuthorderQuerystatusResponseModel addVerifyListItem(IndirectAuthOrderFailedReason verifyListItem) {
    if (this.verifyList == null) {
      this.verifyList = new ArrayList<>();
    }
    this.verifyList.add(verifyListItem);
    return this;
  }

   /**
   * 申请单审核失败时的原因描述列表
   * @return verifyList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "申请单审核失败时的原因描述列表")

  public List<IndirectAuthOrderFailedReason> getVerifyList() {
    return verifyList;
  }


  public void setVerifyList(List<IndirectAuthOrderFailedReason> verifyList) {
    this.verifyList = verifyList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMerchantIndirectAuthorderQuerystatusResponseModel alipayMerchantIndirectAuthorderQuerystatusResponseModel = (AlipayMerchantIndirectAuthorderQuerystatusResponseModel) o;
    return Objects.equals(this.orderNo, alipayMerchantIndirectAuthorderQuerystatusResponseModel.orderNo) &&
        Objects.equals(this.orderStatus, alipayMerchantIndirectAuthorderQuerystatusResponseModel.orderStatus) &&
        Objects.equals(this.qrCode, alipayMerchantIndirectAuthorderQuerystatusResponseModel.qrCode) &&
        Objects.equals(this.verifyList, alipayMerchantIndirectAuthorderQuerystatusResponseModel.verifyList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo, orderStatus, qrCode, verifyList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMerchantIndirectAuthorderQuerystatusResponseModel {\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
    sb.append("    verifyList: ").append(toIndentedString(verifyList)).append("\n");
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
    openapiFields.add("order_no");
    openapiFields.add("order_status");
    openapiFields.add("qr_code");
    openapiFields.add("verify_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMerchantIndirectAuthorderQuerystatusResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMerchantIndirectAuthorderQuerystatusResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMerchantIndirectAuthorderQuerystatusResponseModel is not found in the empty JSON string", AlipayMerchantIndirectAuthorderQuerystatusResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMerchantIndirectAuthorderQuerystatusResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMerchantIndirectAuthorderQuerystatusResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("order_no") != null && !jsonObj.get("order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_no").toString()));
      }
      if (jsonObj.get("order_status") != null && !jsonObj.get("order_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_status").toString()));
      }
      if (jsonObj.get("qr_code") != null && !jsonObj.get("qr_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qr_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qr_code").toString()));
      }
      JsonArray jsonArrayverifyList = jsonObj.getAsJsonArray("verify_list");
      if (jsonArrayverifyList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("verify_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `verify_list` to be an array in the JSON string but got `%s`", jsonObj.get("verify_list").toString()));
        }

        // validate the optional field `verify_list` (array)
        for (int i = 0; i < jsonArrayverifyList.size(); i++) {
          IndirectAuthOrderFailedReason.validateJsonObject(jsonArrayverifyList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMerchantIndirectAuthorderQuerystatusResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMerchantIndirectAuthorderQuerystatusResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMerchantIndirectAuthorderQuerystatusResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMerchantIndirectAuthorderQuerystatusResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMerchantIndirectAuthorderQuerystatusResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMerchantIndirectAuthorderQuerystatusResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMerchantIndirectAuthorderQuerystatusResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMerchantIndirectAuthorderQuerystatusResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMerchantIndirectAuthorderQuerystatusResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMerchantIndirectAuthorderQuerystatusResponseModel
  */
  public static AlipayMerchantIndirectAuthorderQuerystatusResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMerchantIndirectAuthorderQuerystatusResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMerchantIndirectAuthorderQuerystatusResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

