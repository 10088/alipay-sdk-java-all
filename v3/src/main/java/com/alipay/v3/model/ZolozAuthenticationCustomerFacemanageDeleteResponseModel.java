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
 * ZolozAuthenticationCustomerFacemanageDeleteResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZolozAuthenticationCustomerFacemanageDeleteResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_RETCODE = "retcode";
  @SerializedName(SERIALIZED_NAME_RETCODE)
  private String retcode;

  public static final String SERIALIZED_NAME_RETCODESUB = "retcodesub";
  @SerializedName(SERIALIZED_NAME_RETCODESUB)
  private String retcodesub;

  public static final String SERIALIZED_NAME_RETMESSAGE = "retmessage";
  @SerializedName(SERIALIZED_NAME_RETMESSAGE)
  private String retmessage;

  public static final String SERIALIZED_NAME_RETMESSAGESUB = "retmessagesub";
  @SerializedName(SERIALIZED_NAME_RETMESSAGESUB)
  private String retmessagesub;

  public ZolozAuthenticationCustomerFacemanageDeleteResponseModel() { 
  }

  public ZolozAuthenticationCustomerFacemanageDeleteResponseModel result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * 返回值
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{}", value = "返回值")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteResponseModel retcode(String retcode) {
    
    this.retcode = retcode;
    return this;
  }

   /**
   * 返回码
   * @return retcode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OK_SUCCESS", value = "返回码")

  public String getRetcode() {
    return retcode;
  }


  public void setRetcode(String retcode) {
    this.retcode = retcode;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteResponseModel retcodesub(String retcodesub) {
    
    this.retcodesub = retcodesub;
    return this;
  }

   /**
   * 返回详细码
   * @return retcodesub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Z3111", value = "返回详细码")

  public String getRetcodesub() {
    return retcodesub;
  }


  public void setRetcodesub(String retcodesub) {
    this.retcodesub = retcodesub;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteResponseModel retmessage(String retmessage) {
    
    this.retmessage = retmessage;
    return this;
  }

   /**
   * 返回信息
   * @return retmessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "成功", value = "返回信息")

  public String getRetmessage() {
    return retmessage;
  }


  public void setRetmessage(String retmessage) {
    this.retmessage = retmessage;
  }


  public ZolozAuthenticationCustomerFacemanageDeleteResponseModel retmessagesub(String retmessagesub) {
    
    this.retmessagesub = retmessagesub;
    return this;
  }

   /**
   * 返回详细信息
   * @return retmessagesub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "出库成功", value = "返回详细信息")

  public String getRetmessagesub() {
    return retmessagesub;
  }


  public void setRetmessagesub(String retmessagesub) {
    this.retmessagesub = retmessagesub;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZolozAuthenticationCustomerFacemanageDeleteResponseModel zolozAuthenticationCustomerFacemanageDeleteResponseModel = (ZolozAuthenticationCustomerFacemanageDeleteResponseModel) o;
    return Objects.equals(this.result, zolozAuthenticationCustomerFacemanageDeleteResponseModel.result) &&
        Objects.equals(this.retcode, zolozAuthenticationCustomerFacemanageDeleteResponseModel.retcode) &&
        Objects.equals(this.retcodesub, zolozAuthenticationCustomerFacemanageDeleteResponseModel.retcodesub) &&
        Objects.equals(this.retmessage, zolozAuthenticationCustomerFacemanageDeleteResponseModel.retmessage) &&
        Objects.equals(this.retmessagesub, zolozAuthenticationCustomerFacemanageDeleteResponseModel.retmessagesub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, retcode, retcodesub, retmessage, retmessagesub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZolozAuthenticationCustomerFacemanageDeleteResponseModel {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    retcode: ").append(toIndentedString(retcode)).append("\n");
    sb.append("    retcodesub: ").append(toIndentedString(retcodesub)).append("\n");
    sb.append("    retmessage: ").append(toIndentedString(retmessage)).append("\n");
    sb.append("    retmessagesub: ").append(toIndentedString(retmessagesub)).append("\n");
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
    openapiFields.add("retcode");
    openapiFields.add("retcodesub");
    openapiFields.add("retmessage");
    openapiFields.add("retmessagesub");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZolozAuthenticationCustomerFacemanageDeleteResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZolozAuthenticationCustomerFacemanageDeleteResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZolozAuthenticationCustomerFacemanageDeleteResponseModel is not found in the empty JSON string", ZolozAuthenticationCustomerFacemanageDeleteResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZolozAuthenticationCustomerFacemanageDeleteResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZolozAuthenticationCustomerFacemanageDeleteResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      if (jsonObj.get("retcode") != null && !jsonObj.get("retcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retcode").toString()));
      }
      if (jsonObj.get("retcodesub") != null && !jsonObj.get("retcodesub").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retcodesub` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retcodesub").toString()));
      }
      if (jsonObj.get("retmessage") != null && !jsonObj.get("retmessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retmessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retmessage").toString()));
      }
      if (jsonObj.get("retmessagesub") != null && !jsonObj.get("retmessagesub").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `retmessagesub` to be a primitive type in the JSON string but got `%s`", jsonObj.get("retmessagesub").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZolozAuthenticationCustomerFacemanageDeleteResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZolozAuthenticationCustomerFacemanageDeleteResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZolozAuthenticationCustomerFacemanageDeleteResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZolozAuthenticationCustomerFacemanageDeleteResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZolozAuthenticationCustomerFacemanageDeleteResponseModel>() {
           @Override
           public void write(JsonWriter out, ZolozAuthenticationCustomerFacemanageDeleteResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZolozAuthenticationCustomerFacemanageDeleteResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZolozAuthenticationCustomerFacemanageDeleteResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZolozAuthenticationCustomerFacemanageDeleteResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZolozAuthenticationCustomerFacemanageDeleteResponseModel
  */
  public static ZolozAuthenticationCustomerFacemanageDeleteResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZolozAuthenticationCustomerFacemanageDeleteResponseModel.class);
  }

 /**
  * Convert an instance of ZolozAuthenticationCustomerFacemanageDeleteResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

