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
import com.alipay.v3.model.JointAccountQuotaDTO;
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
 * JointAccountMemberList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class JointAccountMemberList {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_QUOTA = "account_quota";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_QUOTA)
  private List<JointAccountQuotaDTO> accountQuota = null;

  public static final String SERIALIZED_NAME_OPEN_ID = "open_id";
  @SerializedName(SERIALIZED_NAME_OPEN_ID)
  private String openId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public JointAccountMemberList() { 
  }

  public JointAccountMemberList accountQuota(List<JointAccountQuotaDTO> accountQuota) {
    
    this.accountQuota = accountQuota;
    return this;
  }

  public JointAccountMemberList addAccountQuotaItem(JointAccountQuotaDTO accountQuotaItem) {
    if (this.accountQuota == null) {
      this.accountQuota = new ArrayList<>();
    }
    this.accountQuota.add(accountQuotaItem);
    return this;
  }

   /**
   * 额度模型
   * @return accountQuota
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "额度模型")

  public List<JointAccountQuotaDTO> getAccountQuota() {
    return accountQuota;
  }


  public void setAccountQuota(List<JointAccountQuotaDTO> accountQuota) {
    this.accountQuota = accountQuota;
  }


  public JointAccountMemberList openId(String openId) {
    
    this.openId = openId;
    return this;
  }

   /**
   * 成员openId
   * @return openId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5", value = "成员openId")

  public String getOpenId() {
    return openId;
  }


  public void setOpenId(String openId) {
    this.openId = openId;
  }


  public JointAccountMemberList userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * 成员ID
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088900976746215", value = "成员ID")

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
    JointAccountMemberList jointAccountMemberList = (JointAccountMemberList) o;
    return Objects.equals(this.accountQuota, jointAccountMemberList.accountQuota) &&
        Objects.equals(this.openId, jointAccountMemberList.openId) &&
        Objects.equals(this.userId, jointAccountMemberList.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountQuota, openId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JointAccountMemberList {\n");
    sb.append("    accountQuota: ").append(toIndentedString(accountQuota)).append("\n");
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
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
    openapiFields.add("account_quota");
    openapiFields.add("open_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JointAccountMemberList
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JointAccountMemberList.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JointAccountMemberList is not found in the empty JSON string", JointAccountMemberList.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JointAccountMemberList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JointAccountMemberList` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayaccountQuota = jsonObj.getAsJsonArray("account_quota");
      if (jsonArrayaccountQuota != null) {
        // ensure the json data is an array
        if (!jsonObj.get("account_quota").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `account_quota` to be an array in the JSON string but got `%s`", jsonObj.get("account_quota").toString()));
        }

        // validate the optional field `account_quota` (array)
        for (int i = 0; i < jsonArrayaccountQuota.size(); i++) {
          JointAccountQuotaDTO.validateJsonObject(jsonArrayaccountQuota.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("open_id") != null && !jsonObj.get("open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_id").toString()));
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JointAccountMemberList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JointAccountMemberList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JointAccountMemberList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JointAccountMemberList.class));

       return (TypeAdapter<T>) new TypeAdapter<JointAccountMemberList>() {
           @Override
           public void write(JsonWriter out, JointAccountMemberList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JointAccountMemberList read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JointAccountMemberList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JointAccountMemberList
  * @throws IOException if the JSON string is invalid with respect to JointAccountMemberList
  */
  public static JointAccountMemberList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JointAccountMemberList.class);
  }

 /**
  * Convert an instance of JointAccountMemberList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

