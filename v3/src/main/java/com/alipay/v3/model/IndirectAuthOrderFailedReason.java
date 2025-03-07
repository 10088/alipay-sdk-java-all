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
 * IndirectAuthOrderFailedReason
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IndirectAuthOrderFailedReason {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FAIL_PARAM = "fail_param";
  @SerializedName(SERIALIZED_NAME_FAIL_PARAM)
  private String failParam;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason;

  public IndirectAuthOrderFailedReason() { 
  }

  public IndirectAuthOrderFailedReason failParam(String failParam) {
    
    this.failParam = failParam;
    return this;
  }

   /**
   * 审核失败字段
   * @return failParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "support_credentials", value = "审核失败字段")

  public String getFailParam() {
    return failParam;
  }


  public void setFailParam(String failParam) {
    this.failParam = failParam;
  }


  public IndirectAuthOrderFailedReason failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 描述申请单审核失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "证照编号对应的企业名称、法人名称与录入信息不一致", value = "描述申请单审核失败原因")

  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndirectAuthOrderFailedReason indirectAuthOrderFailedReason = (IndirectAuthOrderFailedReason) o;
    return Objects.equals(this.failParam, indirectAuthOrderFailedReason.failParam) &&
        Objects.equals(this.failReason, indirectAuthOrderFailedReason.failReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failParam, failReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndirectAuthOrderFailedReason {\n");
    sb.append("    failParam: ").append(toIndentedString(failParam)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
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
    openapiFields.add("fail_param");
    openapiFields.add("fail_reason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IndirectAuthOrderFailedReason
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IndirectAuthOrderFailedReason.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IndirectAuthOrderFailedReason is not found in the empty JSON string", IndirectAuthOrderFailedReason.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IndirectAuthOrderFailedReason.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IndirectAuthOrderFailedReason` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fail_param") != null && !jsonObj.get("fail_param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_param").toString()));
      }
      if (jsonObj.get("fail_reason") != null && !jsonObj.get("fail_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fail_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fail_reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IndirectAuthOrderFailedReason.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IndirectAuthOrderFailedReason' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IndirectAuthOrderFailedReason> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IndirectAuthOrderFailedReason.class));

       return (TypeAdapter<T>) new TypeAdapter<IndirectAuthOrderFailedReason>() {
           @Override
           public void write(JsonWriter out, IndirectAuthOrderFailedReason value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IndirectAuthOrderFailedReason read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IndirectAuthOrderFailedReason given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IndirectAuthOrderFailedReason
  * @throws IOException if the JSON string is invalid with respect to IndirectAuthOrderFailedReason
  */
  public static IndirectAuthOrderFailedReason fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IndirectAuthOrderFailedReason.class);
  }

 /**
  * Convert an instance of IndirectAuthOrderFailedReason to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

