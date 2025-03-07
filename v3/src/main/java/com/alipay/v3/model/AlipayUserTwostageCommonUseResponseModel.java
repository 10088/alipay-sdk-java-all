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
import com.alipay.v3.model.UserIdentityInfo;
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
 * AlipayUserTwostageCommonUseResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayUserTwostageCommonUseResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_USER_IDENTITY_INFO = "user_identity_info";
  @SerializedName(SERIALIZED_NAME_USER_IDENTITY_INFO)
  private UserIdentityInfo userIdentityInfo;

  public AlipayUserTwostageCommonUseResponseModel() { 
  }

  public AlipayUserTwostageCommonUseResponseModel openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * open_id
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "open_id")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public AlipayUserTwostageCommonUseResponseModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝用户userId信息，因为用户已经在客户端给商户的小程序授权了，并且商户要通过userId信息挂接优惠券信息，所以可以无需脱敏返回给商户。
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123412341234", value = "支付宝用户userId信息，因为用户已经在客户端给商户的小程序授权了，并且商户要通过userId信息挂接优惠券信息，所以可以无需脱敏返回给商户。")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AlipayUserTwostageCommonUseResponseModel userIdentityInfo(UserIdentityInfo userIdentityInfo) {
    
    this.userIdentityInfo = userIdentityInfo;
    return this;
  }

   /**
   * Get userIdentityInfo
   * @return userIdentityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserIdentityInfo getUserIdentityInfo() {
    return userIdentityInfo;
  }


  public void setUserIdentityInfo(UserIdentityInfo userIdentityInfo) {
    this.userIdentityInfo = userIdentityInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayUserTwostageCommonUseResponseModel alipayUserTwostageCommonUseResponseModel = (AlipayUserTwostageCommonUseResponseModel) o;
    return Objects.equals(this.openId, alipayUserTwostageCommonUseResponseModel.openId) &&
        Objects.equals(this.userId, alipayUserTwostageCommonUseResponseModel.userId) &&
        Objects.equals(this.userIdentityInfo, alipayUserTwostageCommonUseResponseModel.userIdentityInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openId, userId, userIdentityInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayUserTwostageCommonUseResponseModel {\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userIdentityInfo: ").append(toIndentedString(userIdentityInfo)).append("\n");
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
    openapiFields.add("open_id");
    openapiFields.add("user_id");
    openapiFields.add("user_identity_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayUserTwostageCommonUseResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayUserTwostageCommonUseResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayUserTwostageCommonUseResponseModel is not found in the empty JSON string", AlipayUserTwostageCommonUseResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayUserTwostageCommonUseResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayUserTwostageCommonUseResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      // validate the optional field `user_identity_info`
      if (jsonObj.getAsJsonObject("user_identity_info") != null) {
        UserIdentityInfo.validateJsonObject(jsonObj.getAsJsonObject("user_identity_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayUserTwostageCommonUseResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayUserTwostageCommonUseResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayUserTwostageCommonUseResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayUserTwostageCommonUseResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayUserTwostageCommonUseResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayUserTwostageCommonUseResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayUserTwostageCommonUseResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayUserTwostageCommonUseResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayUserTwostageCommonUseResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayUserTwostageCommonUseResponseModel
  */
  public static AlipayUserTwostageCommonUseResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayUserTwostageCommonUseResponseModel.class);
  }

 /**
  * Convert an instance of AlipayUserTwostageCommonUseResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

