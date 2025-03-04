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
 * TemplateRightsContentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateRightsContentDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;

  public static final String SERIALIZED_NAME_LOGO_ID = "logo_id";
  @SerializedName(SERIALIZED_NAME_LOGO_ID)
  private String logoId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public TemplateRightsContentDTO() { 
  }

  public TemplateRightsContentDTO detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * 权益内容详情
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益内容详情")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  public TemplateRightsContentDTO logoId(String logoId) {
    
    this.logoId = logoId;
    return this;
  }

   /**
   * 权益icon图片Id（目前用于开卡授权页使用），通过接口（alipay.offline.material.image.upload）上传图片
   * @return logoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益icon图片Id（目前用于开卡授权页使用），通过接口（alipay.offline.material.image.upload）上传图片")

  public String getLogoId() {
    return logoId;
  }


  public void setLogoId(String logoId) {
    this.logoId = logoId;
  }


  public TemplateRightsContentDTO title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 权益内容标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益内容标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateRightsContentDTO templateRightsContentDTO = (TemplateRightsContentDTO) o;
    return Objects.equals(this.detail, templateRightsContentDTO.detail) &&
        Objects.equals(this.logoId, templateRightsContentDTO.logoId) &&
        Objects.equals(this.title, templateRightsContentDTO.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, logoId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateRightsContentDTO {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("detail");
    openapiFields.add("logo_id");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TemplateRightsContentDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TemplateRightsContentDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateRightsContentDTO is not found in the empty JSON string", TemplateRightsContentDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TemplateRightsContentDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateRightsContentDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detail").toString()));
      }
      if (jsonObj.get("logo_id") != null && !jsonObj.get("logo_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo_id").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateRightsContentDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateRightsContentDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateRightsContentDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateRightsContentDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateRightsContentDTO>() {
           @Override
           public void write(JsonWriter out, TemplateRightsContentDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateRightsContentDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateRightsContentDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateRightsContentDTO
  * @throws IOException if the JSON string is invalid with respect to TemplateRightsContentDTO
  */
  public static TemplateRightsContentDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateRightsContentDTO.class);
  }

 /**
  * Convert an instance of TemplateRightsContentDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

