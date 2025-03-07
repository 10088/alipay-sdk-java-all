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
 * AlipaySystemOauthTokenResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipaySystemOauthTokenResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "access_token";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_ALIPAY_USER_ID = "alipay_user_id";
  @SerializedName(SERIALIZED_NAME_ALIPAY_USER_ID)
  private String alipayUserId;

  public static final String SERIALIZED_NAME_AUTH_START = "auth_start";
  @SerializedName(SERIALIZED_NAME_AUTH_START)
  private String authStart;

  public static final String SERIALIZED_NAME_AUTH_TOKEN_TYPE = "auth_token_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TOKEN_TYPE)
  private String authTokenType;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expires_in";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private String expiresIn;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_RE_EXPIRES_IN = "re_expires_in";
  @SerializedName(SERIALIZED_NAME_RE_EXPIRES_IN)
  private String reExpiresIn;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_UNION_ID = "union_id";
  @SerializedName(SERIALIZED_NAME_UNION_ID)
  private String unionId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public AlipaySystemOauthTokenResponseModel() { 
  }

  public AlipaySystemOauthTokenResponseModel accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * 访问令牌。通过该令牌调用需要授权类接口
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20120823ac6ffaa4d2d84e7384bf983531473993", value = "访问令牌。通过该令牌调用需要授权类接口")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public AlipaySystemOauthTokenResponseModel alipayUserId(String alipayUserId) {
    
    this.alipayUserId = alipayUserId;
    return this;
  }

   /**
   * 已废弃，请勿使用
   * @return alipayUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "已废弃，请勿使用", value = "已废弃，请勿使用")

  public String getAlipayUserId() {
    return alipayUserId;
  }


  public void setAlipayUserId(String alipayUserId) {
    this.alipayUserId = alipayUserId;
  }


  public AlipaySystemOauthTokenResponseModel authStart(String authStart) {
    
    this.authStart = authStart;
    return this;
  }

   /**
   * 授权token开始时间，作为有效期计算的起点
   * @return authStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2010-11-11 11:11:11", value = "授权token开始时间，作为有效期计算的起点")

  public String getAuthStart() {
    return authStart;
  }


  public void setAuthStart(String authStart) {
    this.authStart = authStart;
  }


  public AlipaySystemOauthTokenResponseModel authTokenType(String authTokenType) {
    
    this.authTokenType = authTokenType;
    return this;
  }

   /**
   * 令牌类型，permanent表示返回的access_token和refresh_token永久有效，非永久令牌不返回该字段
   * @return authTokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "permanent", value = "令牌类型，permanent表示返回的access_token和refresh_token永久有效，非永久令牌不返回该字段")

  public String getAuthTokenType() {
    return authTokenType;
  }


  public void setAuthTokenType(String authTokenType) {
    this.authTokenType = authTokenType;
  }


  public AlipaySystemOauthTokenResponseModel expiresIn(String expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * 访问令牌的有效时间，单位是秒。
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "访问令牌的有效时间，单位是秒。")

  public String getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  public AlipaySystemOauthTokenResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 支付宝用户唯一标识
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "支付宝用户唯一标识")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipaySystemOauthTokenResponseModel reExpiresIn(String reExpiresIn) {
    
    this.reExpiresIn = reExpiresIn;
    return this;
  }

   /**
   * 刷新令牌的有效时间，单位是秒。
   * @return reExpiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3600", value = "刷新令牌的有效时间，单位是秒。")

  public String getReExpiresIn() {
    return reExpiresIn;
  }


  public void setReExpiresIn(String reExpiresIn) {
    this.reExpiresIn = reExpiresIn;
  }


  public AlipaySystemOauthTokenResponseModel refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 刷新令牌。通过该令牌可以刷新access_token
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20120823ac6ffdsdf2d84e7384bf983531473993", value = "刷新令牌。通过该令牌可以刷新access_token")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public AlipaySystemOauthTokenResponseModel unionId(String unionId) {
    
    this.unionId = unionId;
    return this;
  }

   /**
   * union_id是支付宝用户在开放平台的唯一标识符，在配置应用分组后会返回该值。 同一用户的union_id在同一分组内应用的union_id一致。
   * @return unionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "092aSPrsmhTbexLh9zgoYb2uvZNC4D8izCpGKTem8QiIOQb", value = "union_id是支付宝用户在开放平台的唯一标识符，在配置应用分组后会返回该值。 同一用户的union_id在同一分组内应用的union_id一致。")

  public String getUnionId() {
    return unionId;
  }


  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }


  public AlipaySystemOauthTokenResponseModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝用户的唯一标识。以2088开头的16位数字。
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102150477652", value = "支付宝用户的唯一标识。以2088开头的16位数字。")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipaySystemOauthTokenResponseModel alipaySystemOauthTokenResponseModel = (AlipaySystemOauthTokenResponseModel) o;
    return Objects.equals(this.accessToken, alipaySystemOauthTokenResponseModel.accessToken) &&
        Objects.equals(this.alipayUserId, alipaySystemOauthTokenResponseModel.alipayUserId) &&
        Objects.equals(this.authStart, alipaySystemOauthTokenResponseModel.authStart) &&
        Objects.equals(this.authTokenType, alipaySystemOauthTokenResponseModel.authTokenType) &&
        Objects.equals(this.expiresIn, alipaySystemOauthTokenResponseModel.expiresIn) &&
        Objects.equals(this.openId, alipaySystemOauthTokenResponseModel.openId) &&
        Objects.equals(this.reExpiresIn, alipaySystemOauthTokenResponseModel.reExpiresIn) &&
        Objects.equals(this.refreshToken, alipaySystemOauthTokenResponseModel.refreshToken) &&
        Objects.equals(this.unionId, alipaySystemOauthTokenResponseModel.unionId) &&
        Objects.equals(this.userId, alipaySystemOauthTokenResponseModel.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, alipayUserId, authStart, authTokenType, expiresIn, openId, reExpiresIn, refreshToken, unionId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipaySystemOauthTokenResponseModel {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    alipayUserId: ").append(toIndentedString(alipayUserId)).append("\n");
    sb.append("    authStart: ").append(toIndentedString(authStart)).append("\n");
    sb.append("    authTokenType: ").append(toIndentedString(authTokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    reExpiresIn: ").append(toIndentedString(reExpiresIn)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    unionId: ").append(toIndentedString(unionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("access_token");
    openapiFields.add("alipay_user_id");
    openapiFields.add("auth_start");
    openapiFields.add("auth_token_type");
    openapiFields.add("expires_in");
    openapiFields.add("open_id");
    openapiFields.add("re_expires_in");
    openapiFields.add("refresh_token");
    openapiFields.add("union_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipaySystemOauthTokenResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipaySystemOauthTokenResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipaySystemOauthTokenResponseModel is not found in the empty JSON string", AlipaySystemOauthTokenResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipaySystemOauthTokenResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipaySystemOauthTokenResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("access_token") != null && !jsonObj.get("access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_token").toString()));
      }
      if (jsonObj.get("alipay_user_id") != null && !jsonObj.get("alipay_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alipay_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alipay_user_id").toString()));
      }
      if (jsonObj.get("auth_start") != null && !jsonObj.get("auth_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_start").toString()));
      }
      if (jsonObj.get("auth_token_type") != null && !jsonObj.get("auth_token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_token_type").toString()));
      }
      if (jsonObj.get("expires_in") != null && !jsonObj.get("expires_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires_in").toString()));
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("re_expires_in") != null && !jsonObj.get("re_expires_in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `re_expires_in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("re_expires_in").toString()));
      }
      if (jsonObj.get("refresh_token") != null && !jsonObj.get("refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_token").toString()));
      }
      if (jsonObj.get("union_id") != null && !jsonObj.get("union_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `union_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("union_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipaySystemOauthTokenResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipaySystemOauthTokenResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipaySystemOauthTokenResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipaySystemOauthTokenResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipaySystemOauthTokenResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipaySystemOauthTokenResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipaySystemOauthTokenResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipaySystemOauthTokenResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipaySystemOauthTokenResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipaySystemOauthTokenResponseModel
  */
  public static AlipaySystemOauthTokenResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipaySystemOauthTokenResponseModel.class);
  }

 /**
  * Convert an instance of AlipaySystemOauthTokenResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

