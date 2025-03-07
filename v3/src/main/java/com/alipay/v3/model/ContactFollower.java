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
 * ContactFollower
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContactFollower {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AVATAR = "avatar";
  @SerializedName(SERIALIZED_NAME_AVATAR)
  private String avatar;

  public static final String SERIALIZED_NAME_DEFAULT_AVATAR = "default_avatar";
  @SerializedName(SERIALIZED_NAME_DEFAULT_AVATAR)
  private String defaultAvatar;

  public static final String SERIALIZED_NAME_EACH_RECORD_FLAG = "each_record_flag";
  @SerializedName(SERIALIZED_NAME_EACH_RECORD_FLAG)
  private String eachRecordFlag;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public ContactFollower() { 
  }

  public ContactFollower avatar(String avatar) {
    
    this.avatar = avatar;
    return this;
  }

   /**
   * 支付宝头像
   * @return avatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝头像", value = "支付宝头像")

  public String getAvatar() {
    return avatar;
  }


  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }


  public ContactFollower defaultAvatar(String defaultAvatar) {
    
    this.defaultAvatar = defaultAvatar;
    return this;
  }

   /**
   * 默认头像
   * @return defaultAvatar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "默认头像")

  public String getDefaultAvatar() {
    return defaultAvatar;
  }


  public void setDefaultAvatar(String defaultAvatar) {
    this.defaultAvatar = defaultAvatar;
  }


  public ContactFollower eachRecordFlag(String eachRecordFlag) {
    
    this.eachRecordFlag = eachRecordFlag;
    return this;
  }

   /**
   * false
   * @return eachRecordFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "false")

  public String getEachRecordFlag() {
    return eachRecordFlag;
  }


  public void setEachRecordFlag(String eachRecordFlag) {
    this.eachRecordFlag = eachRecordFlag;
  }


  public ContactFollower userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 用户id
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088202882050410", value = "用户id")

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
    ContactFollower contactFollower = (ContactFollower) o;
    return Objects.equals(this.avatar, contactFollower.avatar) &&
        Objects.equals(this.defaultAvatar, contactFollower.defaultAvatar) &&
        Objects.equals(this.eachRecordFlag, contactFollower.eachRecordFlag) &&
        Objects.equals(this.userId, contactFollower.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, defaultAvatar, eachRecordFlag, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactFollower {\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    defaultAvatar: ").append(toIndentedString(defaultAvatar)).append("\n");
    sb.append("    eachRecordFlag: ").append(toIndentedString(eachRecordFlag)).append("\n");
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
    openapiFields.add("avatar");
    openapiFields.add("default_avatar");
    openapiFields.add("each_record_flag");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactFollower
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContactFollower.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactFollower is not found in the empty JSON string", ContactFollower.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactFollower.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactFollower` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("avatar") != null && !jsonObj.get("avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatar").toString()));
      }
      if (jsonObj.get("default_avatar") != null && !jsonObj.get("default_avatar").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_avatar` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_avatar").toString()));
      }
      if (jsonObj.get("each_record_flag") != null && !jsonObj.get("each_record_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `each_record_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("each_record_flag").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactFollower.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactFollower' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactFollower> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactFollower.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactFollower>() {
           @Override
           public void write(JsonWriter out, ContactFollower value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactFollower read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactFollower given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactFollower
  * @throws IOException if the JSON string is invalid with respect to ContactFollower
  */
  public static ContactFollower fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactFollower.class);
  }

 /**
  * Convert an instance of ContactFollower to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

