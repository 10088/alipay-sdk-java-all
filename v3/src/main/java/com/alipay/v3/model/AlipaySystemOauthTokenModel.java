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
 * AlipaySystemOauthTokenModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipaySystemOauthTokenModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_GRANT_TYPE = "grant_type";
  @SerializedName(SERIALIZED_NAME_GRANT_TYPE)
  private String grantType;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refresh_token";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public AlipaySystemOauthTokenModel() { 
  }

  public AlipaySystemOauthTokenModel code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 授权码，用户对应用授权后得到。本参数在 grant_type 为 authorization_code 时必填；为 refresh_token 时不填。
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4b203fe6c11548bcabd8da5bb087a83b", value = "授权码，用户对应用授权后得到。本参数在 grant_type 为 authorization_code 时必填；为 refresh_token 时不填。")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public AlipaySystemOauthTokenModel grantType(String grantType) {
    
    this.grantType = grantType;
    return this;
  }

   /**
   * 授权方式。支持： 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
   * @return grantType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "authorization_code", value = "授权方式。支持： 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。")

  public String getGrantType() {
    return grantType;
  }


  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }


  public AlipaySystemOauthTokenModel refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填，且该值来源于此接口的返回值 app_refresh_token（即至少需要通过 grant_type&#x3D;authorization_code 调用此接口一次才能获取）。
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201208134b203fe6c11548bcabd8da5bb087a83b", value = "刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填，且该值来源于此接口的返回值 app_refresh_token（即至少需要通过 grant_type=authorization_code 调用此接口一次才能获取）。")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipaySystemOauthTokenModel alipaySystemOauthTokenModel = (AlipaySystemOauthTokenModel) o;
    return Objects.equals(this.code, alipaySystemOauthTokenModel.code) &&
        Objects.equals(this.grantType, alipaySystemOauthTokenModel.grantType) &&
        Objects.equals(this.refreshToken, alipaySystemOauthTokenModel.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, grantType, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipaySystemOauthTokenModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("grant_type");
    openapiFields.add("refresh_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipaySystemOauthTokenModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipaySystemOauthTokenModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipaySystemOauthTokenModel is not found in the empty JSON string", AlipaySystemOauthTokenModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipaySystemOauthTokenModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipaySystemOauthTokenModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("grant_type") != null && !jsonObj.get("grant_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `grant_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("grant_type").toString()));
      }
      if (jsonObj.get("refresh_token") != null && !jsonObj.get("refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refresh_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipaySystemOauthTokenModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipaySystemOauthTokenModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipaySystemOauthTokenModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipaySystemOauthTokenModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipaySystemOauthTokenModel>() {
           @Override
           public void write(JsonWriter out, AlipaySystemOauthTokenModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipaySystemOauthTokenModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipaySystemOauthTokenModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipaySystemOauthTokenModel
  * @throws IOException if the JSON string is invalid with respect to AlipaySystemOauthTokenModel
  */
  public static AlipaySystemOauthTokenModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipaySystemOauthTokenModel.class);
  }

 /**
  * Convert an instance of AlipaySystemOauthTokenModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

