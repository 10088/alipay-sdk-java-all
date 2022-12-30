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
import com.alipay.v3.model.AgentChatInfo;
import com.alipay.v3.model.AgentHotlineInfo;
import com.alipay.v3.model.RoleId;
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
 * AlipayIserviceCcmAgentCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmAgentCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ANSWERING_MODE = "answering_mode";
  @SerializedName(SERIALIZED_NAME_ANSWERING_MODE)
  private String answeringMode;

  public static final String SERIALIZED_NAME_CCS_INSTANCE_IDS = "ccs_instance_ids";
  @SerializedName(SERIALIZED_NAME_CCS_INSTANCE_IDS)
  private List<String> ccsInstanceIds = null;

  public static final String SERIALIZED_NAME_CHAT_CONFIGS = "chat_configs";
  @SerializedName(SERIALIZED_NAME_CHAT_CONFIGS)
  private List<AgentChatInfo> chatConfigs = null;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_EXTERNAL_USER_ID = "external_user_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_ID)
  private String externalUserId;

  public static final String SERIALIZED_NAME_HOTLINE_CONFIGS = "hotline_configs";
  @SerializedName(SERIALIZED_NAME_HOTLINE_CONFIGS)
  private List<AgentHotlineInfo> hotlineConfigs = null;

  public static final String SERIALIZED_NAME_JOB_NUMBER = "job_number";
  @SerializedName(SERIALIZED_NAME_JOB_NUMBER)
  private String jobNumber;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private String mobile;

  public static final String SERIALIZED_NAME_NICK_NAME = "nick_name";
  @SerializedName(SERIALIZED_NAME_NICK_NAME)
  private String nickName;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public static final String SERIALIZED_NAME_ROLE_IDS = "role_ids";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<RoleId> roleIds = null;

  public static final String SERIALIZED_NAME_USER_CHANNEL = "user_channel";
  @SerializedName(SERIALIZED_NAME_USER_CHANNEL)
  private String userChannel;

  public AlipayIserviceCcmAgentCreateModel() { 
  }

  public AlipayIserviceCcmAgentCreateModel answeringMode(String answeringMode) {
    
    this.answeringMode = answeringMode;
    return this;
  }

   /**
   * 热线接入方式，取值0，1，2
   * @return answeringMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "热线接入方式，取值0，1，2")

  public String getAnsweringMode() {
    return answeringMode;
  }


  public void setAnsweringMode(String answeringMode) {
    this.answeringMode = answeringMode;
  }


  public AlipayIserviceCcmAgentCreateModel ccsInstanceIds(List<String> ccsInstanceIds) {
    
    this.ccsInstanceIds = ccsInstanceIds;
    return this;
  }

  public AlipayIserviceCcmAgentCreateModel addCcsInstanceIdsItem(String ccsInstanceIdsItem) {
    if (this.ccsInstanceIds == null) {
      this.ccsInstanceIds = new ArrayList<>();
    }
    this.ccsInstanceIds.add(ccsInstanceIdsItem);
    return this;
  }

   /**
   * 部门id列表
   * @return ccsInstanceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"XAHSNRBS\"]", value = "部门id列表")

  public List<String> getCcsInstanceIds() {
    return ccsInstanceIds;
  }


  public void setCcsInstanceIds(List<String> ccsInstanceIds) {
    this.ccsInstanceIds = ccsInstanceIds;
  }


  public AlipayIserviceCcmAgentCreateModel chatConfigs(List<AgentChatInfo> chatConfigs) {
    
    this.chatConfigs = chatConfigs;
    return this;
  }

  public AlipayIserviceCcmAgentCreateModel addChatConfigsItem(AgentChatInfo chatConfigsItem) {
    if (this.chatConfigs == null) {
      this.chatConfigs = new ArrayList<>();
    }
    this.chatConfigs.add(chatConfigsItem);
    return this;
  }

   /**
   * 在线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应
   * @return chatConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "在线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应")

  public List<AgentChatInfo> getChatConfigs() {
    return chatConfigs;
  }


  public void setChatConfigs(List<AgentChatInfo> chatConfigs) {
    this.chatConfigs = chatConfigs;
  }


  public AlipayIserviceCcmAgentCreateModel creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 操作人客服id
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019032101896769", value = "操作人客服id")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public AlipayIserviceCcmAgentCreateModel email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 客服邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test@163.com", value = "客服邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AlipayIserviceCcmAgentCreateModel externalUserId(String externalUserId) {
    
    this.externalUserId = externalUserId;
    return this;
  }

   /**
   * 客服账号id，当user_channel&#x3D;ALIPAY时，external_user_id为支付宝账号id
   * @return externalUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088xxx", value = "客服账号id，当user_channel=ALIPAY时，external_user_id为支付宝账号id")

  public String getExternalUserId() {
    return externalUserId;
  }


  public void setExternalUserId(String externalUserId) {
    this.externalUserId = externalUserId;
  }


  public AlipayIserviceCcmAgentCreateModel hotlineConfigs(List<AgentHotlineInfo> hotlineConfigs) {
    
    this.hotlineConfigs = hotlineConfigs;
    return this;
  }

  public AlipayIserviceCcmAgentCreateModel addHotlineConfigsItem(AgentHotlineInfo hotlineConfigsItem) {
    if (this.hotlineConfigs == null) {
      this.hotlineConfigs = new ArrayList<>();
    }
    this.hotlineConfigs.add(hotlineConfigsItem);
    return this;
  }

   /**
   * 热线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应
   * @return hotlineConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "热线技能组设置，技能组部门间隔离，此设置应与ccs_instance_ids对应")

  public List<AgentHotlineInfo> getHotlineConfigs() {
    return hotlineConfigs;
  }


  public void setHotlineConfigs(List<AgentHotlineInfo> hotlineConfigs) {
    this.hotlineConfigs = hotlineConfigs;
  }


  public AlipayIserviceCcmAgentCreateModel jobNumber(String jobNumber) {
    
    this.jobNumber = jobNumber;
    return this;
  }

   /**
   * 客服工号，新增后不可变更。4位数字，不可重复
   * @return jobNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0002", value = "客服工号，新增后不可变更。4位数字，不可重复")

  public String getJobNumber() {
    return jobNumber;
  }


  public void setJobNumber(String jobNumber) {
    this.jobNumber = jobNumber;
  }


  public AlipayIserviceCcmAgentCreateModel mobile(String mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * 客服手机号
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13812345678", value = "客服手机号")

  public String getMobile() {
    return mobile;
  }


  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public AlipayIserviceCcmAgentCreateModel nickName(String nickName) {
    
    this.nickName = nickName;
    return this;
  }

   /**
   * 客服昵称
   * @return nickName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "风清扬", value = "客服昵称")

  public String getNickName() {
    return nickName;
  }


  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public AlipayIserviceCcmAgentCreateModel realName(String realName) {
    
    this.realName = realName;
    return this;
  }

   /**
   * 客服姓名
   * @return realName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "客服姓名")

  public String getRealName() {
    return realName;
  }


  public void setRealName(String realName) {
    this.realName = realName;
  }


  public AlipayIserviceCcmAgentCreateModel roleIds(List<RoleId> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public AlipayIserviceCcmAgentCreateModel addRoleIdsItem(RoleId roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * 角色id列表
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "角色id列表")

  public List<RoleId> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<RoleId> roleIds) {
    this.roleIds = roleIds;
  }


  public AlipayIserviceCcmAgentCreateModel userChannel(String userChannel) {
    
    this.userChannel = userChannel;
    return this;
  }

   /**
   * 客服账号渠道 ALIPAY:支付宝账号
   * @return userChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALIPAY", value = "客服账号渠道 ALIPAY:支付宝账号")

  public String getUserChannel() {
    return userChannel;
  }


  public void setUserChannel(String userChannel) {
    this.userChannel = userChannel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmAgentCreateModel alipayIserviceCcmAgentCreateModel = (AlipayIserviceCcmAgentCreateModel) o;
    return Objects.equals(this.answeringMode, alipayIserviceCcmAgentCreateModel.answeringMode) &&
        Objects.equals(this.ccsInstanceIds, alipayIserviceCcmAgentCreateModel.ccsInstanceIds) &&
        Objects.equals(this.chatConfigs, alipayIserviceCcmAgentCreateModel.chatConfigs) &&
        Objects.equals(this.creatorId, alipayIserviceCcmAgentCreateModel.creatorId) &&
        Objects.equals(this.email, alipayIserviceCcmAgentCreateModel.email) &&
        Objects.equals(this.externalUserId, alipayIserviceCcmAgentCreateModel.externalUserId) &&
        Objects.equals(this.hotlineConfigs, alipayIserviceCcmAgentCreateModel.hotlineConfigs) &&
        Objects.equals(this.jobNumber, alipayIserviceCcmAgentCreateModel.jobNumber) &&
        Objects.equals(this.mobile, alipayIserviceCcmAgentCreateModel.mobile) &&
        Objects.equals(this.nickName, alipayIserviceCcmAgentCreateModel.nickName) &&
        Objects.equals(this.realName, alipayIserviceCcmAgentCreateModel.realName) &&
        Objects.equals(this.roleIds, alipayIserviceCcmAgentCreateModel.roleIds) &&
        Objects.equals(this.userChannel, alipayIserviceCcmAgentCreateModel.userChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answeringMode, ccsInstanceIds, chatConfigs, creatorId, email, externalUserId, hotlineConfigs, jobNumber, mobile, nickName, realName, roleIds, userChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmAgentCreateModel {\n");
    sb.append("    answeringMode: ").append(toIndentedString(answeringMode)).append("\n");
    sb.append("    ccsInstanceIds: ").append(toIndentedString(ccsInstanceIds)).append("\n");
    sb.append("    chatConfigs: ").append(toIndentedString(chatConfigs)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    externalUserId: ").append(toIndentedString(externalUserId)).append("\n");
    sb.append("    hotlineConfigs: ").append(toIndentedString(hotlineConfigs)).append("\n");
    sb.append("    jobNumber: ").append(toIndentedString(jobNumber)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    userChannel: ").append(toIndentedString(userChannel)).append("\n");
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
    openapiFields.add("answering_mode");
    openapiFields.add("ccs_instance_ids");
    openapiFields.add("chat_configs");
    openapiFields.add("creator_id");
    openapiFields.add("email");
    openapiFields.add("external_user_id");
    openapiFields.add("hotline_configs");
    openapiFields.add("job_number");
    openapiFields.add("mobile");
    openapiFields.add("nick_name");
    openapiFields.add("real_name");
    openapiFields.add("role_ids");
    openapiFields.add("user_channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmAgentCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmAgentCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmAgentCreateModel is not found in the empty JSON string", AlipayIserviceCcmAgentCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmAgentCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmAgentCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("answering_mode") != null && !jsonObj.get("answering_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `answering_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("answering_mode").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("ccs_instance_ids") != null && !jsonObj.get("ccs_instance_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ccs_instance_ids` to be an array in the JSON string but got `%s`", jsonObj.get("ccs_instance_ids").toString()));
      }
      JsonArray jsonArraychatConfigs = jsonObj.getAsJsonArray("chat_configs");
      if (jsonArraychatConfigs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("chat_configs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `chat_configs` to be an array in the JSON string but got `%s`", jsonObj.get("chat_configs").toString()));
        }

        // validate the optional field `chat_configs` (array)
        for (int i = 0; i < jsonArraychatConfigs.size(); i++) {
          AgentChatInfo.validateJsonObject(jsonArraychatConfigs.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("external_user_id") != null && !jsonObj.get("external_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_user_id").toString()));
      }
      JsonArray jsonArrayhotlineConfigs = jsonObj.getAsJsonArray("hotline_configs");
      if (jsonArrayhotlineConfigs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("hotline_configs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `hotline_configs` to be an array in the JSON string but got `%s`", jsonObj.get("hotline_configs").toString()));
        }

        // validate the optional field `hotline_configs` (array)
        for (int i = 0; i < jsonArrayhotlineConfigs.size(); i++) {
          AgentHotlineInfo.validateJsonObject(jsonArrayhotlineConfigs.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("job_number") != null && !jsonObj.get("job_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `job_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("job_number").toString()));
      }
      if (jsonObj.get("mobile") != null && !jsonObj.get("mobile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile").toString()));
      }
      if (jsonObj.get("nick_name") != null && !jsonObj.get("nick_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nick_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nick_name").toString()));
      }
      if (jsonObj.get("real_name") != null && !jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
      JsonArray jsonArrayroleIds = jsonObj.getAsJsonArray("role_ids");
      if (jsonArrayroleIds != null) {
        // ensure the json data is an array
        if (!jsonObj.get("role_ids").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `role_ids` to be an array in the JSON string but got `%s`", jsonObj.get("role_ids").toString()));
        }

        // validate the optional field `role_ids` (array)
        for (int i = 0; i < jsonArrayroleIds.size(); i++) {
          RoleId.validateJsonObject(jsonArrayroleIds.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("user_channel") != null && !jsonObj.get("user_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmAgentCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmAgentCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmAgentCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmAgentCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmAgentCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmAgentCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmAgentCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmAgentCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmAgentCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmAgentCreateModel
  */
  public static AlipayIserviceCcmAgentCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmAgentCreateModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmAgentCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

