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
import com.alipay.v3.model.ActivityBaseInfo;
import com.alipay.v3.model.CommonVoucherDisplayInfo;
import com.alipay.v3.model.CommonVoucherSendRule;
import com.alipay.v3.model.CommonVoucherUseRule;
import com.alipay.v3.model.UserVoucherBaseInfo;
import com.alipay.v3.model.VoucherDeductInfo;
import com.alipay.v3.model.VoucherDisplayPatternInfo;
import com.alipay.v3.model.VoucherSendModeInfo;
import com.alipay.v3.model.VoucherUseRuleInfo;
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
 * AlipayMarketingActivityUserQueryvoucherResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityUserQueryvoucherResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVITY_BASE_INFO = "activity_base_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BASE_INFO)
  private ActivityBaseInfo activityBaseInfo;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_ASSOCIATE_TRADE_NO = "associate_trade_no";
  @SerializedName(SERIALIZED_NAME_ASSOCIATE_TRADE_NO)
  private String associateTradeNo;

  public static final String SERIALIZED_NAME_AVAILABLE_BEGIN_TIME = "available_begin_time";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_BEGIN_TIME)
  private String availableBeginTime;

  public static final String SERIALIZED_NAME_AVAILABLE_END_TIME = "available_end_time";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_END_TIME)
  private String availableEndTime;

  public static final String SERIALIZED_NAME_BELONG_MERCHANT_ID = "belong_merchant_id";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_ID)
  private String belongMerchantId;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_USER_VOUCHER_BASE_INFO = "user_voucher_base_info";
  @SerializedName(SERIALIZED_NAME_USER_VOUCHER_BASE_INFO)
  private UserVoucherBaseInfo userVoucherBaseInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DEDUCT_INFO = "voucher_deduct_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DEDUCT_INFO)
  private VoucherDeductInfo voucherDeductInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_INFO = "voucher_display_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_INFO)
  private CommonVoucherDisplayInfo voucherDisplayInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO = "voucher_display_pattern_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO)
  private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

  public static final String SERIALIZED_NAME_VOUCHER_NAME = "voucher_name";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NAME)
  private String voucherName;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO = "voucher_send_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO)
  private VoucherSendModeInfo voucherSendModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_RULE = "voucher_send_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_RULE)
  private CommonVoucherSendRule voucherSendRule;

  public static final String SERIALIZED_NAME_VOUCHER_STATUS = "voucher_status";
  @SerializedName(SERIALIZED_NAME_VOUCHER_STATUS)
  private String voucherStatus;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private String voucherType;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE = "voucher_use_rule";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE)
  private CommonVoucherUseRule voucherUseRule;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_INFO = "voucher_use_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_INFO)
  private VoucherUseRuleInfo voucherUseRuleInfo;

  public AlipayMarketingActivityUserQueryvoucherResponseModel() { 
  }

  public AlipayMarketingActivityUserQueryvoucherResponseModel activityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    
    this.activityBaseInfo = activityBaseInfo;
    return this;
  }

   /**
   * Get activityBaseInfo
   * @return activityBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActivityBaseInfo getActivityBaseInfo() {
    return activityBaseInfo;
  }


  public void setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    this.activityBaseInfo = activityBaseInfo;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动 id
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042700826004508401111111", value = "活动 id")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel associateTradeNo(String associateTradeNo) {
    
    this.associateTradeNo = associateTradeNo;
    return this;
  }

   /**
   * 若商家券操作过关联商户订单信息，则该字段返回商家券已关联的商户订单号。
   * @return associateTradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021042322001426261436764012", value = "若商家券操作过关联商户订单信息，则该字段返回商家券已关联的商户订单号。")

  public String getAssociateTradeNo() {
    return associateTradeNo;
  }


  public void setAssociateTradeNo(String associateTradeNo) {
    this.associateTradeNo = associateTradeNo;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel availableBeginTime(String availableBeginTime) {
    
    this.availableBeginTime = availableBeginTime;
    return this;
  }

   /**
   * 券可用开始时间
   * @return availableBeginTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "券可用开始时间")

  public String getAvailableBeginTime() {
    return availableBeginTime;
  }


  public void setAvailableBeginTime(String availableBeginTime) {
    this.availableBeginTime = availableBeginTime;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel availableEndTime(String availableEndTime) {
    
    this.availableEndTime = availableEndTime;
    return this;
  }

   /**
   * 券可用结束时间
   * @return availableEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "券可用结束时间")

  public String getAvailableEndTime() {
    return availableEndTime;
  }


  public void setAvailableEndTime(String availableEndTime) {
    this.availableEndTime = availableEndTime;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel belongMerchantId(String belongMerchantId) {
    
    this.belongMerchantId = belongMerchantId;
    return this;
  }

   /**
   * 券归属 pid
   * @return belongMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088202967380463", value = "券归属 pid")

  public String getBelongMerchantId() {
    return belongMerchantId;
  }


  public void setBelongMerchantId(String belongMerchantId) {
    this.belongMerchantId = belongMerchantId;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 领券时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "领券时间")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel userVoucherBaseInfo(UserVoucherBaseInfo userVoucherBaseInfo) {
    
    this.userVoucherBaseInfo = userVoucherBaseInfo;
    return this;
  }

   /**
   * Get userVoucherBaseInfo
   * @return userVoucherBaseInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserVoucherBaseInfo getUserVoucherBaseInfo() {
    return userVoucherBaseInfo;
  }


  public void setUserVoucherBaseInfo(UserVoucherBaseInfo userVoucherBaseInfo) {
    this.userVoucherBaseInfo = userVoucherBaseInfo;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    
    this.voucherDeductInfo = voucherDeductInfo;
    return this;
  }

   /**
   * Get voucherDeductInfo
   * @return voucherDeductInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDeductInfo getVoucherDeductInfo() {
    return voucherDeductInfo;
  }


  public void setVoucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    this.voucherDeductInfo = voucherDeductInfo;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherDisplayInfo(CommonVoucherDisplayInfo voucherDisplayInfo) {
    
    this.voucherDisplayInfo = voucherDisplayInfo;
    return this;
  }

   /**
   * Get voucherDisplayInfo
   * @return voucherDisplayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonVoucherDisplayInfo getVoucherDisplayInfo() {
    return voucherDisplayInfo;
  }


  public void setVoucherDisplayInfo(CommonVoucherDisplayInfo voucherDisplayInfo) {
    this.voucherDisplayInfo = voucherDisplayInfo;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
    return this;
  }

   /**
   * Get voucherDisplayPatternInfo
   * @return voucherDisplayPatternInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherDisplayPatternInfo getVoucherDisplayPatternInfo() {
    return voucherDisplayPatternInfo;
  }


  public void setVoucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    this.voucherDisplayPatternInfo = voucherDisplayPatternInfo;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherName(String voucherName) {
    
    this.voucherName = voucherName;
    return this;
  }

   /**
   * 券名称
   * @return voucherName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "满10减1", value = "券名称")

  public String getVoucherName() {
    return voucherName;
  }


  public void setVoucherName(String voucherName) {
    this.voucherName = voucherName;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    
    this.voucherSendModeInfo = voucherSendModeInfo;
    return this;
  }

   /**
   * Get voucherSendModeInfo
   * @return voucherSendModeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherSendModeInfo getVoucherSendModeInfo() {
    return voucherSendModeInfo;
  }


  public void setVoucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    this.voucherSendModeInfo = voucherSendModeInfo;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherSendRule(CommonVoucherSendRule voucherSendRule) {
    
    this.voucherSendRule = voucherSendRule;
    return this;
  }

   /**
   * Get voucherSendRule
   * @return voucherSendRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonVoucherSendRule getVoucherSendRule() {
    return voucherSendRule;
  }


  public void setVoucherSendRule(CommonVoucherSendRule voucherSendRule) {
    this.voucherSendRule = voucherSendRule;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherStatus(String voucherStatus) {
    
    this.voucherStatus = voucherStatus;
    return this;
  }

   /**
   * 券状态。
   * @return voucherStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SENDED", value = "券状态。")

  public String getVoucherStatus() {
    return voucherStatus;
  }


  public void setVoucherStatus(String voucherStatus) {
    this.voucherStatus = voucherStatus;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherType(String voucherType) {
    
    this.voucherType = voucherType;
    return this;
  }

   /**
   * 券类型。
   * @return voucherType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIX_VOUCHER", value = "券类型。")

  public String getVoucherType() {
    return voucherType;
  }


  public void setVoucherType(String voucherType) {
    this.voucherType = voucherType;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherUseRule(CommonVoucherUseRule voucherUseRule) {
    
    this.voucherUseRule = voucherUseRule;
    return this;
  }

   /**
   * Get voucherUseRule
   * @return voucherUseRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonVoucherUseRule getVoucherUseRule() {
    return voucherUseRule;
  }


  public void setVoucherUseRule(CommonVoucherUseRule voucherUseRule) {
    this.voucherUseRule = voucherUseRule;
  }


  public AlipayMarketingActivityUserQueryvoucherResponseModel voucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    
    this.voucherUseRuleInfo = voucherUseRuleInfo;
    return this;
  }

   /**
   * Get voucherUseRuleInfo
   * @return voucherUseRuleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseRuleInfo getVoucherUseRuleInfo() {
    return voucherUseRuleInfo;
  }


  public void setVoucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    this.voucherUseRuleInfo = voucherUseRuleInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityUserQueryvoucherResponseModel alipayMarketingActivityUserQueryvoucherResponseModel = (AlipayMarketingActivityUserQueryvoucherResponseModel) o;
    return Objects.equals(this.activityBaseInfo, alipayMarketingActivityUserQueryvoucherResponseModel.activityBaseInfo) &&
        Objects.equals(this.activityId, alipayMarketingActivityUserQueryvoucherResponseModel.activityId) &&
        Objects.equals(this.associateTradeNo, alipayMarketingActivityUserQueryvoucherResponseModel.associateTradeNo) &&
        Objects.equals(this.availableBeginTime, alipayMarketingActivityUserQueryvoucherResponseModel.availableBeginTime) &&
        Objects.equals(this.availableEndTime, alipayMarketingActivityUserQueryvoucherResponseModel.availableEndTime) &&
        Objects.equals(this.belongMerchantId, alipayMarketingActivityUserQueryvoucherResponseModel.belongMerchantId) &&
        Objects.equals(this.createTime, alipayMarketingActivityUserQueryvoucherResponseModel.createTime) &&
        Objects.equals(this.userVoucherBaseInfo, alipayMarketingActivityUserQueryvoucherResponseModel.userVoucherBaseInfo) &&
        Objects.equals(this.voucherDeductInfo, alipayMarketingActivityUserQueryvoucherResponseModel.voucherDeductInfo) &&
        Objects.equals(this.voucherDisplayInfo, alipayMarketingActivityUserQueryvoucherResponseModel.voucherDisplayInfo) &&
        Objects.equals(this.voucherDisplayPatternInfo, alipayMarketingActivityUserQueryvoucherResponseModel.voucherDisplayPatternInfo) &&
        Objects.equals(this.voucherName, alipayMarketingActivityUserQueryvoucherResponseModel.voucherName) &&
        Objects.equals(this.voucherSendModeInfo, alipayMarketingActivityUserQueryvoucherResponseModel.voucherSendModeInfo) &&
        Objects.equals(this.voucherSendRule, alipayMarketingActivityUserQueryvoucherResponseModel.voucherSendRule) &&
        Objects.equals(this.voucherStatus, alipayMarketingActivityUserQueryvoucherResponseModel.voucherStatus) &&
        Objects.equals(this.voucherType, alipayMarketingActivityUserQueryvoucherResponseModel.voucherType) &&
        Objects.equals(this.voucherUseRule, alipayMarketingActivityUserQueryvoucherResponseModel.voucherUseRule) &&
        Objects.equals(this.voucherUseRuleInfo, alipayMarketingActivityUserQueryvoucherResponseModel.voucherUseRuleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityBaseInfo, activityId, associateTradeNo, availableBeginTime, availableEndTime, belongMerchantId, createTime, userVoucherBaseInfo, voucherDeductInfo, voucherDisplayInfo, voucherDisplayPatternInfo, voucherName, voucherSendModeInfo, voucherSendRule, voucherStatus, voucherType, voucherUseRule, voucherUseRuleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityUserQueryvoucherResponseModel {\n");
    sb.append("    activityBaseInfo: ").append(toIndentedString(activityBaseInfo)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    associateTradeNo: ").append(toIndentedString(associateTradeNo)).append("\n");
    sb.append("    availableBeginTime: ").append(toIndentedString(availableBeginTime)).append("\n");
    sb.append("    availableEndTime: ").append(toIndentedString(availableEndTime)).append("\n");
    sb.append("    belongMerchantId: ").append(toIndentedString(belongMerchantId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    userVoucherBaseInfo: ").append(toIndentedString(userVoucherBaseInfo)).append("\n");
    sb.append("    voucherDeductInfo: ").append(toIndentedString(voucherDeductInfo)).append("\n");
    sb.append("    voucherDisplayInfo: ").append(toIndentedString(voucherDisplayInfo)).append("\n");
    sb.append("    voucherDisplayPatternInfo: ").append(toIndentedString(voucherDisplayPatternInfo)).append("\n");
    sb.append("    voucherName: ").append(toIndentedString(voucherName)).append("\n");
    sb.append("    voucherSendModeInfo: ").append(toIndentedString(voucherSendModeInfo)).append("\n");
    sb.append("    voucherSendRule: ").append(toIndentedString(voucherSendRule)).append("\n");
    sb.append("    voucherStatus: ").append(toIndentedString(voucherStatus)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    voucherUseRule: ").append(toIndentedString(voucherUseRule)).append("\n");
    sb.append("    voucherUseRuleInfo: ").append(toIndentedString(voucherUseRuleInfo)).append("\n");
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
    openapiFields.add("activity_base_info");
    openapiFields.add("activity_id");
    openapiFields.add("associate_trade_no");
    openapiFields.add("available_begin_time");
    openapiFields.add("available_end_time");
    openapiFields.add("belong_merchant_id");
    openapiFields.add("create_time");
    openapiFields.add("user_voucher_base_info");
    openapiFields.add("voucher_deduct_info");
    openapiFields.add("voucher_display_info");
    openapiFields.add("voucher_display_pattern_info");
    openapiFields.add("voucher_name");
    openapiFields.add("voucher_send_mode_info");
    openapiFields.add("voucher_send_rule");
    openapiFields.add("voucher_status");
    openapiFields.add("voucher_type");
    openapiFields.add("voucher_use_rule");
    openapiFields.add("voucher_use_rule_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityUserQueryvoucherResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityUserQueryvoucherResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityUserQueryvoucherResponseModel is not found in the empty JSON string", AlipayMarketingActivityUserQueryvoucherResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityUserQueryvoucherResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityUserQueryvoucherResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `activity_base_info`
      if (jsonObj.getAsJsonObject("activity_base_info") != null) {
        ActivityBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("activity_base_info"));
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("associate_trade_no") != null && !jsonObj.get("associate_trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `associate_trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("associate_trade_no").toString()));
      }
      if (jsonObj.get("available_begin_time") != null && !jsonObj.get("available_begin_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_begin_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_begin_time").toString()));
      }
      if (jsonObj.get("available_end_time") != null && !jsonObj.get("available_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_end_time").toString()));
      }
      if (jsonObj.get("belong_merchant_id") != null && !jsonObj.get("belong_merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `belong_merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("belong_merchant_id").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      // validate the optional field `user_voucher_base_info`
      if (jsonObj.getAsJsonObject("user_voucher_base_info") != null) {
        UserVoucherBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("user_voucher_base_info"));
      }
      // validate the optional field `voucher_deduct_info`
      if (jsonObj.getAsJsonObject("voucher_deduct_info") != null) {
        VoucherDeductInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_deduct_info"));
      }
      // validate the optional field `voucher_display_info`
      if (jsonObj.getAsJsonObject("voucher_display_info") != null) {
        CommonVoucherDisplayInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_info"));
      }
      // validate the optional field `voucher_display_pattern_info`
      if (jsonObj.getAsJsonObject("voucher_display_pattern_info") != null) {
        VoucherDisplayPatternInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_pattern_info"));
      }
      if (jsonObj.get("voucher_name") != null && !jsonObj.get("voucher_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_name").toString()));
      }
      // validate the optional field `voucher_send_mode_info`
      if (jsonObj.getAsJsonObject("voucher_send_mode_info") != null) {
        VoucherSendModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_mode_info"));
      }
      // validate the optional field `voucher_send_rule`
      if (jsonObj.getAsJsonObject("voucher_send_rule") != null) {
        CommonVoucherSendRule.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_rule"));
      }
      if (jsonObj.get("voucher_status") != null && !jsonObj.get("voucher_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_status").toString()));
      }
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_type").toString()));
      }
      // validate the optional field `voucher_use_rule`
      if (jsonObj.getAsJsonObject("voucher_use_rule") != null) {
        CommonVoucherUseRule.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule"));
      }
      // validate the optional field `voucher_use_rule_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_info") != null) {
        VoucherUseRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityUserQueryvoucherResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityUserQueryvoucherResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityUserQueryvoucherResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityUserQueryvoucherResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityUserQueryvoucherResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityUserQueryvoucherResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityUserQueryvoucherResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityUserQueryvoucherResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityUserQueryvoucherResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityUserQueryvoucherResponseModel
  */
  public static AlipayMarketingActivityUserQueryvoucherResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityUserQueryvoucherResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityUserQueryvoucherResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

