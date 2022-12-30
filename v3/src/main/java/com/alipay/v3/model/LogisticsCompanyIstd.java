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
import com.alipay.v3.model.ServiceCodeIstd;
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
 * LogisticsCompanyIstd
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogisticsCompanyIstd {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LOGISTICS_CODE = "logistics_code";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_CODE)
  private String logisticsCode;

  public static final String SERIALIZED_NAME_SERVICE_CODES = "service_codes";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODES)
  private List<ServiceCodeIstd> serviceCodes = null;

  public LogisticsCompanyIstd() { 
  }

  public LogisticsCompanyIstd logisticsCode(String logisticsCode) {
    
    this.logisticsCode = logisticsCode;
    return this;
  }

   /**
   * 即时配送公司编码，由支付宝分配
   * @return logisticsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FENGNIAO", value = "即时配送公司编码，由支付宝分配")

  public String getLogisticsCode() {
    return logisticsCode;
  }


  public void setLogisticsCode(String logisticsCode) {
    this.logisticsCode = logisticsCode;
  }


  public LogisticsCompanyIstd serviceCodes(List<ServiceCodeIstd> serviceCodes) {
    
    this.serviceCodes = serviceCodes;
    return this;
  }

  public LogisticsCompanyIstd addServiceCodesItem(ServiceCodeIstd serviceCodesItem) {
    if (this.serviceCodes == null) {
      this.serviceCodes = new ArrayList<>();
    }
    this.serviceCodes.add(serviceCodesItem);
    return this;
  }

   /**
   * 即时配送公司服务代码列表
   * @return serviceCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "即时配送公司服务代码列表")

  public List<ServiceCodeIstd> getServiceCodes() {
    return serviceCodes;
  }


  public void setServiceCodes(List<ServiceCodeIstd> serviceCodes) {
    this.serviceCodes = serviceCodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogisticsCompanyIstd logisticsCompanyIstd = (LogisticsCompanyIstd) o;
    return Objects.equals(this.logisticsCode, logisticsCompanyIstd.logisticsCode) &&
        Objects.equals(this.serviceCodes, logisticsCompanyIstd.serviceCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logisticsCode, serviceCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogisticsCompanyIstd {\n");
    sb.append("    logisticsCode: ").append(toIndentedString(logisticsCode)).append("\n");
    sb.append("    serviceCodes: ").append(toIndentedString(serviceCodes)).append("\n");
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
    openapiFields.add("logistics_code");
    openapiFields.add("service_codes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LogisticsCompanyIstd
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LogisticsCompanyIstd.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LogisticsCompanyIstd is not found in the empty JSON string", LogisticsCompanyIstd.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LogisticsCompanyIstd.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LogisticsCompanyIstd` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("logistics_code") != null && !jsonObj.get("logistics_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logistics_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logistics_code").toString()));
      }
      JsonArray jsonArrayserviceCodes = jsonObj.getAsJsonArray("service_codes");
      if (jsonArrayserviceCodes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("service_codes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `service_codes` to be an array in the JSON string but got `%s`", jsonObj.get("service_codes").toString()));
        }

        // validate the optional field `service_codes` (array)
        for (int i = 0; i < jsonArrayserviceCodes.size(); i++) {
          ServiceCodeIstd.validateJsonObject(jsonArrayserviceCodes.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LogisticsCompanyIstd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LogisticsCompanyIstd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LogisticsCompanyIstd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LogisticsCompanyIstd.class));

       return (TypeAdapter<T>) new TypeAdapter<LogisticsCompanyIstd>() {
           @Override
           public void write(JsonWriter out, LogisticsCompanyIstd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LogisticsCompanyIstd read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LogisticsCompanyIstd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LogisticsCompanyIstd
  * @throws IOException if the JSON string is invalid with respect to LogisticsCompanyIstd
  */
  public static LogisticsCompanyIstd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LogisticsCompanyIstd.class);
  }

 /**
  * Convert an instance of LogisticsCompanyIstd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

