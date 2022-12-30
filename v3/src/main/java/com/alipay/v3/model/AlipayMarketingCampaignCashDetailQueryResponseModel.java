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
 * AlipayMarketingCampaignCashDetailQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCampaignCashDetailQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAMP_STATUS = "camp_status";
  @SerializedName(SERIALIZED_NAME_CAMP_STATUS)
  private String campStatus;

  public static final String SERIALIZED_NAME_COUPON_NAME = "coupon_name";
  @SerializedName(SERIALIZED_NAME_COUPON_NAME)
  private String couponName;

  public static final String SERIALIZED_NAME_CROWD_NO = "crowd_no";
  @SerializedName(SERIALIZED_NAME_CROWD_NO)
  private String crowdNo;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_ORIGIN_CROWD_NO = "origin_crowd_no";
  @SerializedName(SERIALIZED_NAME_ORIGIN_CROWD_NO)
  private String originCrowdNo;

  public static final String SERIALIZED_NAME_PRIZE_MSG = "prize_msg";
  @SerializedName(SERIALIZED_NAME_PRIZE_MSG)
  private String prizeMsg;

  public static final String SERIALIZED_NAME_PRIZE_TYPE = "prize_type";
  @SerializedName(SERIALIZED_NAME_PRIZE_TYPE)
  private String prizeType;

  public static final String SERIALIZED_NAME_SEND_AMOUNT = "send_amount";
  @SerializedName(SERIALIZED_NAME_SEND_AMOUNT)
  private String sendAmount;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private String totalAmount;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_NUM = "total_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
  private Integer totalNum;

  public AlipayMarketingCampaignCashDetailQueryResponseModel() { 
  }

  public AlipayMarketingCampaignCashDetailQueryResponseModel campStatus(String campStatus) {
    
    this.campStatus = campStatus;
    return this;
  }

   /**
   * 活动状态，CREATED: 已创建未打款 PAID:已打款 READY:活动已开始 PAUSE:活动已暂停 CLOSED:活动已结束 SETTLED:活动已清算
   * @return campStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREATED、PAID、READY、PAUSE、CLOSED、SETTLED", value = "活动状态，CREATED: 已创建未打款 PAID:已打款 READY:活动已开始 PAUSE:活动已暂停 CLOSED:活动已结束 SETTLED:活动已清算")

  public String getCampStatus() {
    return campStatus;
  }


  public void setCampStatus(String campStatus) {
    this.campStatus = campStatus;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel couponName(String couponName) {
    
    this.couponName = couponName;
    return this;
  }

   /**
   * 红包名称
   * @return couponName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX周年庆红包", value = "红包名称")

  public String getCouponName() {
    return couponName;
  }


  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel crowdNo(String crowdNo) {
    
    this.crowdNo = crowdNo;
    return this;
  }

   /**
   * 活动号
   * @return crowdNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POYb84lfiKVdIfERAYsqPL_KQRIpfQbl47xfRmmPBlDMnSZ96O-zxUfKlHp5cxmx", value = "活动号")

  public String getCrowdNo() {
    return crowdNo;
  }


  public void setCrowdNo(String crowdNo) {
    this.crowdNo = crowdNo;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 活动结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-08-10 22:28:30", value = "活动结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel originCrowdNo(String originCrowdNo) {
    
    this.originCrowdNo = originCrowdNo;
    return this;
  }

   /**
   * 原始活动号,商户排查问题时提供的活动依据
   * @return originCrowdNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20160901029410190092922308762004", value = "原始活动号,商户排查问题时提供的活动依据")

  public String getOriginCrowdNo() {
    return originCrowdNo;
  }


  public void setOriginCrowdNo(String originCrowdNo) {
    this.originCrowdNo = originCrowdNo;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel prizeMsg(String prizeMsg) {
    
    this.prizeMsg = prizeMsg;
    return this;
  }

   /**
   * 活动文案,用户在账单中看到的红包描述
   * @return prizeMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XX送您大红包", value = "活动文案,用户在账单中看到的红包描述")

  public String getPrizeMsg() {
    return prizeMsg;
  }


  public void setPrizeMsg(String prizeMsg) {
    this.prizeMsg = prizeMsg;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel prizeType(String prizeType) {
    
    this.prizeType = prizeType;
    return this;
  }

   /**
   * 现金红包的发放形式, fixed为固定金额,random为随机金额
   * @return prizeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "random", value = "现金红包的发放形式, fixed为固定金额,random为随机金额")

  public String getPrizeType() {
    return prizeType;
  }


  public void setPrizeType(String prizeType) {
    this.prizeType = prizeType;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel sendAmount(String sendAmount) {
    
    this.sendAmount = sendAmount;
    return this;
  }

   /**
   * 活动已发放金额
   * @return sendAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200000.00", value = "活动已发放金额")

  public String getSendAmount() {
    return sendAmount;
  }


  public void setSendAmount(String sendAmount) {
    this.sendAmount = sendAmount;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 活动开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-08-10 22:28:30", value = "活动开始时间")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel totalAmount(String totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 活动总金额
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20000.00", value = "活动总金额")

  public String getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * 红包总个数
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "红包总个数")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public AlipayMarketingCampaignCashDetailQueryResponseModel totalNum(Integer totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * 红包总个数(废弃)
   * @return totalNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "红包总个数(废弃)")

  public Integer getTotalNum() {
    return totalNum;
  }


  public void setTotalNum(Integer totalNum) {
    this.totalNum = totalNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCampaignCashDetailQueryResponseModel alipayMarketingCampaignCashDetailQueryResponseModel = (AlipayMarketingCampaignCashDetailQueryResponseModel) o;
    return Objects.equals(this.campStatus, alipayMarketingCampaignCashDetailQueryResponseModel.campStatus) &&
        Objects.equals(this.couponName, alipayMarketingCampaignCashDetailQueryResponseModel.couponName) &&
        Objects.equals(this.crowdNo, alipayMarketingCampaignCashDetailQueryResponseModel.crowdNo) &&
        Objects.equals(this.endTime, alipayMarketingCampaignCashDetailQueryResponseModel.endTime) &&
        Objects.equals(this.originCrowdNo, alipayMarketingCampaignCashDetailQueryResponseModel.originCrowdNo) &&
        Objects.equals(this.prizeMsg, alipayMarketingCampaignCashDetailQueryResponseModel.prizeMsg) &&
        Objects.equals(this.prizeType, alipayMarketingCampaignCashDetailQueryResponseModel.prizeType) &&
        Objects.equals(this.sendAmount, alipayMarketingCampaignCashDetailQueryResponseModel.sendAmount) &&
        Objects.equals(this.startTime, alipayMarketingCampaignCashDetailQueryResponseModel.startTime) &&
        Objects.equals(this.totalAmount, alipayMarketingCampaignCashDetailQueryResponseModel.totalAmount) &&
        Objects.equals(this.totalCount, alipayMarketingCampaignCashDetailQueryResponseModel.totalCount) &&
        Objects.equals(this.totalNum, alipayMarketingCampaignCashDetailQueryResponseModel.totalNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campStatus, couponName, crowdNo, endTime, originCrowdNo, prizeMsg, prizeType, sendAmount, startTime, totalAmount, totalCount, totalNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCampaignCashDetailQueryResponseModel {\n");
    sb.append("    campStatus: ").append(toIndentedString(campStatus)).append("\n");
    sb.append("    couponName: ").append(toIndentedString(couponName)).append("\n");
    sb.append("    crowdNo: ").append(toIndentedString(crowdNo)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    originCrowdNo: ").append(toIndentedString(originCrowdNo)).append("\n");
    sb.append("    prizeMsg: ").append(toIndentedString(prizeMsg)).append("\n");
    sb.append("    prizeType: ").append(toIndentedString(prizeType)).append("\n");
    sb.append("    sendAmount: ").append(toIndentedString(sendAmount)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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
    openapiFields.add("camp_status");
    openapiFields.add("coupon_name");
    openapiFields.add("crowd_no");
    openapiFields.add("end_time");
    openapiFields.add("origin_crowd_no");
    openapiFields.add("prize_msg");
    openapiFields.add("prize_type");
    openapiFields.add("send_amount");
    openapiFields.add("start_time");
    openapiFields.add("total_amount");
    openapiFields.add("total_count");
    openapiFields.add("total_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCampaignCashDetailQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCampaignCashDetailQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCampaignCashDetailQueryResponseModel is not found in the empty JSON string", AlipayMarketingCampaignCashDetailQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCampaignCashDetailQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCampaignCashDetailQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("camp_status") != null && !jsonObj.get("camp_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `camp_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("camp_status").toString()));
      }
      if (jsonObj.get("coupon_name") != null && !jsonObj.get("coupon_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coupon_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coupon_name").toString()));
      }
      if (jsonObj.get("crowd_no") != null && !jsonObj.get("crowd_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `crowd_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("crowd_no").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("origin_crowd_no") != null && !jsonObj.get("origin_crowd_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `origin_crowd_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("origin_crowd_no").toString()));
      }
      if (jsonObj.get("prize_msg") != null && !jsonObj.get("prize_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prize_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prize_msg").toString()));
      }
      if (jsonObj.get("prize_type") != null && !jsonObj.get("prize_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prize_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prize_type").toString()));
      }
      if (jsonObj.get("send_amount") != null && !jsonObj.get("send_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `send_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("send_amount").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCampaignCashDetailQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCampaignCashDetailQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCampaignCashDetailQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCampaignCashDetailQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCampaignCashDetailQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCampaignCashDetailQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCampaignCashDetailQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCampaignCashDetailQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCampaignCashDetailQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCampaignCashDetailQueryResponseModel
  */
  public static AlipayMarketingCampaignCashDetailQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCampaignCashDetailQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCampaignCashDetailQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

