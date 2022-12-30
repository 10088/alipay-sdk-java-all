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
 * InteligentVoucherDescDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentVoucherDescDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private String images;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public InteligentVoucherDescDetail() { 
  }

  public InteligentVoucherDescDetail details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * 具体描述信息列表
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "周一到周五可用", value = "具体描述信息列表")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public InteligentVoucherDescDetail images(String images) {
    
    this.images = images;
    return this;
  }

   /**
   * 图片描述信息
   * @return images
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://dl.django.t.taobao.com/rest/1.0/image?fileIds=RY7twkJVR26nz8OeXRIjvAAAACMAAQED&zoom=original", value = "图片描述信息")

  public String getImages() {
    return images;
  }


  public void setImages(String images) {
    this.images = images;
  }


  public InteligentVoucherDescDetail title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 券说明的标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "温馨提示", value = "券说明的标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public InteligentVoucherDescDetail url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 券外部详情描述
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "www.alipay.com", value = "券外部详情描述")

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
    InteligentVoucherDescDetail inteligentVoucherDescDetail = (InteligentVoucherDescDetail) o;
    return Objects.equals(this.details, inteligentVoucherDescDetail.details) &&
        Objects.equals(this.images, inteligentVoucherDescDetail.images) &&
        Objects.equals(this.title, inteligentVoucherDescDetail.title) &&
        Objects.equals(this.url, inteligentVoucherDescDetail.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, images, title, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentVoucherDescDetail {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("details");
    openapiFields.add("images");
    openapiFields.add("title");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentVoucherDescDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentVoucherDescDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentVoucherDescDetail is not found in the empty JSON string", InteligentVoucherDescDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentVoucherDescDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentVoucherDescDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `details` to be a primitive type in the JSON string but got `%s`", jsonObj.get("details").toString()));
      }
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `images` to be a primitive type in the JSON string but got `%s`", jsonObj.get("images").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentVoucherDescDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentVoucherDescDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentVoucherDescDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentVoucherDescDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentVoucherDescDetail>() {
           @Override
           public void write(JsonWriter out, InteligentVoucherDescDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentVoucherDescDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentVoucherDescDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentVoucherDescDetail
  * @throws IOException if the JSON string is invalid with respect to InteligentVoucherDescDetail
  */
  public static InteligentVoucherDescDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentVoucherDescDetail.class);
  }

 /**
  * Convert an instance of InteligentVoucherDescDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

