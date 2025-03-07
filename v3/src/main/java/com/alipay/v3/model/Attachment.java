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
 * Attachment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Attachment {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTACHMENT_NAME = "attachment_name";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_NAME)
  private String attachmentName;

  public static final String SERIALIZED_NAME_FILE_ID = "file_id";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public Attachment() { 
  }

  public Attachment attachmentName(String attachmentName) {
    
    this.attachmentName = attachmentName;
    return this;
  }

   /**
   * 流程附件名称
   * @return attachmentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "流程附件名称")

  public String getAttachmentName() {
    return attachmentName;
  }


  public void setAttachmentName(String attachmentName) {
    this.attachmentName = attachmentName;
  }


  public Attachment fileId(String fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * 流程附件id
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "流程附件id")

  public String getFileId() {
    return fileId;
  }


  public void setFileId(String fileId) {
    this.fileId = fileId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.attachmentName, attachment.attachmentName) &&
        Objects.equals(this.fileId, attachment.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentName, fileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    attachmentName: ").append(toIndentedString(attachmentName)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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
    openapiFields.add("attachment_name");
    openapiFields.add("file_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Attachment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Attachment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Attachment is not found in the empty JSON string", Attachment.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Attachment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Attachment` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("attachment_name") != null && !jsonObj.get("attachment_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attachment_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attachment_name").toString()));
      }
      if (jsonObj.get("file_id") != null && !jsonObj.get("file_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Attachment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Attachment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Attachment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Attachment.class));

       return (TypeAdapter<T>) new TypeAdapter<Attachment>() {
           @Override
           public void write(JsonWriter out, Attachment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Attachment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Attachment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Attachment
  * @throws IOException if the JSON string is invalid with respect to Attachment
  */
  public static Attachment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Attachment.class);
  }

 /**
  * Convert an instance of Attachment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

