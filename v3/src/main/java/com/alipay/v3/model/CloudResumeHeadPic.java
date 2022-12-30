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
 * CloudResumeHeadPic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CloudResumeHeadPic {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PIC_URL = "pic_url";
  @SerializedName(SERIALIZED_NAME_PIC_URL)
  private String picUrl;

  public CloudResumeHeadPic() { 
  }

  public CloudResumeHeadPic picUrl(String picUrl) {
    
    this.picUrl = picUrl;
    return this;
  }

   /**
   * 头像连接url
   * @return picUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://afts/...", value = "头像连接url")

  public String getPicUrl() {
    return picUrl;
  }


  public void setPicUrl(String picUrl) {
    this.picUrl = picUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudResumeHeadPic cloudResumeHeadPic = (CloudResumeHeadPic) o;
    return Objects.equals(this.picUrl, cloudResumeHeadPic.picUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(picUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudResumeHeadPic {\n");
    sb.append("    picUrl: ").append(toIndentedString(picUrl)).append("\n");
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
    openapiFields.add("pic_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CloudResumeHeadPic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CloudResumeHeadPic.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CloudResumeHeadPic is not found in the empty JSON string", CloudResumeHeadPic.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CloudResumeHeadPic.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CloudResumeHeadPic` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("pic_url") != null && !jsonObj.get("pic_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pic_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pic_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CloudResumeHeadPic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CloudResumeHeadPic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CloudResumeHeadPic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CloudResumeHeadPic.class));

       return (TypeAdapter<T>) new TypeAdapter<CloudResumeHeadPic>() {
           @Override
           public void write(JsonWriter out, CloudResumeHeadPic value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CloudResumeHeadPic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CloudResumeHeadPic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CloudResumeHeadPic
  * @throws IOException if the JSON string is invalid with respect to CloudResumeHeadPic
  */
  public static CloudResumeHeadPic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CloudResumeHeadPic.class);
  }

 /**
  * Convert an instance of CloudResumeHeadPic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

