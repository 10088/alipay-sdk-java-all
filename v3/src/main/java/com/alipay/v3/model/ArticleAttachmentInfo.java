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
 * ArticleAttachmentInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ArticleAttachmentInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public ArticleAttachmentInfo() { 
  }

  public ArticleAttachmentInfo fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 文章附件
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "文章附件")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public ArticleAttachmentInfo key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 附件完整Key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "附件完整Key")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ArticleAttachmentInfo url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 附件的url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "附件的url")

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
    ArticleAttachmentInfo articleAttachmentInfo = (ArticleAttachmentInfo) o;
    return Objects.equals(this.fileName, articleAttachmentInfo.fileName) &&
        Objects.equals(this.key, articleAttachmentInfo.key) &&
        Objects.equals(this.url, articleAttachmentInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, key, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleAttachmentInfo {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("file_name");
    openapiFields.add("key");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArticleAttachmentInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArticleAttachmentInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArticleAttachmentInfo is not found in the empty JSON string", ArticleAttachmentInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ArticleAttachmentInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ArticleAttachmentInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("file_name") != null && !jsonObj.get("file_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_name").toString()));
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArticleAttachmentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArticleAttachmentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArticleAttachmentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArticleAttachmentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ArticleAttachmentInfo>() {
           @Override
           public void write(JsonWriter out, ArticleAttachmentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ArticleAttachmentInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ArticleAttachmentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArticleAttachmentInfo
  * @throws IOException if the JSON string is invalid with respect to ArticleAttachmentInfo
  */
  public static ArticleAttachmentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArticleAttachmentInfo.class);
  }

 /**
  * Convert an instance of ArticleAttachmentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

