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
 * Signer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Signer {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ID_NUMBER = "id_number";
  @SerializedName(SERIALIZED_NAME_ID_NUMBER)
  private String idNumber;

  public static final String SERIALIZED_NAME_ID_TYPE = "id_type";
  @SerializedName(SERIALIZED_NAME_ID_TYPE)
  private String idType;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public Signer() { 
  }

  public Signer email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "593100192@tsign.cn", value = "邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public Signer idNumber(String idNumber) {
    
    this.idNumber = idNumber;
    return this;
  }

   /**
   * 证件号
   * @return idNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330304199806083911", value = "证件号")

  public String getIdNumber() {
    return idNumber;
  }


  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }


  public Signer idType(String idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * 证件类型,详见个人证件类型说明（http://open.esign.cn/docs/xy/%E6%8E%A5%E5%8F%A3%E6%96%87%E6%A1%A3/%E9%99%84%E5%BD%95/%E4%B8%AA%E4%BA%BA%E8%AF%81%E4%BB%B6%E7%B1%BB%E5%9E%8B.html），默认CRED_PSN_CH_IDCARD (证件号不为空，则必填)
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CRED_PSN_CH_IDCARD", value = "证件类型,详见个人证件类型说明（http://open.esign.cn/docs/xy/%E6%8E%A5%E5%8F%A3%E6%96%87%E6%A1%A3/%E9%99%84%E5%BD%95/%E4%B8%AA%E4%BA%BA%E8%AF%81%E4%BB%B6%E7%B1%BB%E5%9E%8B.html），默认CRED_PSN_CH_IDCARD (证件号不为空，则必填)")

  public String getIdType() {
    return idType;
  }


  public void setIdType(String idType) {
    this.idType = idType;
  }


  public Signer mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 手机号
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "18888888888", value = "手机号")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public Signer name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 姓名
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "姓名", value = "姓名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Signer userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 支付宝userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102924502823", value = "支付宝userId")

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
    Signer signer = (Signer) o;
    return Objects.equals(this.email, signer.email) &&
        Objects.equals(this.idNumber, signer.idNumber) &&
        Objects.equals(this.idType, signer.idType) &&
        Objects.equals(this.mobile, signer.mobile) &&
        Objects.equals(this.name, signer.name) &&
        Objects.equals(this.userId, signer.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, idNumber, idType, mobile, name, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signer {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("email");
    openapiFields.add("id_number");
    openapiFields.add("id_type");
    openapiFields.add("mobile");
    openapiFields.add("name");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Signer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Signer.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Signer is not found in the empty JSON string", Signer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Signer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Signer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("id_number") != null && !jsonObj.get("id_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_number").toString()));
      }
      if (jsonObj.get("id_type") != null && !jsonObj.get("id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id_type").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Signer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Signer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Signer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Signer.class));

       return (TypeAdapter<T>) new TypeAdapter<Signer>() {
           @Override
           public void write(JsonWriter out, Signer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Signer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Signer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Signer
  * @throws IOException if the JSON string is invalid with respect to Signer
  */
  public static Signer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Signer.class);
  }

 /**
  * Convert an instance of Signer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

