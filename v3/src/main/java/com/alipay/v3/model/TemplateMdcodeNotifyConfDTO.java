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
 * TemplateMdcodeNotifyConfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateMdcodeNotifyConfDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXT_PARAMS = "ext_params";
  @SerializedName(SERIALIZED_NAME_EXT_PARAMS)
  private String extParams;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public TemplateMdcodeNotifyConfDTO() { 
  }

  public TemplateMdcodeNotifyConfDTO extParams(String extParams) {
    
    this.extParams = extParams;
    return this;
  }

   /**
   * 扩展参数信息；  格式为key-value键值对；  支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数。
   * @return extParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "扩展参数信息；  格式为key-value键值对；  支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数。")

  public String getExtParams() {
    return extParams;
  }


  public void setExtParams(String extParams) {
    this.extParams = extParams;
  }


  public TemplateMdcodeNotifyConfDTO url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 商户接收发码通知的地址链接；  只支持https地址；  用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户接收发码通知的地址链接；  只支持https地址；  用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateMdcodeNotifyConfDTO templateMdcodeNotifyConfDTO = (TemplateMdcodeNotifyConfDTO) o;
    return Objects.equals(this.extParams, templateMdcodeNotifyConfDTO.extParams) &&
        Objects.equals(this.url, templateMdcodeNotifyConfDTO.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extParams, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateMdcodeNotifyConfDTO {\n");
    sb.append("    extParams: ").append(toIndentedString(extParams)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("ext_params");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateMdcodeNotifyConfDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateMdcodeNotifyConfDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateMdcodeNotifyConfDTO is not found in the empty JSON string", TemplateMdcodeNotifyConfDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateMdcodeNotifyConfDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateMdcodeNotifyConfDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ext_params") != null && !jsonObj.get("ext_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_params").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateMdcodeNotifyConfDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateMdcodeNotifyConfDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateMdcodeNotifyConfDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateMdcodeNotifyConfDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateMdcodeNotifyConfDTO>() {
           @Override
           public void write(JsonWriter out, TemplateMdcodeNotifyConfDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateMdcodeNotifyConfDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateMdcodeNotifyConfDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateMdcodeNotifyConfDTO
  * @throws IOException if the JSON string is invalid with respect to TemplateMdcodeNotifyConfDTO
  */
  public static TemplateMdcodeNotifyConfDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateMdcodeNotifyConfDTO.class);
  }

 /**
  * Convert an instance of TemplateMdcodeNotifyConfDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

