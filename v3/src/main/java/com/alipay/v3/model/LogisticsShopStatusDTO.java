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
 * LogisticsShopStatusDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogisticsShopStatusDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUDIT_DESC = "audit_desc";
  @SerializedName(SERIALIZED_NAME_AUDIT_DESC)
  private String auditDesc;

  public static final String SERIALIZED_NAME_LOGISTICS_CODE = "logistics_code";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_CODE)
  private String logisticsCode;

  public static final String SERIALIZED_NAME_LOGISTICS_NAME = "logistics_name";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_NAME)
  private String logisticsName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public LogisticsShopStatusDTO() { 
  }

  public LogisticsShopStatusDTO auditDesc(String auditDesc) {
    
    this.auditDesc = auditDesc;
    return this;
  }

   /**
   * 商家在配送公司的账户的审核说明.
   * @return auditDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家在配送公司的账户的审核说明.")

  public String getAuditDesc() {
    return auditDesc;
  }


  public void setAuditDesc(String auditDesc) {
    this.auditDesc = auditDesc;
  }


  public LogisticsShopStatusDTO logisticsCode(String logisticsCode) {
    
    this.logisticsCode = logisticsCode;
    return this;
  }

   /**
   * 配送公司物流编码。
   * @return logisticsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配送公司物流编码。")

  public String getLogisticsCode() {
    return logisticsCode;
  }


  public void setLogisticsCode(String logisticsCode) {
    this.logisticsCode = logisticsCode;
  }


  public LogisticsShopStatusDTO logisticsName(String logisticsName) {
    
    this.logisticsName = logisticsName;
    return this;
  }

   /**
   * 配送公司名称。
   * @return logisticsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配送公司名称。")

  public String getLogisticsName() {
    return logisticsName;
  }


  public void setLogisticsName(String logisticsName) {
    this.logisticsName = logisticsName;
  }


  public LogisticsShopStatusDTO status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 门店状态，AUDITING:审核中，AUDIT_REJECT:审核驳回，VALID:已生效，UPDATING:更新中，WAIT_CREATE:待开通(存量门店若需要支持后面新增的配送公司，需要调用门店更新接口发起申请)
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店状态，AUDITING:审核中，AUDIT_REJECT:审核驳回，VALID:已生效，UPDATING:更新中，WAIT_CREATE:待开通(存量门店若需要支持后面新增的配送公司，需要调用门店更新接口发起申请)")

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
    LogisticsShopStatusDTO logisticsShopStatusDTO = (LogisticsShopStatusDTO) o;
    return Objects.equals(this.auditDesc, logisticsShopStatusDTO.auditDesc) &&
        Objects.equals(this.logisticsCode, logisticsShopStatusDTO.logisticsCode) &&
        Objects.equals(this.logisticsName, logisticsShopStatusDTO.logisticsName) &&
        Objects.equals(this.status, logisticsShopStatusDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditDesc, logisticsCode, logisticsName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogisticsShopStatusDTO {\n");
    sb.append("    auditDesc: ").append(toIndentedString(auditDesc)).append("\n");
    sb.append("    logisticsCode: ").append(toIndentedString(logisticsCode)).append("\n");
    sb.append("    logisticsName: ").append(toIndentedString(logisticsName)).append("\n");
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
    openapiFields.add("audit_desc");
    openapiFields.add("logistics_code");
    openapiFields.add("logistics_name");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LogisticsShopStatusDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LogisticsShopStatusDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogisticsShopStatusDTO is not found in the empty JSON string", LogisticsShopStatusDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LogisticsShopStatusDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogisticsShopStatusDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("audit_desc") != null && !jsonObj.get("audit_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `audit_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("audit_desc").toString()));
      }
      if (jsonObj.get("logistics_code") != null && !jsonObj.get("logistics_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistics_code").toString()));
      }
      if (jsonObj.get("logistics_name") != null && !jsonObj.get("logistics_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistics_name").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogisticsShopStatusDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogisticsShopStatusDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogisticsShopStatusDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogisticsShopStatusDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<LogisticsShopStatusDTO>() {
           @Override
           public void write(JsonWriter out, LogisticsShopStatusDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogisticsShopStatusDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LogisticsShopStatusDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogisticsShopStatusDTO
  * @throws IOException if the JSON string is invalid with respect to LogisticsShopStatusDTO
  */
  public static LogisticsShopStatusDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogisticsShopStatusDTO.class);
  }

 /**
  * Convert an instance of LogisticsShopStatusDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

