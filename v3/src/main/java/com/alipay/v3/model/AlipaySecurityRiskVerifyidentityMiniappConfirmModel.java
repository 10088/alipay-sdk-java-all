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
 * AlipaySecurityRiskVerifyidentityMiniappConfirmModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipaySecurityRiskVerifyidentityMiniappConfirmModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CHALLENGE = "challenge";
  @SerializedName(SERIALIZED_NAME_CHALLENGE)
  private String challenge;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_VERIFY_ID = "verify_id";
  @SerializedName(SERIALIZED_NAME_VERIFY_ID)
  private String verifyId;

  public AlipaySecurityRiskVerifyidentityMiniappConfirmModel() { 
  }

  public AlipaySecurityRiskVerifyidentityMiniappConfirmModel challenge(String challenge) {
    
    this.challenge = challenge;
    return this;
  }

   /**
   * 业务的业务流水号，例如订单id
   * @return challenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00123456", value = "业务的业务流水号，例如订单id")

  public String getChallenge() {
    return challenge;
  }


  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }


  public AlipaySecurityRiskVerifyidentityMiniappConfirmModel userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 蚂蚁统一会员ID，验证时会与做身份认证时候会话中的userId做比对，如不相符核验结果不通过
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088302857831249", value = "蚂蚁统一会员ID，验证时会与做身份认证时候会话中的userId做比对，如不相符核验结果不通过")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AlipaySecurityRiskVerifyidentityMiniappConfirmModel verifyId(String verifyId) {
    
    this.verifyId = verifyId;
    return this;
  }

   /**
   * 核身校验id，是一次核身校验服务中唯一性的id
   * @return verifyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0xa213nfdajbav17521", value = "核身校验id，是一次核身校验服务中唯一性的id")

  public String getVerifyId() {
    return verifyId;
  }


  public void setVerifyId(String verifyId) {
    this.verifyId = verifyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipaySecurityRiskVerifyidentityMiniappConfirmModel alipaySecurityRiskVerifyidentityMiniappConfirmModel = (AlipaySecurityRiskVerifyidentityMiniappConfirmModel) o;
    return Objects.equals(this.challenge, alipaySecurityRiskVerifyidentityMiniappConfirmModel.challenge) &&
        Objects.equals(this.userId, alipaySecurityRiskVerifyidentityMiniappConfirmModel.userId) &&
        Objects.equals(this.verifyId, alipaySecurityRiskVerifyidentityMiniappConfirmModel.verifyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenge, userId, verifyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipaySecurityRiskVerifyidentityMiniappConfirmModel {\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    verifyId: ").append(toIndentedString(verifyId)).append("\n");
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
    openapiFields.add("challenge");
    openapiFields.add("user_id");
    openapiFields.add("verify_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipaySecurityRiskVerifyidentityMiniappConfirmModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipaySecurityRiskVerifyidentityMiniappConfirmModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipaySecurityRiskVerifyidentityMiniappConfirmModel is not found in the empty JSON string", AlipaySecurityRiskVerifyidentityMiniappConfirmModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipaySecurityRiskVerifyidentityMiniappConfirmModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipaySecurityRiskVerifyidentityMiniappConfirmModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("challenge") != null && !jsonObj.get("challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("challenge").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("verify_id") != null && !jsonObj.get("verify_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verify_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verify_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipaySecurityRiskVerifyidentityMiniappConfirmModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipaySecurityRiskVerifyidentityMiniappConfirmModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipaySecurityRiskVerifyidentityMiniappConfirmModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipaySecurityRiskVerifyidentityMiniappConfirmModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipaySecurityRiskVerifyidentityMiniappConfirmModel>() {
           @Override
           public void write(JsonWriter out, AlipaySecurityRiskVerifyidentityMiniappConfirmModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipaySecurityRiskVerifyidentityMiniappConfirmModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipaySecurityRiskVerifyidentityMiniappConfirmModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipaySecurityRiskVerifyidentityMiniappConfirmModel
  * @throws IOException if the JSON string is invalid with respect to AlipaySecurityRiskVerifyidentityMiniappConfirmModel
  */
  public static AlipaySecurityRiskVerifyidentityMiniappConfirmModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipaySecurityRiskVerifyidentityMiniappConfirmModel.class);
  }

 /**
  * Convert an instance of AlipaySecurityRiskVerifyidentityMiniappConfirmModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

