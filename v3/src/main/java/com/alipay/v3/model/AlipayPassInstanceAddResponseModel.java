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
 * AlipayPassInstanceAddResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayPassInstanceAddResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private String success;

  public AlipayPassInstanceAddResponseModel() { 
  }

  public AlipayPassInstanceAddResponseModel result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * 接口调用返回结果信息  serialNumber：唯一核销凭证串号（必须由动态传参指定）  passId：券唯一id  operation：本次调用的操作类型，ADD  errorCode：处理结果码（错误码）  errorMsg：处理结果说明（错误说明）
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"serialNumber\":\"123555123\",\"passId\":\"209919213\",\"operate\":\"ADD\",\"errorCode\":\"SUCCESS\",\"errorMsg\":\"处理成功\"}", value = "接口调用返回结果信息  serialNumber：唯一核销凭证串号（必须由动态传参指定）  passId：券唯一id  operation：本次调用的操作类型，ADD  errorCode：处理结果码（错误码）  errorMsg：处理结果说明（错误说明）")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public AlipayPassInstanceAddResponseModel success(String success) {
    
    this.success = success;
    return this;
  }

   /**
   * 操作成功标识【true：成功；false：失败】
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TRUE", value = "操作成功标识【true：成功；false：失败】")

  public String getSuccess() {
    return success;
  }


  public void setSuccess(String success) {
    this.success = success;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayPassInstanceAddResponseModel alipayPassInstanceAddResponseModel = (AlipayPassInstanceAddResponseModel) o;
    return Objects.equals(this.result, alipayPassInstanceAddResponseModel.result) &&
        Objects.equals(this.success, alipayPassInstanceAddResponseModel.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayPassInstanceAddResponseModel {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
    openapiFields.add("result");
    openapiFields.add("success");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayPassInstanceAddResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayPassInstanceAddResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayPassInstanceAddResponseModel is not found in the empty JSON string", AlipayPassInstanceAddResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayPassInstanceAddResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayPassInstanceAddResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if (jsonObj.get("success") != null && !jsonObj.get("success").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `success` to be a primitive type in the JSON string but got `%s`", jsonObj.get("success").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayPassInstanceAddResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayPassInstanceAddResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayPassInstanceAddResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayPassInstanceAddResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayPassInstanceAddResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayPassInstanceAddResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayPassInstanceAddResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayPassInstanceAddResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayPassInstanceAddResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayPassInstanceAddResponseModel
  */
  public static AlipayPassInstanceAddResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayPassInstanceAddResponseModel.class);
  }

 /**
  * Convert an instance of AlipayPassInstanceAddResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

