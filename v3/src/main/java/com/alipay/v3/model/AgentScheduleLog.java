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
 * AgentScheduleLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AgentScheduleLog {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGENT_ID = "agent_id";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private String agentId;

  public static final String SERIALIZED_NAME_AGENT_NAME = "agent_name";
  @SerializedName(SERIALIZED_NAME_AGENT_NAME)
  private String agentName;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_EXTERNAL_USER_NO = "external_user_no";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_USER_NO)
  private String externalUserNo;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_STATUS = "last_status";
  @SerializedName(SERIALIZED_NAME_LAST_STATUS)
  private String lastStatus;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AgentScheduleLog() { 
  }

  public AgentScheduleLog agentId(String agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * 客服id
   * @return agentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018101801902073", value = "客服id")

  public String getAgentId() {
    return agentId;
  }


  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  public AgentScheduleLog agentName(String agentName) {
    
    this.agentName = agentName;
    return this;
  }

   /**
   * 客服名称
   * @return agentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "张三", value = "客服名称")

  public String getAgentName() {
    return agentName;
  }


  public void setAgentName(String agentName) {
    this.agentName = agentName;
  }


  public AgentScheduleLog createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 状态变更发生时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-23 09:10:23", value = "状态变更发生时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AgentScheduleLog duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 状态持续时长,单位秒
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "状态持续时长,单位秒")

  public Integer getDuration() {
    return duration;
  }


  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public AgentScheduleLog endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 状态变更结束时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-23 09:20:53", value = "状态变更结束时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AgentScheduleLog externalUserNo(String externalUserNo) {
    
    this.externalUserNo = externalUserNo;
    return this;
  }

   /**
   * isv或商户系统中对应的客服工号
   * @return externalUserNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0012", value = "isv或商户系统中对应的客服工号")

  public String getExternalUserNo() {
    return externalUserNo;
  }


  public void setExternalUserNo(String externalUserNo) {
    this.externalUserNo = externalUserNo;
  }


  public AgentScheduleLog id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * 客服状态变更流水id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10223", value = "客服状态变更流水id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AgentScheduleLog lastStatus(String lastStatus) {
    
    this.lastStatus = lastStatus;
    return this;
  }

   /**
   * 变更前状态
   * @return lastStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "离线", value = "变更前状态")

  public String getLastStatus() {
    return lastStatus;
  }


  public void setLastStatus(String lastStatus) {
    this.lastStatus = lastStatus;
  }


  public AgentScheduleLog startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 状态变更开始时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd&#39;T&#39;HH:mm:ss&#39;Z&#39;
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-10-23 09:10:23", value = "状态变更开始时间,采用UTC时间，按照ISO8601标准表示，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AgentScheduleLog status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 变更后状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "上线", value = "变更后状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentScheduleLog agentScheduleLog = (AgentScheduleLog) o;
    return Objects.equals(this.agentId, agentScheduleLog.agentId) &&
        Objects.equals(this.agentName, agentScheduleLog.agentName) &&
        Objects.equals(this.createTime, agentScheduleLog.createTime) &&
        Objects.equals(this.duration, agentScheduleLog.duration) &&
        Objects.equals(this.endTime, agentScheduleLog.endTime) &&
        Objects.equals(this.externalUserNo, agentScheduleLog.externalUserNo) &&
        Objects.equals(this.id, agentScheduleLog.id) &&
        Objects.equals(this.lastStatus, agentScheduleLog.lastStatus) &&
        Objects.equals(this.startTime, agentScheduleLog.startTime) &&
        Objects.equals(this.status, agentScheduleLog.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, agentName, createTime, duration, endTime, externalUserNo, id, lastStatus, startTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScheduleLog {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalUserNo: ").append(toIndentedString(externalUserNo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("agent_id");
    openapiFields.add("agent_name");
    openapiFields.add("create_time");
    openapiFields.add("duration");
    openapiFields.add("end_time");
    openapiFields.add("external_user_no");
    openapiFields.add("id");
    openapiFields.add("last_status");
    openapiFields.add("start_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AgentScheduleLog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AgentScheduleLog.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgentScheduleLog is not found in the empty JSON string", AgentScheduleLog.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AgentScheduleLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AgentScheduleLog` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agent_id") != null && !jsonObj.get("agent_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_id").toString()));
      }
      if (jsonObj.get("agent_name") != null && !jsonObj.get("agent_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agent_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agent_name").toString()));
      }
      if (jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("external_user_no") != null && !jsonObj.get("external_user_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_user_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_user_no").toString()));
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("last_status") != null && !jsonObj.get("last_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_status").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgentScheduleLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgentScheduleLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgentScheduleLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgentScheduleLog.class));

       return (TypeAdapter<T>) new TypeAdapter<AgentScheduleLog>() {
           @Override
           public void write(JsonWriter out, AgentScheduleLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AgentScheduleLog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AgentScheduleLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgentScheduleLog
  * @throws IOException if the JSON string is invalid with respect to AgentScheduleLog
  */
  public static AgentScheduleLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgentScheduleLog.class);
  }

 /**
  * Convert an instance of AgentScheduleLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

