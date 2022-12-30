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
import com.alipay.v3.model.CommonVoucherDisplayLiteInfo;
import com.alipay.v3.model.CommonVoucherUseRuleLiteInfo;
import com.alipay.v3.model.VoucherAvailableScopeInfo;
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
 * ActivityLiteInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActivityLiteInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVITY_BASE_INFO = "activity_base_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_BASE_INFO)
  private ActivityBaseInfo activityBaseInfo;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId;

  public static final String SERIALIZED_NAME_ACTIVITY_NAME = "activity_name";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_NAME)
  private String activityName;

  public static final String SERIALIZED_NAME_ACTIVITY_STATUS = "activity_status";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_STATUS)
  private String activityStatus;

  public static final String SERIALIZED_NAME_BELONG_MERCHANT_ID = "belong_merchant_id";
  @SerializedName(SERIALIZED_NAME_BELONG_MERCHANT_ID)
  private String belongMerchantId;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_PUBLISH_END_TIME = "publish_end_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_END_TIME)
  private String publishEndTime;

  public static final String SERIALIZED_NAME_PUBLISH_START_TIME = "publish_start_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_START_TIME)
  private String publishStartTime;

  public static final String SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO = "voucher_available_scope_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_AVAILABLE_SCOPE_INFO)
  private VoucherAvailableScopeInfo voucherAvailableScopeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DEDUCT_INFO = "voucher_deduct_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DEDUCT_INFO)
  private VoucherDeductInfo voucherDeductInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_LITE_INFO = "voucher_display_lite_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_LITE_INFO)
  private CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo;

  public static final String SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO = "voucher_display_pattern_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DISPLAY_PATTERN_INFO)
  private VoucherDisplayPatternInfo voucherDisplayPatternInfo;

  public static final String SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO = "voucher_send_mode_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_SEND_MODE_INFO)
  private VoucherSendModeInfo voucherSendModeInfo;

  public static final String SERIALIZED_NAME_VOUCHER_TYPE = "voucher_type";
  @SerializedName(SERIALIZED_NAME_VOUCHER_TYPE)
  private String voucherType;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_INFO = "voucher_use_rule_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_INFO)
  private VoucherUseRuleInfo voucherUseRuleInfo;

  public static final String SERIALIZED_NAME_VOUCHER_USE_RULE_LITE_INFO = "voucher_use_rule_lite_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_RULE_LITE_INFO)
  private CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo;

  public ActivityLiteInfo() { 
  }

  public ActivityLiteInfo activityBaseInfo(ActivityBaseInfo activityBaseInfo) {
    
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


  public ActivityLiteInfo activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 活动 id。
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042700826004508401111111", value = "活动 id。")

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public ActivityLiteInfo activityName(String activityName) {
    
    this.activityName = activityName;
    return this;
  }

   /**
   * 活动名称。 不对支付宝用户进行展示，仅供商家在后台管理活动使用。
   * @return activityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "满10减1活动", value = "活动名称。 不对支付宝用户进行展示，仅供商家在后台管理活动使用。")

  public String getActivityName() {
    return activityName;
  }


  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }


  public ActivityLiteInfo activityStatus(String activityStatus) {
    
    this.activityStatus = activityStatus;
    return this;
  }

   /**
   * 活动状态。
   * @return activityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACTIVE", value = "活动状态。")

  public String getActivityStatus() {
    return activityStatus;
  }


  public void setActivityStatus(String activityStatus) {
    this.activityStatus = activityStatus;
  }


  public ActivityLiteInfo belongMerchantId(String belongMerchantId) {
    
    this.belongMerchantId = belongMerchantId;
    return this;
  }

   /**
   * 归属商户 PID。
   * @return belongMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088202967380463", value = "归属商户 PID。")

  public String getBelongMerchantId() {
    return belongMerchantId;
  }


  public void setBelongMerchantId(String belongMerchantId) {
    this.belongMerchantId = belongMerchantId;
  }


  public ActivityLiteInfo createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 活动创建时间。
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "活动创建时间。")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public ActivityLiteInfo publishEndTime(String publishEndTime) {
    
    this.publishEndTime = publishEndTime;
    return this;
  }

   /**
   * 券发放结束时间。格式为：yyyy-MM-dd HH:mm:ss。
   * @return publishEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-29 23:59:59", value = "券发放结束时间。格式为：yyyy-MM-dd HH:mm:ss。")

  public String getPublishEndTime() {
    return publishEndTime;
  }


  public void setPublishEndTime(String publishEndTime) {
    this.publishEndTime = publishEndTime;
  }


  public ActivityLiteInfo publishStartTime(String publishStartTime) {
    
    this.publishStartTime = publishStartTime;
    return this;
  }

   /**
   * 券发放开始时间。格式为：yyyy-MM-dd HH:mm:ss。
   * @return publishStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "券发放开始时间。格式为：yyyy-MM-dd HH:mm:ss。")

  public String getPublishStartTime() {
    return publishStartTime;
  }


  public void setPublishStartTime(String publishStartTime) {
    this.publishStartTime = publishStartTime;
  }


  public ActivityLiteInfo voucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
    return this;
  }

   /**
   * Get voucherAvailableScopeInfo
   * @return voucherAvailableScopeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherAvailableScopeInfo getVoucherAvailableScopeInfo() {
    return voucherAvailableScopeInfo;
  }


  public void setVoucherAvailableScopeInfo(VoucherAvailableScopeInfo voucherAvailableScopeInfo) {
    this.voucherAvailableScopeInfo = voucherAvailableScopeInfo;
  }


  public ActivityLiteInfo voucherDeductInfo(VoucherDeductInfo voucherDeductInfo) {
    
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


  public ActivityLiteInfo voucherDisplayLiteInfo(CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo) {
    
    this.voucherDisplayLiteInfo = voucherDisplayLiteInfo;
    return this;
  }

   /**
   * Get voucherDisplayLiteInfo
   * @return voucherDisplayLiteInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonVoucherDisplayLiteInfo getVoucherDisplayLiteInfo() {
    return voucherDisplayLiteInfo;
  }


  public void setVoucherDisplayLiteInfo(CommonVoucherDisplayLiteInfo voucherDisplayLiteInfo) {
    this.voucherDisplayLiteInfo = voucherDisplayLiteInfo;
  }


  public ActivityLiteInfo voucherDisplayPatternInfo(VoucherDisplayPatternInfo voucherDisplayPatternInfo) {
    
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


  public ActivityLiteInfo voucherSendModeInfo(VoucherSendModeInfo voucherSendModeInfo) {
    
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


  public ActivityLiteInfo voucherType(String voucherType) {
    
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


  public ActivityLiteInfo voucherUseRuleInfo(VoucherUseRuleInfo voucherUseRuleInfo) {
    
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


  public ActivityLiteInfo voucherUseRuleLiteInfo(CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo) {
    
    this.voucherUseRuleLiteInfo = voucherUseRuleLiteInfo;
    return this;
  }

   /**
   * Get voucherUseRuleLiteInfo
   * @return voucherUseRuleLiteInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CommonVoucherUseRuleLiteInfo getVoucherUseRuleLiteInfo() {
    return voucherUseRuleLiteInfo;
  }


  public void setVoucherUseRuleLiteInfo(CommonVoucherUseRuleLiteInfo voucherUseRuleLiteInfo) {
    this.voucherUseRuleLiteInfo = voucherUseRuleLiteInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityLiteInfo activityLiteInfo = (ActivityLiteInfo) o;
    return Objects.equals(this.activityBaseInfo, activityLiteInfo.activityBaseInfo) &&
        Objects.equals(this.activityId, activityLiteInfo.activityId) &&
        Objects.equals(this.activityName, activityLiteInfo.activityName) &&
        Objects.equals(this.activityStatus, activityLiteInfo.activityStatus) &&
        Objects.equals(this.belongMerchantId, activityLiteInfo.belongMerchantId) &&
        Objects.equals(this.createTime, activityLiteInfo.createTime) &&
        Objects.equals(this.publishEndTime, activityLiteInfo.publishEndTime) &&
        Objects.equals(this.publishStartTime, activityLiteInfo.publishStartTime) &&
        Objects.equals(this.voucherAvailableScopeInfo, activityLiteInfo.voucherAvailableScopeInfo) &&
        Objects.equals(this.voucherDeductInfo, activityLiteInfo.voucherDeductInfo) &&
        Objects.equals(this.voucherDisplayLiteInfo, activityLiteInfo.voucherDisplayLiteInfo) &&
        Objects.equals(this.voucherDisplayPatternInfo, activityLiteInfo.voucherDisplayPatternInfo) &&
        Objects.equals(this.voucherSendModeInfo, activityLiteInfo.voucherSendModeInfo) &&
        Objects.equals(this.voucherType, activityLiteInfo.voucherType) &&
        Objects.equals(this.voucherUseRuleInfo, activityLiteInfo.voucherUseRuleInfo) &&
        Objects.equals(this.voucherUseRuleLiteInfo, activityLiteInfo.voucherUseRuleLiteInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityBaseInfo, activityId, activityName, activityStatus, belongMerchantId, createTime, publishEndTime, publishStartTime, voucherAvailableScopeInfo, voucherDeductInfo, voucherDisplayLiteInfo, voucherDisplayPatternInfo, voucherSendModeInfo, voucherType, voucherUseRuleInfo, voucherUseRuleLiteInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityLiteInfo {\n");
    sb.append("    activityBaseInfo: ").append(toIndentedString(activityBaseInfo)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityStatus: ").append(toIndentedString(activityStatus)).append("\n");
    sb.append("    belongMerchantId: ").append(toIndentedString(belongMerchantId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    publishEndTime: ").append(toIndentedString(publishEndTime)).append("\n");
    sb.append("    publishStartTime: ").append(toIndentedString(publishStartTime)).append("\n");
    sb.append("    voucherAvailableScopeInfo: ").append(toIndentedString(voucherAvailableScopeInfo)).append("\n");
    sb.append("    voucherDeductInfo: ").append(toIndentedString(voucherDeductInfo)).append("\n");
    sb.append("    voucherDisplayLiteInfo: ").append(toIndentedString(voucherDisplayLiteInfo)).append("\n");
    sb.append("    voucherDisplayPatternInfo: ").append(toIndentedString(voucherDisplayPatternInfo)).append("\n");
    sb.append("    voucherSendModeInfo: ").append(toIndentedString(voucherSendModeInfo)).append("\n");
    sb.append("    voucherType: ").append(toIndentedString(voucherType)).append("\n");
    sb.append("    voucherUseRuleInfo: ").append(toIndentedString(voucherUseRuleInfo)).append("\n");
    sb.append("    voucherUseRuleLiteInfo: ").append(toIndentedString(voucherUseRuleLiteInfo)).append("\n");
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
    openapiFields.add("activity_name");
    openapiFields.add("activity_status");
    openapiFields.add("belong_merchant_id");
    openapiFields.add("create_time");
    openapiFields.add("publish_end_time");
    openapiFields.add("publish_start_time");
    openapiFields.add("voucher_available_scope_info");
    openapiFields.add("voucher_deduct_info");
    openapiFields.add("voucher_display_lite_info");
    openapiFields.add("voucher_display_pattern_info");
    openapiFields.add("voucher_send_mode_info");
    openapiFields.add("voucher_type");
    openapiFields.add("voucher_use_rule_info");
    openapiFields.add("voucher_use_rule_lite_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActivityLiteInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ActivityLiteInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActivityLiteInfo is not found in the empty JSON string", ActivityLiteInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActivityLiteInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActivityLiteInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `activity_base_info`
      if (jsonObj.getAsJsonObject("activity_base_info") != null) {
        ActivityBaseInfo.validateJsonObject(jsonObj.getAsJsonObject("activity_base_info"));
      }
      if (jsonObj.get("activity_id") != null && !jsonObj.get("activity_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_id").toString()));
      }
      if (jsonObj.get("activity_name") != null && !jsonObj.get("activity_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_name").toString()));
      }
      if (jsonObj.get("activity_status") != null && !jsonObj.get("activity_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activity_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activity_status").toString()));
      }
      if (jsonObj.get("belong_merchant_id") != null && !jsonObj.get("belong_merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `belong_merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("belong_merchant_id").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("publish_end_time") != null && !jsonObj.get("publish_end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_end_time").toString()));
      }
      if (jsonObj.get("publish_start_time") != null && !jsonObj.get("publish_start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publish_start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publish_start_time").toString()));
      }
      // validate the optional field `voucher_available_scope_info`
      if (jsonObj.getAsJsonObject("voucher_available_scope_info") != null) {
        VoucherAvailableScopeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_available_scope_info"));
      }
      // validate the optional field `voucher_deduct_info`
      if (jsonObj.getAsJsonObject("voucher_deduct_info") != null) {
        VoucherDeductInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_deduct_info"));
      }
      // validate the optional field `voucher_display_lite_info`
      if (jsonObj.getAsJsonObject("voucher_display_lite_info") != null) {
        CommonVoucherDisplayLiteInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_lite_info"));
      }
      // validate the optional field `voucher_display_pattern_info`
      if (jsonObj.getAsJsonObject("voucher_display_pattern_info") != null) {
        VoucherDisplayPatternInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_display_pattern_info"));
      }
      // validate the optional field `voucher_send_mode_info`
      if (jsonObj.getAsJsonObject("voucher_send_mode_info") != null) {
        VoucherSendModeInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_send_mode_info"));
      }
      if (jsonObj.get("voucher_type") != null && !jsonObj.get("voucher_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_type").toString()));
      }
      // validate the optional field `voucher_use_rule_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_info") != null) {
        VoucherUseRuleInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_info"));
      }
      // validate the optional field `voucher_use_rule_lite_info`
      if (jsonObj.getAsJsonObject("voucher_use_rule_lite_info") != null) {
        CommonVoucherUseRuleLiteInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_rule_lite_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActivityLiteInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActivityLiteInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActivityLiteInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActivityLiteInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ActivityLiteInfo>() {
           @Override
           public void write(JsonWriter out, ActivityLiteInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActivityLiteInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActivityLiteInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActivityLiteInfo
  * @throws IOException if the JSON string is invalid with respect to ActivityLiteInfo
  */
  public static ActivityLiteInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActivityLiteInfo.class);
  }

 /**
  * Convert an instance of ActivityLiteInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

