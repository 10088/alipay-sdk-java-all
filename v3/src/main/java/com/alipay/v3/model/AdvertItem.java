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
 * AdvertItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdvertItem {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IMG_URL = "img_url";
  @SerializedName(SERIALIZED_NAME_IMG_URL)
  private String imgUrl;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private String linkType;

  public static final String SERIALIZED_NAME_LINK_URL = "link_url";
  @SerializedName(SERIALIZED_NAME_LINK_URL)
  private String linkUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public AdvertItem() { 
  }

  public AdvertItem imgUrl(String imgUrl) {
    
    this.imgUrl = imgUrl;
    return this;
  }

   /**
   * 广告图片url, 尺寸为996*240，最大不超过5M，支持格式:.jpg、.png ，请先调用&lt;a href&#x3D;\&quot;https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload\&quot;&gt; 图片上传接口&lt;/a&gt;获得图片url
   * @return imgUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "广告图片url, 尺寸为996*240，最大不超过5M，支持格式:.jpg、.png ，请先调用<a href=\"https://docs.open.alipay.com/api_3/alipay.offline.material.image.upload\"> 图片上传接口</a>获得图片url")

  public String getImgUrl() {
    return imgUrl;
  }


  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }


  public AdvertItem linkType(String linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * 跳转类型，网页:HTTP、小程序:APP，不传默认HTTP
   * @return linkType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "跳转类型，网页:HTTP、小程序:APP，不传默认HTTP")

  public String getLinkType() {
    return linkType;
  }


  public void setLinkType(String linkType) {
    this.linkType = linkType;
  }


  public AdvertItem linkUrl(String linkUrl) {
    
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * 跳转链接，点击广告图片跳到的链接url
   * @return linkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "跳转链接，点击广告图片跳到的链接url")

  public String getLinkUrl() {
    return linkUrl;
  }


  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public AdvertItem name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 广告帧名称，可选
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "广告帧名称，可选")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertItem advertItem = (AdvertItem) o;
    return Objects.equals(this.imgUrl, advertItem.imgUrl) &&
        Objects.equals(this.linkType, advertItem.linkType) &&
        Objects.equals(this.linkUrl, advertItem.linkUrl) &&
        Objects.equals(this.name, advertItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imgUrl, linkType, linkUrl, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertItem {\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("img_url");
    openapiFields.add("link_type");
    openapiFields.add("link_url");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdvertItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdvertItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdvertItem is not found in the empty JSON string", AdvertItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdvertItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdvertItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("img_url") != null && !jsonObj.get("img_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `img_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("img_url").toString()));
      }
      if (jsonObj.get("link_type") != null && !jsonObj.get("link_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_type").toString()));
      }
      if (jsonObj.get("link_url") != null && !jsonObj.get("link_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_url").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertItem.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertItem>() {
           @Override
           public void write(JsonWriter out, AdvertItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertItem
  * @throws IOException if the JSON string is invalid with respect to AdvertItem
  */
  public static AdvertItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertItem.class);
  }

 /**
  * Convert an instance of AdvertItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

