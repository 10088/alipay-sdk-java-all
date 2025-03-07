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
import com.alipay.v3.model.AntMerchantExpandIndirectImageUploadModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * AntMerchantExpandIndirectImageUploadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AntMerchantExpandIndirectImageUploadRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AntMerchantExpandIndirectImageUploadModel data;

  public static final String SERIALIZED_NAME_IMAGE_CONTENT = "image_content";
  @SerializedName(SERIALIZED_NAME_IMAGE_CONTENT)
  private File imageContent;

  public AntMerchantExpandIndirectImageUploadRequest() { 
  }

  public AntMerchantExpandIndirectImageUploadRequest data(AntMerchantExpandIndirectImageUploadModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AntMerchantExpandIndirectImageUploadModel getData() {
    return data;
  }


  public void setData(AntMerchantExpandIndirectImageUploadModel data) {
    this.data = data;
  }


  public AntMerchantExpandIndirectImageUploadRequest imageContent(File imageContent) {
    
    this.imageContent = imageContent;
    return this;
  }

   /**
   * Get imageContent
   * @return imageContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getImageContent() {
    return imageContent;
  }


  public void setImageContent(File imageContent) {
    this.imageContent = imageContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AntMerchantExpandIndirectImageUploadRequest antMerchantExpandIndirectImageUploadRequest = (AntMerchantExpandIndirectImageUploadRequest) o;
    return Objects.equals(this.data, antMerchantExpandIndirectImageUploadRequest.data) &&
        Objects.equals(this.imageContent, antMerchantExpandIndirectImageUploadRequest.imageContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, imageContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntMerchantExpandIndirectImageUploadRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    imageContent: ").append(toIndentedString(imageContent)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("image_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AntMerchantExpandIndirectImageUploadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AntMerchantExpandIndirectImageUploadRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AntMerchantExpandIndirectImageUploadRequest is not found in the empty JSON string", AntMerchantExpandIndirectImageUploadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AntMerchantExpandIndirectImageUploadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AntMerchantExpandIndirectImageUploadRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AntMerchantExpandIndirectImageUploadModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AntMerchantExpandIndirectImageUploadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AntMerchantExpandIndirectImageUploadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AntMerchantExpandIndirectImageUploadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AntMerchantExpandIndirectImageUploadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AntMerchantExpandIndirectImageUploadRequest>() {
           @Override
           public void write(JsonWriter out, AntMerchantExpandIndirectImageUploadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AntMerchantExpandIndirectImageUploadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AntMerchantExpandIndirectImageUploadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AntMerchantExpandIndirectImageUploadRequest
  * @throws IOException if the JSON string is invalid with respect to AntMerchantExpandIndirectImageUploadRequest
  */
  public static AntMerchantExpandIndirectImageUploadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AntMerchantExpandIndirectImageUploadRequest.class);
  }

 /**
  * Convert an instance of AntMerchantExpandIndirectImageUploadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

