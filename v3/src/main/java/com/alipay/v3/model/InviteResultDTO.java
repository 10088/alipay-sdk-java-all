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
 * InviteResultDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InviteResultDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_IDENTITY_TYPE = "identity_type";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TYPE)
  private String identityType;

  public static final String SERIALIZED_NAME_PROCESS_ID = "process_id";
  @SerializedName(SERIALIZED_NAME_PROCESS_ID)
  private String processId;

  public InviteResultDTO() { 
  }

  public InviteResultDTO identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * （被邀请人）用户唯一标识&lt;br&gt; 补充说明：&lt;br&gt; - 该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000268032234", value = "（被邀请人）用户唯一标识<br> 补充说明：<br> - 该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public InviteResultDTO identityType(String identityType) {
    
    this.identityType = identityType;
    return this;
  }

   /**
   * （被邀请人）账号类型，参考值如下：&lt;br&gt; - OUT_USER_ID：商户侧用户唯一标识&lt;br&gt; 补充说明： - 该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致
   * @return identityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY_USER_ID", value = "（被邀请人）账号类型，参考值如下：<br> - OUT_USER_ID：商户侧用户唯一标识<br> 补充说明： - 该字段与签约接口alipay.fund.jointaccount.sign请求参数中传入值保持一致")

  public String getIdentityType() {
    return identityType;
  }


  public void setIdentityType(String identityType) {
    this.identityType = identityType;
  }


  public InviteResultDTO processId(String processId) {
    
    this.processId = processId;
    return this;
  }

   /**
   * 审批单号，不同被邀请人之间的审批单号不同（支付宝侧生成）
   * @return processId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021082066102300080000002126", value = "审批单号，不同被邀请人之间的审批单号不同（支付宝侧生成）")

  public String getProcessId() {
    return processId;
  }


  public void setProcessId(String processId) {
    this.processId = processId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteResultDTO inviteResultDTO = (InviteResultDTO) o;
    return Objects.equals(this.identity, inviteResultDTO.identity) &&
        Objects.equals(this.identityType, inviteResultDTO.identityType) &&
        Objects.equals(this.processId, inviteResultDTO.processId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, identityType, processId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteResultDTO {\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    identityType: ").append(toIndentedString(identityType)).append("\n");
    sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
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
    openapiFields.add("identity");
    openapiFields.add("identity_type");
    openapiFields.add("process_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InviteResultDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InviteResultDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InviteResultDTO is not found in the empty JSON string", InviteResultDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InviteResultDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InviteResultDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if (jsonObj.get("identity_type") != null && !jsonObj.get("identity_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_type").toString()));
      }
      if (jsonObj.get("process_id") != null && !jsonObj.get("process_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `process_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("process_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InviteResultDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InviteResultDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InviteResultDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InviteResultDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<InviteResultDTO>() {
           @Override
           public void write(JsonWriter out, InviteResultDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InviteResultDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InviteResultDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InviteResultDTO
  * @throws IOException if the JSON string is invalid with respect to InviteResultDTO
  */
  public static InviteResultDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InviteResultDTO.class);
  }

 /**
  * Convert an instance of InviteResultDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

