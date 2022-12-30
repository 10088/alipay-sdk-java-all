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
 * ZMGOOpenConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZMGOOpenConfig {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLY_BUTTON_DESC = "apply_button_desc";
  @SerializedName(SERIALIZED_NAME_APPLY_BUTTON_DESC)
  private String applyButtonDesc;

  public static final String SERIALIZED_NAME_APPOINT_DATE = "appoint_date";
  @SerializedName(SERIALIZED_NAME_APPOINT_DATE)
  private String appointDate;

  public static final String SERIALIZED_NAME_CARD_COLOR_SCHEME = "card_color_scheme";
  @SerializedName(SERIALIZED_NAME_CARD_COLOR_SCHEME)
  private String cardColorScheme;

  public static final String SERIALIZED_NAME_CUSTOM_OPEN_TIP_LIST = "custom_open_tip_list";
  @SerializedName(SERIALIZED_NAME_CUSTOM_OPEN_TIP_LIST)
  private String customOpenTipList;

  public static final String SERIALIZED_NAME_CUSTOM_OPEN_TIPS = "custom_open_tips";
  @SerializedName(SERIALIZED_NAME_CUSTOM_OPEN_TIPS)
  private String customOpenTips;

  public static final String SERIALIZED_NAME_FREEZE_AMOUNT = "freeze_amount";
  @SerializedName(SERIALIZED_NAME_FREEZE_AMOUNT)
  private String freezeAmount;

  public static final String SERIALIZED_NAME_MIN_SIGN_INTERVAL = "min_sign_interval";
  @SerializedName(SERIALIZED_NAME_MIN_SIGN_INTERVAL)
  private String minSignInterval;

  public static final String SERIALIZED_NAME_PERIOD_MODE = "period_mode";
  @SerializedName(SERIALIZED_NAME_PERIOD_MODE)
  private String periodMode;

  public static final String SERIALIZED_NAME_PERIOD_TIME = "period_time";
  @SerializedName(SERIALIZED_NAME_PERIOD_TIME)
  private String periodTime;

  public static final String SERIALIZED_NAME_SHOW_SIGN_SUCCESS_PAGE = "show_sign_success_page";
  @SerializedName(SERIALIZED_NAME_SHOW_SIGN_SUCCESS_PAGE)
  private Boolean showSignSuccessPage;

  public static final String SERIALIZED_NAME_SIGN_AGAIN_SCHEMA = "sign_again_schema";
  @SerializedName(SERIALIZED_NAME_SIGN_AGAIN_SCHEMA)
  private String signAgainSchema;

  public static final String SERIALIZED_NAME_SIGN_SUCCESS_TASK_BUTTON_DESC = "sign_success_task_button_desc";
  @SerializedName(SERIALIZED_NAME_SIGN_SUCCESS_TASK_BUTTON_DESC)
  private String signSuccessTaskButtonDesc;

  public static final String SERIALIZED_NAME_SUPPORT_EXPIRE_DEFERRAL = "support_expire_deferral";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EXPIRE_DEFERRAL)
  private Boolean supportExpireDeferral;

  public ZMGOOpenConfig() { 
  }

  public ZMGOOpenConfig applyButtonDesc(String applyButtonDesc) {
    
    this.applyButtonDesc = applyButtonDesc;
    return this;
  }

   /**
   * 开通页按钮文案描述;传入内容后开通页点击开通按钮展示文案会使用该字段传入内容
   * @return applyButtonDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开通页按钮文案描述;传入内容后开通页点击开通按钮展示文案会使用该字段传入内容")

  public String getApplyButtonDesc() {
    return applyButtonDesc;
  }


  public void setApplyButtonDesc(String applyButtonDesc) {
    this.applyButtonDesc = applyButtonDesc;
  }


  public ZMGOOpenConfig appointDate(String appointDate) {
    
    this.appointDate = appointDate;
    return this;
  }

   /**
   * 固定到期时间或每月的第几日。 （1）当period_mode为APPOINT_DATE时，取值固定日期，如\&quot;2022-06-01 00:00:00\&quot;，表示协议在6月1号0点到期; （2）当period_mode为FIX_DATE，取值\&quot;3\&quot;，表示协议在period_time个月后的3号到期。
   * @return appointDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "固定到期时间或每月的第几日。 （1）当period_mode为APPOINT_DATE时，取值固定日期，如\"2022-06-01 00:00:00\"，表示协议在6月1号0点到期; （2）当period_mode为FIX_DATE，取值\"3\"，表示协议在period_time个月后的3号到期。")

  public String getAppointDate() {
    return appointDate;
  }


  public void setAppointDate(String appointDate) {
    this.appointDate = appointDate;
  }


  public ZMGOOpenConfig cardColorScheme(String cardColorScheme) {
    
    this.cardColorScheme = cardColorScheme;
    return this;
  }

   /**
   * 芝麻GO卡颜色。 C_BLACK(\&quot;C_BLACK\&quot;, \&quot;黑色\&quot;), C_RED(\&quot;C_RED\&quot;, \&quot;红色\&quot;), C_GREEN(\&quot;C_GREEN\&quot;, \&quot;绿色\&quot;), C_LIGHT_BLUE(\&quot;C_LIGHT_BLUE\&quot;, \&quot;浅蓝色\&quot;), C_BLUE(\&quot;C_BLUE\&quot;, \&quot;蓝色\&quot;), C_ORANGE(\&quot;C_ORANGE\&quot;,\&quot;橙色\&quot;), C_PURPLE(\&quot;C_PURPLE\&quot;, \&quot;紫色\&quot;);
   * @return cardColorScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "芝麻GO卡颜色。 C_BLACK(\"C_BLACK\", \"黑色\"), C_RED(\"C_RED\", \"红色\"), C_GREEN(\"C_GREEN\", \"绿色\"), C_LIGHT_BLUE(\"C_LIGHT_BLUE\", \"浅蓝色\"), C_BLUE(\"C_BLUE\", \"蓝色\"), C_ORANGE(\"C_ORANGE\",\"橙色\"), C_PURPLE(\"C_PURPLE\", \"紫色\");")

  public String getCardColorScheme() {
    return cardColorScheme;
  }


  public void setCardColorScheme(String cardColorScheme) {
    this.cardColorScheme = cardColorScheme;
  }


  public ZMGOOpenConfig customOpenTipList(String customOpenTipList) {
    
    this.customOpenTipList = customOpenTipList;
    return this;
  }

   /**
   * 未完成任务规则详情
   * @return customOpenTipList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "未完成任务规则详情")

  public String getCustomOpenTipList() {
    return customOpenTipList;
  }


  public void setCustomOpenTipList(String customOpenTipList) {
    this.customOpenTipList = customOpenTipList;
  }


  public ZMGOOpenConfig customOpenTips(String customOpenTips) {
    
    this.customOpenTips = customOpenTips;
    return this;
  }

   /**
   * 规则详情
   * @return customOpenTips
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规则详情")

  public String getCustomOpenTips() {
    return customOpenTips;
  }


  public void setCustomOpenTips(String customOpenTips) {
    this.customOpenTips = customOpenTips;
  }


  public ZMGOOpenConfig freezeAmount(String freezeAmount) {
    
    this.freezeAmount = freezeAmount;
    return this;
  }

   /**
   * 担保金额额度
   * @return freezeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "担保金额额度")

  public String getFreezeAmount() {
    return freezeAmount;
  }


  public void setFreezeAmount(String freezeAmount) {
    this.freezeAmount = freezeAmount;
  }


  public ZMGOOpenConfig minSignInterval(String minSignInterval) {
    
    this.minSignInterval = minSignInterval;
    return this;
  }

   /**
   * 用户签约间隔时间
   * @return minSignInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户签约间隔时间")

  public String getMinSignInterval() {
    return minSignInterval;
  }


  public void setMinSignInterval(String minSignInterval) {
    this.minSignInterval = minSignInterval;
  }


  public ZMGOOpenConfig periodMode(String periodMode) {
    
    this.periodMode = periodMode;
    return this;
  }

   /**
   * 芝麻GO义务到期的计算方式。包括： RELATIVE_DATE(\&quot;RELATIVE_DATE\&quot;, \&quot;相对日期\&quot;), ABSOLATE_DATE(\&quot;ABSOLATE_DATE\&quot;, \&quot;绝对日期(当日开始计算)\&quot;), ABSOLUTE_PLUS_1_DATE(\&quot;ABSOLUTE_PLUS_1_DATE\&quot;, \&quot;绝对日期(次日开始计算)\&quot;), FIX_DATE(\&quot;FIX_DATE\&quot;, \&quot;固定日期\&quot;), APPOINT_DATE(\&quot;APPOINT_DATE\&quot;, \&quot;指定日期\&quot;),
   * @return periodMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "芝麻GO义务到期的计算方式。包括： RELATIVE_DATE(\"RELATIVE_DATE\", \"相对日期\"), ABSOLATE_DATE(\"ABSOLATE_DATE\", \"绝对日期(当日开始计算)\"), ABSOLUTE_PLUS_1_DATE(\"ABSOLUTE_PLUS_1_DATE\", \"绝对日期(次日开始计算)\"), FIX_DATE(\"FIX_DATE\", \"固定日期\"), APPOINT_DATE(\"APPOINT_DATE\", \"指定日期\"),")

  public String getPeriodMode() {
    return periodMode;
  }


  public void setPeriodMode(String periodMode) {
    this.periodMode = periodMode;
  }


  public ZMGOOpenConfig periodTime(String periodTime) {
    
    this.periodTime = periodTime;
    return this;
  }

   /**
   * 周期时长 当period_mode为RELATIVE_DATE、ABSOLATE_DATE、ABSOLUTE_PLUS_1_DATE、FIX_DATE时必填
   * @return periodTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "周期时长 当period_mode为RELATIVE_DATE、ABSOLATE_DATE、ABSOLUTE_PLUS_1_DATE、FIX_DATE时必填")

  public String getPeriodTime() {
    return periodTime;
  }


  public void setPeriodTime(String periodTime) {
    this.periodTime = periodTime;
  }


  public ZMGOOpenConfig showSignSuccessPage(Boolean showSignSuccessPage) {
    
    this.showSignSuccessPage = showSignSuccessPage;
    return this;
  }

   /**
   * 是否展示签约完成页
   * @return showSignSuccessPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否展示签约完成页")

  public Boolean getShowSignSuccessPage() {
    return showSignSuccessPage;
  }


  public void setShowSignSuccessPage(Boolean showSignSuccessPage) {
    this.showSignSuccessPage = showSignSuccessPage;
  }


  public ZMGOOpenConfig signAgainSchema(String signAgainSchema) {
    
    this.signAgainSchema = signAgainSchema;
    return this;
  }

   /**
   * 用户签约商户活动到期
   * @return signAgainSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用户签约商户活动到期")

  public String getSignAgainSchema() {
    return signAgainSchema;
  }


  public void setSignAgainSchema(String signAgainSchema) {
    this.signAgainSchema = signAgainSchema;
  }


  public ZMGOOpenConfig signSuccessTaskButtonDesc(String signSuccessTaskButtonDesc) {
    
    this.signSuccessTaskButtonDesc = signSuccessTaskButtonDesc;
    return this;
  }

   /**
   * 签约完成页任务按钮描述，当展示签约完成页&#x3D;true的时候 改内容必填
   * @return signSuccessTaskButtonDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签约完成页任务按钮描述，当展示签约完成页=true的时候 改内容必填")

  public String getSignSuccessTaskButtonDesc() {
    return signSuccessTaskButtonDesc;
  }


  public void setSignSuccessTaskButtonDesc(String signSuccessTaskButtonDesc) {
    this.signSuccessTaskButtonDesc = signSuccessTaskButtonDesc;
  }


  public ZMGOOpenConfig supportExpireDeferral(Boolean supportExpireDeferral) {
    
    this.supportExpireDeferral = supportExpireDeferral;
    return this;
  }

   /**
   * 是否支持延期特权
   * @return supportExpireDeferral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "是否支持延期特权")

  public Boolean getSupportExpireDeferral() {
    return supportExpireDeferral;
  }


  public void setSupportExpireDeferral(Boolean supportExpireDeferral) {
    this.supportExpireDeferral = supportExpireDeferral;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZMGOOpenConfig zmGOOpenConfig = (ZMGOOpenConfig) o;
    return Objects.equals(this.applyButtonDesc, zmGOOpenConfig.applyButtonDesc) &&
        Objects.equals(this.appointDate, zmGOOpenConfig.appointDate) &&
        Objects.equals(this.cardColorScheme, zmGOOpenConfig.cardColorScheme) &&
        Objects.equals(this.customOpenTipList, zmGOOpenConfig.customOpenTipList) &&
        Objects.equals(this.customOpenTips, zmGOOpenConfig.customOpenTips) &&
        Objects.equals(this.freezeAmount, zmGOOpenConfig.freezeAmount) &&
        Objects.equals(this.minSignInterval, zmGOOpenConfig.minSignInterval) &&
        Objects.equals(this.periodMode, zmGOOpenConfig.periodMode) &&
        Objects.equals(this.periodTime, zmGOOpenConfig.periodTime) &&
        Objects.equals(this.showSignSuccessPage, zmGOOpenConfig.showSignSuccessPage) &&
        Objects.equals(this.signAgainSchema, zmGOOpenConfig.signAgainSchema) &&
        Objects.equals(this.signSuccessTaskButtonDesc, zmGOOpenConfig.signSuccessTaskButtonDesc) &&
        Objects.equals(this.supportExpireDeferral, zmGOOpenConfig.supportExpireDeferral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyButtonDesc, appointDate, cardColorScheme, customOpenTipList, customOpenTips, freezeAmount, minSignInterval, periodMode, periodTime, showSignSuccessPage, signAgainSchema, signSuccessTaskButtonDesc, supportExpireDeferral);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZMGOOpenConfig {\n");
    sb.append("    applyButtonDesc: ").append(toIndentedString(applyButtonDesc)).append("\n");
    sb.append("    appointDate: ").append(toIndentedString(appointDate)).append("\n");
    sb.append("    cardColorScheme: ").append(toIndentedString(cardColorScheme)).append("\n");
    sb.append("    customOpenTipList: ").append(toIndentedString(customOpenTipList)).append("\n");
    sb.append("    customOpenTips: ").append(toIndentedString(customOpenTips)).append("\n");
    sb.append("    freezeAmount: ").append(toIndentedString(freezeAmount)).append("\n");
    sb.append("    minSignInterval: ").append(toIndentedString(minSignInterval)).append("\n");
    sb.append("    periodMode: ").append(toIndentedString(periodMode)).append("\n");
    sb.append("    periodTime: ").append(toIndentedString(periodTime)).append("\n");
    sb.append("    showSignSuccessPage: ").append(toIndentedString(showSignSuccessPage)).append("\n");
    sb.append("    signAgainSchema: ").append(toIndentedString(signAgainSchema)).append("\n");
    sb.append("    signSuccessTaskButtonDesc: ").append(toIndentedString(signSuccessTaskButtonDesc)).append("\n");
    sb.append("    supportExpireDeferral: ").append(toIndentedString(supportExpireDeferral)).append("\n");
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
    openapiFields.add("apply_button_desc");
    openapiFields.add("appoint_date");
    openapiFields.add("card_color_scheme");
    openapiFields.add("custom_open_tip_list");
    openapiFields.add("custom_open_tips");
    openapiFields.add("freeze_amount");
    openapiFields.add("min_sign_interval");
    openapiFields.add("period_mode");
    openapiFields.add("period_time");
    openapiFields.add("show_sign_success_page");
    openapiFields.add("sign_again_schema");
    openapiFields.add("sign_success_task_button_desc");
    openapiFields.add("support_expire_deferral");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZMGOOpenConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZMGOOpenConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZMGOOpenConfig is not found in the empty JSON string", ZMGOOpenConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZMGOOpenConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZMGOOpenConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_button_desc") != null && !jsonObj.get("apply_button_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_button_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_button_desc").toString()));
      }
      if (jsonObj.get("appoint_date") != null && !jsonObj.get("appoint_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appoint_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appoint_date").toString()));
      }
      if (jsonObj.get("card_color_scheme") != null && !jsonObj.get("card_color_scheme").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_color_scheme` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_color_scheme").toString()));
      }
      if (jsonObj.get("custom_open_tip_list") != null && !jsonObj.get("custom_open_tip_list").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_open_tip_list` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_open_tip_list").toString()));
      }
      if (jsonObj.get("custom_open_tips") != null && !jsonObj.get("custom_open_tips").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_open_tips` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_open_tips").toString()));
      }
      if (jsonObj.get("freeze_amount") != null && !jsonObj.get("freeze_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freeze_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freeze_amount").toString()));
      }
      if (jsonObj.get("min_sign_interval") != null && !jsonObj.get("min_sign_interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_sign_interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_sign_interval").toString()));
      }
      if (jsonObj.get("period_mode") != null && !jsonObj.get("period_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_mode").toString()));
      }
      if (jsonObj.get("period_time") != null && !jsonObj.get("period_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period_time").toString()));
      }
      if (jsonObj.get("sign_again_schema") != null && !jsonObj.get("sign_again_schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_again_schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_again_schema").toString()));
      }
      if (jsonObj.get("sign_success_task_button_desc") != null && !jsonObj.get("sign_success_task_button_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sign_success_task_button_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sign_success_task_button_desc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZMGOOpenConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZMGOOpenConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZMGOOpenConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZMGOOpenConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ZMGOOpenConfig>() {
           @Override
           public void write(JsonWriter out, ZMGOOpenConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZMGOOpenConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZMGOOpenConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZMGOOpenConfig
  * @throws IOException if the JSON string is invalid with respect to ZMGOOpenConfig
  */
  public static ZMGOOpenConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZMGOOpenConfig.class);
  }

 /**
  * Convert an instance of ZMGOOpenConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

