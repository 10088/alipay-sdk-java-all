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
 * AlipayPcreditHuabeiAuthOrderUnfreezeModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPcreditHuabeiAuthOrderUnfreezeModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_NEED_TERMINATED = "need_terminated";
  @SerializedName(SERIALIZED_NAME_NEED_TERMINATED)
  private String needTerminated;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_ORDER_TITLE = "order_title";
  @SerializedName(SERIALIZED_NAME_ORDER_TITLE)
  private String orderTitle;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_SELLER_ID = "seller_id";
  @SerializedName(SERIALIZED_NAME_SELLER_ID)
  private String sellerId;

  public static final String SERIALIZED_NAME_UNFREEZE_AMOUNT = "unfreeze_amount";
  @SerializedName(SERIALIZED_NAME_UNFREEZE_AMOUNT)
  private String unfreezeAmount;

  public AlipayPcreditHuabeiAuthOrderUnfreezeModel() { 
  }

  public AlipayPcreditHuabeiAuthOrderUnfreezeModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20185513447859192007", value = "支付宝系统中用以唯一标识用户签约记录的编号，即花呗先享协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "买家在支付宝的用户id")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeModel needTerminated(String needTerminated) {
    
    this.needTerminated = needTerminated;
    return this;
  }

   /**
   * true表示需要解约。false或者不填写表示仅解冻。
   * @return needTerminated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "'false'", value = "true表示需要解约。false或者不填写表示仅解冻。")

  public String getNeedTerminated() {
    return needTerminated;
  }


  public void setNeedTerminated(String needTerminated) {
    this.needTerminated = needTerminated;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 买家在支付宝的用户id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "买家在支付宝的用户id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeModel orderTitle(String orderTitle) {
    
    this.orderTitle = orderTitle;
    return this;
  }

   /**
   * 商户业务订单的简单描述，如商品名称等，长度不超过100个字母或50个汉字
   * @return orderTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "饿了么花呗先享超级会员撤销", value = "商户业务订单的简单描述，如商品名称等，长度不超过100个字母或50个汉字")

  public String getOrderTitle() {
    return orderTitle;
  }


  public void setOrderTitle(String orderTitle) {
    this.orderTitle = orderTitle;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次操作的请求流水号，用于标识请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938032", value = "商户本次操作的请求流水号，用于标识请求流水的唯一性，不能包含除中文、英文、数字以外的字符，需要保证在商户端不重复。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeModel sellerId(String sellerId) {
    
    this.sellerId = sellerId;
    return this;
  }

   /**
   * 商户的支付宝用户id。如果该值为空，则默认为商户签约账号对应的支付宝用户ID。
   * @return sellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102146225135", value = "商户的支付宝用户id。如果该值为空，则默认为商户签约账号对应的支付宝用户ID。")

  public String getSellerId() {
    return sellerId;
  }


  public void setSellerId(String sellerId) {
    this.sellerId = sellerId;
  }


  public AlipayPcreditHuabeiAuthOrderUnfreezeModel unfreezeAmount(String unfreezeAmount) {
    
    this.unfreezeAmount = unfreezeAmount;
    return this;
  }

   /**
   * 需要解冻的金额，单位为：元（人民币），精确到小数点后两位
   * @return unfreezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3.00", value = "需要解冻的金额，单位为：元（人民币），精确到小数点后两位")

  public String getUnfreezeAmount() {
    return unfreezeAmount;
  }


  public void setUnfreezeAmount(String unfreezeAmount) {
    this.unfreezeAmount = unfreezeAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayPcreditHuabeiAuthOrderUnfreezeModel alipayPcreditHuabeiAuthOrderUnfreezeModel = (AlipayPcreditHuabeiAuthOrderUnfreezeModel) o;
    return Objects.equals(this.agreementNo, alipayPcreditHuabeiAuthOrderUnfreezeModel.agreementNo) &&
        Objects.equals(this.alipayUserId, alipayPcreditHuabeiAuthOrderUnfreezeModel.alipayUserId) &&
        Objects.equals(this.needTerminated, alipayPcreditHuabeiAuthOrderUnfreezeModel.needTerminated) &&
        Objects.equals(this.openId, alipayPcreditHuabeiAuthOrderUnfreezeModel.openId) &&
        Objects.equals(this.orderTitle, alipayPcreditHuabeiAuthOrderUnfreezeModel.orderTitle) &&
        Objects.equals(this.outRequestNo, alipayPcreditHuabeiAuthOrderUnfreezeModel.outRequestNo) &&
        Objects.equals(this.sellerId, alipayPcreditHuabeiAuthOrderUnfreezeModel.sellerId) &&
        Objects.equals(this.unfreezeAmount, alipayPcreditHuabeiAuthOrderUnfreezeModel.unfreezeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, alipayUserId, needTerminated, openId, orderTitle, outRequestNo, sellerId, unfreezeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPcreditHuabeiAuthOrderUnfreezeModel {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    needTerminated: ").append(toIndentedString(needTerminated)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    orderTitle: ").append(toIndentedString(orderTitle)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    unfreezeAmount: ").append(toIndentedString(unfreezeAmount)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("alipay_user_id");
    openapiFields.add("need_terminated");
    openapiFields.add("open_id");
    openapiFields.add("order_title");
    openapiFields.add("out_request_no");
    openapiFields.add("seller_id");
    openapiFields.add("unfreeze_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPcreditHuabeiAuthOrderUnfreezeModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPcreditHuabeiAuthOrderUnfreezeModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPcreditHuabeiAuthOrderUnfreezeModel is not found in the empty JSON string", AlipayPcreditHuabeiAuthOrderUnfreezeModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayPcreditHuabeiAuthOrderUnfreezeModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayPcreditHuabeiAuthOrderUnfreezeModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("need_terminated") != null && !jsonObj.get("need_terminated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `need_terminated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("need_terminated").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("order_title") != null && !jsonObj.get("order_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_title").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("seller_id") != null && !jsonObj.get("seller_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller_id").toString()));
      }
      if (jsonObj.get("unfreeze_amount") != null && !jsonObj.get("unfreeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unfreeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unfreeze_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPcreditHuabeiAuthOrderUnfreezeModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPcreditHuabeiAuthOrderUnfreezeModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPcreditHuabeiAuthOrderUnfreezeModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPcreditHuabeiAuthOrderUnfreezeModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPcreditHuabeiAuthOrderUnfreezeModel>() {
           @Override
           public void write(JsonWriter out, AlipayPcreditHuabeiAuthOrderUnfreezeModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayPcreditHuabeiAuthOrderUnfreezeModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayPcreditHuabeiAuthOrderUnfreezeModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPcreditHuabeiAuthOrderUnfreezeModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPcreditHuabeiAuthOrderUnfreezeModel
  */
  public static AlipayPcreditHuabeiAuthOrderUnfreezeModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPcreditHuabeiAuthOrderUnfreezeModel.class);
  }

 /**
  * Convert an instance of AlipayPcreditHuabeiAuthOrderUnfreezeModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

