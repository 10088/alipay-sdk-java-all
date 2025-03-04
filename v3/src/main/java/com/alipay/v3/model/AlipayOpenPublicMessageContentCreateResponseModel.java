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
 * AlipayOpenPublicMessageContentCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicMessageContentCreateResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTENT_ID = "content_id";
  @SerializedName(SERIALIZED_NAME_CONTENT_ID)
  private String contentId;

  public static final String SERIALIZED_NAME_CONTENT_URL = "content_url";
  @SerializedName(SERIALIZED_NAME_CONTENT_URL)
  private String contentUrl;

  public AlipayOpenPublicMessageContentCreateResponseModel() { 
  }

  public AlipayOpenPublicMessageContentCreateResponseModel contentId(String contentId) {
    
    this.contentId = contentId;
    return this;
  }

   /**
   * 内容id
   * @return contentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "201410323232dsadjada-dsa-1234dsada", value = "内容id")

  public String getContentId() {
    return contentId;
  }


  public void setContentId(String contentId) {
    this.contentId = contentId;
  }


  public AlipayOpenPublicMessageContentCreateResponseModel contentUrl(String contentUrl) {
    
    this.contentUrl = contentUrl;
    return this;
  }

   /**
   * 内容详情内链url
   * @return contentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "alipays://xxxx", value = "内容详情内链url")

  public String getContentUrl() {
    return contentUrl;
  }


  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicMessageContentCreateResponseModel alipayOpenPublicMessageContentCreateResponseModel = (AlipayOpenPublicMessageContentCreateResponseModel) o;
    return Objects.equals(this.contentId, alipayOpenPublicMessageContentCreateResponseModel.contentId) &&
        Objects.equals(this.contentUrl, alipayOpenPublicMessageContentCreateResponseModel.contentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentId, contentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicMessageContentCreateResponseModel {\n");
    sb.append("    contentId: ").append(toIndentedString(contentId)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
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
    openapiFields.add("content_id");
    openapiFields.add("content_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicMessageContentCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicMessageContentCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicMessageContentCreateResponseModel is not found in the empty JSON string", AlipayOpenPublicMessageContentCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicMessageContentCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicMessageContentCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("content_id") != null && !jsonObj.get("content_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_id").toString()));
      }
      if (jsonObj.get("content_url") != null && !jsonObj.get("content_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicMessageContentCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicMessageContentCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicMessageContentCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicMessageContentCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicMessageContentCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicMessageContentCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicMessageContentCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicMessageContentCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicMessageContentCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicMessageContentCreateResponseModel
  */
  public static AlipayOpenPublicMessageContentCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicMessageContentCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicMessageContentCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

