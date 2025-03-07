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
import com.alipay.v3.model.ForbbidenTime;
import com.alipay.v3.model.UseTime;
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
 * UseRule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UseRule {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_FORBIDDEN_TIME = "forbidden_time";
  @SerializedName(SERIALIZED_NAME_FORBIDDEN_TIME)
  private ForbbidenTime forbiddenTime;

  public static final String SERIALIZED_NAME_LIMIT_RULE = "limit_rule";
  @SerializedName(SERIALIZED_NAME_LIMIT_RULE)
  private String limitRule;

  public static final String SERIALIZED_NAME_MIN_CONSUME = "min_consume";
  @SerializedName(SERIALIZED_NAME_MIN_CONSUME)
  private String minConsume;

  public static final String SERIALIZED_NAME_PAY_REDIRECT_URL = "pay_redirect_url";
  @SerializedName(SERIALIZED_NAME_PAY_REDIRECT_URL)
  private String payRedirectUrl;

  public static final String SERIALIZED_NAME_SUIT_SHOPS = "suit_shops";
  @SerializedName(SERIALIZED_NAME_SUIT_SHOPS)
  private List<String> suitShops = null;

  public static final String SERIALIZED_NAME_USE_TIME = "use_time";
  @SerializedName(SERIALIZED_NAME_USE_TIME)
  private List<UseTime> useTime = null;

  public UseRule() { 
  }

  public UseRule extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 扩展属性，无需设置
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\\\"key\\\":\\\"value\\\"", value = "扩展属性，无需设置")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public UseRule forbiddenTime(ForbbidenTime forbiddenTime) {
    
    this.forbiddenTime = forbiddenTime;
    return this;
  }

   /**
   * Get forbiddenTime
   * @return forbiddenTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ForbbidenTime getForbiddenTime() {
    return forbiddenTime;
  }


  public void setForbiddenTime(ForbbidenTime forbiddenTime) {
    this.forbiddenTime = forbiddenTime;
  }


  public UseRule limitRule(String limitRule) {
    
    this.limitRule = limitRule;
    return this;
  }

   /**
   * 优惠券的使用支付渠道限制规  则，  不受支付渠道限制  :USE_NO_LIMIT;  仅限口碑储值卡支付时可用  :USE_ON_CURRENT_PAY_C  HANNEL;  口碑储值卡支付时不可用  :NOT_ALLOWED_USE;  【备注】支付渠道限制不允许修改
   * @return limitRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USE_NO_LIMIT", value = "优惠券的使用支付渠道限制规  则，  不受支付渠道限制  :USE_NO_LIMIT;  仅限口碑储值卡支付时可用  :USE_ON_CURRENT_PAY_C  HANNEL;  口碑储值卡支付时不可用  :NOT_ALLOWED_USE;  【备注】支付渠道限制不允许修改")

  public String getLimitRule() {
    return limitRule;
  }


  public void setLimitRule(String limitRule) {
    this.limitRule = limitRule;
  }


  public UseRule minConsume(String minConsume) {
    
    this.minConsume = minConsume;
    return this;
  }

   /**
   * 券核销的最低消费门槛，单位元
   * @return minConsume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "券核销的最低消费门槛，单位元")

  public String getMinConsume() {
    return minConsume;
  }


  public void setMinConsume(String minConsume) {
    this.minConsume = minConsume;
  }


  public UseRule payRedirectUrl(String payRedirectUrl) {
    
    this.payRedirectUrl = payRedirectUrl;
    return this;
  }

   /**
   * 券买单跳转链接
   * @return payRedirectUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://mycar-parkingplatform.alipay-eco.com/pbizplatform/park/parking/stayPayCarList?entrance=1", value = "券买单跳转链接")

  public String getPayRedirectUrl() {
    return payRedirectUrl;
  }


  public void setPayRedirectUrl(String payRedirectUrl) {
    this.payRedirectUrl = payRedirectUrl;
  }


  public UseRule suitShops(List<String> suitShops) {
    
    this.suitShops = suitShops;
    return this;
  }

  public UseRule addSuitShopsItem(String suitShopsItem) {
    if (this.suitShops == null) {
      this.suitShops = new ArrayList<>();
    }
    this.suitShops.add(suitShopsItem);
    return this;
  }

   /**
   * 券适用门店列表  仅品牌商发起的招商活动可为空  直发奖类型活动必须与活动适用门店一致  最多支持10w家门店
   * @return suitShops
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015110600077000000002125023,2015110600077000000002125022", value = "券适用门店列表  仅品牌商发起的招商活动可为空  直发奖类型活动必须与活动适用门店一致  最多支持10w家门店")

  public List<String> getSuitShops() {
    return suitShops;
  }


  public void setSuitShops(List<String> suitShops) {
    this.suitShops = suitShops;
  }


  public UseRule useTime(List<UseTime> useTime) {
    
    this.useTime = useTime;
    return this;
  }

  public UseRule addUseTimeItem(UseTime useTimeItem) {
    if (this.useTime == null) {
      this.useTime = new ArrayList<>();
    }
    this.useTime.add(useTimeItem);
    return this;
  }

   /**
   * 券可用时间段
   * @return useTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可用时间段")

  public List<UseTime> getUseTime() {
    return useTime;
  }


  public void setUseTime(List<UseTime> useTime) {
    this.useTime = useTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UseRule useRule = (UseRule) o;
    return Objects.equals(this.extInfo, useRule.extInfo) &&
        Objects.equals(this.forbiddenTime, useRule.forbiddenTime) &&
        Objects.equals(this.limitRule, useRule.limitRule) &&
        Objects.equals(this.minConsume, useRule.minConsume) &&
        Objects.equals(this.payRedirectUrl, useRule.payRedirectUrl) &&
        Objects.equals(this.suitShops, useRule.suitShops) &&
        Objects.equals(this.useTime, useRule.useTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extInfo, forbiddenTime, limitRule, minConsume, payRedirectUrl, suitShops, useTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UseRule {\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    forbiddenTime: ").append(toIndentedString(forbiddenTime)).append("\n");
    sb.append("    limitRule: ").append(toIndentedString(limitRule)).append("\n");
    sb.append("    minConsume: ").append(toIndentedString(minConsume)).append("\n");
    sb.append("    payRedirectUrl: ").append(toIndentedString(payRedirectUrl)).append("\n");
    sb.append("    suitShops: ").append(toIndentedString(suitShops)).append("\n");
    sb.append("    useTime: ").append(toIndentedString(useTime)).append("\n");
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
    openapiFields.add("ext_info");
    openapiFields.add("forbidden_time");
    openapiFields.add("limit_rule");
    openapiFields.add("min_consume");
    openapiFields.add("pay_redirect_url");
    openapiFields.add("suit_shops");
    openapiFields.add("use_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UseRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UseRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UseRule is not found in the empty JSON string", UseRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UseRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UseRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      // validate the optional field `forbidden_time`
      if (jsonObj.getAsJsonObject("forbidden_time") != null) {
        ForbbidenTime.validateJsonObject(jsonObj.getAsJsonObject("forbidden_time"));
      }
      if (jsonObj.get("limit_rule") != null && !jsonObj.get("limit_rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit_rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit_rule").toString()));
      }
      if (jsonObj.get("min_consume") != null && !jsonObj.get("min_consume").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `min_consume` to be a primitive type in the JSON string but got `%s`", jsonObj.get("min_consume").toString()));
      }
      if (jsonObj.get("pay_redirect_url") != null && !jsonObj.get("pay_redirect_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_redirect_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_redirect_url").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("suit_shops") != null && !jsonObj.get("suit_shops").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `suit_shops` to be an array in the JSON string but got `%s`", jsonObj.get("suit_shops").toString()));
      }
      JsonArray jsonArrayuseTime = jsonObj.getAsJsonArray("use_time");
      if (jsonArrayuseTime != null) {
        // ensure the json data is an array
        if (!jsonObj.get("use_time").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `use_time` to be an array in the JSON string but got `%s`", jsonObj.get("use_time").toString()));
        }

        // validate the optional field `use_time` (array)
        for (int i = 0; i < jsonArrayuseTime.size(); i++) {
          UseTime.validateJsonObject(jsonArrayuseTime.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UseRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UseRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UseRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UseRule.class));

       return (TypeAdapter<T>) new TypeAdapter<UseRule>() {
           @Override
           public void write(JsonWriter out, UseRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UseRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UseRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UseRule
  * @throws IOException if the JSON string is invalid with respect to UseRule
  */
  public static UseRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UseRule.class);
  }

 /**
  * Convert an instance of UseRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

